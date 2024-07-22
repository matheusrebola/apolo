package apolo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Interacoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoInteracao tipoInteracao,
		String conteudo,
		LocalDateTime dataInteracao,
		SalasTransmissao salasTransmissao,
		Usuarios usuarios) {

}
