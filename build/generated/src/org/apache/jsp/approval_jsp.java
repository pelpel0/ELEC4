package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.java.DB;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class approval_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Request tab</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <table id=\"tbl-student\" class=\"table table-responsive table-bordered\" cellpadding=\"0\" width=\"100%\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Student Number</th>\n");
      out.write("                            <th>Course</th>\n");
      out.write("                            <th>Year</th>\n");
      out.write("                            <th>Section</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>Time</th>\n");
      out.write("                            <th>Request Details</th>\n");
      out.write("                            <th>Approval</th>\n");
      out.write("                            <th>Edit</th>\n");
      out.write("                            <th>Reset</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            Connection con;
                            PreparedStatement pst;
                            ResultSet rs;

                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");
                                    
                                String query = "select * from request";
                                Statement st = con.createStatement();
                                

                                   rs= st.executeQuery(query);
                                   while(rs.next()){
                                   String id=rs.getString("id");
                                   
                                   
      out.write("\n");
      out.write("                                   \n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("studentnumber"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("course"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("year"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("section"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("time"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("requestdetails"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("approval"));
      out.write("</td>\n");
      out.write("                            <td><a href=\"edit.jsp?id=");
      out.print(id);
      out.write("\">Edit</a></td>\n");
      out.write("                            <td><a href=\"reset.jsp?id=");
      out.print(id);
      out.write("\">Reset</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                   }
                            
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<main>\n");
      out.write("    </main>\n");
      out.write("        </body>\n");
      out.write("            </html>\n");
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
