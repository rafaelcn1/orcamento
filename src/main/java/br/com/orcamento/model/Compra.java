package br.com.orcamento.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Compra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne // Muitos COMPRAS para um CREDOR apenas, exemplo: várias compras pagas com um
				// cartão, cartão visa pode ter várias compras paga com ele
	@JoinColumn(name = "credor_compra") // Renomear a coluna para não ficar com o nome padrão
	private Credor credor;

	@ManyToOne // Muitos COMPRAS para um Responsavel apenas, exemplo: várias compras feita por
				// Rafael
	@JoinColumn(name = "responsavel_compra") // Renomear a coluna para não ficar com o nome padrão
	private Responsavel responsavel;

	private String descricao;
	private Date data;
	private double valor;
	private int parcelas;
	private boolean situacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Credor getCredor() {
		return credor;
	}

	public void setCredor(Credor credor) {
		this.credor = credor;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
