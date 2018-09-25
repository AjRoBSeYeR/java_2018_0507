<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/index.css" />
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>

<body class="container-fluid">
		<jsp:useBean id="errorpo" scope="session" class="com.ipartek.supermercado.pojo.Articulo"/>
    <header>
        <div class="row ">
            <div class="miCab col-md-12 text-center"><img src="imgs/descarga1.png" height="100px" width="200px" alt="Este es el ejemplo de un texto alternativo"></div>
        </div>
        <div class="row">
            <nav class="navbar navbar-inverse">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">BM</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="login.jsp">Login<span class="sr-only">(current)</span></a></li>
                        <li><a href="regProd.html">registrar Producto</a></li>
                        <li><a href="listado.jsp">listado productos</a></li>
                      <li><a href="regUsuarios.jsp">reg usuarios</a></li>
                    </ul>
                    <div class="row">
                        <form class="miCuadro navbar-form navbar-right">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="buscar">
                            </div>
                            <button type="submit" class="btn btn-default">Buscar</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    </header>
     <form class="form-horizontal" action="usuario" method="post">
        <div class="form-group">
            <label for="id" class="col-sm-offset-1 col-sm-2 control-label">email</label>
            <div class="col-sm-8">
                <input type="email" class="form-control" id="id" name="mail" required="required" min="1" placeholder="Id numérico">
            </div>
        </div>
        <div class="form-group">
            <label for="titulo" class="col-sm-offset-1 col-sm-2 control-label">password</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" id="nombre" name="password" required="required" maxlength="100" pattern="[A-Za-z0-9ñÑáéíóúçàèìòù ]{3,50}" placeholder="nombre del articulo  mínimo 3 caracteres y máximo 50">
            </div>
        </div>
            <div class="col-sm-offset-2 col-sm-10">
                <button name="login" value="registro" class="btn btn-primary">Aceptar</button>
                <a class="btn btn-danger" href="#">Cancelar</a>
        
        </div>
    </form>
  

    <footer>
        <div class="row">
            <div class="col-md-2 col-xs-6 text-center"><img src="imgs/fb.png" height="50" width="50" alt="Este es el ejemplo de un texto alternativo"></div>
            <div class="col-md-2 col-xs-6 text-center"><img src="imgs/twitter2.png" height="50" width="50" alt="Este es el ejemplo de un texto alternativo"></div>
            <div class="col-md-2 col-xs-12"><a href="#">Politica de Privacidad</a></div>
            <div class="col-md-2 col-xs-12 "><a href="#">Contacto</a></div>
            <div class="col-md-2 col-xs-12"><a href="#">localicacion</a></div>
            <div class="micop col-md-2 col-xs-12">&copy;2018</div>
        </div>
    </footer>

</body>
</html>