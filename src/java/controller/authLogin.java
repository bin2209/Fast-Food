/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
/**
 *
 * @author mac
 */
public class authLogin extends HttpServlet {
//    demo db
    private User[] users;
    public void init() throws ServletException {
        users = new User[2];
        users[0] = new User(0, "nhtruong1", "pass1", "Nguyen Hai Truong", 'M', "22/09/2003");
        users[1] = new User(1, "nhtruong2", "pass2", "Nguyen Hai Hai", 'M', "22/09/2005");
    }
//    demo db

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                response.setContentType("text/html");
                String username = request.getParameter("user");
                String password = request.getParameter("pass");

                if (isValidUser(username, password)) {
                    HttpSession session = request.getSession();
                    User user = getUserByUsername(username);
                    session.setAttribute("user", user);

                    // xem tren url de check 
                    response.sendRedirect("success.jsp");
                } else {
                    response.sendRedirect("fail.jsp");
                }
        }
    }
    
    
    private boolean isValidUser(String username, String password) {
        // Use a while loop to check if the login already exists in the User array
        int index = 0;
        while (index < users.length) {
            User user = users[index];
            if (user.getUserName().equals(username) && user.getUserPass().equals(password)) {
                return true;
            }
            index++;
        }
        return false;
    }

    private User getUserByUsername(String username) {
        // Retrieve the User object from the array based on the username
        for (User user : users) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
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
        processRequest(request, response);
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
        processRequest(request, response);
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
