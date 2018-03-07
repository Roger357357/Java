package senac.poo.ADO3;
import java.util.Random;

public class Jogador {
    private String nome;
    private int idade;
    private int camisa;
    private int finalização;
    private int passe;
    private int defesa;
    
    Random  gerador = new Random();
    Random  km = new Random();
    // Construtor do Jogador
    public Jogador(String nome,int idade,int camisa,int finalização,int passe,int defesa){
    	this.nome = nome;
    	this.idade = idade;
    	this.camisa = camisa;
    	this.finalização = finalização;
    	this.passe = passe;
    	this.defesa = defesa; 	    
    }
    
  public void Random() {
  for(int i=0; i<=8; i++){ 
	  int random1 = gerador.nextInt(12);
    if((camisa == random1) && (random1>=1)) {
    	int randomkm = km.nextInt(3);
	  // Função correr do jogador
    	  for( int j=1;j<=2;j++) {
    		  System.out.println("O " + nome + " está com a bola...");
    	  }
    // Função passar do jogador
    	  if(passe >= 20) {
    		  System.out.println("... O " + nome + " tocou para outro jogador.");
		   
    	  }
    	  else {
    		  System.out.println("O " + nome + " perdeu a bola.");
    	  }
    	  random1=0;
     }
    }
    
  
   /*if(finalização >= 80) {
    		System.out.println("É Golllllllll");
    		System.out.println("O " + nome + " fez o gol.");
    	}
    	else {
    		System.out.println("O " + nome + " errou o chute.");
    	}*/
  }
     
    // Função chutar
    //public void chutar() {
    	
    //}
    
    
    
    
    // Função setters
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }	 
    public void setFinalização(int finalização) {
    	this.finalização = finalização;
    }
    public void setPasse(int passe) {
    	this.passe = passe;
    }
    public void setDefesa(int defesa) {
    	this.defesa = defesa;
    }
    
    // Função getters
    public String getNome() {
    	return this.nome;
    }
    public int getIdade() {
    	return this.idade;
    }
    public int getFinalização() {
    	return this.finalização;
    }
    public int getPasse() {
    	return this.passe;
    }
    public int getDefesa() {
    	return this.defesa;
    }
}
