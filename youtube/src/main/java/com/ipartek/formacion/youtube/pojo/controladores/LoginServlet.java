package com.ipartek.formacion.youtube.pojo.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.youtube.logica.LogicaNegocio;
import com.ipartek.formacion.youtube.pojo.Usuario;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Recogida de datos de formularios, URLs, cookies, session...
		request.setCharacterEncoding("UTF-8");
		
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		if(nombre == null || password == null) {
			throw new RuntimeException("Escribe un usuario y contraseña.");
		}
		
		//2.Cargamos el modelo (en nuestro caso el pojo)
		Usuario usuario = new Usuario(nombre, password);
		
		//3.Logica de negocio
 		
		/*if(usuario.isCorrecto() && usuarioValido) {
			//4.Redireccion a otra pagina con uno o varios modelos
			request.getSession().setAttribute("user", usuario);
			request.getRequestDispatcher("index").forward(request, response); //principal
		} else {
			//4.Redireccion a otra pagina con uno o varios modelos
			if(!usuarioValido) {
				request.setAttribute("errores", "El usuario no es valido");
			}
			request.setAttribute("user", usuario);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}*/
	}

}