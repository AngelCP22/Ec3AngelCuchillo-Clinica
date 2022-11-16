package EC3AngelCuchilloClinica.services;

import java.util.List;

import EC3AngelCuchilloClinica.model.UsuarioCliente;

public interface UsuarioClienteService {
	void guardar(UsuarioCliente usuarioCliente);
	void actualizar(UsuarioCliente usuarioCliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);
}
