package u3.composicao;

public class Main {

	public static void main(String[] args) {
		
	
		
		var ponto1 = new Ponto(1.0f, 1.0f);
		var ponto2 = new Ponto(5.0f, 5.0f);
		
		var reta = new Reta(ponto1, ponto2);
		System.out.println(reta);
		
		var ponto3 = new Ponto(7.0f, 7.0f);
		
		var triangulo = new Triangulo(ponto1, ponto2, ponto3);
		System.out.println(triangulo);
		
		var ponto4 = new Ponto(10.0f, 10.0f);
		
		var quadrilatero = new Quadrilatero(ponto1, ponto2, ponto3, ponto4);
		System.out.println(quadrilatero);
		
	}

}
