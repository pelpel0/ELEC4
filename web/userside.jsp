<%-- 
    Document   : admin
    Created on : Jan 17, 2020, 4:57:47 AM
    Author     : USER
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.java.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/admin.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/> 
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link href="bootstrap/css/userside.css" rel="stylesheet" type="text/css"/>
<title>Home-User</title>
</head>
<body>
    <% 
    try{
    String username=(String)session.getAttribute("username");
    if(username!=null){
        Connection con = DB.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from users where username ='"+username+"'");
         while (rs.next()) {
//        String sql="select name from users where username='"+username+"'";
        
       
%>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-4 shadow">
    <a class="navbar-brand col-sm-2 col-md-11 mr-2" href="userside.jsp"><img class="position-absolute" style=" top:-10px"  src="image/FEMS LOGO.png" alt="" width="72" height="72"></a>
<ul class="navbar-nav px-3">
<li class="nav-item text-nowrap"x>
    <a class="nav-link" href="index.jsp">Log out</a>
</li>
</ul>
</nav>       
<div class="container-fluid">
<div class="row">
<nav class="col-md-2 d-none d-md-block bg-light sidebar position-absolute" style="top: 90px">
<div class="sidebar-sticky">        
    <table id="myTable"class="info" style="font-size: 12px; ">    
    <thead>
       
    <tr> 
    <th name="name">Name:  &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;<%=rs.getString("fname")%> <%=rs.getString("lname")%></th>      
    </tr>
    <tr>
    <th>Student No: &nbsp; <%=rs.getString("studentnumber")%></th>
    </tr>
    <tr>
    <th>Course: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <%=rs.getString("course")%></th>  
    </tr>
    <tr>
    <th>Year: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <%=rs.getString("year")%></th>  
    </tr>
    <tr>
    <th>Section: &nbsp; &nbsp; &nbsp; &nbsp; <%=rs.getString("section")%></th>  
    </tr>
   
    </thead>
</table>
</div>
</nav>   
    <div id="borrowModal" class="modal fade" role="dialog">
<div class="modal-dialog">

 Modal content
<div class="modal-content">
<div class="modal-header">
    <img src="image/FEMS LOGO.png" alt= class="avatar">
</div>
<div class="modal-body">          
<form action="borrow" method="post"> 
<form class="needs-validation" novalidate>

<div colspan="2"><center>Borrow Form</center></div>  
<input name="user" style="border:0px; width: 100px; color:white;" value="<%=rs.getString("username")%>" >
<div class="row">
<div class="col-md-4 order-md-2 mb-4">
<h4 class="d-flex justify-content-between align-items-center mb-3"></h4>
</div>
<div class="col-md-12 order-md-1">
<form class="needs-validation" novalidate>          
<div class="row">
<div class="col-md-0 mb-3"></div>      
<div class="col-md-6 mb-3">
    <label>First name</label>
    <input type="text" class="form-control" name="name" placeholder="" value="<%=rs.getString("fname")%>" required autofocus>
<div class="invalid-feedback">
    Valid first name is required.
</div>
</div>            
<div class="col-md-6 mb-3">
    <label>Last name</label>
    <input type="text" class="form-control" name ="lname" placeholder="" value="<%=rs.getString("lname")%>" required>
    <div class="invalid-feedback">
    Valid last name is required.
</div>
</div>  
    
</div>
  
<div class="row">
<div class="col-md-0 mb-3"></div>            
<div class="col-md-6 mb-3">
    <label>Email<span class="text-muted">(Optional)</span></label>
    <input type="email" class="form-control" name="email" placeholder="you@example.com" value="<%=rs.getString("email")%>" required>
<div class="invalid-feedback">
    Please enter valid Email.
</div>
</div>         
<div class="col-md-6 mb-3">
    <label>Student Number</label>
    <input type="text" class="form-control" name="studentnumber" placeholder="20**-*****-MN-0" value="<%=rs.getString("studentnumber")%> " required>
<div class="invalid-feedback">
    Please enter valid Student Number.
</div>
</div> 
</div>
<div class="row">
<div class="col-md-0 mb-3"></div>   
<div class="col-md-4 mb-3">
    <label>Course</label>
    <input type="text" class="form-control" name="course" placeholder="" value="<%=rs.getString("course")%>" required autofocus>
    
</div>
<div class="col-md-4 mb-3">
    <label>Year</label>
    <input type="text" class="form-control" name="year" placeholder="" value="<%=rs.getString("year")%>" required autofocus>
    
</div>   
<div class="col-md-4 mb-3">
    <label>Section</label>
    <input  id="select1" class="d-block" type="text" class="form-control" name="section" value="<%=rs.getString("section")%>" required>
<div class="invalid-feedback">
    Required.
</div>
</div>             
</div>
<div class="row">
<div class="col-md-0 mb-3"></div>   
<div class="col-md-4 mb-3">
    <label>Item</label>
    <input type="text" class="form-control" name="item" placeholder="" value="" required autofocus>
    
</div>
<div class="col-md-4 mb-3">
    <label>Quantity</label>
    <input type="text" class="form-control" name="quantity" placeholder="" value="" required autofocus>
</div>   
</div>
<div class="modal-footer"> 
    <button class=" btn btn-lg btn-secondary px-2"  type="button" data-dismiss="modal">Cancel</button>
    <button class=" btn btn-lg btn-secondary px-2" type="submit" name="ADD">Submit</button>
</div> 

</div>     
</div>
</form>
</div>
</div>
</div>
</div>
<div id="requestModal" class="modal fade" role="dialog">
<div class="modal-dialog">

<!-- Modal content-->
<div class="modal-content">
<div class="modal-header">
    <img src="image/FEMS LOGO.png" alt= class="avatar">
</div>
<div class="modal-body">          
<form action="addrequest" method="post"> 
<form class="needs-validation" novalidate>          
<div colspan="2"><center>Request Form</center></div>  
<input name="user1  " style="border:0px; width: 100px; color:white;" value="<%=rs.getString("username")%>" >
<div class="row">
<div class="col-md-4 order-md-2 mb-4">
<h4 class="d-flex justify-content-between align-items-center mb-3"></h4>
</div>
<div class="col-md-12 order-md-1">
    <form class="needs-validation" novalidate>          
<div class="row">
<div class="col-md-0 mb-3">     
</div>  
<div class="col-md-6 mb-3">
    <label>First name</label>
    <input type="text" class="form-control" name="name" placeholder="" value="<%=rs.getString("fname")%>" required autofocus>
<div class="invalid-feedback">
    Valid first name is required.
</div>
</div>           
<div class="col-md-6 mb-3">
    <label>Last name</label>
    <input type="text" class="form-control" name ="lname" placeholder="" value="<%=rs.getString("lname")%>" required>
    <div class="invalid-feedback">
    Valid last name is required.
</div>
</div>   
</div>
<div class="row">
<div class="col-md-0 mb-3"></div>            
<div class="col-md-6 mb-3">
    <label>Email<span class="text-muted">(Optional)</span></label>
    <input type="email" class="form-control" name="email" placeholder="you@example.com" value="<%=rs.getString("email")%>" required>
<div class="invalid-feedback">
    Please enter valid Email.
</div>
</div>         
<div class="col-md-6 mb-3">
    <label>Student Number</label>
    <input type="text" class="form-control" name="studentnumber" placeholder="20**-*****-MN-0" value="<%=rs.getString("studentnumber")%>" required>
<div class="invalid-feedback">
    Please enter valid Student Number.
</div>
</div> 
</div>
<div class="row">
<div class="col-md-0 mb-3"></div>   
<div class="col-md-4 mb-3">
    <label>Course</label>
    <input type="text" class="form-control" name="course" placeholder="" value="<%=rs.getString("course")%>" required>
</div>
<div class="col-md-4 mb-3">
    <label>Year</label>
    <input type="text" class="form-control" name="year" placeholder="" value="<%=rs.getString("year")%>" required>
</div>   
<div class="col-md-4 mb-3">
    <label>Section</label>
    <input id="select1" class="d-block w-100" type="text" class="form-control" name="section" placeholder="" value="<%=rs.getString("section")%>" required>
</div>
<div class="invalid-feedback">
    Required.
</div>
</div>             
<div class="row">
<div class="col-md-0 mb-3"></div> 
<div class="col-md-12 mb-1">
    <label>Request Details</label>
    <input type="text" class="form-control d-block " name="requestdetails" placeholder="" value="" required style = "height:150%;"> 
</div>
<div class="invalid-feedback">
</div>
<div class="col-md-6 mb-3">
<div class="invalid-feedback">
    Please enter valid Student Number.
</div>
</div>
</div>
<div class="modal-footer" style="margin-top: 50px; "> 
    
    <input type="text" class="form-control" name="approval"  value="pending" disabled style="width: 80px; margin-right: 190px;"> 
    <button class=" btn btn-lg btn-secondary px-2 "  type="button" data-dismiss="modal">Cancel</button>
    <button class=" btn btn-lg btn-secondary px-2"   type="submit" name="Addrequest">Submit</button>
</div>
</div>
</div>
</form>
</div>
</div>
</div>
</div>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-2">
<div class="d-flex justify-content-between flex-wrap  align-items-center pb-1 mb-5 border-bottom">
<a class="btn btn-lg btn-secondary "data-toggle="modal" data-target="#borrowModal">Borrow</a>


<center color><h2> Welcome <%=rs.getString("fname")%> <%=rs.getString("lname")%>!</h2></center>

<a class=" btn btn-lg btn-secondary px-3" data-toggle="modal" data-target="#requestModal">Request</a>
<%
}
}        }
catch (Exception e) {
out.println(e);
                    }
