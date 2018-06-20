package senac.poo.p1.questao2;

public abstract class CartaoWeb {
    
    private String destinatario;
    
    public abstract String showMessage();
    
    public CartaoWeb(String destino){
        this.destinatario = destino;
    }
    
    public void setDestinatario(String destino){
        this.destinatario = destino;
    }
    
    public String getDestinatario(){
        return destinatario;
    }
}
