package senac.poo.ADO3;


public class Jogo {

	public static void main(String[] args) {
		
		Jogador goleiro = new Jogador("Vanderlei", 30, 20, 67, 92);
		Jogador lateral_direito = new Jogador("Daniel", 19, 30, 63, 70);
		Jogador lateral_esquerdo = new Jogador("Jean", 24, 41, 45, 74);
		Jogador zaqueiro1 = new Jogador("Lucas", 22, 40, 63, 80);
		Jogador zaqueiro2 = new Jogador("David", 30, 34, 55, 78);
		Jogador volante1 = new Jogador("Alison", 25, 37, 70, 85);
		Jogador volante2 = new Jogador("Renato", 38, 24, 93, 63);
		Jogador meia = new Jogador("Vitor", 23, 66, 74, 51);
		Jogador ponta_esquerdo = new Jogador("Gabriel", 21, 84, 79, 60);
		Jogador centro_avante = new Jogador("Eduardo", 26, 81, 70, 57);
		Jogador ponta_direito = new Jogador("Bruno", 27, 87, 83, 69);
		
		// Função Começar a partida
		
	    System.out.printf("Começou a partida.\n");
	    goleiro.correr(1);
	    goleiro.passar();
	    lateral_direito.correr(3);
	    lateral_direito.passar();
	    lateral_esquerdo.correr(2);
	    lateral_esquerdo.passar();
	    zaqueiro1.correr(2);
	    zaqueiro1.passar();
	    zaqueiro2.correr(3);
	    zaqueiro2.passar();
	    volante1.correr(1);
	    volante1.passar();
	    volante2.correr(2);
	    volante2.passar();
	    meia.correr(1);
	    meia.passar();
	    ponta_esquerdo.correr(1);
	    ponta_esquerdo.passar();
	    ponta_direito.correr(1);
	    ponta_direito.passar();
	    centro_avante.correr(1);
	    centro_avante.chutar();

	}

}
