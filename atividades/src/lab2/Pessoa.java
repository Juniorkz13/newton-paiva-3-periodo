package lab2;

public class Pessoa {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private float peso;
	private static int qtdPessoas = 0;

	public Pessoa(String nome, String cpf, String dataNascimento, float peso) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		qtdPessoas++;
	}

	public String toString() {
		return nome + " , de CPF nº " + cpf + " , nascido(a) em " + dataNascimento + " , pesa " + peso + " kg.";
	}

	public static int getQtdPessoas() {
		return qtdPessoas;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

//	public void exibirMenor(Pessoa pessoa1, Pessoa pessoa2, Pessoa pessoa3) {
//
//		float a = pessoa1.peso;
//		float b = pessoa2.peso;
//		float c = pessoa3.peso;
//		
//		System.out.println("\nA pessoa com o menor peso é:");
//
//			if (a < b && a < c) {
//				System.out.println(pessoa1.toString());
//			}
//			if (b < a && b < c) {
//				System.out.println(pessoa2.toString());
//			}
//			if (c < a && c < b) {
//				System.out.println(pessoa3.toString());
//			}
//		}
}
