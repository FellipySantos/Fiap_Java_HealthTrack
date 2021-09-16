package br.com.fiap.devspremium.healtrack;

public class Treinador extends Prestador {
	/**
    *
    * A classe Treinador salva os registros de cadastro do Treinador. Ela é uma classe entidade que busca herança com a classe Prestador (que busca herança com a classe Usuário).
    *
    *
    * @author DevPremium
    *
    * @version 1.0
    *
    */
	private String cref;
	
	

	/**
	 * Metodo para pegar o CREF do treinador
	 * @return
	 */
	public String getCref() {
		return cref;
	}
	/**
	 * Metodo para inserir o CREF do treinador
	 * @param cref
	 */
	public void setCref(String cref) {
		this.cref = cref;
	}
	
	/**
	 * Metodo para cadastrar um novo treino.
	 * @param treino 
	 * @param nome
	 * @param descricao
	 * @param qtdCal
	 * @param Validade
	 * @param frequencia
	 */
	public void CadastrarTreino(Treino treino, String nome, String descricao, int qtdCal, String Validade, String frequencia) {
		treino.setNome(nome);
		treino.setDescricao(descricao);
		treino.setQtdCal(qtdCal);
		treino.setValidade(Validade);
		treino.setFrequencia(frequencia);
	}
	
}
