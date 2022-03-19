package br.com.dio.model;

import java.util.Objects;

public class Livros {

	private String nome;
	private String npag;
	
	public Livros() {
		
		this.nome = nome;
		this.npag = npag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNpag() {
		return npag;
	}

	public void setNpag(String npag) {
		this.npag = npag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, npag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(npag, other.npag);
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + ", getNome()=" + getNome() + ", getNpag()=" + getNpag()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	 
	
}
