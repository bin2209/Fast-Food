/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginUser;
import util.UserDao;

/**
 *
 * @author mac
 */
public class Login extends HttpServlet {

    private UserDao dao;

//    private static String EDITPG = "/edit.jsp";
    private static String ADMINPG = "admin";
    private static String NORMALPG = "account";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
//        Check truong hop da dang nhap roi
        if (session != null && session.getAttribute("userEmail") != null) {
            response.sendRedirect(NORMALPG);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

//         Neu chua thi return login
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String getType = request.getParameter("e");

        if (getType != null && !getType.isEmpty()) {
            switch (getType) {
                case "register":
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "lostaccount":
                    request.getRequestDispatcher("lostaccount.jsp").forward(request, response);
                    break;
                case "registersuccess":
                    request.getRequestDispatcher("loginstatus.jsp").forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher("login.jsp").forward(request, response);

            }
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.dao = new UserDao();
        PrintWriter pwOut = response.getWriter();

        //get input from jsp		
        String em = request.getParameter("email");
        String pw = request.getParameter("password");
        //Validate Login with input
        if (this.dao.validateLogin(em, pw)) {
            //create session and store variables
            LoginUser user = dao.userSession(em);
            HttpSession session = request.getSession();

            // Khoi tao session trong database
            session.setAttribute("userID", user.getUserID());
            session.setAttribute("userFullName", user.getUserFullName());
            session.setAttribute("userEmail", user.getUserEmail());
            session.setAttribute("userSex", user.getUserSex());
            session.setAttribute("userBirthDay", user.getUserBirthDay());

//            session.setAttribute("userSex", user.getUserSex());
//            session.setAttribute("userBirthDay", user.getUserBirthDay());
            //load welcome page with session data
            response.sendRedirect(NORMALPG);

        } //if input is not stored in database print error message and reload page
        else {
            response.sendRedirect("?loginFail");
        }

        pwOut.close();

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
