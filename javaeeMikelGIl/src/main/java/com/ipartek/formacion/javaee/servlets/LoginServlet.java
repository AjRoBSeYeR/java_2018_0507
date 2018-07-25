package com.ipartek.formacion.javaee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.javaee.modelos.LoginForm;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("hola a todos\n" + new java.util.Date());

		String ruta = request.getContextPath();
		pw.println(ruta);

		
		pw.println("\nSi quieres introducir usuario y contrase�a hagalo por POST");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");		
		if (nombre == null || password == null) { 
			throw new RuntimeException("No se han recibido los datos de nombre y/o password");
		}
		
		LoginForm login = new LoginForm(nombre,password);
		
		if (validar(login)) {
			request.getSession().setAttribute("usuario", login);;
			response.sendRedirect("principal.jsp");
		}else {
			//response.sendRedirect("error.html");
			login.setMensajeError("El usuario o contrase�a no son correctos");
			request.setAttribute("login", login);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
//		PrintWriter pw = response.getWriter();
//		pw.append("Hola ").append(nombre);
		
		//doGet(request, response);
	}

	private boolean validar(LoginForm login) {
		return "antxon".equals(login.getNombre()) && "asdf".equals(login.getPassword());
	}

}
