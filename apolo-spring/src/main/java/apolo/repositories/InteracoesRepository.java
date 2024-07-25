package apolo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.Interacoes;

public interface InteracoesRepository extends JpaRepository<Interacoes, UUID> {

}
