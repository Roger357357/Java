package senac.poo.ado4;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Quadrado -----------");
		System.out.println("Digite o valor do lado do quadrado: ");
	}
	public void AreaQuadrado(int lado) {
		int area = lado * lado;
		System.out.println("Área = " +area+ "cm²");
	}
}
