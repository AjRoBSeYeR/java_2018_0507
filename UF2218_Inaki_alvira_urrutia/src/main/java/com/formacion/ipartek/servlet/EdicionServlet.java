package com.formacion.ipartek.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formacion.ipartek.logica.LogicaNegocio;
import com.formacion.ipartek.pojo.HojaLibro;

/**
 * Servlet implementation class EdicionServlet
 */
@WebServlet("/edicion")
public class EdicionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String inser = null, texto = "", autor = "";
		int id = -1;
		if (request.getParameter("texto") != null)
			texto = request.getParameter("texto");
		if (request.getParameter("autor") != null)
			autor = request.getParameter("autor");
		if (request.getParameter("id") != null)
			id = Integer.parseInt(request.getParameter("id"));
		if (request.getParameter("insertarHoja") != null)
			if (request.getParameter("insertarHoja").equalsIgnoreCase("true")) {
				LogicaNegocio.insertarHoja(new HojaLibro(id, texto, autor));
				System.out.println(texto + "te" + autor + "au" + id + "id" + "dentro anadir");
			}
		LogicaNegocio.devolverTamanoLibro(request);
		movimientos(request);
		request.getRequestDispatcher("edicion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void movimientos(HttpServletRequest request) {
		String avanzar = null, move = null;
		boolean fin = false;
		int paginaBarra = -1;
		ServletContext context = getServletConfig().getServletContext();
		if (request.getParameter("page") != null)
			paginaBarra = Integer.parseInt(request.getParameter("page"));
		if (request.getParameter("move") != null)
			move = request.getParameter("move");
		if (request.getParameter("fromJsp") != null)
			avanzar = request.getParameter("fromJsp");
		context.getAttribute("pagina");
		if (request.getParameter("move") != null && move.equalsIgnoreCase("siguiente")
				&& paginaBarra >= (Integer) request.getSession().getAttribute("tamanoLibro")) {
			fin = true;
		} else
			fin = false;

		if ((Integer) context.getAttribute("pagina") == 0 && avanzar == null) {// cuando llego del servidor y cargo la
																				// primera vez dvuelvo el arra echo por
																				// mi
			int pagina = (Integer) context.getAttribute("pagina");
			request.getSession().setAttribute("rangos", LogicaNegocio.getPorRangos(pagina));
			request.getSession().setAttribute("pagAct", LogicaNegocio.obtenerPagina(pagina).getTextoHoja());
			request.getSession().setAttribute("autor", LogicaNegocio.obtenerPagina(pagina).getAutor());
		}
		if (!fin && avanzar != null && avanzar.equalsIgnoreCase("true") && move.equalsIgnoreCase("barra")) {// cuando
																											// pulso uno
			// de los botones de
			// la barra
			int pagina = (Integer) context.getAttribute("pagina");
			context.setAttribute("pagina", paginaBarra);// para notificarlo en toda la pagina
			request.getSession().setAttribute("rangos", LogicaNegocio.getPorRangos(paginaBarra));
			request.getSession().setAttribute("pagAct", LogicaNegocio.obtenerPagina(paginaBarra).getTextoHoja());
			request.getSession().setAttribute("autor", LogicaNegocio.obtenerPagina(paginaBarra).getAutor());
			System.out.println("entro");
		}
		if (!fin && avanzar != null && avanzar.equalsIgnoreCase("true") && move.equalsIgnoreCase("siguiente")) {// cunado
																												// pulso
			// el boton de
			// siguiente
			int pagina = (Integer) context.getAttribute("pagina");
			pagina++;

			context.setAttribute("pagina", pagina);
			request.getSession().setAttribute("rangos", LogicaNegocio.getPorRangos(pagina));
			request.getSession().setAttribute("pagAct", LogicaNegocio.obtenerPagina(pagina).getTextoHoja());
			request.getSession().setAttribute("autor", LogicaNegocio.obtenerPagina(pagina).getAutor());

		}
		if ((Integer) context.getAttribute("pagina") == 0) {// comprobar despues de sumar por que si no siempre va a
															// asignar
			// null
			avanzar = null;
		}
		if (avanzar != null && avanzar.equalsIgnoreCase("true") && move.equalsIgnoreCase("anterior")) {// cunado pulso
																										// el boton de
																										// siguiente
			int pagina = (Integer) context.getAttribute("pagina");
			pagina--;
			context.setAttribute("pagina", pagina);
			request.getSession().setAttribute("rangos", LogicaNegocio.getPorRangos(pagina));
			request.getSession().setAttribute("pagAct", LogicaNegocio.obtenerPagina(pagina).getTextoHoja());
			request.getSession().setAttribute("autor", LogicaNegocio.obtenerPagina(pagina).getAutor());
		}

	}
}
