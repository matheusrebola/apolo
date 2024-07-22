package apolo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record VideosGravados(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String videoUrl,
		LocalDateTime dataGravacao,
		SalasTransmissao salasTransmissao,
		Usuarios usuarios) {

}
