package pajaros;

public class Principal {

	public static void main(String[] args) {
		
		/*Piolin p = new Piolin('H', 8, 12.50f, 3);
		p.quienSoy();
		p.altura();
		
		Loro l = new Loro('M', 11, 'N', "rojo");
		l.quienSoy();
		l.deDondeEres();
		
		p.tamano = 50.84f;
		p.altura();
		
		l.region = 'S';
		l.deDondeEres();
		
		System.out.println(Ave.numAves);*/
		
		// Se crear� un array de 3 Piolines y se inicializar�n todos sus datos 
		Piolin[] arrayP = new Piolin[3]; //conjunto de piolines (array)
		arrayP[0] = new Piolin('H', 8, 12.5f, 3);
		arrayP[1] = new Piolin('M', 10, 23.78f, 6);
		arrayP[2] = new Piolin('H', 3, 3.9f, 2);
		
		/* Se asignar� un nuevo nombre de animal y nuevo nombre de due�o al primero 
		de los tres Piolines creados */
		DatosPersonales datos = new DatosPersonales("Peter","Juan"); 
		arrayP[0].setNombres(datos);

	}

}
