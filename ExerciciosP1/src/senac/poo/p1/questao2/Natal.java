package senac.poo.p1.questao2;

public class Natal extends CartaoWeb {
    
    private String mensagem;
    
    public Natal(String destinatario, String msg){
        super(destinatario);
        this.mensagem = msg;
        //showMessage();
    }   
    
    public String showMessage(){
        //System.out.println(mensagem + "\nPara: " + super.getDestinatario());
        return mensagem + "\nPara: " + super.getDestinatario();
    }
    
    public void setMenssagem(String msg){
        this.mensagem = msg;
    }
    
    public String getMenssagem(){
        return mensagem;
    }
}
