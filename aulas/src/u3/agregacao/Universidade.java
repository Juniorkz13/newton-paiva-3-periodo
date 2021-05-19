package u3.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

	private String nome;
	private List<Aluno> alunos;

	
	public Universidade(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Universidade [nome=" + nome + ", alunos=" + alunos + "]";
	}

	public Aluno pesquisar(String matricula) {
		for (Aluno a : alunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}

		}
		return null;
	}

	public void listar() {
		System.out.println("\nLista de alunos:\n");
		for (Aluno a : alunos) {
			System.out.println(a);

		}
	}

	public void addAluno(Aluno aluno) {
		if(alunos.contains(aluno)) {
			System.out.println("Aluno já existente!");
			return;
		}
		this.alunos.add(aluno);
		System.out.println("Aluno matriculado com sucesso!");
	}

	public void removerAluno(Aluno aluno) {
		if (!alunos.contains(aluno)) {
			System.out.println("Aluno não matriculado!");
			return;
		}
		this.alunos.remove(aluno);
	}

}
