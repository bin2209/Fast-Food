<%-- 
    Document   : navbar
    Created on : Jan 9, 2024, 7:53:45 PM
    Author     : mac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Fast Food</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}">Home</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}/service.jsp">Service</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}/contact.jsp">Contact</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}/login.jsp">Login</a>
        </li>
      </ul>
        
      <form class="" role="search">
        <input class="form-control" type="search" placeholder="Search" aria-label="Search">
      </form>
        
         <button class="btn btn-primary" type="button">Login</button>
        
       
        
    </div>
  </div>
</nav>