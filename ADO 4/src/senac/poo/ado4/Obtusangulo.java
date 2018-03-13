package senac.poo.ado4;

public class Obtusangulo extends Triangulares{
	
	public Obtusangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Obtusângulo -----------");
		System.out.println("      Ângulos maiores que 90°");
		System.out.println("Digite o valor do lado cateto e "
				+ "da hipotenusa: ");
	}
	public void AreaTriangulo(int cateto, int hipotenusa) {
		/*switch(angulo) {
		    case 120:
		    	angulo = (int) Math.sin(120);
		    	break;
		    case 135:
		    	angulo = (int) Math.sin(135);
		    	break;
		    case 150:
		    	angulo = (int) Math.sin(150);
		    	break;
		    default:
		        System.out.println("Nâo existe esse ângulo na tabela.");
		}*/
		//double area = (cateto * hipotenusa * angulo)/2;
		int area = (cateto * hipotenusa)/2;
		System.out.println("Área = " +area+ "cm²");
	}
}
