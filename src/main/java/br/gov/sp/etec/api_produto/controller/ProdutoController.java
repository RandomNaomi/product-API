package br.gov.sp.etec.api_produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.api_produto.dto.ProdutoDTO;
import br.gov.sp.etec.api_produto.entity.ProdutoEntity;
import br.gov.sp.etec.api_produto.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoService pSer;
	@PostMapping("cadastrar-produto")
	public ResponseEntity<?> cadastrar(@RequestBody ProdutoDTO pDto){
		ProdutoEntity pdte = pSer.cadastrar(pDto);
		
	return ResponseEntity.ok(pdte);
		
		
		
	}

}
