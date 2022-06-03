package com.farmaciadamarcia.farmaciaDaMarcia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //define como tabela(entidade)
@Table(name = "tb_categoria") //nomeia a tabela criada
public class Categoria {
	
	@Id //define como id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //monta o auto increment
	private long id;
	
	@NotNull //valor não pode ser nulo
	private String descricaoCategoria;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) //define a relação entre entidades
	@JsonIgnoreProperties("categoria") //não sei ainda
	private List<Produto> produto;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
