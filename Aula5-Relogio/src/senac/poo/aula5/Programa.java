package senac.poo.aula5;

/**
 *
 * @author roger.fgalmeida
 */
public class Programa {
    public static void main(String[] args){
        Relogio.hora = 07;
        Relogio.minutos = 30;
        Relogio.segundos = 27;
        
        
        
        Relogio filialAM = new Relogio(1, "Amazonas");
        Relogio filialSP = new Relogio(2, "São Paulo");
        Relogio filialRJ = new Relogio(3, "Rio de Janeiro");
        
        
        System.out.println("Filial "+filialAM.nomeFilial+":  " +filialAM.fusohorario+":"+filialAM.minutos+":"+filialAM.segundos);
        System.out.println("Filial "+filialSP.nomeFilial+":  " +filialSP.hora+":"+filialSP.minutos+":"+filialSP.segundos);
        System.out.println("Filial "+filialRJ.nomeFilial+":  " +filialRJ.hora+":"+filialRJ.minutos+":"+filialRJ.segundos);
    }
}
