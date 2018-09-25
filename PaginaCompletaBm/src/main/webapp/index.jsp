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
    <div class="row">
        <article class="miProducto">
            <img src="imgs/bef.jpg" height="170" width="165" alt="">
            <section>
                <div class="texto-encima text-center">20%</div>
                <h3 class="text-center"><span class="price--line-through">14.99€</span><span class="rojo">12.95€</span> </h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>

        <article class="miProducto">
            <img src="imgs/seagrams.jpg" height="170" width="165" alt="">
            <section>
               <div class="texto-encima text-center">35%</div>
                <h3 class="text-center"><span class="price--line-through">14.99€</span><span class="rojo">12.95€</span> </h3>
                <p class="text-center">SEAGRAMS ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/absolut.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">9.95€</h3>
                <p class="text-center">ABSOLUT vodka ruso botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/negri.jpg" height="170" width="165" alt="">
            <section>                
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">NEGRITA ron inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/cardhu.jpg" height="170" width="165" alt="">
            <section>
                  <div class="texto-encima text-center">35%</div>
                <h3 class="text-center">12.95€</h3>                
                <p class="text-center">CARDHU whisky inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/tanq.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">TANQUERAY ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/puert.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/gor.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/gordonPink.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/bef.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/bef.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>
        <article class="miProducto">
            <img src="imgs/bef.jpg" height="170" width="165" alt="">
            <section>
                <h3 class="text-center">12.95€</h3>
                <p class="text-center">BEFFEATTER ginebra inglesa botella 70cl </p>
                <div class="miBotonera">
                    <button class="miBot" type="submit">+</button>
                    <span>1</span>
                    <button class="miBot" type="submit">-</button>
                </div>
            </section>
            <button class="btn btn-lg btn-success btn-block" type="submit">añadir al carrito</button>
        </article>

        <a href="#top" class="miTopp btn-danger">top</a>
    </div>


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