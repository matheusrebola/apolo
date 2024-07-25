package apolo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.Visualizacoes;

public interface VisualizacoesRepository extends JpaRepository<Visualizacoes, UUID> {

}
