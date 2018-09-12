<%@ include file="index.jsp" %>
<jsp:useBean id="login" scope="request"
		class="com.ipartek.formacion.javaee.servlets.LoginForm" />
    <div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="login" method="post" role="form" style="display: block;">
									<div class="form-group">
										<label>Usuario</label>
										<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" 
										value='<jsp:getProperty property="nombre" name="login"/>'>
										<span class="errorNombre"> <jsp:getProperty
											 property="mensajeErrorUsuario" name="login"/></span>
									</div>
									<div class="form-group">
										<label>Contraseña</label>
										<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" <span class="errorClave"> <jsp:getProperty
					 property="mensajeErrorClave" name="login"/></span>  >
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@ include file="footer.jsp" %>