package br.gov.sp.etec.api_produto.dto;

public class ProdutoDTO {
	private String nomeProduto;
	private String descricaoProduto;
	private double precoProduto;
	private int quantiaProduto;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantiaProduto() {
		return quantiaProduto;
	}
	public void setQuantiaProduto(int quantiaProduto) {
		this.quantiaProduto = quantiaProduto;
	}

}
