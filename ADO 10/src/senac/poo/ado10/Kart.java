package senac.poo.ado10;

public class Kart extends Thread {

	private int velocidade;
	private int tempo;
	private String nome;
	
	public Kart(String nome, int velocidade, int tempo) {
		this.nome = nome;
		this.velocidade = velocidade;
		this.tempo = tempo;
	}
	
	public void run() {
		try {
			for(int i=0;i<11;i++) {
				System.out.println(nome+ " est� com velocidade de "+velocidade+" na volta "+i);
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(nome+" terminou a corrida");
	}
	public void observacao() {
		System.out.println("- Sejam Bem-Vindos ao Kart�dromo de Interlagos -");
		System.out.println("------ Vai come�ar o Brasileiro de Kart --------");
		System.out.println("----- Quem ser� que vence a corrida hoje?-------\n");
		
	}
}
