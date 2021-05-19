package u3.heranca.medico;

public class Dentista {

	@SuppressWarnings("unused")
	private String cro;

	public Dentista(String cro) {
		this.cro = cro;
	}

	public void atender() {
		System.out.println("Dentista atendendo");
	}

	public void vestir() {
		System.out.println("Roupa branca - jaleco");
	}
}
