package br.com.paulomatheus;

public class Multiplos {

	public long verifica (int n) {
		long soma = 0;
		boolean validacao = false;
		while (n > 0) {
			
			if (n % 3 == 0) {
				soma += n;
				validacao = true;
			} else if ( n % 5 == 0) {
				//Caso o numero nao seja divisivel por 3 ele eh adicionado para soma
				if (!validacao) {
					soma += n;
				} 					
			}
			n = n - 1;
			validacao = false;
	}
		System.out.println("Valor da soma: "+ soma);
		return soma;
	
	}
}
