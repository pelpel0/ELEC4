
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

@WebServlet(name = "fems", urlPatterns = {"/fems"})
public class fems extends HttpServlet {
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
                
                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql="insert into borrow(name, lname, email, studentnumber, course, year, section, item, quantity, date, time) values('"+name+"','"+lname+"','"+email+"','"+studentnumber+"','"+course+"','"+year+"','"+section+"','"+item+"','"+quantity+"','"+Date+"','"+time+"')";
                status=st.executeUpdate(sql);
                if(status>0)
                {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('THANK YOU!');");
                  out.println("</script>");
                  response.sendRedirect("borrow.jsp");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('sadsa');");
                    out.println("</script>");
                    
                }
            }
      
    
            
             else if (request.getParameter("Addrequest")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String name = request.getParameter("name");
                String lname = request.getParameter ("lname");       
                String studentnumber = request.getParameter("studentnumber");
                String course = request.getParameter("course");
                String year = request.getParameter("year");
                String section = request.getParameter("section");
                String email= request.getParameter ("email"); 
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//storing today date
                String Date=sdf.format(new Date());
                SimpleDateFormat stf = new SimpleDateFormat("h:mm a" );
                String time = stf.format(new Date());
                String requestdetails = request.getParameter("requestdetails"); 
                
                
                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql1="insert into request(name, lname, studentnumber, course, year, section, email, date, time,requestdetails) values('"+name+"','"+lname+"','"+studentnumber+"','"+course+"','"+year+"','"+section+"','"+email+"','"+Date+"','"+time+"','"+requestdetails+"')";             
                status1=st.executeUpdate(sql1);
              if(status1>0)
                {
                  out.println("<script type=\"text/javascript\">");
                  out.println("alert('THANK YOU!');");
                  out.println("</script>");
                  response.sendRedirect("request.jsp");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('sadsa');");
                    out.println("</script>");
                    
                }
            }
        
   
             else if(request.getParameter("additem")!=null)
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
            
           else if(request.getParameter("login")!=null)
            {
                /* Getting The Value From TextBox  */
                String username=request.getParameter("username");
                String password=request.getParameter("password");
                System.out.println(username+" "+password);
                con=DB.getConnection();
                st=con.createStatement();
                String sql="select * from users where username='"+username+"' and password='"+password+"'";
                rs=st.executeQuery(sql);
                if(rs.next()){
                    session.setAttribute("username",username);   
                    response.sendRedirect("admin.jsp");
                }
                else
                {
                    session.setAttribute("error", "Invalid Username and Password...");
                    response.sendRedirect("login.jsp");
                }
            }
           else if(request.getParameter("login-user")!=null)
            {
                /* Getting The Value From TextBox  */
                String username=request.getParameter("username");
                String password=request.getParameter("password");
                System.out.println(username+" "+password);
                con=DB.getConnection();
                st=con.createStatement();
                String sql="select * from users where username='"+username+"' and password='"+password+"'";
                rs=st.executeQuery(sql);
                if(rs.next()){
                    session.setAttribute("username",username);   
                    response.sendRedirect("userside.jsp");
                }
                else
                {
                    session.setAttribute("error", "Invalid Username and Password...");
                    response.sendRedirect("login.jsp");
                }
            }
              
      
            else if(request.getParameter("register")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String fname = request.getParameter("fname");
                String lname = request.getParameter ("lname");
                String username= request.getParameter ("username");        
                String studentnumber = request.getParameter("studentnumber");
                String course = request.getParameter("course");
                String year = request.getParameter("year");
                String section = request.getParameter("section");
                String password = request.getParameter("password");

                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql="insert into users(fname, lname, username,password, studentnumber, course, year, section) values('"+fname+"','"+lname+"','"+username+"','"+password+"','"+studentnumber+"','"+course+"','"+year+"','"+section+"')";
                status=st.executeUpdate(sql);
                if(status>0)
                {
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('THANK YOU!');");
                 out.println("</script>");
                 
                  response.sendRedirect("admin.jsp");
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
