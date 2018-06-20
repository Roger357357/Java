package senac.poo.p1.questao4;

public class Programa {
    
    public static void main(String[]args){
        
        FilaDinamica fila = new FilaDinamica();
        
        fila.inserir(0);
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        
        fila.imprimir();
        
        while(! fila.vazia()){
            int x = fila.retirar();
            System.out.println("Retirei o elemento: "+x);
        }
    }
}
