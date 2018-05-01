package senac.poo.ado;
import java.*;

public class NumeroInteiro {

	private int num1;
	private int num2;
	
	public NumeroInteiro(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void soma() {
		int soma = num1 + num2;
		System.out.println("Soma = " +soma);
	}
	public void subtracao() {
		int sub = num1 - num2;
		System.out.println("Subtra��o = " +sub);
	}
	public void multiplicacao() {
		int mult = num1 * num2;
		System.out.println("Multilica��o = " +mult);
	}
	public void divisao() {
			try{
				int divisao = num1 /num2;
				System.out.println("Divis�o = " +divisao);
			}catch(java.lang.ArithmeticException e) {
			System.out.println("Divis�o = ");
			System.out.println("Erro: N�o � poss�vel fazer divis�o por zero." );
		}
	}
	
}
