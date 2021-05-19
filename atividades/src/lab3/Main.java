package lab3;

public class Main {

	public static void main(String[] args) {

		var editora = new Editora("ABC123", "DarkSide", "Rua do Russel, nº 450, Glória, Rio de Janeiro, Brasil.");

		var artigo1 = new Artigo("0001", "LOVECRAFT, H.P.", "Sussurros na escuridão", "15/02/1930");
		var artigo2 = new Artigo("0002", "KELLY, Richard", "Donnie Darko", "31/03/2003");
		var artigo3 = new Artigo("0003", "KING, Stephen", "O Iluminado", "28/01/1977");

		var revista1 = new Revista("555", "Super Clássicos", artigo1, artigo2, artigo3);

		editora.addRevista(revista1);

		editora.imprimirRevistas();

		revista1.imprimirArtigos();

		System.out.println("\nO artigo " + artigo1.getConteudo() + " do autor " + artigo1.getAutor()
				+ ", possui em todo o seu cadastro a quantidade de caracteres igual a: " + artigo1.obterTamanho());
		System.out.println("\nO artigo " + artigo2.getConteudo() + " do autor " + artigo2.getAutor()
				+ ", possui em todo o seu cadastro a quantidade de caracteres igual a: " + artigo2.obterTamanho());
		artigo2.toString();
		System.out.println("\nO artigo " + artigo3.getConteudo() + " do autor " + artigo3.getAutor()
				+ ", possui em todo o seu cadastro a quantidade de caracteres igual a: " + artigo3.obterTamanho());
		artigo3.toString();

	}

}
