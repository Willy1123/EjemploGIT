import acm.graphics.*;
import acm.program.GraphicsProgram;

/*
 * Autor: Guillermo Blasco
 * 
 * Ejemplo de uso de GitHub
 */

public class Ejercicio1 extends GraphicsProgram{

	public void run() {
		//cambio el tamaño de la ventana
		setSize(800,600);
		//llamo al método que dibuja la pirámide
		pintaPiramide();

	}

	public void pintaPiramide() {
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		
		//querido yo del martes:
		//te falta lo mas facil de todo
		//girar la piramide y ponerla bien
		for(int j=0; j < numLadrillosBase; j++) {
			for(int i=0; i < numLadrillosBase-j; i++) {
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				//añade una fila de ladrillos
				add(ladrillo,anchoLadrillo*j/2 + anchoLadrillo*i, j*altoLadrillo);
			}
		}
	}

}
