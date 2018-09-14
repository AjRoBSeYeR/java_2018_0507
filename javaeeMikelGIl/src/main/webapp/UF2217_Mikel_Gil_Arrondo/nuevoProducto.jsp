<div class="col-md-3"></div>
<div class="col-md-6">
	<seccion id="registro">
		<h3>Nuevo producto</h3>
	    <form class="form-horizontal" action="index.jsp">
	        <div class="form-group">
	            <label for="inputNombre">Nombre producto</label>
	            <input type="text" class="form-control" id="inputNombre" placeholder="Nombre (M�nimo 2, m�ximo 20)" minlength=2 maxlength=20 required>
	        </div>
	        <div class="form-group">
	            <label for="inputCategoria">Categoria</label>
	            <select class="form-control">
	              <option value="0" selected>Seleccione una categor�a</option>
				  <option value="1">Bebida</option>
				  <option value="2">Fruta</option>
				  <option value="3">Carne</option>
				  <option value="4">Pescado</option>
				  <option value="5">Otros</option>
				</select>
	        </div>
	        <div class="form-group">
	            <label for="inputDescripcion">Descripci�n producto</label>
	            <textarea id="textareaNuevoProducto" class="form-control" rows="3" placeholder="Descripci�n producto (M�nimo 5 , m�ximo 100)" minlength=5 maxlength=100 required></textarea>
	        </div>
	        <div class="form-group">
	            <label for="inputPrecio">Precio</label>
	            <input type="text" class="form-control" id="inputPrecio" placeholder="Precio">
	        </div>
	        <div class="form-group">
	            <label for="inputDescuento">Descuento</label>
	            <input type="text" class="form-control" id="inputDescuento" placeholder="Descuento">
	        </div>
	        <div class="form-group text-center">
	            <button type="submit" class="btn btn-default">Aplicar y aceptar</button>
	            <button class="btn btn-default"><a href="index.jsp" alt="Cancelar">Cancelar</a></button>
	        </div>
	    </form>
    </seccion>
</div>
<div class="col-md-3"></div>