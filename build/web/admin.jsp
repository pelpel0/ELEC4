<%-- 
    Document   : admin
    Created on : Jan 17, 2020, 4:57:47 AM
    Author     : USER
--%>
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

        <title>Home-Admin</title>
    </head>
    <body>
<nav class="navbar navbar-dark bg-dark flex-md-nowrap p-3 shadow">
    <a class="navbar-brand col-sm-2 col-md-11 mr-2" href="admin.jsp"><img class="position-absolute" style=" top:-10px"  src="image/FEMS LOGO.png" alt="" width="72" height="72"></a>
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
<div class="dropdown dropdown-dark bg-dark" style="  margin-top: 0px; margin-right: 80px; width: 50px;" class=" bg-dark ">
<button class="btn btn-secondary dropdown-toggle bg-dark" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="width: 70px;">
<a class="nav-link" href="index.jsp" style="color: rgba(253, 99, 28, 1)">Log out</a>
</button>
<div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="">
<a class="dropdown-item" href="adduser.jsp" style="color: rgba(253, 99, 28, 1);">
<img src="image/addusers.png" alt=""/>
Add User          
</a>                   
<a class="dropdown-item" href="index.jsp" style="color: rgba(253, 99, 28, 1);">
<img src="image/log-out.png" alt=""/>
Log out                
</a>
</div>
</div>    
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
<!--            <a class="nav-link" href="admintab3.jsp" style="padding:15px">
              <span data-feather="bar-chart-2"></span>
              <img src="image/3.png" alt=""/>
              Inventory-->
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

    <% 
        try{
        String user=(String)session.getAttribute("user");
        if(user!=null){
        Connection con = DB.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from admin where user ='"+user+"'");
        while (rs.next()) {
//        String sql="select name from users where username='"+username+"'";
        
       
%>
<center color><h2 style="padding-top: 50px"> Welcome <%=rs.getString("name")%> <%=rs.getString("last")%>!</h2></center>      
<% 
}
}
}
catch (Exception e) {
out.println(e);
}
%>
      </main>
       
  </div>
</div>
    </body>
</html>
