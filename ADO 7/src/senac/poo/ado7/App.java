package senac.poo.ado7;

public class App {

	public static void main(String[] args) {
		String[] nome = {"Roger", "Rodgre"};
		Double[] nota = {2.3, 2.4};
		Integer[] codigo = {1,2,3};
		String[] nomef = {"Tyo", "Deric"};
	    Float[] coordx = {12.9f,19.0f};
	    Float[] coordy = {1.5f, 4.8f};
		
		Par<String,Double> p = new Par<String,Double>(nome,nota);
		Par<Integer,String> p1 = new Par<Integer,String>(codigo, nomef);
		Par<Float,Float> p2 = new Par<Float,Float>(coordx,coordy);
		
		System.out.println("Nome e nota dos alunos:");
		p.printArray(nome,nota);
		System.out.println("Código e Nome dos funcionários:");
		p.printArray(codigo, nomef);
		System.out.println("Coordenadas x e y:");
		p.printArray(coordx, coordy);
		
		

	}

}
