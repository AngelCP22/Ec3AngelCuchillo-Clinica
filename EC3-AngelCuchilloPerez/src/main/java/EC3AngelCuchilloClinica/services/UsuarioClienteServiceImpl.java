package EC3AngelCuchilloClinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3AngelCuchilloClinica.model.UsuarioCliente;
import EC3AngelCuchilloClinica.repository.UsuarioClienteRepository;
@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	UsuarioClienteRepository repositorio;
	
	@Override
	public void guardar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub
		repositorio.save(usuarioCliente);
	}

	@Override
	public void actualizar(UsuarioCliente usuarioCliente) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(usuarioCliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
