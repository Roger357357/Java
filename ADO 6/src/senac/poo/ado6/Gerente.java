package senac.poo.ado6;

public class Gerente extends Funcionario implements Prioridade{
	
	private String depart;
	
	public Gerente(String nome, int codigo, String endereco, String depart) {
		super(nome, codigo, endereco);
		this.depart = depart;
	}
	
	public boolean autentica() {
		if(depart == "RH" || depart == "Compras" || depart == "Departamento Pessoal")
			return true;
		else 
			return false;
	}
	public void imprime() {
		System.out.println("Nome: " +nome);
		System.out.println("Função: Gerente");	
		if(autentica() == true)
			System.out.println("Faz parte do Departamento: " +depart);
		else
			System.out.println("Não faz parte do Departamento");
		System.out.println("Código do Trabalhador: " +codigo);
		System.out.println("Endereço: " +endereco+ "\n");
	}
	
	// Método Setter
	public void setDepart(String depart) {
		this.depart = depart;
	}
	// Método Getter
	public String getDepart() {
		return depart;
	}

}
