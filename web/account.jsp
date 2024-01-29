<%-- 
    Document   : account
    Created on : Jan 19, 2024, 4:48:39 PM
    Author     : mac
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="../include/navbar.jsp" %>

<%
    Enumeration<String> attributeNames = session.getAttributeNames();

    while (attributeNames.hasMoreElements()) {
        String attributeName = attributeNames.nextElement();
        Object attributeValue = session.getAttribute(attributeName);

        out.println("<p>" + attributeName + ": " + attributeValue + "</p>");
    }
%>
<!-- Display session attributes -->
<section class="untree_co-section">
    <div class="container">
        <div class="row">
            <div class="col-md-6 mb-5 mb-md-0">
                <div class="p-3 p-lg-5 rounded-5 bg-white">
                    <h2 class="h3 mb-3 text-black">Hi <span th:text="${session.getAttribute('userFullName')}">Guest</span>!</h2>
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
                   
                    <th:block th:replace="${contentTemplate} :: edit"></th:block>
                </div>
            </div>
        </div>
    </div>
</section>

<script>
    // Initial form state
    var initialFormState = document.getElementById('myForm').innerHTML;

    // Function to check form changes and enable/disable the button
    function checkFormChanges() {
        var submitButton = document.getElementById('submitButton');

        // Enable the button if the form content has changed
        submitButton.disabled = document.getElementById('myForm').innerHTML === initialFormState;
    }
</script>
<%@ include file="../include/footer.jsp" %>