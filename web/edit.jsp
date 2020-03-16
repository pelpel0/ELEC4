<%-- 
    Document   : edit
    Created on : Mar 6, 2020, 2:23:18 AM
    Author     : USER
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>


<%
if(request.getParameter("submit")!=null){

String id = request.getParameter("id");
String name = request.getParameter("name");
String lname = request.getParameter("lname");
String studentnumber = request.getParameter("studentnumber");
String email = request.getParameter("email");
String course = request.getParameter("course");
String year = request.getParameter("year");
String section = request.getParameter("section");
String requestdetails = request.getParameter("requestdetails");
String approval = request.getParameter("approval");

Connection con;
PreparedStatement pst;
ResultSet rs;

Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");
pst = con.prepareStatement("update request set name=?,lname=?,studentnumber=?,email=?,course=?,year=?,section=?,requestdetails=?,approval=? where id=?");
pst.setString(1,name);
pst.setString(2,lname);
pst.setString(3,studentnumber);
pst.setString(4,email);
pst.setString(5,course);
pst.setString(6,year);
pst.setString(7,section);
pst.setString(8,requestdetails);
pst.setString(9,approval);
pst.setString(10,id);
pst.executeUpdate();
%>
<script>
    alert("Your record has been updated!");
</script>

<%
}%>





<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
        <div class="row">
            <form method="POST" action="#">
                
                
                <%
                    Connection con;
                    PreparedStatement pst;
                    ResultSet rs;

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");

                    String id = request.getParameter("id");
                    
                    pst = con.prepareStatement("select * from request where id = ?");
                    pst.setString(1,id);
                    rs=pst.executeQuery();
                    
                    while(rs.next()){

                %>
                 <title>Request Form</title>
        <style>
        .container{
          opacity:1;
          height: auto;
          margin: 180px; 
          margin-top: 10px;
            }
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }
     
      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
         label{
            color: rgba(253, 99, 28, 1);
        }
         input{
          order-radius: 25px;
          border: 2px solid #FF6347;
        }
      }
      </style>
    </head>
   <body class="bg-dark" >
   <center>
    <div class="container" >
  <div class="py-0 text-center">
    <img class="d-block mx-auto mb-1" src="image/FEMS LOGO.png" alt="" width="102" height="102">
    <h2 style="color: rgba(253, 99, 28, 1);">Request Form</h2>
     </div>   
  <div class="row   ">
    <div class="col-md-4 order-md-2 mb-4">
      <h4 class="d-flex justify-content-between align-items-center mb-3">
    </div>
     
    <div class="col-md-12 order-md-1">
    <form class="needs-validation" novalidate> 
        <div class="row">
            <div class="col-md-3 mb-3"></div>
   
            <div class="col-md-3 mb-3">
                <label>First name</label>
                <input type="text" class="form-control" name="name" placeholder="" value="<%=rs.getString("name")%>" required autofocus>
                 <div class="invalid-feedback">
              Valid first name is required.
            </div>
            </div>
            <div class="col-md-3 mb-3">
                <label>Last name</label>
                <input type="text" class="form-control" name ="lname" placeholder="" value="<%=rs.getString("lname")%>" required>
                 <div class="invalid-feedback">
              Valid last name is required.
            </div>
            </div>   
        </div>
   
        <div class="row">
            <div class="col-md-3 mb-3"></div>
            
            <div class="col-md-3 mb-3">
                <label>Email<span class="text-muted">(Optional)</span></label>
                <input type="email" class="form-control" name="email" placeholder="you@example.com" value="<%=rs.getString("email")%>" required>
                 <div class="invalid-feedback">
              Please enter valid Email.
            </div>
            </div>      
            <div class="col-md-3 mb-3">
                <label>Student Number</label>
                <input type="text" class="form-control" name="studentnumber" value="<%=rs.getString("studentnumber")%>" placeholder="20**-*****-MN-0" value="" required>
                 <div class="invalid-feedback">
              Please enter valid Student Number.
            </div>
            </div> 
        </div>

        <div class="row">
            <div class="col-md-3 mb-3"></div>
   
            <div class="col-md-2 mb-3">
                <label>Course</label>
                <input type="text" class="form-control" value="<%=rs.getString("course")%>" name="course" required>
            </div>
            <div class="col-md-2 mb-3">
                <label>Year</label>
                <input type="text" class="form-control" value="<%=rs.getString("year")%>" name="year" required>
            </div>   
            <div class="col-md-2 mb-3">
                <label>Section</label>
                <input type="text" class="form-control" value="<%=rs.getString("section")%>" name="section" placeholder="" required>
            <div class="invalid-feedback">
              Required.
            </div>
            </div>
        </div>
                <div class="row">
            <div class="col-md-3 mb-3"></div>
            
            <div class="col-md-6 mb-3">
                <label>Request Details</label>
                <input type="text" class="form-control" name="requestdetails" placeholder="" value="<%=rs.getString("requestdetails")%>" required style = "height:110%">
                 <div class="invalid-feedback">
              Required.
            </div>
            </div> 
        </div>
                 <hr class="mb-3">
                 <div class="row">
            <div class="col-md-5 mb-3"></div>
            
            <div class="col-md-2 mb-4">
                <label>Approval Status</label>
                <input type="text" class="form-control" name="approval" placeholder="" value="<%=rs.getString("approval")%>" required>
                 <div class="invalid-feedback">
              Status required!
            </div>
            </div> 
        </div>
 

                <%
                }
                %>
                </br>
                <div alight ="">
                    <input type="submit" id="submit" name="submit" class="btn btn-info">
                </div>
                <div align="">
                    <p> <a href="admintab.jsp">return</a></p>
                </div>
    <div>   
    <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-4">&copy; 2017-2019 FEMS</p>
        <ul class="list-inline">
          <li class="list-inline-item"><a href="#">Privacy</a></li>
          <li class="list-inline-item"><a href="#">Terms</a></li>
          <li class="list-inline-item"><a href="#">Support</a></li>
        </ul>
    </footer>
    </div>
    </div>            
    </div>
    </div>   
</center>
    </body>
<!--                <div alight="right">
                    <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                    <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
                </div>
                
                <div align="right">
                    <p><a href="admintab.jsp">Return</a></p>
                </div>
                </div>
                </div>
                   </div>
                 </center>
                </div>               -->
</html>
