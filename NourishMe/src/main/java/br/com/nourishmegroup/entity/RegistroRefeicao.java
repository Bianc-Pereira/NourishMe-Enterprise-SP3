package br.com.nourishmegroup.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class RegistroRefeicao {

	@Id //define a chave primaria
	@SequenceGenerator(name = "refeicao", sequenceName = "registro_Refeicao", allocationSize = 1)
	@Column (name = "cd_registro", nullable = false, length = 6)
	private int idRegistro;
	
	@Column(name = "tp_refeicao", nullable=false,length=30)
	private String tipoRefeicao;
	
	@Column(name = "ds_refeicao", nullable=false, length=200)
	private String descricaoRefeicao;
	
	@Column(name = "tp_sentimento", nullable=false, length = 200)
	private String descricaoSentimentos;
	
	@Column(name = "dt_registro")
	@CreationTimestamp
	private Calendar dataCadastrorefeicao;

	@Column(name = "dt_modificacao")
	@UpdateTimestamp
	private Calendar dataUltimoUpdateRefeicao;
	
	
	//getters and setters
	public int getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getTipoRefeicao() {
		return tipoRefeicao;
	}
	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}
	public String getDescricaoRefeicao() {
		return descricaoRefeicao;
	}
	public void setDescricaoRefeicao(String descricaoRefeicao) {
		this.descricaoRefeicao = descricaoRefeicao;
	}
	
	public Calendar getDataCadastrorefeicao() {
		return dataCadastrorefeicao;
	}
	public void setDataCadastrorefeicao(Calendar dataCadastrorefeicao) {
		this.dataCadastrorefeicao = dataCadastrorefeicao;
	}
	public Calendar getDataUltimoUpdateRefeicao() {
		return dataUltimoUpdateRefeicao;
	}
	public void setDataUltimoUpdateRefeicao(Calendar dataUltimoUpdateRefeicao) {
		this.dataUltimoUpdateRefeicao = dataUltimoUpdateRefeicao;
	}
	public String getDescricaoSentimentos() {
		return descricaoSentimentos;
	}
	public void setDescricaoSentimentos(String descricaoSentimentos) {
		this.descricaoSentimentos = descricaoSentimentos;
	}
	
	
	//Construtores
		public RegistroRefeicao() {
			super();
			// TODO Auto-generated constructor stub
		}
	public RegistroRefeicao(int idRegistro, String tipoRefeicao, String descricaoRefeicao, String descricaoSentimentos,
			Calendar dataCadastrorefeicao, Calendar dataUltimoUpdateRefeicao) {
		super();
		this.idRegistro = idRegistro;
		this.tipoRefeicao = tipoRefeicao;
		this.descricaoRefeicao = descricaoRefeicao;
		this.descricaoSentimentos = descricaoSentimentos;
		this.dataCadastrorefeicao = dataCadastrorefeicao;
		this.dataUltimoUpdateRefeicao = dataUltimoUpdateRefeicao;
	}
		
		
	
	
}
