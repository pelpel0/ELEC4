<%-- 
    Document   : adduser
    Created on : Jan 22, 2020, 1:42:31 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/> 
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/form.css" rel="stylesheet" type="text/css"/> 
        <script src="bootstrap/js/validation.js" type="text/javascript"></script>
        <title>Add-User</title>
    </head>
            <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }      
      .container{
          position: relative;
          opacity:1;
          margin: 2%; 
      }
      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
        label{
            color: rgba(253, 99, 28, 1);
        }
        input{
              border-radius: 25px;
                border: 2px solid #FF6347;
        }
      }
      </style>

        <body class="bg-dark">   
    <center>
    <div class="container " >        
        <div class="py-0 text-center " style=" ">
      
    <img class="d-block mx-auto mb-1" src="image/FEMS LOGO.png" alt="" width="102" height="102">
    <h2 style="color: rgba(253, 99, 28, 1);">Registration</h2>
     </div>  
                 
       <form action="loginselv" method="post"> 
  <div class="row">
    <div class="col-md-4 order-md-2 mb-4">
      <h4 class="d-flex justify-content-between align-items-center mb-3">
    </div>
     
    <div class="col-md-12 order-md-1">

    <form class="needs-validation" novalidate>
          
        <div class="row">
            <div class="col-md-3 mb-3"></div>
   
            <div class="col-md-3 mb-3">
            
                <label>First name</label>
                <input type="text" class="form-control" name="fname" placeholder="" value="" required autofocus>
                 <div class="invalid-feedback">
              Valid first name is required.
            </div>
            </div>
            
            <div class="col-md-3 mb-3">
                <label>Last name</label>
                <input type="text" class="form-control" name ="lname" placeholder="" value="" required>
                 <div class="invalid-feedback">
              Valid last name is required.
            </div>
            </div>   
        </div>
         <div class="row">
            <div class="col-md-3 mb-3"></div>
   
            <div class="col-md-3 mb-3">
            
                <label>Username</label>
                <input type="text" class="form-control" name="username" placeholder="" value="" required autofocus>
                 <div class="invalid-feedback">
              Valid first name is required.
            </div>
            </div>
            
            <div class="col-md-3 mb-3">
                <label>Password</label>
                <input type="password" class="form-control" name ="password" placeholder="" value="" required>
                 <div class="invalid-feedback">
              Valid last name is required.
            </div>
            </div>   
        </div>
      
        <div class="row">
            <div class="col-md-3 mb-3"></div>
            
            <div class="col-md-3 mb-3">
                <label>Student Number</label>
                <input type="text" class="form-control" name="studentnumber" placeholder="20**-*****-MN-0" value="" required>
                 <div class="invalid-feedback">
              Please enter valid Student Number.
            </div>
            </div> 
                  <div class="col-md-3 mb-3">
                <label>Email</label>
                <input type="texr" class="form-control" name ="email" placeholder="" value="" required>
                 <div class="invalid-feedback">
              Valid last name is required.
            </div>
            </div>   
        </div>
        

        <div class="row">
            <div class="col-md-3 mb-3"></div>
   
            <div class="col-md-2 mb-3">
                <label>Course</label>
                <select class="custom-select d-block w-100" name="course" required>
              <option value="">Choose...</option>
              <option>BSCpE</option>
            </select>
            </div>
            
            <div class="col-md-2 mb-3">
                <label>Year</label>
                <select class="custom-select d-block w-100" name="year" required>
              <option value="">Choose...</option>
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
            </div>   
            <div class="col-md-2 mb-3">
                <label>Section</label>
                <input type="text" class="form-control" name="section" placeholder="" required>
            <div class="invalid-feedback">
              Required.
            </div>
            </div> 
            
        </div>
        
        <hr class="mb-3">
        <div class="row">
            <div class="col-md-4 mb-3"></div>
   
            <div class="col-md-4 mb-4">
                <button style="border-radius: 25px; border: 2px solid #FF6347; width: 200px; background-color: rgba(253, 99, 28, 1);" class="btn btn-primary btn-lg btn-block" type="submit" name="register">Register</button>
            </div>
        </div>
    </div>
  </div>
    </form>
        
        </center>
    </body>
   
</html>
