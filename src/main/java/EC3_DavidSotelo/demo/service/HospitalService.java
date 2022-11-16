package EC3_DavidSotelo.demo.service;

import java.util.List;

import EC3_DavidSotelo.demo.model.Hospital;



public interface HospitalService  {
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
