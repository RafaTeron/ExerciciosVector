package Exercicio02;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// Vector | encontrar o soma e a media dos números digitados
		System.out.print("Quantos numeros voce pode digitar ? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero : ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + "   ");
		}
		
		System.out.println();
		double soma = 0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		double media = soma/n;
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);
		
		sc.close();

	}

}
