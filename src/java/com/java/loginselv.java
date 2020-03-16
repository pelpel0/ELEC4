package com.java;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginselv", urlPatterns = {"/loginselv"})
public class loginselv extends HttpServlet {
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
            if(request.getParameter("register1")!=null)
            {
                String username=request.getParameter("username");
                String password=request.getParameter("password");
                System.out.println(username+" "+password);
                con=DB.getConnection();
                st=con.createStatement();
                String sql="select * from users where username='"+username+"' and password='"+password+"'";
                rs=st.executeQuery(sql);
                if(rs.next()){
                
                   session.setAttribute("username",username);   
                    response.sendRedirect("borrow.jsp");
                }
                else
                {
                    out.println("Oops! Something went wrong...");
                }
            }
            else if(request.getParameter("loginadmin")!=null)
            {
                String user=request.getParameter("user");
                String pass=request.getParameter("pass");
                System.out.println(user+" "+pass);
                con=DB.getConnection();
                st=con.createStatement();
                String sql="select * from admin where user='"+user+"' and pass='"+pass+"'";
                rs=st.executeQuery(sql);
                if(rs.next()){
                    session.setAttribute("user",user);  
                    response.sendRedirect("admin.jsp");
                }
                else
                {
                    session.setAttribute("error", "Invalid Username and Password...");
                    response.sendRedirect("index.jsp");
                }
            } else if(request.getParameter("register")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String fname = request.getParameter("fname");
                String lname = request.getParameter ("lname");
                String username= request.getParameter ("username");        
                String studentnumber = request.getParameter("studentnumber");
                String email = request.getParameter("email");
                String course = request.getParameter("course");
                String year = request.getParameter("year");
                String section = request.getParameter("section");
                String password = request.getParameter("password");

                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql="insert into users(fname, lname, username,password, studentnumber, email, course, year, section) values('"+fname+"','"+lname+"','"+username+"','"+password+"','"+studentnumber+"','"+email+"','"+course+"','"+year+"','"+section+"')";
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
