package com.ipartek.formacion.javaee.libroelectronico.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.javaee.libroelectronico.accesodatos.LibroMapDAO;
import com.ipartek.formacion.javaee.libroelectronico.logica.LogicaNegocio;
import com.ipartek.formacion.javaee.libroelectronico.pojo.Libro;

/**
 * Servlet implementation class EditarLibroServlet
 */
@WebServlet("/editarLibro")
public class EditarLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String autor = request.getParameter("autor");
		String texto = request.getParameter("texto");
		
		List<Libro> paginas = LibroMapDAO.getInstance().getAll();
		
		Libro libro = new Libro();
		libro.setId(libro.getTotalid());	
		libro.setTexto(texto);
		libro.setAutor(autor);
	
		boolean textoValido = LogicaNegocio.validarPagina(libro);
		//boolean textovalido = true;

		if (libro.isCorrecto() && textoValido) {
			request.setAttribute("libro", libro);
			paginas.add(libro);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/escribirPagina.jsp").forward(request, response);
		}
	}
}
