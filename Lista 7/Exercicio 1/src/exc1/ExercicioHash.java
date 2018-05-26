package exc1;
import java.util.Iterator;
import java.util.HashSet;

public class ExercicioHash {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		
		
		hash.add("Roger");
		hash.add("Felipe");
		hash.add("Giffoni");
		hash.add("de");
		hash.add("Almeida");
		
		Iterator<String> i = hash.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
