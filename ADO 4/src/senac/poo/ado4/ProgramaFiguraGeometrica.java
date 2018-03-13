package senac.poo.ado4;
import java.util.Scanner;

public class ProgramaFiguraGeometrica {

	public static void main(String[] args) {
		
	    // Quadrado	
		Quadrado quadrado = new Quadrado(4);
		quadrado.DefinicaoFG();
		quadrado.Imprimirlados();
		quadrado.ImprimirDigitacao();
		Scanner ladoquadrado = new Scanner(System.in);
		int lq = ladoquadrado.nextInt();	
		quadrado.AreaQuadrado(lq);
		
		// Retângulo	
		Retangulo retangulo = new Retangulo(4);
		retangulo.ImprimirDigitacao();
		Scanner ladoretangulo = new Scanner(System.in);
		int base = ladoretangulo.nextInt();
		int altura = ladoretangulo.nextInt();
		retangulo.AreaRetangulo(base, altura);
		
		// Losango
		Losango losango = new Losango(4);
		losango.ImprimirDigitacao();
		Scanner ladolosango = new Scanner(System.in);
		int diagonalmaior = ladolosango.nextInt();
		int diagonalmenor = ladolosango.nextInt();
		losango.AreaLosango(diagonalmaior, diagonalmenor);
		
		// Triângulo Retângulo
		TrianguloRetangulo tretangulo = new TrianguloRetangulo(3);
		tretangulo.Imprimirlados();
		tretangulo.ImprimirDigitacao();
		Scanner ladotretangulo = new Scanner(System.in);
		int cateto = ladotretangulo.nextInt();
		int hipotenusa = ladotretangulo.nextInt();
		tretangulo.AreaTriangulo(cateto, hipotenusa);
		
		// Triângulo Acutângulo
		Acutangulo acutangulo = new Acutangulo(3);
		acutangulo.ImprimirDigitacao();
		Scanner ladoacutangulo = new Scanner(System.in);
		int cateto2 = ladoacutangulo.nextInt();
		int hipotenusa2 = ladoacutangulo.nextInt();
		acutangulo.AreaTriangulo(cateto2, hipotenusa2);
		
		// Triângulo Obtusângulo
		Obtusangulo obtusangulo = new Obtusangulo(3);
		obtusangulo.ImprimirDigitacao();
		Scanner ladoobtusangulo = new Scanner(System.in);
		int cateto3 = ladoobtusangulo.nextInt();
		int hipotenusa3 = ladoobtusangulo.nextInt();
		acutangulo.AreaTriangulo(cateto3, hipotenusa3);
		

	}

}
