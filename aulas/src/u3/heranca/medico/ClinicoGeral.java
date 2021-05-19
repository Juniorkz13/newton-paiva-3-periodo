package u3.heranca.medico;

public class ClinicoGeral extends Medico {
	String crm;

	public ClinicoGeral(String crm) {
		super(crm);
	}
	
	public void atender() {
		System.out.println("Clinico geral atendendo");
	}
	
}
