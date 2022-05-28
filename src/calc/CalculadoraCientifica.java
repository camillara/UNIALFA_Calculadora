package calc;

public class CalculadoraCientifica extends Calculadora {

	public Double calcularExpoente() {
		return Math.pow(valor1, valor2);
	}

	public Double log() {
		return Math.log(valor1) / Math.log(valor2);
	}

	public Double raizQuadrada(int numR) {
		return Math.sqrt(numR);
	}

	public Double seno(int numAng) {
		valor1 = Math.toRadians(numAng);
		return Math.sin(valor1);
	}

	public Double cosseno(int numAng) {
		valor1 = Math.toRadians(numAng);
		return Math.cos(valor1);
	}

	public Double tangente(int numAng) {
		valor1 = Math.toRadians(numAng);
		return Math.tan(valor1);
	}

}
