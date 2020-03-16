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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/admin.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/> 
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

      
        <title>Inventory</title>
    </head>
        <body>
  
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-4 shadow">
    <a class="navbar-brand col-sm-2 col-md-11 mr-2" href="admin.jsp"><img class="position-absolute" style=" top:-10px"  src="image/FEMS LOGO.png" alt="" width="72" height="72"></a>
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
      <a class="nav-link" href="index.jsp">Log out</a>
    </li>
  </ul>
</nav>
<div class="container-fluid">
  <div class="row">
      <nav class="col-md-2 d-none d-md-block bg-light sidebar position-absolute" style="top: 90px">
      <div class="sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
              <a class="nav-link active" href="admin.jsp" style="padding:15px">
              <span data-feather="home"></span>
              <img src="image/homeOrange (1).png" alt=""/>
              Home <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="admintab.jsp" style="padding:15px">
              <span data-feather="file"></span>
              <img src="image/request.png" alt=""/>
              Request Tab
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="admintab1.jsp" style="padding:15px">
              <span data-feather="shopping-cart"></span>
               <img src="image/1.png" alt=""/>
              Borrow Items
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="admintab2.jsp" style="padding:15px">
              <span data-feather="users"></span>
              <img src="image/2.png" alt=""/>
              Returned Items
            </a>
          </li>
          <li class="nav-item">
<div class="dropdown">
<a class="nav-link dropdown-toggle" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="admintab3.jsp" style="padding:15px">  <img src="image/3.png" alt=""/>  Inventory</a>
<span data-feather="bar-chart-2"></span>
<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
<a class="dropdown-item" href="consumable.jsp">Consumble</a>
<a class="dropdown-item" href="Nonconsumble.jsp">Non-Consumble</a>
</div>
</div>
            </a>
          </li>
        </ul>
      </div>
    </nav>
 <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-1">
      <div class="d-flex justify-content-between flex-wrap  align-items-center  pb-1 mb-6 border-bottom">    
             <table id="myTable" class="table table-striped"  >
    <thead>
        <tr>
           
            <th>Item no.</th>
            <th>Item name</th>
            <th>Description</th>
            <th>Quantity</th>
            <th>Date</th>
            <th>Time</th>           
        </tr>
    </thead>
    <tbody>
    <%
      try{
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from consumble");
            while (rs.next()) {
        %>

        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
</tbody>
</table>    
</div>
</main>
<div class="container" style="padding-left: 200px;">
<center><br>
<!-- Trigger the modal with a button -->
    <button  type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#consumModal">ADD ITEM</button>
</center>
</div>
<div id="consumModal" class="modal fade" role="dialog">
<div class="modal-dialog">
<!-- Modal content-->
<div class="modal-content">
<div class="modal-header">
   <th colspan="2" ><center>Item Inventory</center></th>
</div>
<div class="modal-body">
<form action="consumable" method="post">
<form class="needs-validation" novalidate>
<table class="table table-bordered">
    <thead>
    <tr></tr>
    </thead>
<tbody>
    <tr>
    <td>Item Name:</td>
    <td><input type="text"  value="" name="iname" required  class="form-control"></td>
    </tr>
    <tr>
    <td>Item Description:</td>
    <td><input type="text"  value="" name="description" required class="form-control"></td>
    </tr>
    <tr>
    <td>Quantity:</td>
    <td><input type="number" value="" name="quantity" required class="form-control"></td>
    </tr>        
</tbody>
</table>                                  
<div class="modal-footer"> 
    <button class="btn btn-primary btn-lg px-3"  type="button" data-dismiss="modal">Cancel</button>
    <button class="btn btn-primary btn-lg px-3" type="submit" name="consume">Submit</button>
</div>
</form>
</div>
</div> 
</div>
</div>      
</div>
</body>
</html>
