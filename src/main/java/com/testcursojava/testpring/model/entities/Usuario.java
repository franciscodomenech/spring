package com.testcursojava.testpring.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Usuario {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "tipo")
	private int tipo;
	
	@OneToMany
    @JoinTable(
            name="preferencias",
            joinColumns = @JoinColumn( name="user"),
            inverseJoinColumns = @JoinColumn( name="art")
    )
    private List<Categoria> preferencias;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public List<Categoria> getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(List<Categoria> preferencias) {
		this.preferencias = preferencias;
	}
	
}
