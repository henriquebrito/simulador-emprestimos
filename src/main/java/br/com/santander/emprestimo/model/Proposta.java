package br.com.santander.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal valor;
	private double taxaJuros;
	private Integer quantidadeParcelas;
	private String status;
	private LocalDate dataContratacao;
	@OneToMany
	private Cliente cliente;
	
	public Proposta(BigDecimal valor, double taxaJuros, Integer quantidadeParcelas, String status, LocalDate dataContratacao, Cliente cliente) {
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.quantidadeParcelas = quantidadeParcelas;
		this.status = status;
		this.dataContratacao = dataContratacao;
		this.cliente = cliente;
	}
	
	protected  Proposta() {}
	
	public Integer getId() {
		return id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	public String getStatus() {
		return status;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public Cliente getCliente() {
		return cliente;
	}

}
