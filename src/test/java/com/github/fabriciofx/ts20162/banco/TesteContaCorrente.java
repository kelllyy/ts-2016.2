package com.github.fabriciofx.ts20162.banco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteContaCorrente {
	@Test(expected = IllegalArgumentException.class)
	public void impedeSaqueDeValorZero() {
		Conta c = new ContaCorrente(100.00);
		c.saque(0.00);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void impedeSaqueDeValorNegativo() {
		Conta c = new ContaCorrente(100.00);
		c.saque(-10.00);	
	}
	
	@Test
	public void sacaValorMaiorQueZero() {
		Conta c = new ContaCorrente(100.00);
		c.saque(10.00);
		assertEquals(90.00, c.saldo(), 0.0001);
	}
}
