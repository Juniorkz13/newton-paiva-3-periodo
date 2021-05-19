package lab3;

import java.util.ArrayList;
import java.util.List;

public class Editora {

	private String id;
	private String nome;
	private String endereco;
	private List<Revista> revistas;

	public Editora(String id, String nome, String endereco) {

		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.revistas = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Revista> getRevistas() {
		return revistas;
	}

	public void setRevistas(List<Revista> revistas) {
		this.revistas = revistas;
	}
	

	public void imprimirRevistas() {
		System.out.printf("\nLista de revistas da editora %s:\n", nome);
		for (Revista a : revistas) {
			System.out.println(a.getNome());

		}

	}

	public void addRevista(Revista revista) {
		if (revistas.contains(revista)) {
			System.out.println("Revista já existente!");
			return;
		}
		this.revistas.add(revista);
	}

	public void removerRevista(Revista revista) {
		if (!revistas.contains(revista)) {
			System.out.println("Revista não encontrada!");
			return;
		}
		this.revistas.remove(revista);
	}
}
