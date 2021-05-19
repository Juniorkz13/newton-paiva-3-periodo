package u2;

public class Arvore {

	private static int quantidade;

	public static final float ALTURA_MAXIMA = 20.0F;

	private float altura;

	private String especie;

	public Arvore(float altura, String especie) {
		this.altura = altura;
		this.especie = especie;

		quantidade++;
	}

	public float getAltura() {
		return altura;
	}

	public String getEspecie() {
		return especie;
	}

	public void balancar() {
		System.out.println(especie + " ...vento...");
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
}
