<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>COOK TO HOME</title>
	<link href="<c:url value='resources/css/bootstrap.min.css'/>" rel="stylesheet"/>
	<link href="<c:url value='resources/css/footer.css'/>" rel="stylesheet"/>
<title>HOME</title>
</head>
<body>
<nav class="navbar-fixed-top navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home1">Home</a></li>
      <li><a href="login2">LOGIN</a></li>
      <li><a href="regis2">REGISTRATION</a></li>
      
      <li><a href="aboutus">ABOUT US</a></li>
    </ul>
  </div>
</nav>
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>


  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="<c:url value='resources/image/1.jpg'/>"/>

    </div>
    <div class="item">
      <img src="<c:url value='resources/image/2.jpg'/>"/>

    </div>
    <div class="item">
      <img src="<c:url value='resources/image/3.jpg'/>"/>

    </div>
  </div>


  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<footer class="footer">
      <div class="container">
        <p class="text-muted">Copyrights to caketohome.com</p>
      </div>
    </footer>


	<script src="<c:url value='resources/https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'/>"/></script>

    <script src="<c:url value='resources/js/bootstrap.min.js'/>"/></script>

</body>
</html>