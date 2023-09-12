package br.com.nourishmegroup.entity;

import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuario", sequenceName = "tb_usuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	@Column(name = "id_usuario", nullable = false, length = 6)
	private int idUsuario;

	@Column(name = "ds_email", nullable = false, length = 80)
	private String email;

	@Column(name = "ds_senha", nullable = false, length = 30)
	private String senha;

	@Column(name = "nm_completo", nullable = false, length = 150)
	private String nomeCompleto;

	@Column(name = "dt_nascimento", nullable = false)
	private String dataNascimento;

	@Column(name = "nr_telefone", nullable = false, length = 11)
	private String numeroTelefone;

	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastroUsuario;

	@Column(name = "dt_modificacao")
	@UpdateTimestamp
	private Calendar dataUltimoUpdateUsuario;

	// Construtores

	public Usuario(String email, String senha, String nomeCompleto, String dataNascimento,
	        String numeroTelefone, Calendar dataCadastroUsuario, Calendar dataUltimoUpdateUsuario) {
	    super();
	    this.email = email;
	    this.senha = senha;
	    this.nomeCompleto = nomeCompleto;
	    this.dataNascimento = dataNascimento;
	    this.numeroTelefone = numeroTelefone;
	    this.dataCadastroUsuario = dataCadastroUsuario;
	    this.dataUltimoUpdateUsuario = dataUltimoUpdateUsuario;
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Calendar getDataCadastroUsuario() {
		return dataCadastroUsuario;
	}

	public void setDataCadastroUsuario(Calendar dataCadastroUsuario) {
		this.dataCadastroUsuario = dataCadastroUsuario;
	}

	public Calendar getDataUltimoUpdateUsuario() {
		return dataUltimoUpdateUsuario;
	}

	public void setDataUltimoUpdateUsuario(Calendar dataUltimoUpdateUsuario) {
		this.dataUltimoUpdateUsuario = dataUltimoUpdateUsuario;
	}

}
