<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Bike Store</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style> 

  
  .carousel-inner > .item > img,{
  .carousel-inner > .item > a > img 
      width: 70%;
      margin:auto;
  
  }
  .carousel-inner > .item > img,
.carousel-inner > .item > a > img {
  min-height: 500px; 
  min-width: 500px;   /* Set slide height here */

}
  </style>
</head>
<body>


<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     <div class="navbar navbar-default navbar-fixed-top" role="navigation">
    
     <a class="navbar-brand" href="home"><font  face="Gadget" size="50" color="sky blue"><span style=padding-right:20px><img src="<c:url value="/resources/images/s3.jpg"/>" width="50" height="50">Rass O'Bikes</font> <i> <sub>lets ride...!</sub></span></a></i>
    <div class="navbar-collapse collapse"></div>
     <div>   
   </div>
      </form>
      </ul>
        </nav>
      <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     <div class="navbar navbar-default" role="navigation">
   <font face="bold" size="5" color="White">
    <ul class="nav navbar-nav">
      <li class="active"><a href="refresh">Home</a></li>
            <li><a href="Contact us">Contact us</a></li>
      
       <li style=padding-left:800><a href="reg"><span class="glyphicon glyphicon-user"></span>Sign up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
     </ul></font>
       <sec:authorize access="hasRole('ROLE_USER')">
        <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </sec:authorize>
  </div>
   </div>
    </div> 
    </div>
     </div> 
</nav>
  

  
<h2>mobile number:7702701974</h2>
<h2>Email:rakesh13045@gmail.com</h2>
<h3>Address: Rass O'Bikes Store...Ameerpet,Near BIG BAZAR</h3>
     
</html>
  <div class="navbar navbar-inverse navbar-bottom" role="navigation">
    <div class="container">
    <div class="navbar-text pull-center">copy rights...Rass O'Bikes@@@</div>