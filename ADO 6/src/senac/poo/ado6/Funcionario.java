package senac.poo.ado6;

public abstract class Funcionario {
	
	protected int codigo;
	protected String nome;
	protected String endereco;
	
	// Construtor
	public Funcionario(String nome, int codigo, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}
	public void imprimeinfo() {
		System.out.println("------ Bem-Vindo ------");
		System.out.println("--- ao InfoRoger's ----\n");
		System.out.println("Aqui está a lista dos \n"
				+ "nossos funcionários: \n");
	}
	
	// Métodos Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// Métodos Getters
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}

}
