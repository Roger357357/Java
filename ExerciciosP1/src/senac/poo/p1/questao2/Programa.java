package senac.poo.p1.questao2;
import java.util.ArrayList;

public class Programa {
    
    public static void main(String[]args){
        
        ArrayList<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        
        DiaNamorados data1 = new DiaNamorados("Matheus", "Feliz dia dos Namorados");
        Natal data2 = new Natal("Lucia", "Feliz Natal !!!");
        Aniversario data3 = new Aniversario("Willian", "Feliz Aniversario");
        
        cartoes.add(data2);
        cartoes.add(data1);
        cartoes.add(data3);
        
        for(CartaoWeb cartao: cartoes)
            System.out.println(cartao.showMessage()+"\n");
    }    
}
