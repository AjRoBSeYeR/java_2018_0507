<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/includes/cabecera.jsp"%>
<header>
	<h1>Libro</h1>
</header>
<p>
	<a href="#">Anterior</a><a href="#">Siguiente</a>
</p>

<c:if test="${sessionScope.user == null}">
	<textarea disabled>Loreemsndsionasonsalkcklnm</textarea>
</c:if>

<c:if test="${sessionScope.user != null}">
	<textarea>Loreemsndsionasonsalkcklnm</textarea><p></p>
	<input type="text" disabled value="Autor: ${sessionScope.user.nombre}">
</c:if>	
<p></p>
<p>
	<a href="#">Anterior</a><a href="#">Siguiente</a>
</p>
<%@ include file="/WEB-INF/includes/pie.jsp"%>