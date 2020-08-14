package br.com.paulomatheus;

import java.util.Scanner;

public class Inicio {
	public static void main (String[] args){
		Multiplos multiplos = new Multiplos();
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Entre com o número para ser encontrado seus multiplos de 3 ou 5 até aquele valor (incluindo ele)");
		n = input.nextInt();
		multiplos.verifica(n);
		
	}
}
