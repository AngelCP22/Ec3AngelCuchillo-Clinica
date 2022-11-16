package EC3AngelCuchilloClinica.services;

import java.util.List;

import EC3AngelCuchilloClinica.model.Cliente;


public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
	
}
