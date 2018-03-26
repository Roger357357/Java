package senac.poo.ado6;

public class Motorista extends Funcionario{
	
	private int cnh;
	
	public Motorista(String nome, int codigo, String endereco, int cnh) {
		super(nome, codigo, endereco);
		this.cnh = cnh;
	}
	public void imprime() {
		System.out.println("Nome: " +nome);
		System.out.println("Fun��o: Motorista");
		System.out.println("C�digo do Trabalhador: " +codigo);
		System.out.println("CNH: " +cnh);
		System.out.println("Endere�o: " +endereco+ "\n");
		
	}
	
	// M�todo Setter
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	// M�todo Getter
	public int getCnh() {
		return cnh;
	}

}
