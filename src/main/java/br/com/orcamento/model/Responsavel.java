package br.com.orcamento.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Responsavel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private double salario;
	
	
	/*
	 * Um resposavel para muitos credores, exemplo: Rafael pode ter vários cartões
	 */
	@OneToMany(mappedBy = "responsavel", fetch = FetchType.LAZY, cascade = CascadeType.ALL) //mappedBy = "responsavel", será o nome do objeto responsavel na class Credor 
	private List<Credor> listaCredores;
	
	/*
	 * Um resposavel para muitas compras, exemplo: Rafael pode ter várias compras
	 */
	@OneToMany(mappedBy = "responsavel", fetch = FetchType.LAZY, cascade = CascadeType.ALL) //mappedBy = "responsavel", será o nome do objeto responsavel na class Compra
	private List<Compra> listaCompras;

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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Credor> getListaCredores() {
		return listaCredores;
	}

	public void setListaCredores(List<Credor> listaCredores) {
		this.listaCredores = listaCredores;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
