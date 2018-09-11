<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Ejemplo Bootstrap</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
	
	<script src="js/bootsrap.min.js"></script>
	<script src="js/jquery-1.12.4.min.js"></script>
	
	
</head>
<body>
	<h1 class="cabecera">LIBROS JULEN</h1>
	
	 <nav class="navbar navbar-inverse">
      <div class="container">
    
        <div class="collapse navbar-collapse center-block" id="navbar-collapse-3" >
          <ul class="nav navbar-nav navbar-left">
            <li><a href="#">Historia</a></li>
            <li><a href="#">Fantasia</a></li>
            <li><a href="#">Programacion</a></li>
            <li><a href="#">Thrillers</a></li>
            <li><a href="#">Literatura erotica</a></li>  
          </ul>       
        </div>
      </div>
    </nav>
    
<div class="container">
	<div class="col-sm-2">
    <nav class="nav-sidebar">
		<ul class="nav tabs">
          <li class="active"><a href="#tab1" data-toggle="tab">Login</a></li>
          <li class=""><a href="listado.html" data-toggle="tab">Listado de Libros</a></li>
          <li class=""><a href="edicion.html" data-toggle="tab">A�adir y Editar</a></li>                               
		</ul>
	</nav>
		<div><h2 class="add">Coloque aqui su anuncio!!!!!</h2></div>
</div>

<%@ include file="listado.jsp" %>

<div class="tab-content">
<div class="tab-pane active text-style" id="tab1">
  <h2>Login</h2>
       <p>
    <div class="container">	
	<div class="row">

		<div class="col-xs-12 col-sm-7 col-md-7 col-lg-3">
                    <form action="listado.html">
                      <div class="form-group">
                        <label for="exampleInputEmail1">Nombre de Usuario</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Nombre Usuario">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                      </div>
                      <div class="form-check"> 
                        <button type="submit" class="btn btn-primary">Aceptar</button>
                      </div>
                      
                    </form>
		</div>		
	</div>
</div>
    
</div>
<div class="tab-pane text-style" id="tab2">
  <h2>Listado de Libros</h2>
   <p></p>
    <hr>
          <img src="http://placehold.it/150x90" class="img-rounded pull-left">
</div>
<div class="tab-pane text-style" id="tab3">
  <h2>Editar o A�adir</h2>
  <p></p>
    <hr>
    <div class="col-xs-6 col-md-3">
      <img src="http://placehold.it/150x150" class="img-rounded pull-right">
  </div>
</div>
</div>
    
    
</div>

</body>
</html>