package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"bootstrap/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>HOME</title>       \n");
      out.write("</head>    \n");
      out.write("<body id='bg'style=\"background-image: url('image/bg.jpg');\" >  \n");
      out.write("<div id=\"a\" class=\"py-3 text-center\" >\n");
      out.write("    <img  class=\"d-block mx-auto mb-3\" src=\"image/FEMS LOGO.png\" alt=\"\" width=\"150\" height=\"150\">\n");
      out.write("    <h2>Facility and Equipment Monitoring System</h2>\n");
      out.write(" </div>\n");
      out.write("   ");

        String error=(String)session.getAttribute("error");
            if(error==null){
            }else{
            out.println("<center><div class='alert alert-danger' style='width:55%;'>"+error+"</div></center>");
            session.removeAttribute("error");
            }
    
      out.write("\n");
      out.write("    <main role=\"main\" class=\"inner cover\">\n");
      out.write("    <p class=\"lead\">\n");
      out.write("    <center><a class=\"btn btn-lg btn-secondary \"data-toggle=\"modal\" data-target=\"#userModal\">Log as user</a></center>\n");
      out.write("    <center><a class=\" btn btn-lg btn-secondary px-3\" data-toggle=\"modal\" data-target=\"#adminModal\">Log as admin</a></center>\n");
      out.write("    </p>\n");
      out.write("  </main>\n");
      out.write("    <div id=\"userModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("  <div class=\"modal-header\">\n");
      out.write("    <img src=\"image/FEMS LOGO.png\" alt= class=\"avatar\">\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-body\">\n");
      out.write("    <form action=\"loginuser\" method=\"post\">\n");
      out.write("     <form class=\"needs-validation\" novalidate>          \n");
      out.write("         <div colspan=\"2\"><center>Log as user</center></div>    \n");
      out.write("<center>\n");
      out.write("<label>Username:</label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required class=\"form-control\"><br>\n");
      out.write("<Label>Password:</Label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required class=\"form-control\">\n");
      out.write("</center>\n");
      out.write("<div class=\"modal-footer\"> \n");
      out.write("    <button class=\"btn btn-primary btn-lg px-2\"  type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("    <button class=\"btn btn-primary btn-lg px-2\"   type=\"submit\" name=\"login-user\">Submit</button>\n");
      out.write("</div>   \n");
      out.write("</form>  \n");
      out.write("</div>      \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<div id=\"adminModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("  <div class=\"modal-header\">\n");
      out.write("    <img src=\"image/FEMS LOGO.png\" alt= class=\"avatar\">\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-body\">\n");
      out.write("    <form action=\"loginselv\" method=\"post\">\n");
      out.write("     <form class=\"needs-validation\" novalidate>          \n");
      out.write("         <div colspan=\"2\"><center>Log as admin</center></div>    \n");
      out.write("<center>\n");
      out.write("<label>Username:</label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"user\" required class=\"form-control\"><br>\n");
      out.write("<Label>Password:</Label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required class=\"form-control\">\n");
      out.write("</center>\n");
      out.write("<div class=\"modal-footer\"> \n");
      out.write("    <button class=\"btn btn-primary btn-lg px-2\"  type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("    <button class=\"btn btn-primary btn-lg px-2\"   type=\"submit\" name=\"loginadmin\">Submit</button>\n");
      out.write("</div>   \n");
      out.write("</form>  \n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("</div>    \n");
      out.write("</div>           \n");
      out.write("</body>\n");
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
