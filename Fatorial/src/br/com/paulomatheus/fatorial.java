package br.com.paulomatheus;

public class fatorial {
	public int calculos (int n) {
		int fat = 1;
		
		if (n>=0) {
			for(int i = 1; i <= n; i++) {
				fat = fat * i;
			}
			System.out.print("Fatorial de "+ n + "!: " + fat);
		} else {
			System.out.print("Fatorial de "+ n + "!: " + 1);
		}
	return fat;	
	}
}
