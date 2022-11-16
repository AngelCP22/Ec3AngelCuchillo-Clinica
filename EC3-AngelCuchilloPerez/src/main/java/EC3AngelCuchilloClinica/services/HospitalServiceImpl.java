package EC3AngelCuchilloClinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3AngelCuchilloClinica.model.Hospital;
import EC3AngelCuchilloClinica.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	HospitalRepository repositorio;
	
	@Override
	public void guardar(Hospital hospital) {
		// TODO Auto-generated method stub
		repositorio.save(hospital);
	}

	@Override
	public void actualizar(Hospital hospital) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(hospital);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Hospital obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
