package senac.poo.ado4;

public class Obtusangulo extends Triangulares{
	
	public Obtusangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Obtus�ngulo -----------");
		System.out.println("      �ngulos maiores que 90�");
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
		        System.out.println("N�o existe esse �ngulo na tabela.");
		}*/
		//double area = (cateto * hipotenusa * angulo)/2;
		int area = (cateto * hipotenusa)/2;
		System.out.println("�rea = " +area+ "cm�");
	}
}
