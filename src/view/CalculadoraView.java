package view;

import java.util.Scanner;

import calc.CalculadoraCientifica;
import calc.CalculadoraComum;

public class CalculadoraView {

	public CalculadoraView() {

	}

	public void menu() {
		Scanner leia = new Scanner(System.in);
		int opcao = 0, sair = -1, numAng;
		CalculadoraComum cComum = new CalculadoraComum();
		CalculadoraCientifica cCientifica = new CalculadoraCientifica();
		Double resultado;
		while (sair != 0) {
			while (opcao < 1 || opcao > 10) {
				System.out.println("Selecione a operação desejada:");
				System.out.println("1 - Soma");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				System.out.println("5 - Expoente");
				System.out.println("6 - Raíz Quadrada");
				System.out.println("7 - Logaritmo");
				System.out.println("8 - Seno");
				System.out.println("9 - Cosseno");
				System.out.println("10 - Tangente");
				System.out.print("=> ");
				opcao = leia.nextInt();
			}
			System.out.println("\nINFORME OS VALORES DE ENTRADA");
			switch (opcao) {
			case 1:
				System.out.print("Valor 1: ");
				cComum.setValor1(leia.nextDouble());
				System.out.print("Valor 2: ");
				cComum.setValor2(leia.nextDouble());
				resultado = cComum.soma();
				System.out.println("O resultado da soma é: " + resultado);
				break;

			case 2:
				System.out.print("Valor 1: ");
				cComum.setValor1(leia.nextDouble());
				System.out.print("Valor 2: ");
				cComum.setValor2(leia.nextDouble());
				resultado = cComum.subtracao();
				System.out.println("O resultado da subtração é:  " + resultado);
				break;

			case 3:
				System.out.print("Valor 1: ");
				cComum.setValor1(leia.nextDouble());
				System.out.print("Valor 2: ");
				cComum.setValor2(leia.nextDouble());
				resultado = cComum.multiplicacao();
				System.out.println("O resultado da multiplicação é:  " + resultado);
				break;

			case 4:
				System.out.print("Valor 1: ");
				cComum.setValor1(leia.nextDouble());
				System.out.print("Valor 2: ");
				cComum.setValor2(leia.nextDouble());
				if (cComum.divisao() != null) {
					resultado = cComum.divisao();
					System.out.println("O resultado da divisão é:  " + resultado);

				} else {
					System.out.print("Não é possível dividir por zero.");
				}
				break;

			case 5:

				System.out.print("Digite a base:");
				cCientifica.setValor1(leia.nextDouble());
				System.out.print("Digite o expoente:");
				cCientifica.setValor2(leia.nextDouble());
				resultado = cCientifica.calcularExpoente();
				System.out.println("O resultado é: " + resultado);
				break;

			case 6:
				System.out.print("\nDigite o numero que deseja a raiz:");
				int numR = leia.nextInt();
				resultado = cCientifica.raizQuadrada(numR);
				System.out.println("A raiz quadrada de " + numR + " é " + resultado);
				break;

			case 7:
				System.out.print("Digite o valor da base:");
				cCientifica.setValor2(leia.nextDouble());
				System.out.print("Digite o logaritmando: ");
				cCientifica.setValor1(leia.nextDouble());
				resultado = cCientifica.log();
				System.out.println("O log de " + cCientifica.getValor1() + " na base " + cCientifica.getValor2()
						+ " é: " + resultado);
				break;

			case 8:
				System.out.print("Digite o ângulo:");
				numAng = leia.nextInt();
				resultado = cCientifica.seno(numAng);
				System.out.println("O seno de " + numAng + " é: " + resultado);
				break;

			case 9:
				System.out.print("Digite o ângulo:");
				numAng = leia.nextInt();
				resultado = cCientifica.cosseno(numAng);
				System.out.println("O cosseno de " + numAng + " é: " + resultado);
				break;

			case 10:
				System.out.print("Digite o ângulo:");
				numAng = leia.nextInt();
				resultado = cCientifica.tangente(numAng);
				System.out.println("A tangente de " + numAng + " é: " + resultado);
				break;
			}
			sair = -1;
			while (sair != 1 && sair != 0) {
				System.out.print("\nSelecione: [ 1 - Retornar ao menu principal ] [ 0 - Sair ] => ");
				sair = leia.nextInt();
				opcao = 0;
			}
		}

		leia.close();
	}

}
