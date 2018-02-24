package senac.poo.ado2;

public class Fibonacci {
 
	int calculaFibonacci(int num) {
	    if(num==1 || num==2)
	       return 1;
	    else if (num==0)
	    	return 0;
	    else {       
	       int resultado = calculaFibonacci(num-1) + calculaFibonacci(num-2);
	       return resultado;
	    }
	}
}
