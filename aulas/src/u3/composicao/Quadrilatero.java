package u3.composicao;

public class Quadrilatero {
	
	private Ponto ponto1;
	private Ponto ponto2;
	private Ponto ponto3;
	private Ponto ponto4;
	
	public Quadrilatero(Ponto ponto1, Ponto ponto2, Ponto ponto3, Ponto ponto4) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
		this.ponto4 = ponto4;
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

	public Ponto getPonto4() {
		return ponto4;
	}

	public void setPonto4(Ponto ponto4) {
		this.ponto4 = ponto4;
	}

	@Override
	public String toString() {
		return "Quadrilatero [ponto1=" + ponto1 + ", ponto2=" + ponto2 + ", ponto3=" + ponto3 + ", ponto4=" + ponto4
				+ "]";
	}
	
	

}
