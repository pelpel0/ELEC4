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

@WebServlet(name = "loginuser", urlPatterns = {"/loginuser"})
public class loginuser extends HttpServlet {
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
                if(request.getParameter("login-user")!=null)
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
                    response.sendRedirect("userside.jsp");
                }
                else
                {
                    session.setAttribute("error", "Invalid Username and Password...");
                    response.sendRedirect("index.jsp");
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
