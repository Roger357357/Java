package senac.poo.ado6;

public class Secretaria extends Funcionario implements Prioridade{

	private String idioma;
	
	public Secretaria(String nome, int codigo, String endereco, String idioma) {
		super(nome, codigo, endereco);
		this.idioma = idioma;
	}
	
	public boolean autentica() {
		if(idioma == "Ingles")
			return true;
		else
			return false;	
	}
	public void imprime() {
		System.out.println("Nome: " +nome);
		System.out.println("Função: Secretaria");
		System.out.println("Código do Trabalhador: " +codigo);
		if(autentica() == true)
			System.out.println("Fala Inglês");
		else
			System.out.println("Não fala Inglês");
		System.out.println("Endereço: " +endereco+ "\n");
	}
	
	// Método Setter
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	// Método Getter
	public String getIdioma() {
		return idioma;
	}
}
