package exc3;
import java.util.Scanner;

public class ProgramaPontos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ax = entrada.nextInt();
		int ay = entrada.nextInt();
		int bx = entrada.nextInt();
		int by = entrada.nextInt();
		int cx = entrada.nextInt();
		int cy = entrada.nextInt();
		Coordenadas c1 = new Coordenadas(ax,ay,bx,by,cx,cy);
	}
}
