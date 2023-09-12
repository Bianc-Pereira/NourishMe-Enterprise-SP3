package br.com.nourishmegroup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="historico")

public class HistoricoDeRegistros {

	@Id
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	@Column(name = "qtd_registro", nullable=false,length=2)
	private int quantidadeRegistroPorDia;
	
	//getters and setters
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getQuantidadeRegistroPorDia() {
		return quantidadeRegistroPorDia;
	}
	public void setQuantidadeRegistroPorDia(int quantidadeRegistroPorDia) {
		this.quantidadeRegistroPorDia = quantidadeRegistroPorDia;
	}
	
	//construtores
	public HistoricoDeRegistros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HistoricoDeRegistros(Usuario usuario, int quantidadeRegistroPorDia) {
		super();
		this.usuario = usuario;
		this.quantidadeRegistroPorDia = quantidadeRegistroPorDia;
	}
	
	
	

}
