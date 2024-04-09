/**
 * 
 */
package controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dtos.clienteDto;
import servidor.menuImplementacion;
import servidor.menuInterfaz;
import servidor.operativaImplementacion;
import servidor.operativaInterfaz;

/**
 * 
 */
public class inicio {

	/**
	 * @param args
	 */
	static public String rutaCVS = "cliente.cvs";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz oi = new operativaImplementacion();
		List<clienteDto> clienteLista = new ArrayList<clienteDto>();
		

		int opcionseleccionada;
		boolean esCerrado = false;

		try {

			File archivo = new File(rutaCVS);
			
			if (!archivo.exists()) {
				archivo.createNewFile();
			}	
			
			do {
				opcionseleccionada = mi.MenuPrincipal();
				switch (opcionseleccionada) {
				case 0:
					esCerrado = true;
					break;
				case 1:
					oi.AltaCliente(clienteLista);
					break;
				default:
					break;
				}

			} while (!esCerrado);
		} catch (IOException e) {
			// TODO: handle exception

		}
	}
}
