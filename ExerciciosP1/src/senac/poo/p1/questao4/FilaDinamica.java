package senac.poo.p1.questao4;

public class FilaDinamica {
    
    private int[] elementos;
    private int primeiro;
    private int ultimo;
    private int total;
    
    public FilaDinamica(){
        elementos = new int[10];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }
    public void inserir(int x){
        if(cheia()){
            throw new RuntimeException("Fila CHEIA - Não será possivel inserir");
        }
        elementos[ultimo] = x;
        ultimo = (ultimo + 1) % elementos.length;
        total++;
    }
    
    public int retirar(){
        if(vazia()){
            throw new RuntimeException("Fila VAZIA - Não será possivel remover");
        }
        int valor = elementos[primeiro];
        primeiro = (primeiro + 1) % elementos.length;
        total--;
        return valor;
    }
    
    public void imprimir(){
        for(int i = 0; i <= total-1; i++){
            System.out.println("E["+i+"] = " +elementos[i]);
        }
    }
    
    public boolean vazia(){
        return total == 0;
    }
    
    public boolean cheia(){
        return total == elementos.length;
    }
}
