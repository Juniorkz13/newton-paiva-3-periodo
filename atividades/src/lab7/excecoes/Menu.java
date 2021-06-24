package lab7.excecoes;

import javax.swing.JOptionPane;

public class Menu {

    static void exibirMenu() {
        System.out.println("======================================");
        System.out.println("BEM VINDO AO BANCO CRED");

        System.out.println("1. Exibir saldo da conta.");
        System.out.println("2. Sacar dinheiro da conta.");
        System.out.println("3. Depositar dinheiro em sua conta.");
        System.out.println("4. Bloquear conta.");
        System.out.println("5. Sair.\n");

        System.out.print("Escolha uma das opções acima (1-5): ");

    }

    public static void main(String[] args) {

        Integer op = 0;
        var conta = new ContaBancaria(200);

        while (op != 5) {

            exibirMenu();
            Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: "));
            op = opcao;

            switch (op) {

                case 1:

                    try {

                        JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo());

                    } catch (ContaBloqueadaException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } finally {
                        conta.incrementarContadorOperacoes();
                    }
                    break;

                case 2:

                    try {

                        var valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque: "));

                        conta.efetuarSaque(valor);

                        JOptionPane.showMessageDialog(null,
                                "Saque efetuado com sucesso: " + valor + "\nSaldo: " + conta.getSaldo());

                    } catch (ValorSaqueInvalidoException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (ContaBloqueadaException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (SaldoInsuficienteException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } finally {
                        conta.incrementarContadorOperacoes();
                    }
                    break;

                case 3:

                    try {

                        var valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para depósito: "));

                        conta.efetuarDeposito(valor);

                        JOptionPane.showMessageDialog(null,
                                "Depósito efetuado com sucesso: " + valor + "\nSaldo: " + conta.getSaldo());

                    } catch (ValorDepositoInvalidoException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (ContaBloqueadaException ex) {

                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } finally {
                        conta.incrementarContadorOperacoes();
                    }
                    break;

                case 4:

                    Integer estado = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite 0 para desbloquear conta ou 1 para bloquear: "));

                    conta.setEstado(estado);
                    break;

                case 5:

                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso banco!");
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        }
    }
}
