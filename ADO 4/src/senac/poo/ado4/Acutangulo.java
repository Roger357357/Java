package senac.poo.ado4;

public class Acutangulo extends Triangulares{

	public Acutangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Acutângulo -----------");
		System.out.println("      Ângulos menores que 90°");
		System.out.println("Digite o valor do lado cateto e "
				+ "da hipotenusa: ");
	}
	public void AreaTriangulo(int cateto, int hipotenusa) {
		/*switch(angulo) {
		    case 30:
		    	angulo = 1/2;
		    	break;
		    case 45:
		    	angulo = (int) Math.sin(45);
		    	break;
		    case 60:
		    	angulo = (int) Math.sin(60);
		    	break;
		    default:
		        System.out.println("Nâo existe esse ângulo na tabela.");
		}*/
		//double area = (cateto * hipotenusa * angulo)/2;
		int area = (cateto * hipotenusa)/2;
		System.out.println("Área = " +area+ "cm²");
	}
}
