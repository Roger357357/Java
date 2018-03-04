package senac.poo.ADO3;

public class Jogador {
    public String nome;
    public int idade;
    public double altura;
    public int finaliza��o;
    public int passe;
    public int defesa;
    /*Jogador(){
    }*/
    
    // Construtor do Jogador
    public Jogador(String nome,int idade,double altura,int finaliza��o,int passe,int defesa){
    	this.nome = nome;
    	this.idade = idade;
    	this.altura = altura;
    	this.finaliza��o = finaliza��o;
    	this.passe = passe;
    	this.defesa = defesa; 	
    	
        
    }
    
    // Fun��o correr do jogador
    public void correr(int km) {
    	for(int i=1;i<=km;i++) {
    		System.out.println("O " + nome + " est� com a bola...");
    	}
    }
    
    // Fun��o passar do jogador
    public void passar() {
    	if(passe >= 20) {
    		System.out.println("... O " + nome + " tocou para outro jogador.");
    	}
    	else {
    		System.out.println("O " + nome + " perdeu a bola.");
    	}
    }
    
    // Fun��o chutar
    public void chutar() {
    	if(finaliza��o >= 80) {
    		System.out.println("� Golllllllll");
    		System.out.println("O " + nome + " fez o gol.");
    	}
    	else {
    		System.out.println("O " + nome + " errou o chute.");
    	}
    }
    
    
    
    
    // Fun��o setters
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    public void setAltura(double altura) {
    	this.altura = altura;
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
    public double getAltura() {
    	return this.altura;
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
