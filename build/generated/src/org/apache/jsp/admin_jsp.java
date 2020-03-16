package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.DB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap/css/admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Home-Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark flex-md-nowrap p-4 shadow\">\n");
      out.write("    <a class=\"navbar-brand col-sm-2 col-md-11 mr-2\" href=\"admin.jsp\"><img class=\"position-absolute\" style=\" top:-10px\"  src=\"image/FEMS LOGO.png\" alt=\"\" width=\"72\" height=\"72\"></a>\n");
      out.write("  <ul class=\"navbar-nav px-3\">\n");
      out.write("    <li class=\"nav-item text-nowrap\">\n");
      out.write("             \n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <nav class=\"col-md-2 d-none d-md-block bg-light sidebar position-absolute\" style=\"top: 90px\">\n");
      out.write("      <div class=\"sidebar-sticky\">\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"admin.jsp\" style=\"padding:15px\">\n");
      out.write("              <span data-feather=\"home\"></span>\n");
      out.write("              <img src=\"image/homeOrange (1).png\" alt=\"\"/>\n");
      out.write("              Home <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"admintab.jsp\" style=\"padding:15px\">\n");
      out.write("              <span data-feather=\"file\"></span>\n");
      out.write("              <img src=\"image/request.png\" alt=\"\"/>\n");
      out.write("              Request Tab\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"admintab1.jsp\" style=\"padding:15px\">\n");
      out.write("              <span data-feather=\"shopping-cart\"></span>\n");
      out.write("               <img src=\"image/1.png\" alt=\"\"/>\n");
      out.write("              Borrowed Items\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"admintab2.jsp\" style=\"padding:15px\">\n");
      out.write("              <span data-feather=\"users\"></span>\n");
      out.write("              <img src=\"image/2.png\" alt=\"\"/>\n");
      out.write("              Returned Items\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"admintab3.jsp\" style=\"padding:15px\">\n");
      out.write("              <span data-feather=\"bar-chart-2\"></span>\n");
      out.write("              <img src=\"image/3.png\" alt=\"\"/>\n");
      out.write("              Inventory\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("      \n");
      out.write("      <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-1\">\n");
      out.write("             \n");
      out.write("           <div class=\"dropdown dropdown-dark bg-dark\" style=\"position: absolute; margin-top: -8.2%; margin-left: 85%;\" class=\" bg-dark \">\n");
      out.write("               <button class=\"btn btn-secondary dropdown-toggle bg-dark\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"width: 172%;\">\n");
      out.write("      <a class=\"nav-link\" href=\"login.jsp\" style=\"color: rgba(253, 99, 28, 1)\">Log out</a>\n");
      out.write("  </button>\n");
      out.write("               <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\" style=\"\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"adduser.jsp\" style=\"color: rgba(253, 99, 28, 1);\">\n");
      out.write("        <img src=\"image/addusers.png\" alt=\"\"/>\n");
      out.write("        Add User          \n");
      out.write("    </a>\n");
      out.write("                   \n");
      out.write("    <a class=\"dropdown-item\" href=\"login.jsp\" style=\"color: rgba(253, 99, 28, 1);\">\n");
      out.write("        <img src=\"image/log-out.png\" alt=\"\"/>\n");
      out.write("       Log out\n");
      out.write("                \n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("           </div>\n");
      out.write("            ");
 
             try{
            String username=(String)session.getAttribute("username");
        if(username!=null){
        }
            
      out.write("\n");
      out.write("        <center color><h2>Welcome to Admin Portal ");
      out.print(username);
      out.write("!</h2></center>\n");
      out.write("        \n");
      out.write("            ");

                }
               catch (Exception e) {
                out.println(e);
            }
        
      out.write("\n");
      out.write("      </main>\n");
      out.write("       \n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
