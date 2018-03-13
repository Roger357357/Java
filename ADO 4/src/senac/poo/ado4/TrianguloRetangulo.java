package senac.poo.ado4;

public class TrianguloRetangulo extends Triangulares{

	
	public TrianguloRetangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Retângulo -----------");
		System.out.println("        Ângulo igual a 90°");
		System.out.println("Digite o valor do lado cateto e \n"
				+ "da hipotenusa: ");
	}
	public void AreaTriangulo(int cateto, int hipotenusa) {
		int area = (cateto * hipotenusa)/2;
		System.out.println("Área = " +area+ "cm²");
	}
}
