package apolo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public record Usuarios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		@Email String email,
		String senha,
		TipoUsuario tipoUsuario,
		LocalDateTime dataCriacao) {

}
