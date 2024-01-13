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
                    <h1>Xuân Giáp Thìn <span class="d-block">Tiệc Linh Đình</span></h1>
                    <p class="mb-4">Combo 299K .</p>
                    <p><a href="" class="btn btn-secondary me-2">Đặt Ngay</a><a href="#" class="btn btn-white-outline">Xem Thêm</a></p>
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