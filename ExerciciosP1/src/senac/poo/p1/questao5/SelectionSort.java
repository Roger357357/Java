package senac.poo.p1.questao5;

public class SelectionSort {
    
    public static void SelectionSort(int vetor[]){
        
        for(int i = 0; i < vetor.length; i++){
            int posicaoMenor = i;
            for(int j = (i+1); j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            if(vetor[i] != vetor[posicaoMenor]){
                int temp = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = temp;
            }
        }
    }
}
