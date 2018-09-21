<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/includes/cabecera.jsp" %>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="well well-sm">
					<form class="form-horizontal" method="post">
						<fieldset>
							<legend class="text-center header">Nuevo producto</legend>

							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-user bigicon"></i></span>
								<div class="col-md-8">
									<input id="fname" name="name" type="text"
										placeholder="Nombre" class="form-control" required>
								</div>
							</div>
							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-user bigicon"></i></span>
								<div class="col-md-8">
									<input id="lname" name="name" type="number"
										placeholder="ID" class="form-control" required>
								</div>
								
							</div>
							
							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-user bigicon"></i></span>
								<div class="col-md-8">
									<input id="lname" name="name" type="number"
										placeholder="Precio" class="form-control" required>
								</div>
								
							</div>

							<div class="form-group">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-pencil-square-o bigicon"></i></span>
								<div class="col-md-8">
									<textarea class="form-control" id="message" name="message"
										placeholder="DescripciÃ³n del producto"
										rows="7" required></textarea>
								</div>
							</div>

							<div class="form-group">
								<div class="col-md-12 text-center">
									<button type="submit" class="btn btn-primary btn-lg"
										id="submitedit">Submit</button>
								</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
	
<%@ include file="/includes/pie.jsp" %>