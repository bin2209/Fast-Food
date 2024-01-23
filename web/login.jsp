<%-- 
    Document   : login.jsp
    Created on : Jan 13, 2024, 7:35:58 PM
    Author     : mac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>


<section class="why-choose-section">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-lg-5">
                <div class="img-wrap">
                    <img src="${pageContext.request.contextPath}/static/images/register.jpg" alt="Image" class="img-fluid">
                </div>

            </div>
            <div class="col-lg-5 container">
                <h2 class="section-title">Login</h2>

                <form method="post">
                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input type="text" name="email" class="form-control" aria-describedby="emailHelp" required>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input type="password" name="password" class="form-control"  required>
                    </div>    
                    <button type="submit" class="btn btn-primary">Login</button>
                    <p><a class="link-opacity-100-hover" href="login?e=register">Trở thành thành viên Fast Food</a></p>
                    <p><a class="link-opacity-100-hover" href="login?e=lostaccount">Quên mật khẩu?</a></p>
                </form>
            </div>
        </div>
    </div>
</section>




<%@ include file="include/footer.jsp" %>