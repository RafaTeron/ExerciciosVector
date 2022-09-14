package Exercicio01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Mostrar os números positivos e negativos digitados
		System.out.print("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("Negativos : ");	
		for (int i=0; i<vect.length; i++) {
		    if (vect[i] < 0) {
		    System.out.print(" | " + vect[i]);
		}
		}
		
		System.out.println();
		System.out.print("Positivos : ");	
		for (int i=0; i<vect.length; i++) {
		    if (vect[i] >= 0) {
		    System.out.print(" | " + vect[i]);
		}
		}
		
		sc.close();
		

	}

}
