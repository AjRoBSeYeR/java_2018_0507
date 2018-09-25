<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/includes/cabecera.jsp" %>


	<h1>Login</h1>

<div id="row">
<div id="col-xm-6">
<form action="login" method="post">
	<p>
		<label for="email">Email</label>
		<input type="email" name="email" id="email" value="${user.email}" />
		<span class="error">${user.errorEmail}</span>
	</p>
	<p>
		<label for="password">Contraseña</label>
		<input type="password" name="password" id="password" />
	</p>
	<p>
		<button>Login</button>
		<span class="error">${errores}</span>
	</p>
	
</form>
</div>
</div>
<%@ include file="/WEB-INF/includes/pie.jsp" %>