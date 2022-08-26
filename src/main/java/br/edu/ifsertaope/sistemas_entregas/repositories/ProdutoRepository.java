package br.edu.ifsertaope.sistemas_entregas.repositories;

import br.edu.ifsertaope.sistemas_entregas.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//O JPARepository ele é extendido porque ele possui vários metodos prontos como buscar uma listagem,
// salvar,deletar
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, UUID> {

}
