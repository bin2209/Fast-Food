<%-- 
    Document   : login.jsp
    Created on : Jan 13, 2024, 7:35:58 PM
    Author     : mac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>



<div class="container" style="padding: 40px 0px;">
    <form method="post">
        <div class="mb-3">
            <label class="form-label">Username</label>
            <input type="text" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        </div>

        <div class="mb-3">
            <label class="form-label">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1">
        </div>    
        <button type="submit" class="btn btn-primary">Submit</button>
        <p><a class="link-opacity-100-hover" href="?e=register">Trở thành thành viên Fast Food</a></p>
        <p><a class="link-opacity-100-hover" href="?e=lostaccount">Quên mật khẩu?</a></p>
    </form>
</div>e




<%@ include file="include/footer.jsp" %>