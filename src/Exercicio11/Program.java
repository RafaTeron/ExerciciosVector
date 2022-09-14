package Exercicio11;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas ? ");
		int N = sc.nextInt();
		double[] altura = new double[N];
		String[] genero = new String[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa:");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa:");
			genero[i] = sc.next();
		}
		
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			if(altura[i] <= menor) {
				menor = altura[i];
			}
			if(altura[i] >= maior) {
				maior = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n" , menor);
		
		System.out.printf("Maior altura = %.2f%n", maior);
		
		double soma = 0;
		int posicao = 0;
		int quantHomem = 0;
		for(int i=0; i<N; i++) {
			if(genero[i].equals("F")) {
				soma += altura[i];
				posicao++;
			}
			if(genero[i].equals("M")) {
				quantHomem++;
			}
		}
		double mediaMulheres = soma/posicao;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		
		System.out.println("Numero de homens = " + quantHomem);
		sc.close();

	}

}
