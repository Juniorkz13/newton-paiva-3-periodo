package lab1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static void exibirMenu() {
		System.out.println("======================================");
		System.out.println("BEM VINDO AO BANCO CRED");

		System.out.println("1. Cadastrar correntista.");
		System.out.println("2. Exibir saldo da conta.");
		System.out.println("3. Sacar dinheiro da conta.");
		System.out.println("4. Depositar dinheiro em sua conta.");
		System.out.println("5. Transferir para outra conta.");
		System.out.println("6. Pagar conta.");
		System.out.println("7. Exibir extrato.");
		System.out.println("8. Pesquisar conta.");
		System.out.println("9. Atualizar conta.");
		System.out.println("10. Encerrar conta.");
		System.out.println("11. Sair.\n");

		System.out.print("Escolha uma das opções acima (1-11): ");

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int op = 0;
		while (op != 11) {
			var correntista = new Correntista();
			var conta = new ContaBancaria();
			exibirMenu();

			op = sc.nextInt();

			switch (op) {

			case 1:
				System.out.println("Cadastrar correntista");
				Scanner entrada = new Scanner(System.in);
				System.out.println("\nDigite seu nome: ");
				String nome = entrada.nextLine();
				System.out.println("Digite seu CPF: ");
				String cpf = entrada.nextLine();
				correntista.setNome(nome);
				correntista.setCpf(cpf);
				Random gerador = new Random();
				Integer agencia = gerador.nextInt(989) + 100;
				Integer numero = gerador.nextInt(9899) + 1000;
				conta.setAgencia(agencia.toString());
				conta.setNumero(numero.toString());
				conta.setBanco("Banco Newton");
				System.out.println("\nConta aberta com sucesso!");
				System.out.println("Conta nº: " + conta.getNumero() + " Agência nº: " + conta.getAgencia());
				Banco.inserir(conta, correntista);
				break;

			case 2:
				System.out.println("Exibir saldo da conta");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					conta.getSaldo();
				}
				break;

			case 3:
				System.out.println("Sacar dinheiro da conta");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					Scanner entrada1 = new Scanner(System.in);
					System.out.print("\nDigite o valor que deseja sacar: R$");
					float valor = entrada1.nextFloat();
					conta.sacar(valor);
					conta.getSaldo();
				}
				break;

			case 4:
				System.out.println("Depositar dinheiro em sua conta");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					Scanner depo = new Scanner(System.in);
					System.out.print("\nDigite o valor que deseja depositar: R$");
					float valor = depo.nextFloat();
					conta.depositar(valor);
					conta.getSaldo();
				}
				break;

			case 5:
				System.out.println("Transferir para outra conta");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					
					Scanner trans = new Scanner(System.in);
					System.out.print("\nDigite o valor que deseja transferir: R$");
					float valor = trans.nextFloat();
					System.out.print("\nDigite a conta: \n");
					Scanner trans1 = new Scanner(System.in);
					String contaDestino = trans1.nextLine();
					conta.transferir(contaDestino, valor);
					conta.getSaldo();
				}
				break;

			case 6:
				System.out.println("Pagar conta");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					Scanner pagar = new Scanner(System.in);
					System.out.print("\nDigite o valor do pagamento: R$");
					float valor = pagar.nextFloat();
					System.out.print("\nDigite o destinatário do pagamento: \n");
					Scanner pagar1 = new Scanner(System.in);
					String destinatario = pagar1.nextLine();
					conta.pagarConta(valor, destinatario);
					conta.getSaldo();
				}
				break;

			case 7:
				System.out.println("Exibir extrato\n");
				if (correntista.getNome() == null) {
					System.out.println("\nERRO: cadastro inexistente!");
				} else {
					conta.exibirExtrato();
				}
				break;
				
			case 8:
				System.out.println("Pesquisar conta\n");
				Scanner pesquisaNum = new Scanner(System.in);
				System.out.print("Digite o número da conta: ");
				String numeroPesq = pesquisaNum.nextLine();
				Scanner pesquisaAg = new Scanner(System.in);
				System.out.print("Digite o número da agência: ");
				String numeroAg = pesquisaAg.nextLine();
				System.out.println(Banco.pesquisar(numeroPesq, numeroAg));
				break;
				
			case 9:
				System.out.println("Atualizar conta\n");
				Scanner pesquisaNumAtt = new Scanner(System.in);
				System.out.print("Digite o número da conta: ");
				String numeroPesqAtt = pesquisaNumAtt.nextLine();
				Scanner pesquisaAgAtt = new Scanner(System.in);
				System.out.print("Digite o número da agência: ");
				String numeroAgAtt = pesquisaAgAtt.nextLine();
				Scanner nomeAtt = new Scanner(System.in);
				System.out.print("Digite o novo nome: ");
				String nomeNovo = nomeAtt.nextLine();
				System.out.println(Banco.atualizar(numeroPesqAtt, numeroAgAtt, nomeNovo));
				break;
				
			case 10:
				System.out.println("Encerrar conta\n");
				Scanner encerrar = new Scanner(System.in);
				System.out.println("Digite o número da conta que deseja encerrar: ");
				String encerrarNum = encerrar.nextLine();
				Banco.encerrar(encerrarNum);
				break;
				
			case 11:
				System.out.println("\nObrigado por usar o nosso banco!");
				break;

			default:
				System.out.println("\nERRO: opção inválida");

			}

		}

	}
}
