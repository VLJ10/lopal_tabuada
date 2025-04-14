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
	
	public String[] exibirTabuada() {
		
		if(multiplicadorMenor > multiplicadorMaior) {
			double temp = multiplicadorMaior;
			multiplicadorMaior = multiplicadorMenor;
			multiplicadorMenor = temp;
		}
		
		int tamanhoVetor = (int) (multiplicadorMaior - multiplicadorMenor + 1);
		
		String tabuada[] = new String[tamanhoVetor];
		int i = 0;
		while(multiplicadorMenor <= multiplicadorMaior) {
			double produto = multiplicando * multiplicadorMenor;
			//multiplicando x multiplicadorMenor = produto
			tabuada[i] = multiplicando + " x " + multiplicadorMenor + " = " + produto ;
//			System.out.printf("%s x %s = %s\n", multiplicando, multiplicadorMenor, produto );
			multiplicadorMenor++;
			i++;
		}
		
		return tabuada;
		
	}
	
//	public String[] exibirTop() {
//		System.out.println("Vai tomando");
//		String top 
//		return top;
//	}

}
