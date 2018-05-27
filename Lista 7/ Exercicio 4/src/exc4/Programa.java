package exc4;

import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {

		String[] nomes = {"Roger", "Maria", "Roberta", "Luiz", "Alan", "Bruno"};
		//Arrays.sort(nomes);
		//System.out.println(nomes);
	}
	public static <T> void ordenarSelecao(String[] vetor) {
			   for (int i = 0; i < vetor.length - 1; i++) {
			     int menor = i;
			   
			     for (i = menor + 1; i < vetor.length; i++) {
			        if (vetor[i] < vetor[menor]) {
			           menor = i;
			        }
			     }
			     if (menor != i) {
			       String t = vetor[i];
			       vetor[i] = vetor[menor];
			       vetor[menor] = t;
			     }
			   
	}
	}
}
