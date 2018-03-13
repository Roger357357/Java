package senac.poo.ado4;

public class Retangulo extends Quadrilatero{
	
	
	public Retangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Retângulo -----------");
		System.out.println("Digite o valor da Base e da Altura: ");
	}
	public void AreaRetangulo(int base, int altura) {
		int area = base * altura;
		System.out.println("Área = " +area+ "cm²");
	}
}
