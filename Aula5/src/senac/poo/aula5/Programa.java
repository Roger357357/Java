package senac.poo.aula5;

/**
 *
 * @author roger.fgalmeida
 */
public class Programa {
    public static void main(String[] args){
        
        Aviao aviao = new Aviao();
        ControleRemoto controle1 = new ControleRemoto(aviao);
        controle1.mover();
        
        Barco barco = new Barco();
        ControleRemoto controle2 = new ControleRemoto(barco);
        controle2.mover();
        
        Carro carro = new Carro();
        ControleRemoto controle3 = new ControleRemoto(carro);
        controle3.mover();
    }
}
