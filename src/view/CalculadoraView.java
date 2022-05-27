package view;

import java.util.Scanner;

import calc.CalculadoraCientifica;
import calc.CalculadoraComum;

public class CalculadoraView {

	public CalculadoraView() {

	}

	public void menu() {
		Scanner leia = new Scanner(System.in);
		int opcao = 0, aux = 0, sair = -1;
		Double valor1, valor2, resultado;
		while (sair != 0) {
			while (opcao != 1 && opcao != 2) {
				System.out
						.print("Selecione a opção desejada:\n1 - Calculadora Comum\n2 - Calculadora Científica\n=> ");
				opcao = leia.nextInt();
			}
			switch (opcao) {
			case 1:
				CalculadoraComum cComum = new CalculadoraComum();
				while (aux < 1 || aux > 5) {
					System.out.print(
							"Operações disponíveis: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Resto da Divisão\n=> ");
					aux = leia.nextInt();
				}
				System.out.println("INFORME OS VALORES DE ENTRADA");
				System.out.print("Valor 1: ");
				valor1 = leia.nextDouble();
				System.out.print("Valor 2: ");
				valor2 = leia.nextDouble();

				if (aux == 1) {
					resultado = cComum.soma(valor1, valor2);
					System.out.println("O resultado da soma é: " + resultado);
				}

				else if (aux == 2) {
					resultado = cComum.subtracao(valor1, valor2);
					System.out.println("O resultado da subtração é:  " + resultado);
				}

				else if (aux == 3) {
					resultado = cComum.multiplicacao(valor1, valor2);
					System.out.println("O resultado da multiplicação é:  " + resultado);
				}

				else if (aux == 4) {
					if (cComum.divisao(valor1, valor2) != null) {
						resultado = cComum.divisao(valor1, valor2);
						System.out.println("O resultado da divisão é:  " + resultado);

					} else {
						System.out.print("Não é possível dividir por zero.");
					}

				}

				else {
					if (cComum.restoDivisao(valor1, valor2) != null) {
						resultado = cComum.restoDivisao(valor1, valor2);
						System.out.println("O resultado da divisão é:  " + resultado);

					} else {
						System.out.print("Não é possível dividir por zero.");
					}

				}

				break;

			case 2:
				CalculadoraCientifica cCientifica = new CalculadoraCientifica();
				while (aux < 1 || aux > 6) {
					System.out.print(
							"Operações disponíveis: \n1 - Expoente\n2 - Raiz Quadrada\n3 - Logaritmo\n4 - Seno\n5 - Cosseno\n6 - Tangente\n=> ");
					aux = leia.nextInt();
				}
				System.out.println("INFORME OS VALORES DE ENTRADA");
				if (aux == 1) {
					System.out.print("Digite a bse:");
					int numEx = leia.nextInt();
					System.out.print("Digite o expoente:");
					int expoente = leia.nextInt();
					resultado = cCientifica.calcularExpoente(numEx, expoente);
					System.out.println("O resultado é: " + resultado);
				}

				if (aux == 2) {
					System.out.print("\nDigite o numero que deseja a raiz:");
					int numR = leia.nextInt();
					resultado = cCientifica.raizQuadrada(numR);
					System.out.println("A raiz quadrada de " + numR + " é " + resultado);
				}

				if (aux == 3) {
					System.out.print("Digite o valor da base:");
					valor1 = leia.nextDouble();
					System.out.print("Digite o logaritmando: ");
					valor2 = leia.nextDouble();
					resultado = cCientifica.log(valor1, valor2);
					System.out.println(
							"O log de " + valor2 + " na base " + valor1 + " é: " + String.format("%.3f", resultado));

				}

				if (aux == 4) {
					System.out.print("Digite o ângulo:");
					int numAng = leia.nextInt();
					resultado = cCientifica.seno(numAng);
					System.out.println("O seno de " + numAng + " é: " + String.format("%f", resultado));

				}

				if (aux == 5) {
					System.out.print("Digite o ângulo:");
					int numAng = leia.nextInt();
					resultado = cCientifica.cosseno(numAng);
					System.out.println("O cosseno de " + numAng + " é: " + String.format("%f", resultado));

				}

				if (aux == 6) {
					System.out.print("Digite o ângulo:");
					int numAng = leia.nextInt();
					resultado = cCientifica.tangente(numAng);
					System.out.println("A tangente de " + numAng + " é: " + String.format("%f", resultado));

				}

				break;
			}
			sair=-1;
			while (sair != 1 && sair != 0) {
				System.out.print("\nSelecione: [ 1 - Retornar ao menu principal ] [ 0 - Sair ] => ");
				sair = leia.nextInt();
				opcao=0;
				aux=0;
			}
		}

		leia.close();
	}

}