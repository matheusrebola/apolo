package apolo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.SalasTransmissao;

public interface SalasTransmissaoRepository extends JpaRepository<SalasTransmissao, UUID> {

}
