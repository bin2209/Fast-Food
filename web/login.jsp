<%-- 
    Document   : login.jsp
    Created on : Jan 13, 2024, 7:35:58 PM
    Author     : mac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>

<%

//    String uri = request.getRequestURI();
//
//  // Extract the context path
////    String contextPath = request.getContextPath();
//
//    // Remove the context path from the URI to get the relative path
//    String relativePath = uri.substring(contextPath.length());
//
//    // Perform switch case based on the relative path
//    switch (relativePath) {
//      case "/services":
//        // Logic for the /services case
//        out.println("Explore our services here.");
//        break;
//
//      default:
//        // Default case if the URL doesn't match any expected patterns
//        request.getRequestDispatcher("template/home.jsp").include(request, response);
//
//        break;
//    }
%>

<div class="container" style="padding: 40px 0px;">
    <form action="authLogin" method="post">
        <div class="mb-3">
            <label class="form-label">Username</label>
            <input type="text" name="user" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        </div>

        <div class="mb-3">
            <label class="form-label">Password</label>
            <input type="password" name="pass" class="form-control" id="exampleInputPassword1">
        </div>    

        <button type="submit" class="btn btn-primary">Submit</button>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/authLogin?type=1">Trở thành thành viên Fast Food</a></p>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/authLogin?type=2">Quên mật khẩu?</a></p>
    </form>
</div>




<%@ include file="include/footer.jsp" %>