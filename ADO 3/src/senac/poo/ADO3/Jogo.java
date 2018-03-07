package senac.poo.ADO3;
import java.util.Random;


public class Jogo {

	public static void main(String[] args) {
		
		Jogador goleiro = new Jogador("Vanderlei", 30, 1, 20, 67, 92);
		Jogador lateral_direito = new Jogador("Daniel", 19, 2, 30, 63, 70);
		Jogador lateral_esquerdo = new Jogador("Jean", 24, 3, 41, 45, 74);
		Jogador zaqueiro1 = new Jogador("Lucas", 22, 4, 40, 63, 80);
		Jogador zaqueiro2 = new Jogador("David", 30, 5, 34, 55, 78);
		Jogador volante1 = new Jogador("Alison", 25, 6, 37, 70, 85);
		Jogador volante2 = new Jogador("Renato", 38, 7, 24, 93, 63);
		Jogador meia = new Jogador("Vitor", 23, 66, 8, 74, 51);
		Jogador ponta_esquerdo = new Jogador("Gabriel", 21, 9, 84, 79, 60);
		Jogador centro_avante = new Jogador("Eduardo", 26, 10, 81, 70, 57);
		Jogador ponta_direito = new Jogador("Bruno", 27, 11, 87, 83, 69);
		
		
		
		
		
		// Função Começar a partida
		
	    System.out.printf("Começou a partida.\n");
	    goleiro.Random();
	    //goleiro.passar();
	    lateral_direito.Random();
	    //lateral_direito.passar();
	    lateral_esquerdo.Random();
	    //lateral_esquerdo.passar();
	    zaqueiro1.Random();
	    //zaqueiro1.passar();
	    zaqueiro2.Random();
	    //zaqueiro2.passar();
	    volante1.Random();
	    //volante1.passar();
	    volante2.Random();
	    //volante2.passar();
	    meia.Random();
	    //meia.passar();
	    ponta_esquerdo.Random();
	    //ponta_esquerdo.passar();
	    ponta_direito.Random();
	    //ponta_direito.passar();
	    centro_avante.Random();
	    //centro_avante.chutar();
        
	}

}
