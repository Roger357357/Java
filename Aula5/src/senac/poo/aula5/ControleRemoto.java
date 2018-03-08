package senac.poo.aula5;

/**
 *
 * @author roger.fgalmeida
 */
public class ControleRemoto {
    // declaração de referência
    private Brinquedo brinquedo;
    
    // contrutor
    public ControleRemoto(Brinquedo b){
        brinquedo  = b;
    }
    
    // método
    public void mover(){
        brinquedo.mover();
    }
}
