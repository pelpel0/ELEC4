
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

@WebServlet(name = "borrow", urlPatterns = {"/borrow"})
public class borrow extends HttpServlet {
PrintWriter out;
HttpSession session;
int status=0;
Connection con;
Statement st;
ResultSet rs;

   
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         try{
            out=response.getWriter();
            session=request.getSession();
            if(request.getParameter("ADD")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String name = request.getParameter("name");
                String lname = request.getParameter ("lname");
                String email= request.getParameter ("email");        
                String studentnumber = request.getParameter("studentnumber");
                String course = request.getParameter("course");
                String year = request.getParameter("year");
                String section = request.getParameter("section");
                String item = request.getParameter("item");
                String quantity = request.getParameter("quantity");
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//storing today date
                String Date=sdf.format(new Date());
                SimpleDateFormat stf = new SimpleDateFormat("h:mm a" );
                String time = stf.format(new Date());
                String user = request.getParameter("user");

                
                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql="insert into borrow(name, lname, email, studentnumber, course, year, section, item, quantity, date, time, user) values('"+name+"','"+lname+"','"+email+"','"+studentnumber+"','"+course+"','"+year+"','"+section+"','"+item+"','" +quantity+"','"+Date+"','"+time+"','"+user+"')";
                status=st.executeUpdate(sql);
                if(status>0)
                {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('THANK YOU!');");
                  out.println("</script>");
                  response.sendRedirect("userside.jsp");
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
