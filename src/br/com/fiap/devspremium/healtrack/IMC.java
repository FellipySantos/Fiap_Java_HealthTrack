package br.com.fiap.devspremium.healtrack;

public class IMC {
	private float altura;
	private float peso;
	
	@Override
	public String toString() {
		return "IMC: \n altura=" + altura + ", peso=" + peso + "\n Imc"+CalculaIMC(peso,altura);
	}
	
	//Gets e Sets
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if (altura<2.30) {
			this.altura = altura;
		}
		else {
			System.out.println("Altura invalida");
		}
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//Metodos
	private String CalculaIMC(float peso, float altura) {
		float imc = peso/(altura*altura);
		String grupo;
		if(imc<18.5) {
			grupo = "Abaixo do peso";
		}
		else if(imc<25) {
			grupo = "Peso normal";
		}
		else if(imc<30) {
			grupo = "Sobrepeso";
		}
		else if(imc<35) {
			grupo = "Obesidade Grau I";
		}
		else if(imc<40) {
			grupo = "Obesidade Grau II";
		}
		else {
			grupo = "Obesidade Grau III ou morbida";
		}
		return ("Seu IMC é: "+imc+" Você está no grupo:"+grupo) ;
		
	}
	
}
