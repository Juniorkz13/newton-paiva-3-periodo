package u3.heranca.medico;

public class Cardiologista extends Medico {
	private String crc;

	public Cardiologista(String crm, String crc) {
		super(crm);
		this.crc = crc;
	}
	
	public String getCrc() {
		return crc;
	}
	
	public void atender() {
		System.out.println("Cardiologista atendendo");
	}

}
