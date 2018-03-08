package senac.poo.aula5;

/**
 *
 * @author roger.fgalmeida
 */
public class Relogio {
    public static int hora;
    public static int minutos;
    public static int segundos;
    public static int fusohorario = hora + 1;
    private int id;
    public String nomeFilial;
    
    public Relogio(int id, String nome){
        this.id=id;
        this.nomeFilial = nome;
    } 
    
    public void setId(int id){
        this.id=id;
    }
    public void setNomeFilial(String nomeFilial){
        this.nomeFilial = nomeFilial;
    }
    
    public int getId(){
        return id;
    }
    public String getNomeFilial(){
        return nomeFilial;
    }
    
}
