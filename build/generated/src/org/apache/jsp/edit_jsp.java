package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

if(request.getParameter("submit")!=null){

String id = request.getParameter("id");
String name = request.getParameter("name");
String lname = request.getParameter("lname");
String studentnumber = request.getParameter("studentnumber");
String email = request.getParameter("email");
String course = request.getParameter("course");
String year = request.getParameter("year");
String section = request.getParameter("section");
String requestdetails = request.getParameter("requestdetails");
String approval = request.getParameter("approval");

Connection con;
PreparedStatement pst;
ResultSet rs;

Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");
pst = con.prepareStatement("update request set name=?,lname=?,studentnumber=?,email=?,course=?,year=?,section=?,requestdetails=?,approval=? where id=?");
pst.setString(1,name);
pst.setString(2,lname);
pst.setString(3,studentnumber);
pst.setString(4,email);
pst.setString(5,course);
pst.setString(6,year);
pst.setString(7,section);
pst.setString(8,requestdetails);
pst.setString(9,approval);
pst.setString(10,id);
pst.executeUpdate();

      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Your record has been updated!\");\n");
      out.write("</script>\n");
      out.write("\n");

}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form method=\"POST\" action=\"#\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

                    Connection con;
                    PreparedStatement pst;
                    ResultSet rs;

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");

                    String id = request.getParameter("id");
                    
                    pst = con.prepareStatement("select * from request where id = ?");
                    pst.setString(1,id);
                    rs=pst.executeQuery();
                    
                    while(rs.next()){

                
      out.write("\n");
      out.write("                 <title>Request Form</title>\n");
      out.write("        <style>\n");
      out.write("        .container{\n");
      out.write("          opacity:1;\n");
      out.write("          height: auto;\n");
      out.write("          margin: 180px; \n");
      out.write("          margin-top: 10px;\n");
      out.write("            }\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("     \n");
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
      out.write("   <body class=\"bg-dark\" >\n");
      out.write("   <center>\n");
      out.write("    <div class=\"container\" >\n");
      out.write("  <div class=\"py-0 text-center\">\n");
      out.write("    <img class=\"d-block mx-auto mb-1\" src=\"image/FEMS LOGO.png\" alt=\"\" width=\"102\" height=\"102\">\n");
      out.write("    <h2 style=\"color: rgba(253, 99, 28, 1);\">Request Form</h2>\n");
      out.write("     </div>   \n");
      out.write("  <div class=\"row   \">\n");
      out.write("    <div class=\"col-md-4 order-md-2 mb-4\">\n");
      out.write("      <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("    <div class=\"col-md-12 order-md-1\">\n");
      out.write("    <form class=\"needs-validation\" novalidate> \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("   \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>First name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"\" value=\"");
      out.print(rs.getString("name"));
      out.write("\" required autofocus>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid first name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Last name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name =\"lname\" placeholder=\"\" value=\"");
      out.print(rs.getString("lname"));
      out.write("\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Valid last name is required.\n");
      out.write("            </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Email<span class=\"text-muted\">(Optional)</span></label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"you@example.com\" value=\"");
      out.print(rs.getString("email"));
      out.write("\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Please enter valid Email.\n");
      out.write("            </div>\n");
      out.write("            </div>      \n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("                <label>Student Number</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"studentnumber\" value=\"");
      out.print(rs.getString("studentnumber"));
      out.write("\" placeholder=\"20**-*****-MN-0\" value=\"\" required>\n");
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
      out.write("                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("course"));
      out.write("\" name=\"course\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Year</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("year"));
      out.write("\" name=\"year\" required>\n");
      out.write("            </div>   \n");
      out.write("            <div class=\"col-md-2 mb-3\">\n");
      out.write("                <label>Section</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("section"));
      out.write("\" name=\"section\" placeholder=\"\" required>\n");
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
      out.write("                <input type=\"text\" class=\"form-control\" name=\"requestdetails\" placeholder=\"\" value=\"");
      out.print(rs.getString("requestdetails"));
      out.write("\" required style = \"height:110%\">\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Required.\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("                 <hr class=\"mb-3\">\n");
      out.write("                 <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 mb-3\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-2 mb-4\">\n");
      out.write("                <label>Approval Status</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"approval\" placeholder=\"\" value=\"");
      out.print(rs.getString("approval"));
      out.write("\" required>\n");
      out.write("                 <div class=\"invalid-feedback\">\n");
      out.write("              Status required!\n");
      out.write("            </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("                </br>\n");
      out.write("                <div alight =\"\">\n");
      out.write("                    <input type=\"submit\" id=\"submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                </div>\n");
      out.write("                <div align=\"\">\n");
      out.write("                    <p> <a href=\"admintab.jsp\">return</a></p>\n");
      out.write("                </div>\n");
      out.write("    <div>   \n");
      out.write("    <footer class=\"my-5 pt-5 text-muted text-center text-small\">\n");
      out.write("        <p class=\"mb-4\">&copy; 2017-2019 FEMS</p>\n");
      out.write("        <ul class=\"list-inline\">\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Privacy</a></li>\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Terms</a></li>\n");
      out.write("          <li class=\"list-inline-item\"><a href=\"#\">Support</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </footer>\n");
      out.write("    </div>\n");
      out.write("    </div>            \n");
      out.write("    </div>\n");
      out.write("    </div>   \n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("<!--                <div alight=\"right\">\n");
      out.write("                    <input type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                    <input type=\"reset\" id=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-warning\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div align=\"right\">\n");
      out.write("                    <p><a href=\"admintab.jsp\">Return</a></p>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("                 </center>\n");
      out.write("                </div>               -->\n");
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
