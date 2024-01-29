package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Account extends HttpServlet {

//    @GetMapping("/account/favourite-orders")
//    public String favouriteOrders(Model model) {
//        return "account";
//    }

    @GetMapping("/account/edit")
    public String edit(Model model) {
//          request.getRequestDispatcher("templates/edit.jsp").forward(request, response);
        return "account";
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(false);

            // Check truong hop da dang nhap roi
            if (session != null && session.getAttribute("userEmail") != null) {
                request.getRequestDispatcher("templates/account.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String getType = request.getParameter("type");
        if ("1".equals(getType)) {
            // Type 1: Register redirect to register.jsp
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if ("2".equals(getType)) {
            // Type 2: Lost password
            request.getRequestDispatcher("lostAccount.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood_db", "root", "truong322")) {
                String username = request.getParameter("user");
                String password = request.getParameter("pass");

                // Use try-with-resources for PreparedStatement and ResultSet
                try (PreparedStatement pst = con.prepareStatement("SELECT * FROM User WHERE userName = ? AND userPass =?")) {
                    pst.setString(1, username);
                    pst.setString(2, password);

                    try (ResultSet rs = pst.executeQuery()) {
                        if (rs.next()) {
                            HttpSession session = request.getSession();
                            session.setAttribute("name", username);
                            response.sendRedirect("account");
                        } else {
                            request.getRequestDispatcher("account2.jsp").forward(request, response);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
