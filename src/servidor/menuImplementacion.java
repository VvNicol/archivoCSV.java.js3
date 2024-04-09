/**
 * 
 */
package servidor;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */
public class menuImplementacion implements menuInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public int MenuPrincipal() throws IOException {
		System.out.println("Menu principal");
		System.out.println("0.Cerrar menu");
		System.out.println("1.Alta Cliente");
		int opcionElegida = sc.nextInt();
		
		return opcionElegida;
	}

}
