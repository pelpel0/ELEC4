package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.DB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admintab1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap/css/admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("         \n");
      out.write("       \n");
      out.write("  <nav class=\"navbar navbar-dark  bg-dark flex-md-nowrap p-0 shadow\">\n");
      out.write("  <a class=\"navbar-brand col-sm-6 col-md-2 mr-0\" href=\"#\"> <img class=\"d-block mx-auto mb-1\" src=\"image/FEMS LOGO.png\" alt=\"\" width=\"72\" height=\"72\"></a>\n");
      out.write("  <ul class=\"navbar-nav px-3\">\n");
      out.write("    <li class=\"nav-item text-nowrap\">\n");
      out.write("      <a class=\"nav-link\" href=\"login.jsp\">Sign out</a>\n");
      out.write("      \n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <nav class=\"col-md-20 d-none d-md-block bg-light sidebar\">\n");
      out.write("      <div class=\"sidebar-sticky\">\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" href=\"#\" style=\"padding:15px\">\n");
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
      out.write("  <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-2\">\n");
      out.write("      <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("          \n");
      out.write("             <table id=\"myTable\" class=\"table table-striped\"  >\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Borrow NO.</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Student Number</th>\n");
      out.write("            <th>Course</th>\n");
      out.write("            <th>Year</th>\n");
      out.write("            <th>Section</th>\n");
      out.write("            <th>Item</th>\n");
      out.write("            <th>Date</th>\n");
      out.write("            <th>Time</th>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("    ");

        try {
            String deleted = (String) session.getAttribute("deleted");
            if (deleted != null) {
                session.removeAttribute("deleted");
                out.println("<center><div class='alert alert-danger'>"+deleted+"</div></center>");
            } else {
            }
            String updated = (String) session.getAttribute("updated");
            if (updated != null) {
                session.removeAttribute("updated");
                out.println("<center><div class='alert alert-success'>"+updated+"</div></center>");
            } else {
            }
            
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from borrow");
            while (rs.next()) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("       \n");
      out.write("           \n");
      out.write("<!--            <td>\n");
      out.write("                <a href=\"edit.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\">Edit</a>&nbsp;|&nbsp;\n");
      out.write("                <a href=\"fems?delete='delete'&&id=");
      out.print(rs.getInt("id"));
      out.write("\">Delete</a>\n");
      out.write("            </td>-->\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("    </div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
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
