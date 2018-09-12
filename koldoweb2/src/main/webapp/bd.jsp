<%@ include file="cabecera.jsp" %>
<div class="row">
  <div class="col-md-8">
  <ol class="breadcrumb">
  <li><a href="#">TodoLibros</a></li>
  <li class="active">Cat�logo</li>
</ol>
</div>
  <div class="col-md-4">

</div>

<div class="row">
    <div class="col-md-8">
    <h1>Lista de libros nuevos destacados</h1>
    <h4>Esta informaci�n se renueva cada semana</h4>
    <table class="table table-hover">
    <tr>
        <th>T�tulo</th>
        <th>Autor</th>
        <th>Fecha de lanzamiento</th>
        <th>ISBN</th>
        <th>Precio en TodoLibros</th>
        <th>Interacci�n</th>
        <th>Editar informaci�n</th>
        <th>Comprar en TodoLibros</th>
    </tr>
    <tr>
        <td>El rey recibe</td>
        <td>Eduardo Mendoza</td>
        <td>2018</td>
        <td>9788432234071</td>
        <td>11,34</td>
        <td><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> Me gusta
</button></td>
        <td><a href="editar.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
</button></a> </td>

<td><a href="login.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar
</button></a> </td>
        
    </tr>
    <tr>
        <td>21 lecciones para el siglo XXI</td>
        <td>Yuval Noah Harari</td>
        <td>2018</td>
        <td>9788499928678</td>
        <td>11,34</td>
        <td><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> Me gusta
</button></td>
        <td><a href="editar.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
</button></a> </td>
        <td><a href="login.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar
</button></a> </td>
    </tr>
        <tr>
        <td>GOG: Empieza la cuenta atr�s</td>
        <td>J.J. Benitez</td>
        <td>2018</td>
        <td>9788408193272</td>
        <td>10,44</td>
        <td><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> Me gusta
</button></td>
        <td><a href="editar.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
</button></a> </td>
        <td><a href="login.jsp"><button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Comprar
</button></a> </td>
   
    </tr>
    </table>
    </div>
  <div class="col-md-4">
  <h1>Disfrute de las �ltimas novedades</h1>
  <p>Todo este contenido y mucho m�s est� disponible para suscriptores con cuenta premium. ��nete a Premium!" </p>
<img src="logopremium.png" class="img-responsive" alt="Responsive image"><button type="button" class="btn btn-danger">Suscr�bete</button><br />
</div>
 
<div class="row">
  <div class="col-md-12">
  
      <hr class="featurette-divider"><br />
</div>
    </div>


<%@ include file="footer.jsp" %>