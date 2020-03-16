<%-- 
    Document   : admintab
    Created on : Jan 17, 2020, 12:02:15 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/admin.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/> 
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Request tab</title>
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
      <div class="d-flex justify-content-between flex-wrap  align-items-center  pb-1 mb-6 border-bottom">
             <table id="myTable" class="table table-striped"  >
    <thead>
        <tr>
            <th>Request NO.</th>
            <th>Name</th>
            <th>Student Number</th>
            <th>Course</th>
            <th>Year</th>
            <th>Section</th>
            <th>Email</th>
            <th>Date</th>
            <th>Time</th>
            <th>Request Details</th>
            <th>Approval</th>
            <th>Update Status</th>
        </tr>
    </thead>
             <tbody>
    <%
                            Connection con;
                            PreparedStatement pst;
                            ResultSet rs;

                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fems", "root", "");
                                    
                                String query = "select * from request";
                                Statement st = con.createStatement();
                                

                                   rs= st.executeQuery(query);
                                   while(rs.next()){
                                   String id=rs.getString("id");
                                   
                                   %>
        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%>&nbsp;<%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><%=rs.getString(7)%></td>
            <td><%=rs.getString(8)%></td>
            <td><%=rs.getString(9)%></td>
            <td><%=rs.getString(10)%></td>
            <td><%=rs.getString(11)%></td>
            <td><%=rs.getString(12)%></td>            
            <td><a href="edit.jsp?id=<%=id%>">Update</a></td>
           
<!--            <td>
                <a href="edit.jsp?id=<%=rs.getInt("id")%>">Edit</a>&nbsp;|&nbsp;
                <a href="fems?delete='delete'&&id=<%=rs.getInt("id")%>">Delete</a>
            </td>-->
 <%
                                   }
                            %>
        </tr>
             </tbody>
</table>
    </div>
    </main>
  </div>
</div>
    </body>
</html>
