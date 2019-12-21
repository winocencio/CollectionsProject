package br.com.inocencio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Aula {

	private int id;
	private int numero;
	private String nome;
	private List<Atividade> atividadeList = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}
	public Aula setNumero(int numero) {
		this.numero = numero;
		return this;
	}
	public List<Atividade> getAtividadeList() {
		return Collections.unmodifiableList(atividadeList);
	}
	public Aula adiciona(Atividade atividade) {
		this.atividadeList.add(atividade);
		return this;
	}
	public int getId() {
		return id;
	}
	public Aula setId(int id) {
		this.id = id;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public Aula setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public String getNomeComprido() {
		return this.numero + ". " + this.nome;
	}
	
	public Aula setAtividadeList(List<Atividade> atividadeList) {
		this.atividadeList = atividadeList;
		return this;
	}
	
	public int getTempoTotalHoras() {
		return this.getTempoTotalMinutos() / 60;
	}
	
	public int getTempoTotalMinutos() {
		return this.atividadeList.stream().mapToInt(Atividade::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Aula: nome: " + this.getNomeComprido() + 
					" , tempo: " + this.getTempoTotalMinutos() + "min " +
					" , Atividades: " + this.getAtividadeList() + " ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(atividadeList, id, nome, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(atividadeList, other.atividadeList) && id == other.id && Objects.equals(nome, other.nome)
				&& numero == other.numero;
	}
	
}
