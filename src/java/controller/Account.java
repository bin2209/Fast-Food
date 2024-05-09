package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Account/*")
public class Account extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);

        // Check if the user is logged in
        if (session != null && session.getAttribute("userEmail") != null) {
            String pathInfo = request.getPathInfo();
            
            if (pathInfo != null) {
                String[] parts = pathInfo.split("/");
                
                if (parts.length > 1) {
                    String action = parts[1];
                    
                    switch (action) {
                        case "edit":
                            // Handle edit action
                            request.setAttribute("pageTitle", "Edit Account");
                            // Forward the request to the JSP with the specific content for edit
                            request.getRequestDispatcher("/account/accountEdit.jsp").forward(request, response);
                            break;
                        case "cart":
                            // Handle cart action
                            request.setAttribute("pageTitle", "Shopping Cart");
                            // Forward the request to the JSP with the specific content for cart
                            request.getRequestDispatcher("/account/accountCart.jsp").forward(request, response);
                            break;
                        // Add other cases for additional actions
                        default:
                            // Handle other actions or redirect to an error page
                            response.sendRedirect(request.getContextPath() + "/error");
                            return;
                    }
                }
            } else {
                // If no specific action is provided, forward to the default account page
                request.getRequestDispatcher("account.jsp").forward(request, response);
            }
        } else {
            // If the user is not logged in, redirect to the login page
            response.sendRedirect("login");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
