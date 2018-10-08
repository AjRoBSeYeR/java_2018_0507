<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="/WEB-INF/includes/cabeceraadmin.jsp"%>

<div class="container">

	<h2>Administración</h2>
	<p class="lead">Perritos</p>

	<hr />



	<table class="table table-striped table-bordered table-hover">

		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Edad</th>
				<th>Raza</th>
				<th>Peso</th>
				<th>Apadrinado</th>
				<th>Identificador</th>
				<th>Longitud</th>
				<th>Latitud</th>
				
				<th style="width: 10%"><a
					class="btn btn-success add-to-cart-button"
					href="listadoprod?accion=add">Añadir</a></th>

			</tr>
		</thead>
		<tbody>

			<c:forEach items="${listadoProductos}" var="perro">

				<tr>
					<th>${perro.id}</th>
					<td>${perro.nombre}</td>
					<td>${perro.edad}</td>
					<td>${perro.raza}</td>
					<td>${perro.peso}</td>
					<td>${perro.apadrinado}</td>
					<td>${perro.chip.identificador}</td>
					<td>${perro.chip.longitud}</td>
					<td>${perro.chip.latitud}</td>

					<td><a class="btn btn-success add-to-cart-button"
						href="listadoprod?accion=edit&id=${perro.id}">Editar</a> <a
						class="btn btn-success add-to-cart-button"
						href="listadoprod?accion=delete&id=${perro.id}">Borrar</a></td>

				</tr>
			</c:forEach>
		</tbody>

	</table>

	<%@ include file="/WEB-INF/includes/pie.jsp"%>