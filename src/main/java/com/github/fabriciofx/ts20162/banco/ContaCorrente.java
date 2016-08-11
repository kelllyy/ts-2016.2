package com.github.fabriciofx.ts20162.banco;

public class ContaCorrente implements Conta {
	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public double saldo() {
		return saldo;
	}

	@Override
	public void saque(double valor) {
		saldo = saldo - valor;
	}

	@Override
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
}
