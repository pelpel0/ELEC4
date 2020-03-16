package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_002d1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("         <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"form.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("  <div class=\"py-5 text-center\">\n");
      out.write("    <img class=\"d-block mx-auto mb-4\" src=\"/docs/4.4/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("    <h2>Request Form</h2>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("  <div class=\"row   \">\n");
      out.write("    <div class=\"col-md-4 order-md-2 mb-4\">\n");
      out.write("      <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div class=\"col-md-12 order-md-1\">\n");
      out.write("\n");
      out.write("    <form class=\"needs-validation\" novalidate>\n");
      out.write("          \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label for=\"firstName\">First name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"\" value=\"\" required autofocus>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid first name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label for=\"lastName\">Last name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name =\"lname\" placeholder=\"\" value=\"\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid last name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Item</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"item\" placeholder=\"\" value=\"\" required>\n");
      out.write("                  <div class=\"invalid-feedback\">\n");
      out.write("              Please enter valid item name.\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Quantity</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"quantity\" placeholder=\"\" value=\"\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Please enter valid Quantity.\n");
      out.write("            </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label>Email</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"\" value=\"\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Please enter valid Email.\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label>Student Number</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"studentnumber\" placeholder=\"\" value=\"\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Please enter valid Student Number.\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Course</label>\n");
      out.write("                <select class=\"custom-select d-block w-100\" id=\"country\" required>\n");
      out.write("              <option value=\"\">Choose...</option>\n");
      out.write("              <option>Computer Engineering</option>\n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Year</label>\n");
      out.write("                <select class=\"custom-select d-block w-100\" id=\"state\" required>\n");
      out.write("              <option value=\"\">Choose...</option>\n");
      out.write("              <option>1st</option>\n");
      out.write("            </select>\n");
      out.write("            </div>   \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Section</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"zip\" placeholder=\"\" required>\n");
      out.write("            <div class=\"invalid-feedback\">\n");
      out.write("              Required.\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr class=\"mb-3\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </form>\n");
      out.write("<div>   \n");
      out.write("    <footer class=\"my-5 pt-5 text-muted text-center text-small\">\n");
      out.write("        <p class=\"mb-4\">&copy; 2017-2019 FEMS</p>\n");
      out.write("        <ul class=\"list-inline\">\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Privacy</a></li>\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Terms</a></li>\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Support</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("</div>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
