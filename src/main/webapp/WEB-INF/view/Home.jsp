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
  min-height: 300px; 
  min-width: 500px;   /* Set slide height here */

}
  </style>
</head>
<body>


<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     <div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <a class="navbar-brand" href="refresh"><font  face="Gadget" size="60" color="sky blue"><span style=padding-right:20px><img src="<c:url value="/resources/images/s3.jpg"/>" width="40" height="30">Rass O'Bikes</font> <i> <sub>lets ride...!</sub></span></a></i>
    <div class="navbar-collapse collapse"></div>
      </div>
   </div>
    </div>
 </nav>
      <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <div class="navbar navbar-inverse" role="navigation">
   <font face="bold" size="3" color="White">
    <ul class="nav navbar-nav">
      <li class="active"><a href="refresh">Home</a></li>
     <li><a href="Products">product</a></li>
        <li><a href="Contact us">Contact us</a></li></ul>
          <ul class="nav navbar-nav  navbar-right">
     <li><a href="reg"><span class="glyphicon glyphicon-user"></span>Sign up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
     </ul>
     </font>
     
  </div>
   </div>
    </div> 
    </div>
     </div> 
</nav>
  

<div class="container">
  
    <div class="center-block">  
    
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    
   <!-- Wrapper for slides -->
    
    
    <div class="carousel-inner" role="listbox">
    
    
    
    
      <div class="item active">
      <img src="<c:url value="/resources/images/bike2.jpg"/>" alt="watch" style="width:10000px; height:300px">
       
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/bike4.jpg"/>" alt="watch" style="width:10000px; height:300px">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/images/bike5.jpg"/>" alt="watch" style="width:10000px;height:300px"> 
      </div>
      
      
       <div class="item">
         <img src="<c:url value="/resources/images/bike7.jpg"/>" alt="watch" style="width:1000px;height:300px">
      </div>
      
          <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
  </div></div></div>
  <br>
 
<div class="container">
<iframe width="460" height="315" src="//www.youtube.com/embed/WmoybhEsWrg" frameborder="0" allowfullscreen></iframe>
<iframe width="460" height="315" src="//www.youtube.com/embed/vVKLl-ZBUwg" frameborder="0" allowfullscreen></iframe>
            
  <div class="row">
    <div class="col-sm-4">
      <a href="enter">
       
          <br><br><br>
         <a  href="Products" ><img src="<c:url value="/resources/images/bike1.jpg"/>" alt="Pulpit Rock" style="width:300px;height:150px">
             </div><br><br><br>
    <div class="col-sm-4">
           
         <a  href="Products"><img  src="<c:url value="/resources/images/bike2.jpg"/>" alt="Mustiers Sainte Marie" style="width:300px;height:150px">
         
    </div>
    <div class="col-sm-4">
      <a href="enter pro?data=table">
          <a  href="Products"> <img  src="<c:url value="/resources/images/bike3.jpg"/>" alt="Cinque Terre" style="width:300px;height:150px">
      </a>
    </div><br><br><br><br><br><br><br>
        <div class="navbar navbar-inverse navbar-bottom" role="navigation">
    <div class="container">
    <div class="navbar-text pull-center">copy rights...Rass O'Bikes@@@</div>
  </div>
</div>
</body>
</html>