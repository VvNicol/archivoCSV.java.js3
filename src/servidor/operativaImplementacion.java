/**
 * 
 */
package servidor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import dtos.clienteDto;

/**
 * 
 */
public class operativaImplementacion implements operativaInterfaz {
	
	private String rutaCSV = "cliente.csv";
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void AltaCliente(List<clienteDto> clienteLista) throws IOException{
		
		
		try (FileWriter fw = new FileWriter(rutaCSV, true)) {
	        long idCliente = idCalcular(clienteLista);
	        System.out.println("Ingrese nombre completo:");
	        String nombreCliente = sc.nextLine();
	        System.out.println("Ingrese telefono:");
	        int telCliente = Integer.parseInt(sc.nextLine()); // Consumir la línea pendiente después de nextInt
	        System.out.println("Ingrese correo electronico:");
	        String correoCl = sc.nextLine();

	        clienteDto nuevoClienteDto = new clienteDto(idCliente, nombreCliente, telCliente, correoCl);
	        clienteLista.add(nuevoClienteDto);
	        fw.write(nuevoClienteDto.toString() + "\n");
	    }
	}

	private long idCalcular(List<clienteDto> clienteLista) {
		// TODO Auto-generated method stub
		long nuevoId = 0;
		int tamanio = clienteLista.size();

		if (tamanio > 0) {

			nuevoId = clienteLista.get(tamanio - 1).getId() + 1;

		} else {

			nuevoId = 1;

		}

		return nuevoId;

	}

}
