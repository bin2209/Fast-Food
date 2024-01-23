<%-- 
    Document   : register
    Created on : Jan 17, 2024, 1:21:57 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>



<div class="container" style="padding: 40px 0px;">
    <form action="register" method="post" oninput="repass.setCustomValidity(repass.value != pass.value ? 'Passwords do not match.' : '')">
        <div class="mb-3">
            <label class="form-label">Full Name</label>
            <input type="text" name="user" class="form-control" aria-describedby="emailHelp" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="pass" class="form-control" required>
        </div>    

         <div class="mb-3">
            <label class="form-label">Password</label>
            <input type="password" name="pass" class="form-control" required>
        </div> 
        
          <div class="mb-3">
            <label class="form-label">Retype Password</label>
            <input type="password" name="repass" class="form-control" required>
        </div>    

        <button type="submit" class="btn btn-primary">Register</button>
        <p><a class="link-opacity-100-hover" href="login"> Đã là thành viên Fast Food</a></p>
        <p><a class="link-opacity-100-hover" href="login?e=lostaccount">Quên mật khẩu?</a></p>
    </form>
</div>




<%@ include file="include/footer.jsp" %>