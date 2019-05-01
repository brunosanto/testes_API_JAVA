package br.com.Filmes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
@Entity
@Table(name="DIRETOR")
public class Diretor {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "datanascimento")
	private Date dataNascimento;
	
	@Column(name = "nomefilme")
	private String nomeFilme;
	
	@Column(name = "anofilme")
	private String anoFilme;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getAnoFilme() {
		return anoFilme;
	}
	public void setAnoFilme(String anoFilme) {
		this.anoFilme = anoFilme;
	}

	
}
