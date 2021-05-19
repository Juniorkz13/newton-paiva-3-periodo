package lab2;

public class Main {

	public static void main(String[] args) {

		var pessoa1 = new Pessoa("João", "123456", "11/03/1990", 75.5f);
		var pessoa2 = new Pessoa("Maria", "147258", "15/04/1991", 50.0f);
		var pessoa3 = new Pessoa("Júnior", "963258", "31/03/1992", 70.3f);

		System.out.println(pessoa1.toString() + "\n" + pessoa2.toString() + "\n" + pessoa3.toString());
		System.out.println("\nA quantidade de pessoas é: " + Pessoa.getQtdPessoas() + ".");
//		pessoa1.exibirMenor(pessoa1, pessoa2, pessoa3);

		float peso = pessoa1.getPeso();
		if (pessoa2.getPeso() < peso) {
			peso = pessoa2.getPeso();
		}
		if (pessoa3.getPeso() < peso) {
			peso = pessoa3.getPeso();
		}

		System.out.println("\nO menor peso é: " + peso + "kg.");

	}

}
