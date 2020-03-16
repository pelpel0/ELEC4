package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class request_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/form.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"bootstrap/js/validation.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Request Form</title>\n");
      out.write("        <style>\n");
      out.write("        .container{\n");
      out.write("          opacity:1;\n");
      out.write("/*          width: 52.4%;*/\n");
      out.write("          position: relative;\n");
      out.write("/*          margin: 2%; \n");
      out.write("          position: absolute;\n");
      out.write("          right: -60px;\n");
      out.write("          top:-20px;\n");
      out.write("          height: auto;\n");
      out.write("          height: 20px;*/\n");
      out.write("/*          background-color: #0069d9;\n");
      out.write("          opacity: 0.5;\n");
      out.write("          width: 50%;\n");
      out.write("*/          margin: 2%; /*\n");
      out.write("          position: absolute;\n");
      out.write("          right: 0px;*/\n");
      out.write("            }\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("/*.backh{\n");
      out.write("          height: auto;\n");
      out.write("          height: 1100px;\n");
      out.write("          width: 50%;\n");
      out.write("          position: absolute;\n");
      out.write("      }\n");
      out.write("      .imahe{\n");
      out.write("          height: auto;\n");
      out.write("        height: 100px;\n");
      out.write("          width: 50%;\n");
      out.write("          position: absolute;\n");
      out.write("          left: 12%;\n");
      out.write("          top:15%;\n");
      out.write("        }*/\n");
      out.write("\n");
      out.write("      \n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("         label{\n");
      out.write("            color: rgba(253, 99, 28, 1);\n");
      out.write("        }\n");
      out.write("         input{\n");
      out.write("          order-radius: 25px;\n");
      out.write("          border: 2px solid #FF6347;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("    </head>\n");
      out.write("<!--    <img class=\"backh\"  src=\"image/backh.jpg\" alt=\"\"/>\n");
      out.write("     <img class=\"imahe \"  src=\"image/backj.png\" alt=\"\"/>-->\n");
      out.write("   <body class=\"bg-dark\">\n");
      out.write("   <center>\n");
      out.write("    <div class=\"container\" >\n");
      out.write("  <div class=\"py-0 text-center\">\n");
      out.write("    <img class=\"d-block mx-auto mb-1\" src=\"image/FEMS LOGO.png\" alt=\"\" width=\"102\" height=\"102\">\n");
      out.write("    <h2 style=\"color: rgba(253, 99, 28, 1);\">Request Form</h2>\n");
      out.write("     </div>  \n");
      out.write("         <form action=\"addrequest\" method=\"post\"> \n");
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
      out.write("                <label>First name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"\" value=\"\" required autofocus>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid first name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Last name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name =\"lname\" placeholder=\"\" value=\"\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid last name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label>Email<span class=\"text-muted\">(Optional)</span></label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"you@example.com\" value=\"\" required>\n");
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
      out.write("                <input type=\"text\" class=\"form-control\" name=\"studentnumber\" placeholder=\"20**-*****-MN-0\" value=\"\" required>\n");
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
      out.write("                <select class=\"custom-select d-block w-100\" name=\"course\" required>\n");
      out.write("              <option value=\"\">Choose...</option>\n");
      out.write("              <option>BSCPE</option>\n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Year</label>\n");
      out.write("                <select class=\"custom-select d-block w-100\" name=\"year\" required>\n");
      out.write("              <option value=\"\">Choose...</option>\n");
      out.write("              <option>1</option>\n");
      out.write("              <option>2</option>\n");
      out.write("              <option>3</option>\n");
      out.write("              <option>4</option>\n");
      out.write("              <option>5</option>\n");
      out.write("            </select>\n");
      out.write("            </div>   \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Section</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"section\" placeholder=\"\" required>\n");
      out.write("            <div class=\"invalid-feedback\">\n");
      out.write("              Required.\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label>Request Details</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"requestdetails\" placeholder=\"\" value=\"\" required style = \"height:110%\">\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Required.\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"padding:25px\">\n");
      out.write("        <hr class=\"mb-3\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-4 mb-4\">\n");
      out.write("                <button style=\"border-radius: 25px; border: 2px solid #FF6347; width: 200px; background-color: rgba(253, 99, 28, 1);\" class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" name=\"Addrequest\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("        </div>\n");
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
      out.write("</center>\n");
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
