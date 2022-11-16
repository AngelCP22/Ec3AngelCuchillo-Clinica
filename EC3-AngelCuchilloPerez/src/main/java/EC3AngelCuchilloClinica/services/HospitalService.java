package EC3AngelCuchilloClinica.services;

import java.util.List;

import EC3AngelCuchilloClinica.model.Hospital;

public interface HospitalService {

	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar ();
	Hospital obtener (Integer id);
	
}
