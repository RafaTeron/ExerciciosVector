package Exercicio04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você quer salvar ? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("Digite um número : ");
			vect[i] = sc.nextDouble();
		}
		
		int quanto = 0;
		for(int i=0; i<N; i++) {
			if(vect[i] % 2 == 0) {
				System.out.println("Numeros pares : " + vect[i]);
				quanto++ ;
			}
		}
		System.out.print("Quantidade de pares : " + quanto);
		sc.close();

	}

}
