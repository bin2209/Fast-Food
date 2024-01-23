<%-- 
    Document   : loginstatus
    Created on : Jan 23, 2024, 2:51:49 PM
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>
<!--HOME PAGE-->
<!--login?e=registersuccess-->

<section class="why-choose-section">
    <div class="container">
        <div class="row justify-content-between">
             <div class="col-lg-5">
                <div class="img-wrap">
                    <img src="${pageContext.request.contextPath}/static/images/register.jpg" alt="Image" class="img-fluid">
                </div>
                
            </div>
            
            
            <div class="col-lg-6">
                <h2 class="section-title">Congratulation!! Register successfully</h2>
                
                <p>So glad to welcome you</p>

                <a href="login" class="btn btn-secondary me-2">Continue Login</a>
            </div>

           

        </div>
    </div>
</section>


<%@ include file="include/footer.jsp" %>