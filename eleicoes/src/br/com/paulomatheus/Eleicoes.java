package br.com.paulomatheus;

public class Eleicoes {

	public static void main(String[] args) {
		TipoDeVoto voto = new TipoDeVoto();
		voto.setQuantidadeDeTotal(1000);
		voto.setQuantidadeDeValidos(800);
		voto.setQuantidadeDeBrancos(150);
		voto.setQuantidadeDeNulos(50);
		 
		System.out.println("Percentual de votos válidos: "+ ((voto.getQuantidadeDeValidos()/voto.getQuantidadeDeTotal())*100)+"%");
		System.out.println("Percentual de votos brancos: "+ ((voto.getQuantidadeDeBrancos()/voto.getQuantidadeDeTotal())*100)+"%");
		System.out.println("Percentual de votos nulos: "+ ((voto.getQuantidadeDeNulos()/voto.getQuantidadeDeTotal())*100)+"%");
	

	}

}
