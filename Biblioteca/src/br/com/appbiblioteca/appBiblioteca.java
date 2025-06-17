package br.com.appbiblioteca;

import br.com.appbiblioteca.service.Biblioteca;
import br.com.appbiblioteca.view.Atendente;

public class appBiblioteca {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Biblioteca biblioteca = new Biblioteca();

		int opcaoEscolhida = 1;

		do {
			opcaoEscolhida = atendente.menuPrincipal();
			biblioteca.gerenciar(opcaoEscolhida, atendente);

		} while (opcaoEscolhida != 0);
	}

}
