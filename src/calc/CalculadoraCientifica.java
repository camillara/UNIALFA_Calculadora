package calc;

public class CalculadoraCientifica extends Calculadora{
	
	public Double calcularExpoente(double num, double expoente) {
		return Math.pow(num, expoente);
	}
	
	public Double log(Double base, Double valor) {
		return Math.log(valor)/Math.log(base);
	}
	
	public Double raizQuadrada(int numR) {
		return Math.sqrt(numR);
	}
	
	public Double seno(int numAng) {
		Double radiandos = Math.toRadians(numAng);
		return Math.sin(radiandos);		
	}
	
	public Double cosseno(int numAng) {
		Double radiandos = Math.toRadians(numAng);
		return Math.cos(radiandos);		
	}
	
	public Double tangente(int numAng) {
		Double radiandos = Math.toRadians(numAng);
		return Math.tan(radiandos);		
	}
	
}
