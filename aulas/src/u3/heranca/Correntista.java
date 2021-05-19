package u3.heranca;

public class Correntista {

	protected String nome;
	protected String cidade;
	protected String telefone;

	public Correntista(String nome, String cidade, String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;

	}
	
	public float obterTaxa() {
		return 0.10f;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone + ", Taxa="
				+ obterTaxa() + "]";
	}
	
	

}
