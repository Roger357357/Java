package exc2;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	private String sexo;
	private double altura;
	
	
	public Cliente(int id, String nome, int idade, String sexo, double altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
	}
	
	public void imprimir() {
		System.out.println(" " + id + "  |" + nome+ "    |" + idade + "    |" + sexo + "   |" + altura);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
}
