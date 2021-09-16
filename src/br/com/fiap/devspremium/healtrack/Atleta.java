package br.com.fiap.devspremium.healtrack;

public class Atleta extends Usuario {
	private String CPF;
	private IMC imc = new IMC();

	
	//Gets e Sets
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		if (Validacoes.isCPF(CPF)) { 
			this.CPF = CPF;
		}
		else {
			System.out.println("Cpf invalido");
		}
	}

	public String getImc() {
		return imc.toString();
	}

	public void setImc(float peso, float altura) {
		imc.setAltura(altura);
		imc.setPeso(peso);
	}
	public String ConsultaDieta(Dieta dieta) {
		return ("Nome: "+dieta.getNome()+"\n Descrição: "+dieta.getDescricao()
		+"\n Calorias: "+dieta.getQtdCal()+"\n Validade: "+dieta.getValidade());
	}
	public String ConsultaTreino(Treino treino) {
		return ("Nome: "+treino.getNome()+"\n Descrição: "+treino.getDescricao()
		+"\n Calorias: "+treino.getQtdCal()+"\n Validade: "+treino.getValidade()
		+"\n Frequencia: "+treino.getFrequencia());
	}
	
	
}
