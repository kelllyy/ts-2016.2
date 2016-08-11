package com.github.fabriciofx.ts20162.banco;

public interface Conta {
	double saldo();
	
	void saque(double valor);
	
	void deposito(double valor);
}
