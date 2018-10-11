<%@ include file="/WEB-INF/includes/cabecera.jsp" %>


<header>

	<h1>Libro compartido</h1>
</header>

<main>
	<c:if test="${sessionScope.usuario != null}">
		<a href="index" class="btn btn-primary">Escribir p�gina</a>
	</c:if>
	<form action="edicion">
		Ir a p�gina <input type="number" name="pagina" /><a href="edicion?numPagina=3" class="btn btn-primary">Ir</a>
	</form>
	
	<%@ include file="/WEB-INF/includes/paginacion.jsp" %>
	
	<p>P�gina ${pagina.numero} / ${numeroPaginas}</p>
	<p>${pagina.contenido}</p>
	<p>${pagina.autor}</p>
	
	<%@ include file="/WEB-INF/includes/paginacion.jsp" %>
	
	<form action="buscarPalabra" method="post">
		Buscar palabra <input type="search" name="palabra" />
	</form>
	
	<ul>
	<c:forEach items="${resultadosBusqueda}" var="paginaResultado">
		<li><a href="index?pagina=${paginaResultado}">${paginaResultado}</a>
	</c:forEach>
	</ul>
</main>

<%@ include file="/WEB-INF/includes/pie.jsp" %>
