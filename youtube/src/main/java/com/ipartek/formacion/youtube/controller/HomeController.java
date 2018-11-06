package com.ipartek.formacion.youtube.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import com.ipartek.formacion.youtube.Video;
=======
import com.ipartek.formacion.youtube.accesodatos.UsuarioMySqlDAO;
>>>>>>> branch 'master' of https://github.com/ipartek/java_2018_0507.git
import com.ipartek.formacion.youtube.accesodatos.VideoMySqlDAO;
<<<<<<< HEAD
=======
import com.ipartek.formacion.youtube.model.Usuario;
import com.ipartek.formacion.youtube.model.Video;
>>>>>>> branch 'master' of https://github.com/ipartek/java_2018_0507.git

@WebServlet("/inicio")
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String idver = request.getParameter("idver");
			
			List<Usuario> usuarios = UsuarioMySqlDAO.getInstance().getAll();
			
			for(Usuario usuario: usuarios) {
				List<Video> videos = VideoMySqlDAO.getInstance().getAllByUsuario(usuario);
				usuario.setVideos(videos);
			}
			
			Video videoInicio = null;
			
			if(idver != null) {
				videoInicio = VideoMySqlDAO.getInstance().getById(idver);
			} else {
				videoInicio = new Video();
	      		
//				if ( !videos.isEmpty() ){
//	      			videoInicio = videos.get(0);
//				}
			}
			
			request.setAttribute("videoInicio", videoInicio);
			request.setAttribute("usuarios", usuarios);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			//throw new ControladorException(e.getMessage(), e);
			
			request.setAttribute("alertatipo", "danger");
			request.setAttribute("alertatexto", "ERROR NO ESPERADO");
		} finally {
			request.getRequestDispatcher("/WEB-INF/vistas/home.jsp").forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		doGet(request, response);
	}
}
