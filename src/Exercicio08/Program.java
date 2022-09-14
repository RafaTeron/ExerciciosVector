package Exercicio08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor ? ");		
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("Digite um numero : ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0, numeropares = 0;
		for(int i=0; i<N; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				numeropares++;
			}
		}
		
		double media = soma/numeropares;
		if(soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();

	}

}
