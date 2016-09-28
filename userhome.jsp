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
      <li class="active"><a href="userhome">Home</a></li>
       <li><a href="ManageProducts">product</a></li>
       <li><a href="Contact us">Contact us</a></li>
       <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      <ul class="nav navbar-nav navbar-right">
       <sec:authorize access="hasRole('ROLE_USER')">
    <li><a href="userhome">Welcome...<%=session.getAttribute("loggedInUser")%></a></li>
    </sec:authorize>
     </ul></font>
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
         <img src="<c:url value="/resources/images/bike5.jpg"/>" alt="watch" style="width:10000px; height:300px">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/bike4.jpg"/>" alt="watch" style="width:10000px; height:300px">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/images/bike8.jpg"/>" alt="watch" style="width:10000px;height:300px"> 
      </div>
      
      
       <div class="item">
         <img src="<c:url value="/resources/images/bike6.jpg"/>" alt="watch" style="width:1000px;height:300px">
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
 
<div class="container">
            
  <div class="row">
    <div class="col-sm-4">
      <a href="enter">
          <br><br><br>
         <img src="<c:url value="/resources/images/bike1.jpg"/>" alt="Pulpit Rock" style="width:300px;height:150px">
             </div><br><br><br>
    <div class="col-sm-4">
           
         <img src="<c:url value="/resources/images/bike2.jpg"/>" alt="Mustiers Sainte Marie" style="width:300px;height:150px">
         
    </div>
    <div class="col-sm-4">
      <a href="enter pro?data=table">
           <img src="<c:url value="/resources/images/bike3.jpg"/>" alt="Cinque Terre" style="width:300px;height:150px">
      </a>
    </div><br><br><br><br><br><br><br>
        <div class="navbar navbar-inverse navbar-bottom" role="navigation">
    <div class="container">
    <div class="navbar-text pull-left">copy rights</div>
  </div>
</div>
</body>
</html>