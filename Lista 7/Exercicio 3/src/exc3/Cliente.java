package exc3;

public class Cliente {

	String nome;
	String dataNascimento;
	
	public Cliente(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return "Nome: " + nome + " Data de Nascimento: " + dataNascimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
