package senac.poo.ado2;
import java.util.Scanner;


public class Resposta {
	   public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		//int y = 0;
		
		Fibonacci fib = new Fibonacci();
		int i = fib.calculaFibonacci(x);
		System.out.println(i);
		
		/*IMPRIMIR A SÉRIE DE FIBONACCI ATE O 12° ELEMENTO
		
		 for (int i=0;i<=12;i++) {
			y = fib.calculaFibonacci(i);
			System.out.println(y);
		}*/

	}
}
