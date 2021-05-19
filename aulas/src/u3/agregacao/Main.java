package u3.agregacao;

public class Main {

	public static void main(String[] args) {
		
		var universidade = new Universidade("Newton Paiva");
		var aluno1 = new Aluno("Júnior", "11011062", "Engenharia da Computação");
		var aluno2 = new Aluno("João", "11011062", "Engenharia da Computação");
		var aluno3 = new Aluno("João", "11011062", "Engenharia da Computação");
		var aluno4 = new Aluno("João", "11011062TESTE", "Engenharia da Computação");
		
		System.out.println("Add primeiro e segundo alunos:");
		universidade.addAluno(aluno1);
		universidade.addAluno(aluno4);
		universidade.listar();
		
		System.out.println("\nTentando add segundo aluno:");
		universidade.addAluno(aluno2);
		universidade.listar();
		System.out.println("\nRemovendo aluno 1:");
		universidade.removerAluno(aluno1);
		universidade.listar();
		System.out.println("\nTentando remover aluno não matriculado:");
		universidade.removerAluno(aluno3);
		universidade.listar();

	}

}
