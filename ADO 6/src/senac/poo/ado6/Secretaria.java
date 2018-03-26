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
		System.out.println("Fun��o: Secretaria");
		System.out.println("C�digo do Trabalhador: " +codigo);
		if(autentica() == true)
			System.out.println("Fala Ingl�s");
		else
			System.out.println("N�o fala Ingl�s");
		System.out.println("Endere�o: " +endereco+ "\n");
	}
	
	// M�todo Setter
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	// M�todo Getter
	public String getIdioma() {
		return idioma;
	}
}
