package com.testcursojava.testpring.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@MapsId @OneToOne
	@JoinColumn(name = "user")
	private Usuario user;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "direccion")
	private String direccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
