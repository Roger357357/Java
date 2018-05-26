package senac.poo.ado;

public class Calculadora {

	private double n1,n2;
	
	public Calculadora(double n1, double n2) { 
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double getSoma() {
		return n1 + n2;
	}
	public double getSubtracao() {
		return n1 - n2;
	}
	public double getMultiplicacao() {
		return n1 * n2;
	}
	public double getDivisao() {
		try{
			return n1 / n2;
		}catch(ArithmeticException e) {
		    e.printStackTrace();
		    return n1 / n2;
		}	
		}
}
