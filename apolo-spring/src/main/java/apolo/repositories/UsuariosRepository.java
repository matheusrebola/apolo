package apolo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {

}
