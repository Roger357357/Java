package senac.poo.ado10;

import java.util.Random;

public class CorridaKart {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int vel1 = rand.nextInt(50) + 1;
		int vel2 = rand.nextInt(50) + 1;
		int vel3 = rand.nextInt(50) + 1;
		int temp1 = rand.nextInt(750);
		int temp2 = rand.nextInt(750);
		int temp3 = rand.nextInt(750);

		Kart roger = new Kart("Roger", vel1,temp1);
		Kart marcel = new Kart("Marcel", vel2,temp2);
		Kart mathias = new Kart("Mathias", vel3,temp3);
		
		Thread t1 = new Thread(roger);
		Thread t2 = new Thread(marcel);
		Thread t3 = new Thread(mathias);
		
		roger.observacao();
		t1.start();
	    t2.start();
	    t3.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
