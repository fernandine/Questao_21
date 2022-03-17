package application;

import java.util.ArrayList;

import entity.Pessoa;

public class Program {

	
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("joao", 15);
		Pessoa p2 = new Pessoa("Leandro", 17);
		Pessoa p3 = new Pessoa("Paulo", 18);
		Pessoa p4 = new Pessoa("jessica", 19);

		ArrayList<Pessoa> lista = new ArrayList<>();

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);

		// Iterando sobre a lista, apresente todos as pessoas no console.

		System.out.println(lista);

		// Exclua da Lista as pessoas com idade inferior a 18 anos.
		// E exiba a quantidade da lista antes e depois daexclusão.

		for (Pessoa pessoa : lista) {
			if (pessoa.getIdade() < 18) {
				lista.remove(lista);
				System.out.println(pessoa);
			}
		}

		/*
		 Crie uma consulta usando Collections em Java para verificar se Jéssica ainda
		 está presente na lista.
		 */

		
		
	}

}
