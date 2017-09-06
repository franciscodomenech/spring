package com.testcursojava.testpring.model;

public class FormInfo {
	private int entero;
	private String texto;
	public FormInfo(int entero, String texto) {
		super();
		this.entero = entero;
		this.texto = texto;
	}
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
