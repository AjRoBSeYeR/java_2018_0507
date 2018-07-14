package com.ipartek.formacion.ejemplo1;

/**
 * 
 * @class Main
 * 
 *        programa principal en el cual se crea una instancia de la clase Piolin
 *        y otro de la clase loro. � Llamar al m�todo quienSoy de las dos
 *        instancias � Llamar al m�todo altura con la instancia del Piol�n �
 *        Invocar al m�todo deDondeEres con la instancia del Loro � Modificar el
 *        tama�o del Piol�n y volver a invocar al m�todo altura � Modificar la
 *        regi�n del Loro � Mostrar el n�mero de Aves creadas.
 * 
 * @author AnaMAMM
 *
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * atributos de instancia
		 * 
		 *
		 */
		Piolin piolin = new Piolin('H', 10, 5, 2, new DatosPersonales("Agrsro", "jfj"));

		Loro loro = new Loro('M', 11, 'E', "azul");

		Loro l2 = new Loro('M', 11, 'E', "rojo");

		/**
		 * array de piolines con 3 posiciones
		 */
		Piolin[] piolines = new Piolin[3];

		/**
		 * inicializacion de datos de piolin
		 */
		Piolin piolin1 = new Piolin('H', 1, 2, 2, new DatosPersonales("A", "A2"));
		Piolin piolin2 = new Piolin('H', 29, 5, 5, new DatosPersonales("B", "B2"));
		Piolin piolin3 = new Piolin('H', 30, 3, 4, new DatosPersonales("C", "C3"));

		piolines[0] = piolin1;
		piolines[1] = piolin2;
		piolines[2] = piolin3;

		/**
		 * Se asignar� un nuevo nombre de animal y nuevo nombre de due�o al primero de
		 * los tres Piolines creados
		 */
		DatosPersonales dp = new DatosPersonales("Ave", "Dueno");
		dp.setNombreAve("Swaggy P");
		dp.setNombreDueno("Pepito");
		piolines[0].setNombres(dp);

		/**
		 * Hacer cantar al loro y a los tres Piolines
		 */
		loro.cantar();

		for (Piolin p : piolines) {
			p.cantar();
		}

		/**
		 * Sacar por pantalla el nombre del animal y del due�o del primer Piol�n creado
		 */
		System.out.println(piolines[0].getNombres().getNombreAve());
		System.out.println(piolines[0].getNombres().getNombreDueno());

		piolin.quienSoy();
		loro.quienSoy();

		piolin.altura();

		loro.deDondeEres('N');
		loro.setRegion('S');

		piolin.setTamano(4);
		piolin.altura();

		// probando instacia de clase (static)
		// System.out.println(l.numAvesCreadas);
		// l.numAvesCreadas++;
		// System.out.println(l2.numAvesCreadas);
		//// da un aviso xq es estatico se llama asi: (con Ave)
		// System.out.println(Ave.numAvesCreadas);

		Ave.mostrarAvesCreadas();

	}

}
