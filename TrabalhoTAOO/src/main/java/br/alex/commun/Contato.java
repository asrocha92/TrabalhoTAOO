package br.alex.commun;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CONTATO")
public class Contato {

	@Id
	@GeneratedValue
	@Column(name="COL_id")
	private Long id;
	@Column(name="COL_nome")
	private String nome;
	@Column(name="COL_snome")
	private String snome;
	
	@OneToMany(mappedBy = "contato", targetEntity = Contato.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	public Contato(String nome, String snome) {
		super();
		this.nome = nome;
		this.snome = snome;
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "Contato[id: " + this.id +
					"\nnome: " + this.nome +
					"\nSobre nome: " + this.snome;
	}
	
}
