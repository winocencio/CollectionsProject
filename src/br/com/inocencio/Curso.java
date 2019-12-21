package br.com.inocencio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Curso {

	private int id;
	private String nome;
	private String instrutor;
	private List<Aula> aulaList = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public Curso setId(int id) {
		this.id = id;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public Curso setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public Curso setInstrutor(String instrutor) {
		this.instrutor = instrutor;
		return this;
	}
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(aulaList);
	}
	public Curso adiciona(Aula aula) {
		this.aulaList.add(aula);
		return this;
	}
	public Curso setAulaList(List<Aula> aulaList) {
		this.aulaList = aulaList;
		return this;
	}
	
	public int getTempoTotalHoras() {
		return this.getTempoTotalMinutos() / 60;
	}
	
	public int getTempoTotalMinutos() {
		return this.aulaList.stream().mapToInt(Aula::getTempoTotalMinutos).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: nome: " + this.getNome() + 
					" , instrutor: " + this.getInstrutor() + 
					" , tempo: " + this.getTempoTotalHoras() + "hr(s) " +
					" , Aulas: " + this.getAulaList() + " ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aulaList, id, instrutor, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(aulaList, other.aulaList) && id == other.id && Objects.equals(instrutor, other.instrutor)
				&& Objects.equals(nome, other.nome);
	}
}
