package senac.poo.ado4;

public class Acutangulo extends Triangulares{

	public Acutangulo(int quantlado) {
		super(quantlado);
	}
	public void ImprimirDigitacao() {
		System.out.println("----------- Acut�ngulo -----------");
		System.out.println("      �ngulos menores que 90�");
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
		        System.out.println("N�o existe esse �ngulo na tabela.");
		}*/
		//double area = (cateto * hipotenusa * angulo)/2;
		int area = (cateto * hipotenusa)/2;
		System.out.println("�rea = " +area+ "cm�");
	}
}
