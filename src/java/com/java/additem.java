
package com.java;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "additem", urlPatterns = {"/additem"})
public class additem extends HttpServlet {
PrintWriter out;
HttpSession session;
int status=0;
int status1=0;
int status2=0;
Connection con;
Statement st;
ResultSet rs;

   
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         try{
            out=response.getWriter();
            session=request.getSession();
            
             if(request.getParameter("additem")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String iname = request.getParameter("iname");
                String sn = request.getParameter ("sn");       
                String description = request.getParameter("description");
                String classification = request.getParameter("classification");
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//storing today date
                String Date=sdf.format(new Date());
                SimpleDateFormat stf = new SimpleDateFormat("h:mm a" );
                String time = stf.format(new Date()); 
                
                
                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql2="insert into item(iname, sn, description, date, time, classification) values('"+iname+"','"+sn+"','"+description+"','"+Date+"','"+time+"','"+classification+"')";
                status2=st.executeUpdate(sql2);
                if(status2>0)
                {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('THANK YOU!');");
                  out.println("</script>");
                  response.sendRedirect("admintab3.jsp");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('sadsa');");
                    out.println("</script>");
                    
                }
            }
      
}catch(Exception e){
            out.println(e);
        }
    }
     
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
