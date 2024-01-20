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
    <form action="authLogin" method="post">
        <div class="mb-3">
            <label class="form-label">Full Name</label>
            <input type="text" name="user" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        </div>

        <div class="mb-3">
            <label class="form-label">Username</label>
            <input type="password" name="pass" class="form-control" id="exampleInputPassword1">
        </div>    

         <div class="mb-3">
            <label class="form-label">Password</label>
            <input type="password" name="pass" class="form-control" id="exampleInputPassword1">
        </div> 
        
          <div class="mb-3">
            <label class="form-label">Retype Password</label>
            <input type="password" name="pass" class="form-control" id="exampleInputPassword1">
        </div>    

        <button type="submit" class="btn btn-primary">Submit</button>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/login.jsp"> Đã là thành viên Fast Food</a></p>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/login?type=2">Quên mật khẩu?</a></p>
    </form>
</div>




<%@ include file="include/footer.jsp" %>