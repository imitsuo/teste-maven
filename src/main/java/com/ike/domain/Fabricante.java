package com.ike.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Fabricante {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy="fabricante",cascade=CascadeType.PERSIST)
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Fabricante()
	{
		super();
	}
	
	public Fabricante(String nome)
	{
		this.nome = nome;
	}
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
}
