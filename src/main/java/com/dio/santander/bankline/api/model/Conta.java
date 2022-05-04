package com.dio.santander.bankline.api.model;

public class Conta {

	private Long numero;
	private Double saldo;
	
	public Long getNumeroLong() {
		return numero;
	}
	public void setNumeroLong(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
