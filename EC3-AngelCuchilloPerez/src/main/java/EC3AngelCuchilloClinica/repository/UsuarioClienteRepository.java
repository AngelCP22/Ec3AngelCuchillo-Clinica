package EC3AngelCuchilloClinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3AngelCuchilloClinica.model.UsuarioCliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{
	UsuarioCliente findByUsuario(String usuario);
}
