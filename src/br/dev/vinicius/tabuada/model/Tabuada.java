package br.dev.vinicius.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double multiplicadorMenor;
	private double multiplicadorMaior;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicadorMenor() {
		return multiplicadorMenor;
	}

	public void setMultiplicadorMenor(double multiplicadorMenor) {
		this.multiplicadorMenor = multiplicadorMenor;
	}

	public double getMultiplicadorMaior() {
		return multiplicadorMaior;
	}

	public void setMultiplicadorMaior(double multiplicadorMaior) {
		this.multiplicadorMaior = multiplicadorMaior;
	}
	
	public void exibirTabuada() {
		
		if(multiplicadorMenor > multiplicadorMaior) {
			double temp = multiplicadorMaior;
			multiplicadorMaior = multiplicadorMenor;
			multiplicadorMenor = temp;
		}
		
		
		while(multiplicadorMenor <= multiplicadorMaior) {
			double produto = multiplicando * multiplicadorMenor;
			
			System.out.printf("%s x %s = %s\n", multiplicando, multiplicadorMenor, produto );
			multiplicadorMenor++;
		}
		
	}
	
	

}
