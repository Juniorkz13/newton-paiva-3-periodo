package u3.heranca.medico;

public class Medico {

	String crm;
	
	public Medico(String crm) {
		this.crm = crm;
	}
	
	public void atender() {
		System.out.println("Médico atendendo");
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void vestir() {
		System.out.println("Roupa branca - jaleco");
	}
}
