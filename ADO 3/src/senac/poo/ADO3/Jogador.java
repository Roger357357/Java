package senac.poo.ADO3;
import java.util.Random;

public class Jogador {
    private String nome;
    private int idade;
    private int camisa;
    private int finaliza��o;
    private int passe;
    private int defesa;
    
    Random  gerador = new Random();
    Random  km = new Random();
    // Construtor do Jogador
    public Jogador(String nome,int idade,int camisa,int finaliza��o,int passe,int defesa){
    	this.nome = nome;
    	this.idade = idade;
    	this.camisa = camisa;
    	this.finaliza��o = finaliza��o;
    	this.passe = passe;
    	this.defesa = defesa; 	    
    }
    
  public void Random() {
  for(int i=0; i<=8; i++){ 
	  int random1 = gerador.nextInt(12);
    if((camisa == random1) && (random1>=1)) {
    	int randomkm = km.nextInt(3);
	  // Fun��o correr do jogador
    	  for( int j=1;j<=2;j++) {
    		  System.out.println("O " + nome + " est� com a bola...");
    	  }
    // Fun��o passar do jogador
    	  if(passe >= 20) {
    		  System.out.println("... O " + nome + " tocou para outro jogador.");
		   
    	  }
    	  else {
    		  System.out.println("O " + nome + " perdeu a bola.");
    	  }
    	  random1=0;
     }
    }
    
  
   /*if(finaliza��o >= 80) {
    		System.out.println("� Golllllllll");
    		System.out.println("O " + nome + " fez o gol.");
    	}
    	else {
    		System.out.println("O " + nome + " errou o chute.");
    	}*/
  }
     
    // Fun��o chutar
    //public void chutar() {
    	
    //}
    
    
    
    
    // Fun��o setters
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }	 
    public void setFinaliza��o(int finaliza��o) {
    	this.finaliza��o = finaliza��o;
    }
    public void setPasse(int passe) {
    	this.passe = passe;
    }
    public void setDefesa(int defesa) {
    	this.defesa = defesa;
    }
    
    // Fun��o getters
    public String getNome() {
    	return this.nome;
    }
    public int getIdade() {
    	return this.idade;
    }
    public int getFinaliza��o() {
    	return this.finaliza��o;
    }
    public int getPasse() {
    	return this.passe;
    }
    public int getDefesa() {
    	return this.defesa;
    }
}
