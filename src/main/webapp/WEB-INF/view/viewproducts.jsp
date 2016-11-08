<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Product Details</title>
</head>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Rass o bikes</a>
    </div>
    <ul class="nav navbar-nav">
      <sec:authorize access="hasRole('ROLE_ADMIN')">
      <li><a href="admin">Home</a></li>
      </sec:authorize>
            <sec:authorize access="hasRole('ROLE_USER')">
      <li><a href="userhome">Home</a></li>
      </sec:authorize>
        <sec:authorize access="hasRole('ROLE_ADMIN')">
      <li><a href="ManageProducts"> Products</a></li>
      </sec:authorize>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     <sec:authorize access="hasRole('ROLE_USER')">
      <li><a href="Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </sec:authorize>
    </ul>
  </div>
</nav>
      <div class="container">
            <table class="table table-hover table-bordered">
            <tr><td rowspan="5">
            <img src='<x:url value="/resources/images/${product.image}"/>'/></td></tr>
            <tr><td>${product.id}</td></tr>
            <tr><td>${product.name}</td></tr>
            <tr><td>${product.price}</td></tr>
            <tr><td>${product.description}</td></tr>
            <sec:authorize access="hasRole('ROLE_USER')">
               <tr><td></td><td><a href="viewcart?id=${product.id}" class="btn btn-primary">Add to Cart</a>
               </td></tr></sec:authorize>
              </table>
                <div class="navbar navbar-inverse navbar-bottom" role="navigation">
    <div class="container">
    <div class="navbar-text pull-center">copy rights...Rass O'Bikes</div>
      </div>
   </body>
</html>
