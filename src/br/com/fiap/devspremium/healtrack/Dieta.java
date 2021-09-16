package br.com.fiap.devspremium.healtrack;

public class Dieta {
	private String nome;
	private String descricao;
	private int qtdCal;
	private String validade;
	
	//Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdCal() {
		return qtdCal;
	}
	public void setQtdCal(int qtdCal) {
		this.qtdCal = qtdCal;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
}
