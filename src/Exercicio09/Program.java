package Exercicio09;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas voce vai digitar ? ");
		int N = sc.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		
		
		for(int i=0; i<N; i++) {
			System.out.println("Dados da " + (i + 1) + "ª : ");
			System.out.print("Nome : ");
			nome[i] = sc.next();
			System.out.print("Idade : ");
			idade[i] = sc.nextInt();
		}
		
		int posicao = 0;
		double velho = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			if(idade[i] > velho) {
				velho = idade[i];
				posicao = i;
			}
		}
		
	    System.out.println("PESSOA MAIS VELHA :" + nome[posicao]);
		sc.close();

	}

}
