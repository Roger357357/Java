package senac.poo.ado6;

public class Engenheiro extends Funcionario{

	private int crea;
	
	// Construtor
	public Engenheiro(String nome,int codigo, String endereco, int crea) {
		super(nome,codigo,endereco);
		this.crea = crea;
	}
	public void imprime() {
		System.out.println("Nome: " +nome);
		System.out.println("Fun��o: Engenheiro");	
		System.out.println("C�digo do Trabalhador: " +codigo);
		System.out.println("CREA: " +crea);
		System.out.println("Endere�o: " +endereco+ "\n");	
	}
	
	// M�todo Setter
	public void setCrea(int crea) {
		this.crea = crea;
	}
	// M�todo Getter
	public int getCrea() {
		return crea;
	}
}
