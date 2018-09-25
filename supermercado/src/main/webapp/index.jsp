

<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel=stylesheet href="css/bootstrap.min.css">
    <link rel=stylesheet href="css/estilos.css">
    <link rel="stylesheet" href="css/fonts.css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="shortcut icon" href="imgs/favicon.ico" />
    <title>Supermercado Ana</title>
</head>

<body>
  
    <div class="jumbotron">
      <h1>Supermercado Ana</h1> 
    </div>
  
<!--Este include cachea la pagina y no tiene que recargarse todo el tiempo  -->
<!--  %@ include file="foo.jsp" %-->
<!--Este include llama continuamente a buscar el otro jsp  -->    


<jsp:include page="menuprincipal.jsp" />
    
<div class="jumbotron">
      <h1>Bienvenido al supermercado ana, vaya a la seccion correspondiente a sus necesidades.</h1> 
    </div>
 <footer>
  <div id="pie">
       <i class="fas fa-envelope"></i>
        <p>Mail <a href="mailto:mail@mail.com"> mail@mail.com</a>.</p>
       <div id="iconredsocial">
           <img class="redsocial" src="imgs/facebook.png" width="30px">
           <img class="redsocial" src="imgs/twiter.png" width="30px">
           <img class="redsocial" src="imgs/insta.jpg" width="30px">
       </div>
       <div >&copy;</div>
       <a href="bebidas.jsp">Volver - </a>
      <a href="contacto.jsp">Contacto - </a>
       <a href="localizacion.jsp">Localizacion</a>
       
   
   </div>
</footer>
</body>
</html>