package br.gov.sp.etec.api_produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.api_produto.dto.ProdutoDTO;
import br.gov.sp.etec.api_produto.entity.ProdutoEntity;
import br.gov.sp.etec.api_produto.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoRepository pRepo;
	
	
	@Override
	public ProdutoEntity cadastrar(ProdutoDTO pdto) {
		ProdutoEntity entidade = new ProdutoEntity();
		entidade.setNomeProduto(pdto.getNomeProduto());
		entidade.setDescricaoProduto(pdto.getDescricaoProduto());
		entidade.setPrecoProduto(pdto.getPrecoProduto());
		entidade.setQuantiaProduto(pdto.getQuantiaProduto());
		
		return pRepo.save(entidade);
		
		
	}

	
}
