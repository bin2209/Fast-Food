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
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td colspan="2">Larry the Bird</td>
                            <td>@twitter</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</section>

<%@ include file="include/footer.jsp" %>
