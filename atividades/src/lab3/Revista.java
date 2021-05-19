package lab3;

public class Revista {

	private String id;
	private String nome;
	private Artigo artigo1;
	private Artigo artigo2;
	private Artigo artigo3;

	public Revista(String id, String nome, Artigo artigo1, Artigo artigo2, Artigo artigo3) {
		super();
		this.id = id;
		this.nome = nome;
		this.artigo1 = artigo1;
		this.artigo2 = artigo2;
		this.artigo3 = artigo3;
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

	public Artigo getArtigo1() {
		return artigo1;
	}

	public void setArtigo1(Artigo artigo1) {
		this.artigo1 = artigo1;
	}

	public Artigo getArtigo2() {
		return artigo2;
	}

	public void setArtigo2(Artigo artigo2) {
		this.artigo2 = artigo2;
	}

	public Artigo getArtigo3() {
		return artigo3;
	}

	public void setArtigo3(Artigo artigo3) {
		this.artigo3 = artigo3;
	}

	@Override
	public String toString() {
		return "Revista [id=" + id + ", nome=" + nome + ", artigo1=" + artigo1 + ", artigo2=" + artigo2 + ", artigo3="
				+ artigo3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revista other = (Revista) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void imprimirArtigos() {
		System.out
				.println("\nArtigos publicados da revista " + nome + ":\n" + artigo1 + "\n" + artigo2 + "\n" + artigo3);
	}

}
