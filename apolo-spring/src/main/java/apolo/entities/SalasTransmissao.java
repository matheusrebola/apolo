package apolo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record SalasTransmissao(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nomeSala,
		String descricao,
		LocalDateTime dataCriacao,
		LocalDateTime dataTransmissao,
		Usuarios usuarios) {

}
