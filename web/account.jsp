<%@ page import="java.util.Enumeration" %>
<%@ page import="model.LoginUser" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ include file="include/header.jsp" %>
<%@ include file="include/navbar.jsp" %>
<%@ page isELIgnored="false" %>

<jsp:useBean id="user" class="model.LoginUser" scope="session" />
<jsp:setProperty name="user" property="*" />

<title>${pageTitle}</title>

<%
    // Display session attributes for debugging (remove in production)
    Enumeration<String> attributeNames = session.getAttributeNames();
    while (attributeNames.hasMoreElements()) {
        String attributeName = attributeNames.nextElement();
        Object attributeValue = session.getAttribute(attributeName);
        out.println("<p>" + attributeName + ": " + attributeValue + "</p>");
    }
%>

<section class="untree_co-section">
    <div class="container">
        <div class="row">
            <div class="col-md-6 mb-5 mb-md-0">
                <div class="p-3 p-lg-5 rounded-5 bg-white">
                    <h2 class="h3 mb-3 text-black"> Hi ${user != null ? user.userFullName : 'Guest'}!</h2>
                    <p><a href="logout">Logout</a></p>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="account/edit">Account detail</a></li>
                        <li class="list-group-item"><a href="account/history-order">History order</a></li>
                        <li class="list-group-item"><a href="account/favorite-order">Favorite order</a></li>
                        <li class="list-group-item"><a href="account/billing">Billing settings</a></li>
                        <li class="list-group-item"><a href="account/changepass">Change password</a></li>
                        <li class="list-group-item"><a href="account/delete">Delete account</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-6 mb-5 mb-md-0">
                <div class="p-3 p-lg-5 rounded-5 bg-white">
                    <!-- Additional content for the second column if needed -->
                </div>
            </div>
        </div>
    </div>
</section>

<%@ include file="include/footer.jsp" %>
