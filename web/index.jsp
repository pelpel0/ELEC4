<%-- 
    Document   : login
    Created on : Jan 17, 2020, 7:14:46 AM
    Author     : USER
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="com.java.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/login.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>HOME</title>       
</head>    
<body id='bg'style="background-image: url('image/bg.jpg');" >  
<div id="a" class="py-3 text-center" >
    <img  class="d-block mx-auto mb-3" src="image/FEMS LOGO.png" alt="" width="150" height="150">
    <h2>Facility and Equipment Monitoring System</h2>
 </div>
   <%
        String error=(String)session.getAttribute("error");
            if(error==null){
            }else{
            out.println("<center><div class='alert alert-danger' style='width:55%;'>"+error+"</div></center>");
            session.removeAttribute("error");
            }
    %>
    <main role="main" class="inner cover">
    <p class="lead">
   <center><a class="btn btn-lg btn-secondary "data-toggle="modal" data-target="#userModal">Log as user</a></center>
    <center><a class=" btn btn-lg btn-secondary px-3" data-toggle="modal" data-target="#adminModal">Log as admin</a></center>
    </p>
  </main>
    <div id="userModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

    <!-- Modal content-->
  <div class="modal-content">
  <div class="modal-header">
    <img src="image/FEMS LOGO.png" alt= class="avatar">

  </div>
  <div class="modal-body">
    <form action="loginuser" method="post">
     <form class="needs-validation" novalidate>          
         <div colspan="2"><center>Log as user</center></div>    
<center>
<label>Username:</label>
    <input type="text" placeholder="Enter Username" name="username" required class="form-control"><br>
<Label>Password:</Label>
    <input type="password" placeholder="Enter Password" name="password" required class="form-control">
</center>
<div class="modal-footer"> 
    <button class=" btn btn-lg btn-secondary px-3"  type="button" data-dismiss="modal">Cancel</button>
    <button class=" btn btn-lg btn-secondary px-3"   type="submit" name="login-user">Submit</button>
</div>   
</form>  
</div>      
</div>
</div>
</div>
    
<div id="adminModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

    <!-- Modal content-->
  <div class="modal-content">
  <div class="modal-header">
    <img src="image/FEMS LOGO.png" alt= class="avatar">

  </div>
  <div class="modal-body">
    <form action="loginselv" method="post">
     <form class="needs-validation" novalidate>          
         <div colspan="2"><center>Log as admin</center></div>    
<center>
<label>Username:</label>
    <input type="text" placeholder="Enter Username" name="user" required class="form-control"><br>
<Label>Password:</Label>
    <input type="password" placeholder="Enter Password" name="pass" required class="form-control">
</center>
<div class="modal-footer"> 
    <button class="btn btn-lg btn-secondary px-3"  type="button" data-dismiss="modal">Cancel</button>
    <button class="btn btn-lg btn-secondary px-3"   type="submit" name="loginadmin">Submit</a></button>
</div>   
</form>  
</div> 
</div>
</div>    
</div>
   
</body>
</html>
