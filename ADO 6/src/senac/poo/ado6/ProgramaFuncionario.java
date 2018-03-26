package senac.poo.ado6;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		// Gerentes
		Gerente gerente1 = new Gerente("Godofredo", 834, "Rua Omã", "RH");
		Gerente gerente2 = new Gerente("Paulo", 807, "Rua Washigton", "Compras");
		// Engenheiros
		Engenheiro engenheiro1 = new Engenheiro("Robson", 123, "Rua das Amoras", 2827920);
		Engenheiro engenheiro2 = new Engenheiro("Bruno", 125, "Rua Roberto", 7828291);
		// Secretarias 
		Secretaria secretaria1 = new Secretaria("Alice", 348, "Rua Kubi", "Portugues");
		Secretaria secretaria2 = new Secretaria("Talita", 331, "Rua Francisco", "Ingles");
		// Motoristas
		Motorista motorista1 = new Motorista("Marcelo", 742, "Rua Amizade", 193722);
		Motorista motorista2 = new Motorista("Ricardo", 709, "Rua Tonho", 188395);
		
		
		gerente1.imprimeinfo();
		gerente1.imprime();
		secretaria1.imprime();
		engenheiro1.imprime();
		motorista1.imprime();
		secretaria2.imprime();
		motorista2.imprime();
		gerente2.imprime();
		engenheiro2.imprime();
		
		
		

	}

}
