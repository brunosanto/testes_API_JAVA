package br.com.Filmes.response;

import java.io.Serializable;
import java.sql.Date;

public class DiretorResponse implements Serializable {


	private static final long serialVersionUID = -1896832468033150684L;

	private Long id;
	
	private String nome;
	
	private Date dataNascimento;
	
	private String nomeFilme;
	
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
