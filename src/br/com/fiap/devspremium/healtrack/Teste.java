package br.com.fiap.devspremium.healtrack;

public class Teste {

	public static void main(String[] args) {
		//Treinador
		Treinador treinador = new Treinador();
		treinador.setNome("Paulo");
		treinador.setEmail("Paulo.Souza@gmail.com");
		treinador.setSexo('F');
		treinador.setDtNasc("19/03/2005");
		treinador.setCnpj("76.457.982/0001-07");
		treinador.setCref("28947292938340");
		Treino Perna = new Treino();
		treinador.CadastrarTreino(Perna, "Treino de Perna", "Este treino te ajudara a fortalecer sua perna"
				, 60, "2 meses", "3 series de 20 minutos");
		
		//Atleta
		Atleta atleta = new Atleta();
		atleta.setNome("Fellipy");
		atleta.setEmail("Fellipy772244@gmail.com");
		atleta.setSexo('M');
		atleta.setDtNasc("07/05/2002");
		atleta.setCPF("074.363.950-25");
		atleta.setImc(89.0F, 1.80F);
		System.out.println(atleta.getImc());
		System.out.println(atleta.ConsultaTreino(Perna));
	}

}
