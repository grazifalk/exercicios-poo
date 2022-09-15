package br.com.residencia.poo.exerciciospdf;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com
eles.
Obs.: Trate o maior número possível de erros (ex: operações com números
negativos, divisão por zero, uso de letras, etc).*/

public class ExercicioTres {

	public static void main(String[] args) {
		double n1, n2, soma = 0.0, sub = 0.0, mult = 0.0, div = 0.0;
		String operacao;
		Scanner entrada = new Scanner(System.in);
		
		try {
					
		System.out.println("=====CALCULADORA DA GRAZI===== \n");
		
		System.out.println("=====Digite o primeiro número: ");
		n1 = entrada.nextDouble();
		System.out.println("=====Digite o segundo número: ");
		n2 = entrada.nextDouble();
		System.out.println("=====Escolha a operação desejada: [+][-][*][/] ");
		operacao = entrada.next();
		
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		
		switch (operacao) {
	    case "+":
	        System.out.println(n1 + " + " + n2 + " = " + soma);
	        break;
	    case "-":
	   	System.out.println(n1 + " - " + n2 + " = " + sub);
	    	break;
	    case "*":
	        System.out.println(n1 + " * " + n2 + " = " + mult);
	        break;
	    case "/":
	    	if (n2 != 0) {
			    div = n1 / n2;
			    System.out.println(n1 + " / " + n2 + " = " + div);
			}else {
			    System.out.println("Não é possível dividir um número por 0.");
			}
	        break;
	    default:
	        System.out.println("=====Erro! Tente novamente!");
			break;

		}
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido!");
		}
		entrada.close();
	}
}