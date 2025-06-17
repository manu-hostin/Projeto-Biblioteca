package br.com.appbiblioteca.service;

import br.com.appbiblioteca.model.Livro;
import br.com.appbiblioteca.view.Atendente;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List<Livro> lista;

	public Biblioteca() {
		lista = new ArrayList<>();
	}

	public List<Livro> getLista() {
		return lista;
	}

	public void setLista(List<Livro> lista) {
		this.lista = lista;
	}

	public void gerenciar(int opcaoEscolhida, Atendente atendente) {
		switch (opcaoEscolhida) {
		case 0:
			System.out.print("Saindo...");
			break;

		case 1:
			String nome = atendente.cadastroNome();
			String autor = atendente.cadastroAutor();
			int ano = atendente.cadastroAno();
			String genero = atendente.cadastroGenero();

			Livro livro = new Livro(nome, autor, ano, genero);

			lista.add(livro);
			break;

		case 2:
			for (Livro novoLivro : lista) {
				atendente.listar(novoLivro);
			}
			break;

		case 3:
			String nomeExclusao = atendente.exclusao();
			boolean removido = false;

			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getTitulo().equalsIgnoreCase(nomeExclusao)) {

					lista.remove(i);
					removido = true;

				}
			}
			if (removido) {
				atendente.sucesso();
			} else {
				atendente.erro();
			}
			break;

		}
	}
}
