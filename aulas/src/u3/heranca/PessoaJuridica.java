package u3.heranca;

public class PessoaJuridica extends Correntista {
	
	String cnpj;

	public PessoaJuridica(String nome, String cidade, String telefone, String cnpj) {
		super(nome, cidade, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public float obterTaxa() {
		return 0.07f;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone
				+ ", Taxa=" + obterTaxa() + "]";
	}
	
	

}
