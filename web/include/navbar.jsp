<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark" arial-label="Furni navigation bar">
			<div class="container">
                            <a class="navbar-brand" href="${pageContext.request.contextPath}"><img class="logo" src="${pageContext.request.contextPath}/static/images/logo.png" alt="alt"/>Fast Food</a>

				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsFurni" aria-controls="navbarsFurni" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarsFurni">
					<ul class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
						<li> <a class="nav-link" href="${pageContext.request.contextPath}">Home</a></li>
						<li><a class="nav-link active" href="${pageContext.request.contextPath}/menu">Menu</a></li>
						<li><a class="nav-link" href="${pageContext.request.contextPath}/service">Services</a></li>
						<li><a class="nav-link" href="${pageContext.request.contextPath}/contact">Contact us</a></li>
					</ul>

					<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
						<li><a class="nav-link" href="${pageContext.request.contextPath}/login"><img src="${pageContext.request.contextPath}/static/images/user.svg"></a></li>
						<li><a class="nav-link" href="${pageContext.request.contextPath}/cart"><img src="${pageContext.request.contextPath}/static/images/cart.svg"></a></li>
					</ul>
				</div>
			</div>
				
		</nav>