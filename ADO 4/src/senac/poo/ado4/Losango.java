package senac.poo.ado4;

public class Losango extends Quadrilatero{
	
	
	public Losango(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Losango -----------");
		System.out.println("Digite o valor da Diagonal Maior e \n"
				+ "da Diagonal Menor: ");
	}
	public void AreaLosango(int diagonalmaior, int diagonalmenor) {
		int area = (diagonalmaior * diagonalmenor)/2;
		System.out.println("Área = " +area+ "cm²");
	}
}
