package apolo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.VideosGravados;

public interface VideosGravadosRepository extends JpaRepository<VideosGravados, UUID> {

}
