package Exercicio07;

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
		
		double soma = 0;
		for(int i=0; i<N; i++) {
			soma += vect[i];
		}
		double media = soma/N;
		System.out.printf("Media do vetor = %.3f%n", media);
		
		for(int i=0; i<N; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
