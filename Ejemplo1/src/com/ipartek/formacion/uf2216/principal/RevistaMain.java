package com.ipartek.formacion.uf2216.principal;

import java.util.Scanner;

import com.ipartek.formacion.uf2216.accesodatos.CrudAble;
import com.ipartek.formacion.uf2216.accesodatos.RevistaArrayDAO;
import com.ipartek.formacion.uf2216.pojo.Revista;
import com.ipartek.formacion.video.pojo.VideoYoutube;
import com.ipartek.formacion.uf2216.principal.Utils;

public class RevistaMain {
	private static final int LISTADO = 1;
	private static final int LISTADOID = 2;
	private static final int BORRARID = 3;
	private static final int UPDATEID = 4;
	private static final int EXIT = 0;
	private static CrudAble<Revista> dao = RevistaArrayDAO.getInstance();
	public static void main(String[]args) {
		
		cargarRevistas();
	
		
	
	int opcion=0;
	
	mostrarMenu();
	
	while(((opcion=leerTeclado())<5)) {
		switch(opcion) {
		case LISTADO:
			listadoRevistas();
			mostrarMenu();
			break;
			
		case LISTADOID:
			p("Que id quieres listar del 1 al"+dao.getAll().size());
			p("-----------");
			
			obternerRevistaXid(leerTeclado());
			mostrarMenu();
			break;
			
		case BORRARID:
			p("Que id quieres borrar del 1 al"+ dao.getAll().size());
			p("-----------");
			borrarRevistaXid(leerTeclado());
			listadoRevistas();
			mostrarMenu();
			break;
			
		case UPDATEID:
			p("Que id quieres modificar del 1 al"+ dao.getAll().size());
			p("------------------");
			modRevistaXid(leerTeclado());
			listadoRevistas();
			mostrarMenu();
			break;
		case EXIT:
			p("Gracias por su consulta, vuelva pronto");
			break;
			
		}
		if(opcion==0) {
			break;
			}
		}
	}
	
	private static void mostrarMenu() {
		p("------------");
		p("Revista");
		p("------------");
		p("");
		p("1. Listado de revistas");
		p("2. Obtener revista por id");
		p("3. Eliminar registro ");
		p("4. Modificar registro");
		p("0. Salir");
		p("Elige una opci�n");
		}
	
	private static void modRevistaXid(int id) {
		mostrarCabecera();
		Revista revista = new Revista("Pesca",1234567891,10,true,1);
		dao.update(revista);
	
	}/*
	private static Revista crearRevistadatosconsola() {
		p("TITULO:");
		String titulo= Utils.leerLinea();
		p("ISBN:");
		int isbn = Utils.leerInt();
		p("NUMEROPAGINAS:");
		int numeroPaginas = Utils.leerInt();
		p("formato:");
		boolean formato = Utils.leerBoolean();
		p("ID:");
		int id = Utils.leerInt();
		
		Revista revista = new Revista(titulo, isbn, numeroPaginas, formato, id);
		return revista;
	}
	
	private static void updateRevista() {
		Revista revista = crearRevistadatosconsola();
		
		if(dao.update(revista)) {
			p("Revista modificada correctamente");
		} else {
			p("No se ha podido modificar la revista");
		}
	}
*/
	
	private static void borrarRevistaXid(int id) {
		mostrarCabecera();
		System.out.println(dao.getById(id));
		dao.delete(id);
		System.out.println("�LA REVISTA SELECCIONADA HA SIDO ELIMINADA CON EXITO!");
	}
	
	private static void obternerRevistaXid(int id) {
		System.out.println("ESTA ES LA REVISTA CON EL ID ESPECIFICADO");
		mostrarCabecera();
		System.out.println(dao.getById(id));
	}
	
	private static void listadoRevistas() {
		System.out.println("ESTAS SON LAS REVISTAS DISPONIBLES");
		mostrarCabecera();
		for(Revista revista:dao.getAll()) {
			
			mostrarRevista(revista);
		}
	}
	private static int leerTecladoElementos(int elementos) {
		Scanner teclado = new Scanner(System.in);
		int i = -1;
		try {
			do {
				i=Integer.parseInt(teclado.nextLine());
				if(i>4) 
					System.out.println("mete opciones del 0 al"+elementos);
				}
				while(i>elementos);
			}
			catch(NumberFormatException e) {
				System.out.println("Introduzca un numero por favor");
			}
			return i;
		}
		
	private static int leerTeclado(){
		int i=-1;
		Scanner teclado = new Scanner(System.in);

		try {
			do {
			i=Integer.parseInt(teclado.nextLine());
			if(i>4)
				System.out.println("mete opciones del 0 al 4");
			}
			while(i>4);
		}
		catch (NumberFormatException e) {
			System.out.println("I");
		}
	
		return i;
	}
	
	private static void mostrarCabecera() {
		p("ID\t TITULO\t          ISBN\t                NUMEROPAGINAS");
	}
	
	private static void mostrarRevista(Revista revista) {
		p(revista.getId()+"        "+revista.getTitulo()+"           "+revista.getIsbn()+"              "+revista.getNumeroPaginas());
	}
	
	private static void cargarRevistas() {
		Revista revista;
		
		revista = new Revista("MOTOS",1321321321,12,true,1);
		dao.insert(revista);
		
		revista = new Revista("ROPA",1213021032,25,false,2);
		dao.insert(revista);
		
		revista = new Revista("MODA",2100120120,30,true,3);
		dao.insert(revista);
		
		revista = new Revista("DEPORTES",1122111110,20,false,4);
		dao.insert(revista);
		
		revista = new Revista("CIENCIA",1111111110,35,true,5);
		dao.insert(revista);
	}
	
	public static void p(String s) {
		System.out.println(s);
	}
}
	
	