%>
<table class="blueTable" style="height: 188px;" width="340">
<thead>
    
<th>Borrow NO.</th>
            <th>Name</th>
            <th>Student Number</th>
            <th>Course</th>
            <th>Year</th>
            <th>Section</th>
            <th>Email</th>
            <th>Item</th>
            <th>No. of Items</th>
            <th>Date</th>
            <th>Time</th>
        
</thead>
<tbody>
<%
        try {   
            String username=(String)session.getAttribute("username");
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from borrow where user = '"+username+"'");
            while (rs.next()) {
        %>

        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%>&nbsp;<%=rs.getString(3)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><%=rs.getString(7)%></td>
            <td><%=rs.getString(8)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(9)%></td>
            <td><%=rs.getString(10)%></td>
            <td><%=rs.getString(11)%></td>
            <td><%=rs.getString(12)%></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
    
</tbody>
<tfoot>
<tr>
<td colspan="12">
<div class="links"><a href="#">&laquo;</a> <a class="active" href="#">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">&raquo;</a></div>
<div class="dropdown" style="color:black; margin-left: 1000px;">
<a class="nav-link dropdown-toggle" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Transaction</a>
<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
<a class="dropdown-item" href="userside.jsp">Borrow</a>
<a class="dropdown-item" href="trans.jsp">Request</a>
</div>
</div>
</td>
</tr>
</tfoot>
</table> 
</div>
</main>    
</div>
</div>
</body>
</html>
