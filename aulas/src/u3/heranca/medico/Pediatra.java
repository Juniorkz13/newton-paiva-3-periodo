package u3.heranca.medico;

public class Pediatra extends Medico {
	
	private String crp;

	public Pediatra(String crp, String crm) {
		super(crm);
		this.crp = crp;
	}
	
	public String getCrp() {
		return crp;
	}

}
