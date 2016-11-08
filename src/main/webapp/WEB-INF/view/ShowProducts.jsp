<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
<style>
.navbar-default  {
  background-color: #2C3E50;
  border-color:#FFFFFF
  color: #FFFFFF; 
  }
  .navbar-default .navbar-header{
  color:#FFFFFF
  }
  .navbar-default .navbar-header:hover,
  .navbar-default .navbar-header:focus{
    color:#18BC9C;
    background-color: transparent;
    }
    
    .navbar-default .navbar-nav > li > a {
    color:#FFFFFF;
    }
    .navbar-default .navbar-nav >.active > a,
    .navbar-default .navbar-nav >.active > a:hover,
    .navbar-default .navbar-nav >.active > a:focus {
    color:#FFFFFF;
    background-color:#4CAF50;
    }
    .navbar-default .navbar-nav > li > a:hover,
    .navbar-default .navbar-nav > li > a:focus{
    color:#18BC9C;
    background-color: transparent;
    }
    .navbar-default .navbar-nav > .open > a,
    .navbar-default .navbar-nav > .open > a:hover,
    .navbar-default .navbar-nav > .open > a:focus{
        background-color:#1A242F;
        color:#FFFFFF;
        } 
        .navbar-default{
        font-size:15px;
        }
        .navbar-nav{
        face:serif;
        }
       
        .navbar-default{
        position:absoulute;
        top:0;
        width:100%;
        }
  
  </style>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
    
      <a class="navbar-brand" href="Home">Headphones.com</a>
     
         
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Products">ManageProducts</a></li>
      
      
    </ul>
   
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Register"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
     
    </ul>
  </div>
</nav>
<center>
<h1><font size=6 face="courier"><span class="glyphicon glyphicon-headphones"> Product Details</span></font></h1>
</center>
<br>
      <div class="container">
            <table class="table table-hover table-bordered">
            <tr><td rowspan="5">
            <img src='<x:url value="/resources/images/${product.image}"/>'/></td></tr>
            <tr><td>Product Id: ${product.id}</td></tr>
            <tr><td>Product Name: ${product.name}</td></tr>
            <tr><td>Price: ${product.price}</td></tr>
            <tr><td>Description: ${product.description}</td></tr>
            
            <sec:authorize access="hasRole('ROLE_USER')">
            <tr><td></td><td><a href="#?id=${product.id}" class="btn btn-warning active btn-lg"><span class="glyphicon glyphicon-shopping-cart"> ADD TO CART</a>
              </td></tr></sec:authorize>               
            </table>
      </div>
      
		<nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
  <div class ="container">
  <div class="navbar-text pull-left">
  <p>© 2016 All Rights Reserved.</p>
  </div>
  </div>
  </nav>
   </body>
</html>
