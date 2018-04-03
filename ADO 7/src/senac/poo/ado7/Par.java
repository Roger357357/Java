package senac.poo.ado7;

public class Par<T, U> {

	private T[] elemento1;
	private U[] elemento2;
	
	public Par(T[] elemento1, U[] elemento2 ) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;	
	}
	public static <T,U> void printArray(T[] inputArray, U[] input) {
		for(T elemento : inputArray)
			System.out.println(elemento);
		for(U elemento : input)
			System.out.println(elemento);
	}
	
	
}
