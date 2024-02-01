<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>
<!--HOME PAGE-->
<section class="hero">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-lg-5">
                <div class="intro-excerpt">
                    <h1>OOPS! WE’RE SORRY<span class="d-block">Something wrong!</span></h1>
                    <p><a href="<%= request.getContextPath() %>" class="btn btn-white-outline">Back to home</a></p>
                </div>
            </div>
            <div class="col-lg-7">
                <div class="hero-img-wrap">
                    <img src="${pageContext.request.contextPath}/static/images/KFC.png" class="img-fluid">
                </div>
            </div>
        </div>
    </div>
</section>




<%@ include file="include/footer.jsp" %>