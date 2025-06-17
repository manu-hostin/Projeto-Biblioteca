package br.com.appbiblioteca.view;

import java.util.Scanner;

import br.com.appbiblioteca.model.Livro;

public class Atendente {
	Scanner leia;

	public Atendente() {
		leia = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("========================");
		System.out.println("           MENU         ");
		System.out.println("1. Cadastrar livro;");
		System.out.println("2. Listar livros;");
		System.out.println("3. Excluir livro;");
		System.out.println("0. Sair.");
		System.out.print("> ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}

	public String cadastroNome() {
		System.out.println("========================");
		System.out.println("         CADASTRO       \n");
		System.out.println("Digite o nome do livro: ");
		System.out.print("> ");
		String nome = leia.nextLine();
		return nome;
	}

	public String cadastroAutor() {
		System.out.println("Digite o nome do autor:");
		System.out.print("> ");
		String autor = leia.nextLine();
		return autor;
	}

	public int cadastroAno() {
		System.out.println("Digite o ano de publicação do livro:");
		System.out.print("> ");
		int ano = leia.nextInt();
		leia.nextLine();
		return ano;
	}

	public String cadastroGenero() {
		System.out.println("Digite o gênero:");
		System.out.print("> ");
		String genero = leia.nextLine();
		return genero;
	}

	public void listar(Livro livro) {
		System.out.println("========================");
		System.out.println("          LISTAR        \n");
		System.out.println("Nome: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Gênero: " + livro.getGenero());
		System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
	}

	public String exclusao() {
		System.out.println("========================");
		System.out.println("         EXCLUSÃO       \n");
		System.out.println("Digite o titulo do livro que deseja excluir:");
		System.out.print("> ");
		String nomeExclusao = leia.nextLine();
		return nomeExclusao;
	}

	public void sucesso() {
		System.out.println("Excluído com sucesso!");
	}

	public void erro() {
		System.out.println("Erro ao excluir.");
	}
}
