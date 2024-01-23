<%-- 
    Document   : account
    Created on : Jan 19, 2024, 4:48:39 PM
    Author     : mac
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<%@ page import="java.io.IOException" %>  
<%@ include file="include/navbar.jsp" %>

<%
    Enumeration<String> attributeNames = session.getAttributeNames();

    while (attributeNames.hasMoreElements()) {
        String attributeName = attributeNames.nextElement();
        Object attributeValue = session.getAttribute(attributeName);

        out.println("<p>" + attributeName + ": " + attributeValue + "</p>");
    }
%>

<!--Account Edit Information -->
<section class="untree_co-section">
    <div class="container">
        <div class="row">
            <div class="col-md-6 mb-5 mb-md-0">
                <div class="p-3 p-lg-5 rounded-5 bg-white">
                    <h2 class="h3 mb-3 text-black">Hi <%=session.getAttribute("userFullName")%> ! </h2>

                    <ul class="list-group">
                        <li class="list-group-item"><a href="logout">Logout</a></li>
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
                    <h2 class="h3 mb-3 text-black">Account Details</h2>
                    <form class="form-group row">
                        <div class="col-md-12">
                            <label for="c_fname" class="text-black">Full Name <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="c_fname" name="c_fname" placeholder="<%=session.getAttribute("userFullName")%>">
                        </div>
                        <div class="col-md-6">
                            <label for="c_email_address" class="text-black">Email Address <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" value="<%=session.getAttribute("userEmail")%>" disabled>
                        </div>
                        <div class="col-md-6">
                            <label for="c_phone" class="text-black">Phone <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="c_phone" name="c_phone" placeholder="Phone number" value="<%=session.getAttribute("userPhone")%>">
                        </div>
                        <div class="col-md-6">
                            <label class="text-black">Gender <span class="text-danger">*</span></label>
                            <select class="form-select form-control" aria-label="Default select example">
                                <option selected>Select your gender</option>
                                <option value="m">Man</option>
                                <option value="f">Female</option>
                                <option value="o">Other</option>
                            </select>
                        </div>
                        <div class="col-md-6">
                            <label for="c_phone" class="text-black">Date of Birth</label>
                            <input type="date" class="form-control"  name="c_phone" placeholder="">
                        </div>

                        <div class="col-md-12">
                            <label for="c_address" class="text-black">Address <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="c_address" name="c_address" placeholder="Street address" value="<%=session.getAttribute("userPhone")%>">
                        </div>


                        <div class="col-md-6">
                            <label for="c_state_country" class="text-black">State / Country <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="c_state_country" name="c_state_country">
                        </div>
                        <div class="col-md-6">
                            <label for="c_postal_zip" class="text-black">Posta / Zip <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="c_postal_zip" name="c_postal_zip">
                        </div>
                    </form>
                    <br>
                    <button class="btn btn-secondary me-2" type="submit" disabled>Cập nhật tài khoản</button>
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



<%@ include file="include/footer.jsp" %>