package br.com.orcamento.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Credor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int vencimentoFatura;
	private int fechamentoFatura;
	private double limiteDisponivel;
	private double limiteUsado;
	
	@Id
	@ManyToOne // Muitos credores para um resposavél apenas, exemplo: vários cartões para um responsavel, Rafael pode ter 3 cartões de crédito
	@JoinColumn(name = "responsavel") // Renomear a coluna para não ficar com o nome padrão
	// (REGISTRO_CONSULTA_SEQUENCIAL
	private Responsavel responsavel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVencimentoFatura() {
		return vencimentoFatura;
	}

	public void setVencimentoFatura(int vencimentoFatura) {
		this.vencimentoFatura = vencimentoFatura;
	}

	public int getFechamentoFatura() {
		return fechamentoFatura;
	}

	public void setFechamentoFatura(int fechamentoFatura) {
		this.fechamentoFatura = fechamentoFatura;
	}

	public double getLimiteDisponivel() {
		return limiteDisponivel;
	}

	public void setLimiteDisponivel(double limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}

	public double getLimiteUsado() {
		return limiteUsado;
	}

	public void setLimiteUsado(double limiteUsado) {
		this.limiteUsado = limiteUsado;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
