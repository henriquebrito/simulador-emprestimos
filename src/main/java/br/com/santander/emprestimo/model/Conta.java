package br.com.santander.emprestimo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal saldo;
	private Long numero;
	private Long agencia;
	private Cliente cliente;
	
	public Conta(BigDecimal saldo, Long numero, Long agencia) {
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	protected Conta() {}
	
	public Integer getId() {
		return id;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public Long getNumero() {
		return numero;
	}
	public Long getAgencia() {
		return agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
}
