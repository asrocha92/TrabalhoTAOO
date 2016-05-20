package br.alex.commun;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONE")
public class Telefone {
	
	@Id
	@GeneratedValue
	@Column(name="COL_id")
	private Long id;
	
	@Column(name="COL_dd")
	private int dd;
	
	@Column(name="COL_tefone")
	private int telefone;

	@ManyToMany
	@JoinColumn(name="contato_id")
	private Contato contato;
	
	public Telefone(int dd, int telefone) {
		super();
		this.dd = dd;
		this.telefone = telefone;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telfone) {
		this.telefone = telfone;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
