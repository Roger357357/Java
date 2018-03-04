package senac.poo.ADO3;

public class Jogador {
    public String nome;
    public int idade;
    public double altura;
    public int finalização;
    public int passe;
    public int defesa;
    /*Jogador(){
    }*/
    
    // Construtor do Jogador
    public Jogador(String nome,int idade,double altura,int finalização,int passe,int defesa){
    	this.nome = nome;
    	this.idade = idade;
    	this.altura = altura;
    	this.finalização = finalização;
    	this.passe = passe;
    	this.defesa = defesa; 	
    	
        
    }
    
    // Função correr do jogador
    public void correr(int km) {
    	for(int i=1;i<=km;i++) {
    		System.out.println("O " + nome + " está com a bola...");
    	}
    }
    
    // Função passar do jogador
    public void passar() {
    	if(passe >= 20) {
    		System.out.println("... O " + nome + " tocou para outro jogador.");
    	}
    	else {
    		System.out.println("O " + nome + " perdeu a bola.");
    	}
    }
    
    // Função chutar
    public void chutar() {
    	if(finalização >= 80) {
    		System.out.println("É Golllllllll");
    		System.out.println("O " + nome + " fez o gol.");
    	}
    	else {
    		System.out.println("O " + nome + " errou o chute.");
    	}
    }
    
    
    
    
    // Função setters
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    public void setAltura(double altura) {
    	this.altura = altura;
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
    public double getAltura() {
    	return this.altura;
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
