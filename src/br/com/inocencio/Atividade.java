package br.com.inocencio;

import java.util.Objects;

public class Atividade {
	
	private int id;
	private int numero;
	private String nome;
	private String conteudo;
	private int tempo;
	
	private EnumTipoAtividade tipo;
	
	public int getTempo() {
		return tempo;
	}
	public Atividade setTempo(int tempo) {
		this.tempo = tempo;
		return this;
	}
	public int getId() {
		return id;
	}
	public Atividade setId(int id) {
		this.id = id;
		return this;
	}
	public int getNumero() {
		return numero;
	}
	public Atividade setNumero(int numero) {
		this.numero = numero;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public Atividade setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public String getConteudo() {
		return conteudo;
	}
	public Atividade setConteudo(String conteudo) {
		this.conteudo = conteudo;
		return this;
	}
	public EnumTipoAtividade getTipo() {
		return tipo;
	}
	public Atividade setTipo(int codigo) {
		this.tipo = EnumTipoAtividade.getEnumByCodigo(codigo);
		return this;
	}
	
	public String getNomeComprido() {
		return this.numero + ". " + this.nome;
	}
	
	@Override
	public String toString() {
		return "[Atividade: nome: " + this.getNomeComprido() + 
					" , tempo: " + this.getTempo() + "min " +
					" , tipo: " + this.getTipo().getNome() + " ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, id, nome, numero, tempo, tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atividade other = (Atividade) obj;
		return Objects.equals(conteudo, other.conteudo) && id == other.id && Objects.equals(nome, other.nome)
				&& numero == other.numero && tempo == other.tempo && tipo == other.tipo;
	}
	
}
