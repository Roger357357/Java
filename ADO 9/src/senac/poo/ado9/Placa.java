package senac.poo.ado9;
import java.io.Serializable;
/**
 *
 * @author roger.fgalmeida
 */
public class Placa implements Serializable{
    private int num;
    private String estado;
    private String cor;
    
    public Placa(int num, String estado, String cor){
        this.num = num;
        this.estado = estado;
        this.cor = cor;
    }
    
    public void observacao() {
    	System.out.println("--------------- DETRAN ---------------");
    	System.out.println("           Placas cadastradas\n");
    }
    public String toString(){
        return "Placa: "+num+"   Estado: "+estado+"   Cor: "+cor;
    }
    // Setters
    public void setNum(int num){
        this.num = num;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    //Getters
    public int getNum(){
        return num;
    }
    public String getEstado(){
        return estado;
    }
    public String getCor(){
        return cor;
    }
}
