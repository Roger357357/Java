package senac.poo.p1.questao1;

public class Reta {
    private int y;
    private int x;
    private int angular;
    private int linear;
    
    public Reta(int a, int b){
        this.angular = a;
        this.linear = b;
    }
    
    public void setAngular(int a){
        this.angular = a;
    }
    
    public void setLinear(int b){
        this.linear = b;
    }
    
    public int getAngular(){
        return angular;
    }
    
    public int getLinear(){
        return linear;
    }
    
    public void VerificaPonto(int a, int b){
        y = angular*a + (linear);
        
        if(y == b){
            System.out.println("O ponto pertence a reta\n");
        }
        else
            System.out.println("Não pertence a reta\n");
    }
}
