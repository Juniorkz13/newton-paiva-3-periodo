package u3.heranca;

public class Main {

	public static void main(String[] args) {
		
		var correntista = new Correntista("José", "Belo Horizonte", "(31) 999 555");
		var pessoaFisica = new PessoaFisica("João", "São Paulo", "(11) 999 444", "123456");
		var pessoaJuridica = new PessoaJuridica("SupermercadoSA", "Rio de Janeiro", "(21) 999 333", "987654-2");
		
		System.out.println(correntista.toString());
		System.out.println(pessoaFisica.toString());
		System.out.println(pessoaJuridica.toString());
		

	}

}
