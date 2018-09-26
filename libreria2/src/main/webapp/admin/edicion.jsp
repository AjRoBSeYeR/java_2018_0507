<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/includes/cabeceraadmin.jsp"%>

<header>
	<h1>Administración Edición</h1>
</header>

<form action="procesaredicion" method="post">
	<p>
		<label for="id">Id</label> <input type="number" name="id" id="id"
			value="${pag.id}"
			<c:if test="${param.accion == 'delete'}">
			readonly="readonly"
		</c:if> />
	</p>
	<p>
		<label for="nombre">Texto</label> <input type="text" name="texto"
			id="texto" value="${pag.texto}"
			<c:if test="${param.accion == 'delete'}">
			disabled="disabled"
		</c:if> />
	</p>
	<p>
		<label for="nick">nick</label> <input type="text" 
			name="nick" id="nick" value="${pag.nick}"
			<c:if test="${param.accion == 'delete'}">
			disabled="disabled"
		</c:if> />
	</p>
	<p>
		<input type="hidden" name="accion" value="${param.accion}" />
		<button>${accion}</button><a href="index">Cancelar</a>
		<span class="error">${error}</span>
	</p>


</form>

<%@ include file="/WEB-INF/includes/pie.jsp"%>