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


@WebServlet(name = "consumable", urlPatterns = {"/consumable"})
public class consumable extends HttpServlet {
PrintWriter out;
HttpSession session;
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
            if(request.getParameter("consume")!=null)
            {
               
                /* Getting The Value From TextBox  */
                String iname = request.getParameter("iname");
                String description = request.getParameter ("description");       
                String quantity = request.getParameter("quantity");
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//storing today date
                String Date=sdf.format(new Date());
                SimpleDateFormat stf = new SimpleDateFormat("h:mm a" );
                String time = stf.format(new Date()); 
                
                
                /* JDBC Connection Code  */
                con=DB.getConnection();
                st=con.createStatement();
                String sql2="INSERT INTO `consumble`(`iname`, `description`, `quantity`, `date`, `time`) VALUES ('"+iname+"','"+description+"','"+quantity+"','"+Date+"','"+time+"')";
                status2=st.executeUpdate(sql2);
                
                
                  session.setAttribute("msg", "Item Successfully Added..");
                  response.sendRedirect("consumable.jsp");
               
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
