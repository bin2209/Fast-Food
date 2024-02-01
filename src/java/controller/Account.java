package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Account")
public class Account extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);

        // Check truong hop da dang nhap roi
        if (session != null && session.getAttribute("userEmail") != null) {
//                request.getRequestDispatcher("account.jsp").forward(request, response);
            String pathInfo = request.getPathInfo();
            if (pathInfo != null) {
                String[] parts = pathInfo.split("/");
                if (parts.length > 1) {
                    String action = parts[1];
                    System.out.println(action);
                    switch (action) {
                        case "edit":
                            // Handle edit action
//                            System.out.println("Handling delete case");
//                            response.sendRedirect(request.getContextPath() + "/error1");

                            break;
                        case "history-order":
                            // Handle history-order action
                            request.setAttribute("pageTitle", "Order History");
                            break;

//                        default:
//                            // Handle other actions or redirect to an error page
//                            response.sendRedirect("error");
//                            return;
                    }
                }

            } else {
                request.getRequestDispatcher("account.jsp").forward(request, response);
            }
//                if (parts.length > 1) {
//                    String action = parts[1];
//
//                    // Perform actions based on the extracted action
//                    switch (action) {
//                        case "history-order":
//                            // Handle history-order action
//                            request.setAttribute("pageTitle", "Order History");
//                            break;
//                        case "edit":
//                            // Handle edit action
//                            request.setAttribute("pageTitle", "Edit Account");
//                            break;
//                        default:
//                            // Handle other actions or redirect to an error page
//                            response.sendRedirect(request.getContextPath() + "/error");
//                            return;
//                    }
//
//                    // Forward the request to the JSP
//                    request.getRequestDispatcher("/WEB-INF/accountPage.jsp").forward(request, response);
//                } else {
//                    // Handle invalid URL or default content
//                    response.sendRedirect("login");
//                }
//            request.getRequestDispatcher("login.jsp").forward(request, response);
            response.sendRedirect("login");
        } else {
            response.sendRedirect("login");
        }
    }
    // Rest of your code here

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood_db", "root", "truong322")) {
//                String username = request.getParameter("user");
//                String password = request.getParameter("pass");
//
//                // Use try-with-resources for PreparedStatement and ResultSet
//                try (PreparedStatement pst = con.prepareStatement("SELECT * FROM User WHERE userName = ? AND userPass =?")) {
//                    pst.setString(1, username);
//                    pst.setString(2, password);
//
//                    try (ResultSet rs = pst.executeQuery()) {
//                        if (rs.next()) {
//                            HttpSession session = request.getSession();
//                            session.setAttribute("name", username);
//                            response.sendRedirect("account");
//                        } else {
//                            request.getRequestDispatcher("account2.jsp").forward(request, response);
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.err.println(e);
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
