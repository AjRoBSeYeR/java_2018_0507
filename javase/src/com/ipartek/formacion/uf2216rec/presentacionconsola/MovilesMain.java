package com.ipartek.formacion.uf2216rec.presentacionconsola;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.ipartek.formacion.uf2216rec.accesodatos.CrudAble;
import com.ipartek.formacion.uf2216rec.accesodatos.MovilesArrayDAO;
import com.ipartek.formacion.uf2216rec.pojo.Moviles;



public class MovilesMain {

	static private MovilesArrayDAO dao;
	static Scanner sc = null;
	
	private static final int SALIR = 0;
	private static final int ADD_MOVIL = 2;
	private static final int LISTADO = 1;
	private static final int GUARDAR = 3;
		
	
	public static void main(String[] args) throws IOException {
		
		sc = new Scanner(System.in);
		dao = MovilesArrayDAO.getInstace();
		
		cargarMoviles();
		
		int opcion;
		
		do {
			mostrarMenu();
			
			opcion = Utils.leerInt();
			
			procesarOpcion(opcion);
		}while(opcion != SALIR);
		
	}//FIN DEL MAIN		
		
		private static void procesarOpcion(int opcion) throws IOException {
			switch(opcion) {
			
			case ADD_MOVIL:
				addMovil();
				break;
				
			case LISTADO:
				listadoMoviles();
				break;
				
			case GUARDAR:
				guardarTxt();
				break;
				
			case SALIR:
				salir();
				break;
				
			default:
				noOption();
				break;
			}
		
		}
		
	
	
	
	private static void guardarTxt() throws IOException {
		
		String nameTxt;
		 do {
			System.out.println("�Como desea llamar al fichero?");
			nameTxt = sc.nextLine();
		}while (nameTxt == null );
		
		File f = new File("C:\\Users\\curso\\git\\java_2018_0507\\javase\\src\\com\\ipartek\\formacion\\uf2216rec\\MovilesList\\" + nameTxt + ".txt");
		
		if(f.exists()) {
			System.out.println("Ya existe un fichero con ese nombre");
			guardarTxt();
		}else {
			try {
				f.createNewFile();
				System.out.println("El fichero ha sido guardado con exito.");
				
				FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw);
				
				try {
					
					for (Moviles movil : dao.getAll()) {
						pw.println(movil);
					}
				}finally {
					pw.close();
					fw.close();
				}
				
				
			} catch (IOException e) {
				System.out.println("Error al crear fichero");
				e.printStackTrace();
			}
		}
		
		mostrarMenu();

	}
	
	
	private static void addMovil() {
		Moviles movil = crearMovilConDatosDeConsola();
		
		if(dao.insert(movil)) {
			p("Movil a�adido correctamente");
		} else {
			p("No se ha podido a�adir el video");
		}
	}
	
	private static Moviles crearMovilConDatosDeConsola() {
		p("ANDROID (TRUE o FALSE): ");
		Boolean android = Utils.leerBoolean();
		p("Marca: ");
		String marca = Utils.leerLinea();
		p("Ram: ");
		double ram = Utils.leerDouble();
		p("Pulgadas: ");
		double pulgadas = Utils.leerDouble();
		p("Memoria: ");
		int memoria = Utils.leerInt();
		
		Moviles movil = new Moviles(android, marca, ram, pulgadas, memoria);
		return movil;		
	}
	
	private static void noOption() {
		p("Esa funci�n no existe");		
	}
	
	private static void salir() {
		p("Gracias por tu visita");
	}
	
	private static void mostrarMenu() {
		p("------------");
		p("Moviles");
		p("------------");
		p("");
		p("1. Listado de moviles");
		p("2. A�adir movil");
		p("3. Guardar moviles");
		p("");
		p("0. Salir");
		p("");
		p("Elige una opci�n: ");
	}
	
	
	private static void listadoMoviles() {
		mostrarCabecera();
		
		for(Moviles movil: dao.getAll()) {
			mostrarMovil(movil);
		}
	}
	
	private static void mostrarCabecera() {
		p("ANDROID " + " " +"MARCA" + " " + "RAM" + " " + "PULGADAS" + " " + "MEMORIA");
	}
	
	private static void mostrarMovil(Moviles movil) {
		p(movil.isAndroid() + "  " + movil.getMarca() +"  " + movil.getRam() +"   " + movil.getPulgadas() +"  " + movil.getMemoria());
	}
	
	private static void cargarMoviles() {
		CrudAble<Moviles> dao = MovilesArrayDAO.getInstace();
		
		for(int i = 1; i<= 5; i++) {
			dao.insert(new Moviles(true, "marcaTelefono", 0, 0, 0));
		}
	}
	
	public static void p(String s) {
		System.out.println(s);
	}
	
	
}//END TAG
