<%-- 
    Document   : register
    Created on : Jan 17, 2024, 1:21:57 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>

<%

%>

<div class="container" style="padding: 40px 0px;">
    <form action="" method="post">
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="user" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        </div>

      

        <button type="submit" class="btn btn-primary">Submit</button>
        <p><a class="link-opacity-100-hover" href="login">Trở về đăng nhập</a></p>
        <p><a class="link-opacity-100-hover" href="?e=register">Đăng ký tài khoản</a></p>
    </form>
</div>




<%@ include file="include/footer.jsp" %>