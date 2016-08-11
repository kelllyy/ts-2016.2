package com.github.fabriciofx.ts20162.banco;

public class ContaPoupanca implements Conta {
	private double saldo;
	
	public ContaPoupanca(double saldo) {
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
	
	public void rendimento(double juros) {
		saldo = saldo * (juros + 1);
	}
}
