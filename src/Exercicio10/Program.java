package Exercicio10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados ? ");
		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno:");
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		double soma = 0, media = 0;
		System.out.println("Alunos aprovados : ");
		for(int i=0; i<N; i++) {
			soma = nota1[i] + nota2[i];
			media = soma/2;
			if(media >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
