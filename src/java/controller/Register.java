/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginUser;
import util.UserDao;

/**
 *
 * @author mac
 */
public class Register extends HttpServlet {

    private final UserDao dao;

    public Register() {
        super();
        dao = new UserDao(); //create new data object

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginUser user = new LoginUser();	//create new user object	
        PrintWriter pwOut = response.getWriter();

        String userFullName = request.getParameter("userFullName");
        String userEmail = request.getParameter("userEmail");
        String userPass = request.getParameter("userPass");

//        String userID = request.getParameter("userid");
        user.setUserFullName(userFullName);
        user.setUserEmail(userEmail);
        user.setUserPass(userPass);

        if (dao.validateRegister(userEmail)) {
            dao.createUser(user);

            pwOut.print("Registration Successful! Please Login.");
            response.setContentType("text/html");
//            RequestDispatcher view = request.getRequestDispatcher("/login.jsp");
            response.sendRedirect("login?e=registersuccess");
        } else {
            pwOut.print("Fail! You already register by this email! Please Login.");
            response.setContentType("text/html");
            RequestDispatcher view = request.getRequestDispatcher("/register.jsp");
            view.include(request, response); 
        }
    }
}
