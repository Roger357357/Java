package senac.poo.ado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	@Test
	public void testSoma() {
		Calculadora calc1 = new Calculadora(9,6);
		calc1.getSoma();
		assertEquals(15,calc1.getSoma());	
	}
	@Test
	public void testSubtracao() {
		Calculadora calc1 = new Calculadora(7.5,4.3);
		calc1.getSubtracao();
		assertEquals(3.2,calc1.getSubtracao());
	}
	@Test
	public void testMultiplicacao() {
		Calculadora calc1 = new Calculadora(2.5,4.0);
		calc1.getMultiplicacao();
		assertEquals(10,calc1.getMultiplicacao());
	}
	@Test
	public void testDivisao() {
		Calculadora calc1 = new Calculadora(0,0);
		calc1.getDivisao();
		assertEquals(0,calc1.getDivisao());
	}

}
