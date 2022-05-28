package test;

import calc.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	// Pacotes importados

	CalculadoraComum calcComum = new CalculadoraComum();
	CalculadoraCientifica calcCientifica = new CalculadoraCientifica();

	@Test
	public void somaTest1() {
		// Teste soma 3+4=7
		calcComum.setValor1(3.0);
		calcComum.setValor2(4.0);
		assertEquals(7.0, calcComum.soma());
	}

	@Test
	public void somaTest2() {
		// Teste soma -3+10=7
		calcComum.setValor1(-3.0);
		calcComum.setValor2(10.0);
		assertEquals(7.0, calcComum.soma());
	}

	@Test
	public void subtracaoTest1() {
		// Teste Subtraçao 7-2=5
		calcComum.setValor1(7.0);
		calcComum.setValor2(2.0);
		assertEquals(5.0, calcComum.subtracao());

	}

	@Test
	public void subtracaoTest2() {
		// Teste Subtraçao 2-7= -5
		calcComum.setValor1(2.0);
		calcComum.setValor2(7.0);
		assertEquals(-5.0, calcComum.subtracao());

	}

	@Test
	public void multiplicacaoTest1() {
		// Teste Multiplicaçao 5*4=20
		calcComum.setValor1(5.0);
		calcComum.setValor2(4.0);
		assertEquals(20.0, calcComum.multiplicacao());
	}

	@Test
	public void multiplicacaoTest2() {
		// teste Multiplicaçao por numero negativo 5*(-2)=-10
		calcComum.setValor1(5.0);
		calcComum.setValor2(-2.0);
		assertEquals(-10.0, calcComum.multiplicacao());
	}

	@Test
	public void multiplicacaoTest3() {
		// teste Multiplicaçao por numero negativo (-5)*(-2)=10
		calcComum.setValor1(-5.0);
		calcComum.setValor2(-2.0);
		assertEquals(10.0, calcComum.multiplicacao());
	}

	@Test
	public void divisaoTest() {
		// Teste Divisao (10/4=2.5)
		calcComum.setValor1(10.0);
		calcComum.setValor2(4.0);
		assertEquals(2.5, calcComum.divisao());
	}

	@Test
	public void divisaoTest2() {
		// Teste Divisao (10/0=null)
		calcComum.setValor1(10.0);
		calcComum.setValor2(0.0);
		assertEquals(null, calcComum.divisao());
	}

	@Test
	public void calcularExpoente() {
		// Teste Expoente Base 2 expoente 4 = 16
		calcCientifica.setValor1(4.0);
		calcCientifica.setValor2(2.0);
		assertEquals(16.0, calcCientifica.calcularExpoente());
	}

	@Test
	public void logTest1() {
		// Teste Logaritmo de base igual ( logaritmo de 4 base 4 = 1)
		calcCientifica.setValor1(4.0);
		calcCientifica.setValor2(4.0);
		assertEquals(1.0, calcCientifica.log());
	}

	@Test
	public void raizQuadradaTest() {
		// Teste raizQuadrada de 9 = 3
		assertEquals(3, calcCientifica.raizQuadrada(9));

	}

	@Test
	public void senoTest() {
		// Teste seno de angulo 5 =
		assertEquals(0.08715574274765817, calcCientifica.seno(5), 0.00001);

	}
	
	@Test
	public void senoTest30() {
		// Teste seno de angulo 30 = 0,5
		assertEquals(0.5, calcCientifica.seno(30), 0.00001);

	}

	@Test
	public void cossenoTest() {
		// Teste cosseno de angulo 9 =
		assertEquals(0.9876883405951378, calcCientifica.cosseno(9));
	}
	
	@Test
	public void cossenoTest60() {
		// Teste cosseno de angulo 60 = 0,5
		assertEquals(0.5, calcCientifica.cosseno(60), 0.00001);
	}

	@Test
	public void tangenteTest() {
		// teste Tangente de Angulo 10 =
		assertEquals(0.17632698070846498, calcCientifica.tangente(10));
	}
	
	@Test
	public void tangenteTest45() {
		// teste Tangente de Angulo 45 = 1
		assertEquals(1.0, calcCientifica.tangente(45),0.00001);
	}


}