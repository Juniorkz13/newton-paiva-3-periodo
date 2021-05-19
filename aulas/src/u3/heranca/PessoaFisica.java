package u3.heranca;

public class PessoaFisica extends Correntista {
	
	private String cpf;

	public PessoaFisica(String nome, String cidade, String telefone, String cpf) {
		super(nome, cidade, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float obterTaxa() {
		return 0.12f;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone
				+ ", Taxa=" + obterTaxa() + "]";
	}
	
	

}
