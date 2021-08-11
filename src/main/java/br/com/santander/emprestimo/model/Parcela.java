package br.com.santander.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parcela {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal valor;
	private Integer numero;
	private LocalDate dataParcela;
	private String status;
	
	public Parcela(BigDecimal valor, Integer numero, LocalDate dataParcela, String status) {
		this.valor = valor;
		this.numero = numero;
		this.dataParcela = dataParcela;
		this.status = status;
	}
	
	protected Parcela() {}
	
	public Integer getId() {
		return id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public Integer getNumero() {
		return numero;
	}
	public LocalDate getDataParcela() {
		return dataParcela;
	}
	public String getStatus() {
		return status;
	}
	
	public void alterarStatus(String status) {
		this.status = status;
	}

}
