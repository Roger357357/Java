package exc2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaDadosCliente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String nome;
		int id;
		int idade;
		String sexo;
		double altura;
		
		System.out.println("**** REGISTRO DE CLIENTES ****");
		
		while(true) {
			System.out.println("Id: ");
			id = entrada.nextInt();
			if(id<0) {
				break;
			}
			System.out.println("Nome: ");
			nome = entrada.next();
			System.out.println("Idade: ");
			idade = entrada.nextInt();
			System.out.println("Sexo: ");
			sexo = entrada.next();
			System.out.println("Altura: ");
			altura = entrada.nextDouble();
			
			clientes.add(new Cliente(id,nome,idade,sexo,altura));
		}
		
		System.out.println("*******************************");
		System.out.println("Total de Clientes: " +clientes.size());
		System.out.println();
		System.out.println(" ID |   NOME   | IDADE | SEXO | ALTURA |");
		for(int i = 0; i < clientes.size();i++) {
			clientes.get(i).imprimir();
		}


		

	}

}
