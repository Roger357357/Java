package senac.poo.p1.questao1;

public class Programa {
    
    public static void main(String[]args){
        
        Reta rt = new Reta(0,0);
        rt.setAngular(2);
        rt.setLinear(-1);
        
        rt.VerificaPonto(2, 3);
    }
}
