package br.alex.commun;

import java.util.List;

import javax.persistence.Entity;

@Entity()
public class Pessoa {

	private Long id;
	
	private String nome;
	
	private String snome;
	
	private List<Contato> contatos;
	
	public Pessoa() {
	}

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

	public String getSnome() {
		return snome;
	}

	public void setSnome(String snome) {
		this.snome = snome;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	
}
