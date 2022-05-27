package calc;

public class CalculadoraComum extends Calculadora{


	public Double soma(Double valor1, Double valor2) {
		return valor1+valor2;
	}


	public Double subtracao(Double valor1, Double valor2) {
		return valor1-valor2;

	}


	public Double multiplicacao(Double valor1, Double valor2) {
		return valor1*valor2;
	}


	public Double divisao(Double valor1, Double valor2) {
		if(valor2==0) {
			return null;
		}
		return valor1/valor2;
	}


	public Double restoDivisao(Double valor1, Double valor2) {
		if(valor2==0) {
			return null;
		}
		return valor1%valor2;
	}
	
	
}
