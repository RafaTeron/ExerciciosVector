package Desafio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos vao ser alugados ? ");
		int N = sc.nextInt();
		
		Alugar[] vect = new Alugar[10];
		
		for(int i=1; i<=N; i++) {
			System.out.println("Aluguel #" + i);
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.next();
			System.out.print("Quarto : ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Alugar(nome,email);
		}
		
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " +vect[i]);
			}
		}
		
		sc.close();
		
	}

}
