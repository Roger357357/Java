package senac.poo.ado6;

public class Motorista extends Funcionario{
	
	private int cnh;
	
	public Motorista(String nome, int codigo, String endereco, int cnh) {
		super(nome, codigo, endereco);
		this.cnh = cnh;
	}
	public void imprime() {
		System.out.println("Nome: " +nome);
		System.out.println("Função: Motorista");
		System.out.println("Código do Trabalhador: " +codigo);
		System.out.println("CNH: " +cnh);
		System.out.println("Endereço: " +endereco+ "\n");
		
	}
	
	// Método Setter
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	// Método Getter
	public int getCnh() {
		return cnh;
	}

}
