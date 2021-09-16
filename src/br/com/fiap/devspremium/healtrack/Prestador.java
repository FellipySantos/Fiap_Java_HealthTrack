package br.com.fiap.devspremium.healtrack;

public class Prestador extends Usuario {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (Validacoes.isCNPJ(cnpj)) {
			this.cnpj = cnpj;
		}
		else {
			System.out.println("Cnpj invalido");
		}
	}	
	public void setDtNasc(String dtNasc) {
		if(Validacoes.MaiorDeIdade(dtNasc)) {
			this.dtNasc = dtNasc;
		}
		else {
			System.out.println("Para se tornar um prestador é necessario ser maior de idade");
		}
	}
}
