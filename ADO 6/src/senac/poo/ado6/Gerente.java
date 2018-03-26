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
		System.out.println("Fun��o: Gerente");	
		if(autentica() == true)
			System.out.println("Faz parte do Departamento: " +depart);
		else
			System.out.println("N�o faz parte do Departamento");
		System.out.println("C�digo do Trabalhador: " +codigo);
		System.out.println("Endere�o: " +endereco+ "\n");
	}
	
	// M�todo Setter
	public void setDepart(String depart) {
		this.depart = depart;
	}
	// M�todo Getter
	public String getDepart() {
		return depart;
	}

}
