package br.com.inocencio.test;

import java.util.ArrayList;
import java.util.List;

import br.com.inocencio.Atividade;
import br.com.inocencio.Aula;
import br.com.inocencio.Curso;

public class TestCollection {

	public static void main(String[] args) {
		
		Atividade atividade1 = new Atividade()
				.setId(0)
				.setNumero(1)
				.setTempo(35)
				.setNome("Primeira Atividade de Vídeo")
				.setTipo(1);
		
		Atividade atividade2 = new Atividade()
				.setId(1)
				.setNumero(2)
				.setTempo(13)
				.setNome("Trabalhando com List")
				.setTipo(2);
		
		Atividade atividade3 = new Atividade()
				.setId(2)
				.setNumero(3)
				.setTempo(9)
				.setNome("Atividade descritiva")
				.setTipo(2);
		
		List<Atividade> atividadeList = new ArrayList<>();
				atividadeList.add(atividade1);
				atividadeList.add(atividade2);
				atividadeList.add(atividade3);
		
		Aula aula1 = new Aula()
				.setId(0)
				.setNumero(1)
				.setNome("Falando de List")
				.setAtividadeList(atividadeList);
		
		Atividade atividade4 = new Atividade()
				.setId(3)
				.setNumero(4)
				.setTempo(20)
				.setNome("Exercicio com ArrayList")
				.setTipo(3);
		
		aula1.adiciona(atividade4);
		
		Atividade atividade5 = new Atividade()
				.setId(4)
				.setNumero(1)
				.setTempo(31)
				.setNome("Atividade de Video sobre Set")
				.setTipo(2);
		
		Aula aula2 = new Aula()
				.setId(2)
				.setNumero(2)
				.setNome("Falando de Set")
				.adiciona(atividade5);
		
		Curso curso = new Curso()
				.setId(0)
				.setNome("Curso de Collection")
				.setInstrutor("Instrutor X")
				.adiciona(aula1)
				.adiciona(aula2);
		
		
		System.out.println(curso);
	}

}
