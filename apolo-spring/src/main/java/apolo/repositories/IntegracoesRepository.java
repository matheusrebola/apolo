package apolo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apolo.entities.Integracoes;

@Repository
public interface IntegracoesRepository extends JpaRepository<Integracoes, UUID> {

}
