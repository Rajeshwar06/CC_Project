<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
		 <h3 class="mb-5">Sign Up</h3>

	<form action="SignUp" method = "post">
	<div class="form-outline m-4">
            Eid <input type="text" class="form-control form-control-sg"    name = "Eid"/>
            </div>
           

            <div class="form-outline m-4">
            Password   <input type="password" id="typePasswordX-2" class="form-control form-control-lg" name = "password"/>
             
            </div>
		<div class="form-outline m-4">
         First Name <input type="text"  class="form-control form-control-sg"  name = "Fname"/>
              
            </div>
        <div class="form-outline m-4">
          Last Name <input type="text"  class="form-control form-control-sg"  name = "Lname"/>
              
            </div>    
        <div class="form-outline m-4">
             Date <input type="date"  class="form-control form-control-sg"  name = "date"/>
             
            </div>
        <div class="form-outline m-4">
             Contact No <input type="text" class="form-control form-control-sg"    name = "contact"/>
            </div>
          <div class="row">
			<div class = "col-sm-1">	   
            <div class="form-outline m-4">
		<input  class="btn btn-primary btn-lg btn-block"  type ="submit" value = "login">
		</div>
		</div>
			<div class = "col-sm-1">	   
            <div class="form-outline m-4">
		<input  class="btn btn-primary btn-lg btn-block"  type ="reset" value = "Cancel">
		</div>
		</div>
		</div>
	</form>
</body>
</html>