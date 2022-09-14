package Exercicio03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas ? ");
		//Adicionar dados ,imprimir a altura media e mostrar a porcentagem de menores de 16 anos
		
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		
		for(int i=0; i<N; i++) {
			System.out.println("Dados da "+ (i + 1) +"ª pessoa: ");
			System.out.print("Nome : ");
			nome[i] = sc.next();
			System.out.print("Idade : ");
			idade[i] = sc.nextInt();
			System.out.print("Altura : ");
			altura[i] = sc.nextDouble();			
		}
		
		int menores = 0;
		double porcentagem, soma = 0;
		
		for (int i=0; i<N; i++) {
			soma = soma + altura[i];
		}
		
		double media = soma / N;
		System.out.printf("Altura média : %.2f%n", media);
		
		for (int i=0; i<N; i++) {
			if (idade[i] < 16) {
				menores = menores + 1;
			}			
		}
		
		porcentagem = (menores * 100) / N;
		System.out.printf("Porcentagem de menores : %.1f%%%n", porcentagem);
		
		System.out.println("Menores que 16 : ");
		for (int i=0; i<N; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
