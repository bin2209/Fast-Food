/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.84
 * Generated at: 2024-01-29 14:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.io.IOException;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/templates/../include/navbar.jsp", Long.valueOf(1706537987363L));
    _jspx_dependants.put("/templates/../include/header.jsp", Long.valueOf(1706537987360L));
    _jspx_dependants.put("/templates/../include/footer.jsp", Long.valueOf(1706537987354L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("java.io.IOException");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <!--<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">-->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/styles.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/tiny.css\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<nav class=\"custom-navbar navbar navbar-expand-md navbar-dark bg-dark\" aria-label=\"Furni navigation bar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <img class=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/logo.png\" alt=\"alt\"/>Fast Food\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarsFurni\" aria-controls=\"navbarsFurni\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsFurni\">\n");
      out.write("            <ul class=\"custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0\">\n");
      out.write("                <li><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Home</a></li>\n");
      out.write("                <li><a class=\"nav-link active\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/menu\">Menu</a></li>\n");
      out.write("                <li><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/service\">Services</a></li>\n");
      out.write("                <li><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/contact\">Contact us</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5\">\n");
      out.write("                ");

                    // HttpSession session = request.getSession(false);
                    if (session != null && session.getAttribute("userEmail") != null) {
                
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\"  id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/user.svg\">\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"account\">Account Detail</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"logout\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <li><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/user.svg\"></a></li>\n");
      out.write("\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                <li><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cart\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/cart.svg\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write('\n');
      out.write('\n');

    Enumeration<String> attributeNames = session.getAttributeNames();

    while (attributeNames.hasMoreElements()) {
        String attributeName = attributeNames.nextElement();
        Object attributeValue = session.getAttribute(attributeName);

        out.println("<p>" + attributeName + ": " + attributeValue + "</p>");
    }

      out.write("\n");
      out.write("<!-- Display session attributes -->\n");
      out.write("<section class=\"untree_co-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("                <div class=\"p-3 p-lg-5 rounded-5 bg-white\">\n");
      out.write("                    <h2 class=\"h3 mb-3 text-black\">Hi <span th:text=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session.getAttribute('userFullName')}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Guest</span>!</h2>\n");
      out.write("                    <p><a href=\"logout\">Logout</a></p>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/edit\">Account detail</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/history-order\">History order</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/favorite-order\">Favorite order</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/billing\">Billing settings</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/changepass\">Change password</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"account/delete\">Delete account</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 mb-5 mb-md-0\">\n");
      out.write("                <div class=\"p-3 p-lg-5 rounded-5 bg-white\">\n");
      out.write("                   \n");
      out.write("                    <th:block th:replace=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contentTemplate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" :: edit\"></th:block>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    // Initial form state\n");
      out.write("    var initialFormState = document.getElementById('myForm').innerHTML;\n");
      out.write("\n");
      out.write("    // Function to check form changes and enable/disable the button\n");
      out.write("    function checkFormChanges() {\n");
      out.write("        var submitButton = document.getElementById('submitButton');\n");
      out.write("\n");
      out.write("        // Enable the button if the form content has changed\n");
      out.write("        submitButton.disabled = document.getElementById('myForm').innerHTML === initialFormState;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"footer-section\">\n");
      out.write("    <div class=\"container relative\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("                <div class=\"subscription-form\">\n");
      out.write("                    <h3 class=\"d-flex align-items-center\"><span class=\"me-1\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/envelope-outline.svg\" alt=\"Image\" class=\"img-fluid\"></span><span>Subscribe to Newsletter</span></h3>\n");
      out.write("\n");
      out.write("                    <form action=\"#\" class=\"row g-3\">\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter your name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("                            <button class=\"btn btn-primary\">\n");
      out.write("                                <span class=\"fa fa-paper-plane\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row g-5 mb-5\">\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <div class=\"mb-4 footer-logo-wrap\"><a href=\"#\" class=\"footer-logo\">Fast Food<span>.</span></a></div>\n");
      out.write("                <p class=\"mb-4\">Donec facilisis quam ut purus rutrum lobortis. Donec vitae odio quis nisl dapibus malesuada. Nullam ac aliquet velit. Aliquam vulputate velit imperdiet dolor tempor tristique. Pellentesque habitant</p>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled custom-social\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-brands fa-facebook-f\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-brands fa-twitter\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-brands fa-instagram\"></span></a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-brands fa-linkedin\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("                <div class=\"row links-wrap\">\n");
      out.write("                    <div class=\"col-6 col-sm-6 col-md-3\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">About us</a></li>\n");
      out.write("                            <li><a href=\"#\">Services</a></li>\n");
      out.write("                            <li><a href=\"#\">Blog</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-6 col-sm-6 col-md-3\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">Support</a></li>\n");
      out.write("                            <li><a href=\"#\">Knowledge base</a></li>\n");
      out.write("                            <li><a href=\"#\">Live chat</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-6 col-sm-6 col-md-3\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">Jobs</a></li>\n");
      out.write("                            <li><a href=\"#\">Our team</a></li>\n");
      out.write("                            <li><a href=\"#\">Leadership</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-6 col-sm-6 col-md-3\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\">Nordic Chair</a></li>\n");
      out.write("                            <li><a href=\"#\">Kruzo Aero</a></li>\n");
      out.write("                            <li><a href=\"#\">Ergonomic Chair</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"border-top copyright\">\n");
      out.write("            <div class=\"row pt-4\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <p class=\"mb-2 text-center text-lg-start\">Copyright ©<script>document.write(new Date().getFullYear());</script>. FPT</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-6 text-center text-lg-end\">\n");
      out.write("                    <ul class=\"list-unstyled d-inline-flex ms-auto\">\n");
      out.write("                        <li class=\"me-4\"><a href=\"#\">Terms &amp; Conditions</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
