package br.edu.ifsertaope.sistemas_entregas.service;

import br.edu.ifsertaope.sistemas_entregas.models.ProdutoModel;
import br.edu.ifsertaope.sistemas_entregas.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class ProdutoService {

    final ProdutoRepository produtoRepository;

    //Ponto de injeção utilizado para quando for salvar algum resistro, por exemplo
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Transactional //usado caso algo dê errado e os dados quebrados não são salvos
    public Object save(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> findById(UUID id) {
        return produtoRepository.findById(id);
    }

    @Transactional //usado pra alterações em cascata
    public void delete(ProdutoModel produtoModel) {
        produtoRepository.delete(produtoModel);
    }
}
