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
		System.out.println("Função: Engenheiro");	
		System.out.println("Código do Trabalhador: " +codigo);
		System.out.println("CREA: " +crea);
		System.out.println("Endereço: " +endereco+ "\n");	
	}
	
	// Método Setter
	public void setCrea(int crea) {
		this.crea = crea;
	}
	// Método Getter
	public int getCrea() {
		return crea;
	}
}
