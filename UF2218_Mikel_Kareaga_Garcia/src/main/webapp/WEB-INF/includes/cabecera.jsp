<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_ES"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>E-BOOK</title>

<style>
	.error {
		color: red;
		font-weight: bold;
	}
</style>

</head>
<body>
	<header>
		<h1>Libro digital<small>${sessionScope.user.email}</small></h1>
		<p>
			
		</p>
	</header>
	<nav>
		<ul>
			<li><a href="escribirPagina.jsp">Escribir Pagina</a></li>
			<li><a href="irPagina">Ir a pagina</a><input type="text" name="numeroPagina"></li>
			
			<li><a href="login.jsp">Iniciar sesion</a></li>
			<li><a href="/desconectar">Cerrar sesion</a></li>
			<c:choose>
				<c:when test="${sessionScope.user == null}">
					<li><a href="login">Login</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="desconectar">Logout</a></li>
				</c:otherwise>
			</c:choose>
				
			
		</ul>
	</nav>

	<main>