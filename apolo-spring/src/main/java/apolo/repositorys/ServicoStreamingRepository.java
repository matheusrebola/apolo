package apolo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import apolo.entities.ServicoStreaming;

public interface ServicoStreamingRepository extends JpaRepository<ServicoStreaming, UUID> {

}
