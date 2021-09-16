package br.com.fiap.devspremium.healtrack;

public class Nutri extends Prestador {
	private String cm;

	
	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}
	
	public void CadastrarDieta(Dieta dieta, String nome, String descricao, int qtdCal, String Validade) {
		dieta.setNome(nome);
		dieta.setDescricao(descricao);
		dieta.setQtdCal(qtdCal);
		dieta.setValidade(Validade);
	}
	
}
