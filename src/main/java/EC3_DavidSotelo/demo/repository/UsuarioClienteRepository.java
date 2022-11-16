package EC3_DavidSotelo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EC3_DavidSotelo.demo.model.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuario(String usuario);
}
