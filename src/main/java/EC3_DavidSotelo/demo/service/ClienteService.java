package EC3_DavidSotelo.demo.service;

import java.util.List;

import EC3_DavidSotelo.demo.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
