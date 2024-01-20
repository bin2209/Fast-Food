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
    <form action="authLogin" method="post">
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="user" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        </div>

      

        <button type="submit" class="btn btn-primary">Submit</button>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/login"> Đã là thành viên Fast Food</a></p>
        <p><a class="link-opacity-100-hover" href="${pageContext.request.contextPath}/login?type=1">Đăng ký tài khoản</a></p>
    </form>
</div>




<%@ include file="include/footer.jsp" %>