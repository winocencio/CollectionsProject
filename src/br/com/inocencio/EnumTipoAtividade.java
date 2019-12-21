package br.com.inocencio;

import java.util.HashMap;
import java.util.Map;

public enum EnumTipoAtividade {

	Video(1,"Atividade de Vídeo"),
	Explicacao(2,"Atividade de Explicação"),
	Exercicio(3,"Atividade de Exercício");
	
	private int codigo;
	private String nome;
	
	private static Map<Integer,EnumTipoAtividade> tipoAtividadeMap = new HashMap<>();
	
	static {
		
		for(EnumTipoAtividade enumTipo : EnumTipoAtividade.values()) {
			tipoAtividadeMap.put(enumTipo.codigo,enumTipo);
		}
	}

	EnumTipoAtividade(int codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public EnumTipoAtividade setCodigo(int codigo) {
		this.codigo = codigo;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public EnumTipoAtividade setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public static EnumTipoAtividade getEnumByCodigo(int codigo) {
		return tipoAtividadeMap.get(codigo);
	}
	
}
