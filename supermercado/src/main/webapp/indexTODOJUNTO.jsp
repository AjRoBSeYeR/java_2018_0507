<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

<head>
<title>Supermercado</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/estilos.css" />

<script src="js/jquery-1.12.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<link href="https://fonts.googleapis.com/css?family=Montserrat:600"
	rel="stylesheet">
</head>

<body class="container-fluid">

	<header id="cabecera" class="v-center p-2">
		<h1>Supermercado</h1>
	</header>

	<nav class="navbar navbar-inverse noborder">
		<div class="container-fluid">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"><img
					src="imgs/logo.png" alt="logo" width="40px"></a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.html">Inicio <span
							class="sr-only">(current)</span></a></li>
					<li><a href="listado.html">Listado</a></li>
					<li><a href="edicion.html">Modificar</a></li>
					<li><a href="#">Otros</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Buscar">
					</div>
					<button type="submit" class="btn btn-default">Buscar</button>
				</form>
				<ul class="nav navbar-nav pull-right">
					<li><a href="login.html" class="pull-right verde">Login</a></li>
				</ul>
			</div>

		</div>
	</nav>

	<div class="row">

		<section id="principal" class="col-12">

			<div id="disponibles" class="text-left">

				<h2>Productos disponibles</h2>

				<div class="row">

					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<div class="img-container">
								<img class="img-responsive center-block" src="imgs/producto.png"
									alt="producto">
								<div class="top-left">20%</div>
							</div>

							<div class="texto-producto">
								<h3 class="descuento">
									<span class="sub-precio"><del>13.35â¬</del></span> 12.95â¬
								</h3>
								<span class="sub-precio">(18,50 â¬ / Litro)</span>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>

					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>

					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<div class="img-container">
								<img class="img-responsive center-block" src="imgs/producto.png"
									alt="producto">
								<div class="top-left">20%</div>
							</div>

							<div class="texto-producto">
								<h3 class="descuento">
									<span class="sub-precio"><del>13.35â¬</del></span> 12.95â¬
								</h3>
								<span class="sub-precio">(18,50 â¬ / Litro)</span>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>

					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>
					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>



					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<div class="img-container">
								<img class="img-responsive center-block" src="imgs/producto.png"
									alt="producto">
								<div class="top-left">20%</div>
							</div>

							<div class="texto-producto">
								<h3 class="descuento">
									<span class="sub-precio"><del>13.35â¬</del></span> 12.95â¬
								</h3>
								<span class="sub-precio">(18,50 â¬ / Litro)</span>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>

					<div class="col-md-15 col-sm-4 col-xs-6">
						<div class="producto">

							<img class="img-responsive center-block" src="imgs/producto.png"
								alt="producto">
							<div class="texto-producto">
								<h3>7.90â¬</h3>
								<small class="text-muted">(18,50 â¬ / Litro)</small>
								<p>BEEFETER ginebra inglesa botella 10cl</p>
							</div>

							<div class="input-group aumentar">
								<span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number">
										<span class="glyphicon glyphicon-minus"></span>
									</button>
								</span> <input type="text" class="form-control input-number" value="1"
									min="1" max="10"> <span class="input-group-btn">
									<button type="button" class="btn btn-default btn-number"
										data-type="plus">
										<span class="glyphicon glyphicon-plus"></span>
									</button>
								</span>
							</div>

							<button class="btn btn-success aÃ±adir">AÃ±adir al carro</button>

						</div>
					</div>

				</div>

			</div>

		</section>

	</div>

	<footer>
		<div class="row text-center v-center">

			<div class="col-md-6 col-xs-12">
				<a href="#">Localizacion</a><br /> <a href="#">Contacto</a><br />
				<a href="#">PolÃ­tica de privacidad</a><br /> <a href="#">&copy;2018
					Cristina Martin</a>
			</div>

			<div class="col-md-6 col-xs-12">
				<div class="footer-icons">
					<a href="#"><img src="imgs/fb.png" alt="facebook"></a> <a
						href="#"><img src="imgs/tt.png" alt="twitter"></a>
				</div>
			</div>
		</div>
	</footer>

	<div class="top">
		<a href="#cabecera"><img src="imgs/top.png"></a>
	</div>

</body>

</html>
