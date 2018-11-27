﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<!-- Bootstrap core CSS -->
<link href="css/bootstrap-litera-theme.min.css" rel="stylesheet">

<!-- Icons -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
	integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
	crossorigin="anonymous">

<!-- Datatables  styles-->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">

<!-- Custom styles -->
<link href="css/estilos.css" rel="stylesheet">

<!-- SCRIPTS -->
<!-- Optional JavaScript -->
<!-- JQuery first, then Popper.js, then Bootstrap JS -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<!-- Datatables -->
<script
	src="http://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>

<!-- Custom scripts -->
<!-- Datatables -->
<script src="js/customDataTables.js"></script>
<!-- Carga alumnos en select -->
<script src="js/cambiarAlumnoSelect.js"></script>

<script src="js/index.js"></script>
<title>Prestamo de libros</title>
</head>
<body>
	<div class="container-fluid">

		<!-- NAVIGATION -->
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="menu?accion=libros"> <i
				class="fas fa-home"></i>
			</a>

			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
					<li class="nav-item active"><a class="nav-link"
						href="menu?accion=libros"><i class="fas fa-book"></i>&nbsp;Libros<span
							class="sr-only">(current)</span> </a></li>
					<li class="nav-item"><a class="nav-link"
						href="menu?accion=alumnos"><i class="fas fa-user"></i>&nbsp;Alumnos</a></li>
					<li class="nav-item"><a class="nav-link"
						href="menu?accion=editoriales"><i class="fas fa-pen-fancy"></i>&nbsp;Editoriales</a></li>
				</ul>
				<form action="logout" class="form-inline my-2 my-lg-0">
					<span class="navbar-text"> <i class="fas fa-user"></i>
						&nbsp;Bienvenido ${sessionScope.usuario.nombre}&nbsp;
					</span>
					<button class="btn btn-warning" type="submit">
						<i class="fas fa-sign-out-alt"></i>&nbsp;Logout
					</button>
				</form>
			</div>
		</nav>

		<c:if test="${mensaje != null}">
			<div class="alert alert-${mensajetipo} alert-dismissible fade show"
				role="alert">
				${mensaje}
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
		</c:if>
		<!-- END NAVIGATION -->

		<!-- SECCION TABLA ALUMNOS -->
		<section id="sectionAlumnos">
			<div class="row text-center">
				<h2 class="text-warning">Gestión alumnos</h2>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="table-responsive">
						<table id="tablaAlumnos" name="tablaAlumnos"
							class="table table-sm table-striped table-light table-hover">
							<thead>
								<tr class="table-warning">
									<th scope="col">Nombre</th>
									<th scope="col">Apellido</th>
									<th scope="col">DNI</th>
									<th scope="col"><a href="gestionAlumno?operacion=nuevo"
										class="btn btn-primary"><i class="fas fa-plus"></i>&nbsp;Nuevo
											alumno</a></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${alumnos}" var="alumno">
									<tr>
										<th>${alumno.nombre}</th>
										<td>${alumno.apellido}</td>
										<td>${alumno.dni}</td>
										<td><a
											href="gestionAlumno?operacion=editar&id=${alumno.id}"><i
												class="far fa-edit"></i></a> <a
											href="gestionAlumno?operacion=borrar&id=${alumno.id}"><i
												class="far fa-trash-alt"></i></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</section>
		<!-- END SECCION TABLA ALUMNOS -->




		<h1>Editoriales</h1>

		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Editorial</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>

		<form>
			<input type="hidden" id="id" value="0" /> <input name="nombre"
				id="nombre" />
		</form>


	</div>
</body>
</html>