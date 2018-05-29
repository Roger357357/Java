package exc1;

public class TesteException {

	public static void main(String[] args) {
		System.out.println("Inicio do Main.");
		metodo1();
		System.out.println("Fim do Main.");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do Metodo 1.");
		metodo2();
		System.out.println("Fim do Metodo 1.");
	}
	public static void metodo2() {
		System.out.println("Inicio do Metodo 2.");
		int[] array = new int[10];
		try {
			for(int i = 0; i<=15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("O vetor possui menos posiçoes do que o informado.");
		}finally {
			System.out.println("Fim do Metodo 2.");
		}
		}
}
