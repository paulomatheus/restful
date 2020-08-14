package br.com.paulomatheus;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
	    bubbleSort(vetor);
	    System.out.println("Vetor ordenado pelo Bubble Sort: " + Arrays.toString(vetor));
	
	}
		 
	public static void bubbleSort(int[] ordenado) { 
 
        int tamanho = ordenado.length; 
        int z = 0;  
        for(int i = 0; i < tamanho; i++){ 
        	for(int j = 1; j < (tamanho-i); j++){ 
        		if(ordenado[j-1] > ordenado[j]){ 
        			z = ordenado[j-1]; 
        			ordenado[j-1] = ordenado[j]; 
        			ordenado[j] = z;  
        		} 
        	} 	 
        } 
    }

}


