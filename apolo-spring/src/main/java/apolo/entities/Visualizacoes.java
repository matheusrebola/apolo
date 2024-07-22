package apolo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Visualizacoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime tempoVisualizacao,
		LocalDateTime dataVisualizacao,
		SalasTransmissao salasTransmissao,
		Usuarios usuarios) {

}
