package senac.poo.ado;
import java.util.Scanner;

public class ProgramaNumero {

	public static void main(String[] args) {
		Scanner entrada1= new Scanner(System.in);
		Scanner entrada2= new Scanner(System.in);
		int num1 = entrada1.nextInt();
		int num2 = entrada2.nextInt();
		NumeroInteiro numInt1 = new NumeroInteiro(num1,num2);
		
		numInt1.soma();
		numInt1.subtracao();
		numInt1.multiplicacao();
		numInt1.divisao();

		
	}

}
