<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <!--bootstrap-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    <!--mis ficheros css js -->
    <link rel="stylesheet" href="css/estilos.css" />
    <script src="js/index.js"></script>
</head>

<body id="LoginForm">
    <% if(session.getAttribute("usuario")!=null){ %>
    Bienvenido
    <%=(String)session.getAttribute("usuario")%>
    <%}%>
    <div class="container">
        <div class="login-form">
            <div class="main-div" id="ancho">
                <div class="panel">
                    <h2>Login</h2>
                    <p>Intorduce tu nombre y clave</p>
                </div>
                <form id="Login" action="Administrar">

                    <div class="form-group">
                        <input name="correo" class="form-control" id="inputEmail" placeholder="Email Address">

                    </div>

                    <div class="form-group">

                        <input name="pass" type="password" class="form-control" id="inputPassword" placeholder="Password">

                    </div>
                    <button type="submit" class="btn btn-primary">Entrar</button>

                </form>
            </div>

        </div>
    </div>
    </div>
    <footer>
    </footer>
</body>

</html>