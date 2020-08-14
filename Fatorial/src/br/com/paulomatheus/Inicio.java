package br.com.paulomatheus;

import java.util.Scanner;

public class Inicio {
	public static void main (String[] args){
		fatorial fatorial = new fatorial();
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Entre com o número?");
		n = input.nextInt();
		fatorial.calculos(n);
	
	}
}
