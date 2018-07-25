<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Bienvenidos</title>
<link REL=StyleSheet HREF="index.css" TYPE="text/css">
<script src="index.js"></script>
</head>
<body>
	<jsp:useBean id = "login" scope="request" />
	<br>
	<div class="Saludo">
		<h2>Login</h2>
		<img src="img/gato.jpg" class="miau" alt="gato" />
	</div>
	<br>
	<p id="mensaje">
		Introduce <i>tus</i> <span class="destacado"> credenciales </span>para
		iniciar sesion
	</p>
	<form action="login" method="post">
		<fieldset>
			<legend>login</legend>
			<p>
				<label for="password">Nombre</label> <br> <input type="text"
					name="nombre" id="nombre">
			</p>
			<p>
				<label for="password">Contraseña</label> <br> <input
					type="text" name="password" id="password">
			</p>
			<p>
				<button>Login</button>
				<span class="errorTexto">
					
				</span>
			</p>
		</fieldset>
	</form>
</body>
</html>