package servidor;

import java.io.IOException;
import java.util.List;

import dtos.clienteDto;

public interface operativaInterfaz {

	void AltaCliente(List<clienteDto> clienteLista)throws IOException;

}
