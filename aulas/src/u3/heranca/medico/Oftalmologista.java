package u3.heranca.medico;

public class Oftalmologista extends Medico {
	private String cro;
	
	public Oftalmologista(String crm, String cro) {
		super(crm);
		this.cro = cro;
	}
	
	public void atender() {
		System.out.println("Oftalmologista atendendo");
	}
	
	public String getCro() {
		return cro;
	}
	
}
