package u3.composicao;

public class Triangulo {
	
	private Ponto ponto1;
	private Ponto ponto2;
	private Ponto ponto3;
	
	public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
	}

	public Ponto getPonto1() {
		return ponto1;
	}

	public void setPonto1(Ponto ponto1) {
		this.ponto1 = ponto1;
	}

	public Ponto getPonto2() {
		return ponto2;
	}

	public void setPonto2(Ponto ponto2) {
		this.ponto2 = ponto2;
	}

	public Ponto getPonto3() {
		return ponto3;
	}

	public void setPonto3(Ponto ponto3) {
		this.ponto3 = ponto3;
	}

	@Override
	public String toString() {
		return "Triangulo [ponto1=" + ponto1 + ", ponto2=" + ponto2 + ", ponto3=" + ponto3 + "]";
	}
	
	

}
