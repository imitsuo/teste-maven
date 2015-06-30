package com.ike.domain;

import javax.persistence.*;

@Entity
@Table
public class Produto {

	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	@ManyToOne
	private Fabricante fabricante;
	
	public Produto(){}
	
	public Produto(String nome, Fabricante fabricante)
	{
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	public Produto(String nome)
	{
		this.nome = nome;
	}
	
	public Long getId()
	{
		return this.id;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Fabricante getFabricante()
	{
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante fabricante)
	{
		this.fabricante = fabricante;
	}
	
	public String toString()
	{
		return "Produto [id=" + id +", nome ="+ nome + ", fabricante="+ fabricante.getNome() + "]";
	}
}