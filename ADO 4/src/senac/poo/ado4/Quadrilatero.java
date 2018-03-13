package senac.poo.ado4;

public class Quadrilatero{

    protected int quantlado;
    
	public Quadrilatero(int quantlado) {
		this.quantlado = quantlado;
	}
	public void DefinicaoFG() {
		System.out.println("--- Figuras Geométricas Planas ---");
		System.out.println("Formas geométricas são os formatos \n"
				+ "das coisas que observamos e \n"
				+ "possuem um conjunto de pontos." + 
				"\n\n");
	}
	public void Imprimirlados() {
		System.out.println("--------- Quadriláteros ---------");
		System.out.println("Quadriláteros são polígonos que \n"
				+ "possuem quatro lados. Suas características e\n"
				+ "propriedades específicas dizem respeito\n"
				+ "aos seus lados, ângulos e diagonais.\n");
	}
}
