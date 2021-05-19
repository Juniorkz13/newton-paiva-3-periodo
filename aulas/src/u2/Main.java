package u2;

public class Main {

	public static void main(String[] args) {

		var arvore1 = new Arvore(10.0f, "Jatobá");
		var arvore2 = new Arvore(15.0f, "Carvalho");

		System.out.println("Altura:  " + arvore1.getAltura());
		System.out.println("Especie:  " + arvore1.getAltura());

		System.out.println("Quantidade: " + Arvore.getQuantidade());
		System.out.println("Altura máxima: " + Arvore.getQuantidade());
		
		arvore1.balancar();
		arvore2.balancar();

	}

}
