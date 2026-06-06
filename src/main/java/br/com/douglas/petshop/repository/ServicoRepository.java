package br.com.douglas.petshop.repository;

import br.com.douglas.petshop.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

    @Query("SELECT new br.com.douglas.petshop.model.Servico(s.id, s.descricao, os.valor) " +
           "FROM Servico s JOIN OrdemServico os ON s.id = os.servicoId " +
           "WHERE os.ordemId = :ordemId")
    List<Servico> findByOrdemId(@Param("ordemId") Long ordemId);

}
