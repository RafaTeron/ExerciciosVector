package Exercicio05;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc quer salvar ? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Numero " + (i + 1) +" : ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = Integer.MIN_VALUE;
		int posicao = 0;
		for(int i=0; i<vect.length; i++) {
			if(vect[i] >= maior) {
				maior = vect[i];
				posicao = i + 1;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR : %.2f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR : " + posicao);
		sc.close();

	}

}
