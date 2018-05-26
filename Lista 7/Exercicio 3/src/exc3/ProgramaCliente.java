package exc3;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class ProgramaCliente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
		Cliente cliente1 = new Cliente("Roger", "20/01/1999");
		Cliente cliente2 = new Cliente("Maria", "15/12/1965");
		Cliente cliente3 = new Cliente("Francisco", "04/10/1990");
		Cliente cliente4 = new Cliente("Alberto", "29/05/1953");
		Cliente cliente5 = new Cliente("Roberta", "18/07/2005");
		
		clientes.put(cliente1.getNome(),cliente1);
		clientes.put(cliente2.getNome(),cliente2);
		clientes.put(cliente3.getNome(),cliente3);
		clientes.put(cliente4.getNome(),cliente4);
		clientes.put(cliente5.getNome(),cliente5);
		
		String nome = entrada.next();
		if(clientes.containsKey(nome))
			System.out.println(clientes.get(nome));
		else
			System.out.println("Cliente não encontrado");
	}

}
