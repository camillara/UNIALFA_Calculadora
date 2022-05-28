package calc;

public class CalculadoraComum extends Calculadora {

	public Double soma() {
		return valor1 + valor2;
	}

	public Double subtracao() {
		return valor1 - valor2;

	}

	public Double multiplicacao() {
		return valor1 * valor2;
	}

	public Double divisao() {
		if (valor2 == 0) {
			return null;
		}
		return valor1 / valor2;
	}

}
