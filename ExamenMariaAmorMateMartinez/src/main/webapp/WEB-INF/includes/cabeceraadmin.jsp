<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css" />



<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>


<title>Principal</title>
</head>
<body>
	<header>


		<div class="jumbotron" id="jum">
			<div class="container">
				<h1 class="display-4">TXAKUR-ETXE ONG</h1>
				<p class="lead">Apadrina a un perrito y hazle feliz</p>

			</div>
		</div>




		<nav class="navbar navbar-default">
	 
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="index">Principal</a></li>
						
						<li><a href="listadoprod">Administracion productos</a></li>
						
						

					</ul>
					<form class="navbar-form navbar-right">
					
					<c:if test="${sessionScope.usuario!=null}">
					
					<!--  <a href="http://localhost:8080/pruebaServlet/carrito.jsp"
							class="btn btn-default">Carrito</a>-->
							
					<a href="salir"
							class="btn btn-default">Salir</a>
					</c:if>
					
					<c:if test="${sessionScope.usuario==null}">
					    
					
							
						<a href="${pageContext.request.contextPath}/login.jsp"
							class="btn btn-default">Login</a>
							
						</c:if>


<a href="index.jsp"><img src="imgs/patitas.png" alt=""
							id="logotipo" /></a>
					</form>

				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</header>
<section id="principal" >