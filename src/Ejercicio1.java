import acm.graphics.*;
import acm.program.GraphicsProgram;

/*
 * Autor: Guillermo Blasco
 * 
 * Ejemplo de uso de GitHub
 */

public class Ejercicio1 extends GraphicsProgram{

	public void run() {
		//cambio el tama�o de la ventana
		setSize(800,600);
		//llamo al m�todo que dibuja la pir�mide
		pintaPiramide();

	}

	public void pintaPiramide() {
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		int basePiramide = numLadrillosBase * anchoLadrillo;
		int ancho = getWidth();
		int alto = getHeight();

		//terminado y probado con varios tama�os de ladrillos
		for(int j=0; j < numLadrillosBase; j++) {
			for(int i=0; i < numLadrillosBase-j; i++) {
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				//a�ade una fila de ladrillos
				add(ladrillo,ancho/2 - basePiramide/2 + anchoLadrillo*j/2 + anchoLadrillo*i, alto - altoLadrillo - j*altoLadrillo);
				pause(20);
			}

			for(int i=0; i < numLadrillosBase-j; i++) {
				GRect ladrillo = new GRect(anchoLadrillo, altoLadrillo);
				//a�ade una fila de ladrillos
				add(ladrillo,ancho/2 - basePiramide/2 + anchoLadrillo*j/2 + anchoLadrillo*i, j*altoLadrillo);
				pause(20);
			}
		}
	}

}


