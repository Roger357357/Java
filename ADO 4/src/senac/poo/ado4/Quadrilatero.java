package senac.poo.ado4;

public class Quadrilatero{

    protected int quantlado;
    
	public Quadrilatero(int quantlado) {
		this.quantlado = quantlado;
	}
	public void DefinicaoFG() {
		System.out.println("--- Figuras Geom�tricas Planas ---");
		System.out.println("Formas geom�tricas s�o os formatos \n"
				+ "das coisas que observamos e \n"
				+ "possuem um conjunto de pontos." + 
				"\n\n");
	}
	public void Imprimirlados() {
		System.out.println("--------- Quadril�teros ---------");
		System.out.println("Quadril�teros s�o pol�gonos que \n"
				+ "possuem quatro lados. Suas caracter�sticas e\n"
				+ "propriedades espec�ficas dizem respeito\n"
				+ "aos seus lados, �ngulos e diagonais.\n");
	}
}
