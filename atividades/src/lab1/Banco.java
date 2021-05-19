package lab1;

import java.util.ArrayList;

public class Banco {

	private static ArrayList<ContaBancaria> listaContas = new ArrayList<>();
	private static ArrayList<Correntista> listaCorrentistas = new ArrayList<>();

	public static ArrayList<ContaBancaria> getListaContas() {
		return listaContas;
	}

	public static ArrayList<Correntista> getListaCorrentista() {
		return listaCorrentistas;
	}

	static public void inserir(ContaBancaria c, Correntista n) {
		int i = 0;
		listaContas.add(i, c);
		listaCorrentistas.add(i, n);
		i++;
	}

	static public String pesquisar(String numero, String agencia) {
		for (int i = 0; i < listaContas.size(); i++) {
			ContaBancaria temp1 = listaContas.get(i);
			Correntista temp2 = listaCorrentistas.get(i);
			if (agencia.matches(temp1.getAgencia()) && numero.matches(temp1.getNumero())) {
				return "\nPesquisa concluída com sucesso!\n" + "Titular: " + temp2.getNome() + "\nCPF: "
						+ temp2.getCpf() + "\nConta: " + numero + "\nAgência: " + agencia;
			}
		}
		return "Conta não encontrada!";
	}

	static public boolean encerrar(String numero) {

		for (ContaBancaria c : listaContas) {
			if (numero.matches(c.getNumero())) {
				System.out.println("Conta removida!");
				listaContas.remove(c);

				return true;

			} else {
				System.out.println("Conta não encontrada!");
			}
		}
		return false;
	}

	static public String atualizar(String numero, String agencia, String nomeNovo) {
		for (int i = 0; i < listaContas.size(); i++) {
			ContaBancaria temp1 = listaContas.get(i);
			Correntista temp2 = listaCorrentistas.get(i);
			if (agencia.matches(temp1.getAgencia()) && numero.matches(temp1.getNumero())) {
				listaCorrentistas.get(i).setNome(nomeNovo);
				return "\nAtualização concluída com sucesso!\n" + "Titular: " + temp2.getNome() + "\nCPF: "
						+ temp2.getCpf() + "\nConta: " + numero + "\nAgência: " + agencia;
			}
		}
		return "Conta não encontrada!";
	}

}
