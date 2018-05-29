package exc2;
import java.util.Scanner;

public class Questa2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0, y = 0;
		try{
			System.out.println("Eu sei dividir.");
			while(x == 0) {
				System.out.println("Informe o primeiro valor: ");
			    x = entrada.nextInt();
			}
			while(y == 0) {
				System.out.println("Informe o segundo valor: ");
			    y = entrada.nextInt();
			}
			double r = (x / y);
			System.out.println("O resultado foi: " + r);
		}catch(ArithmeticException e) {
			System.out.println("Não é possível dividir por zero.");
		}
	}
}
