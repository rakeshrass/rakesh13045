<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<title>Manage Products</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     
       <a class="navbar-brand" href="refresh"> Home</a>
       </div>
    <ul class="nav navbar-nav">
   
    </ul>
    <ul class="nav navbar-nav navbar-right">   
     <li style=padding-left:800><a href="Registerunknown"><span class="glyphicon glyphicon-user"></span>Sign up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
   </ul>
  </div>
</nav>
 <sec:authorize access="hasRole('ROLE_ADMIN')">

</sec:authorize>
<h2>Rass o'bikes</h2>

<div class="container">
<div ng-app="myApp" ng-controller="customersCtrl">
<p> � ��
� � � �<div class="input-group col-md-11 col-sm-6 col-xs-9 navbar-left" style="padding:10px;">
� � � �<input type="text" class="form-control" placeholder="Enter The Search Terms Here" ng-model="searchBy.Name" />
� � � �<span class="input-group-btn">
� � � �<button class="btn btn-primary" type="button">Search</button>
� � </span> �
� </div>
�</p>
<table class="table table-striped table-hover">
  <tr>
       <th>Product Id</th>
       <th>Product Name</th>
       <th>Product Price</th>
       <th>Product Description</th>
       <th>Action</th>
  </tr>
  <tr ng-repeat="x in names | filter:searchBy">
    <td>{{x.Id}}</td>
    <td>{{x.Name}}</td>
    <td>{{x.Price}}</td>
    <td>{{x.Description}}</td>
    <td>
    <a href="${pageContext.servletContext.contextPath}/viewproduct?id={{x.Id}}" class="btn btn-info"class="btn btn-info"><span>View</span></a>
   
   </td>  
  </tr>
</table>

</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("list")
    .then(function (response) {$scope.names = response.data;});
});
</script>
</div>
	  <div class="navbar navbar-inverse navbar-bottom" role="navigation">
    <div class="container">
    <div class="navbar-text pull-left">copy rights</div>
</body>
</html>



