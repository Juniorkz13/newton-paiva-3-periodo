package lab7.proxy.services;

import javax.swing.JOptionPane;

public class CaixaRapido implements OperacoesBancarias {
    private OperacoesBancarias banco;

    public CaixaRapido(OperacoesBancarias banco) {
        this.banco = banco;
    }

    @Override
    public void efetuarSaque() {
        String senha = JOptionPane.showInputDialog("Insira a senha:");
        String codigo = JOptionPane.showInputDialog("Insira o codigo:");

        

        if (banco.getContas().get(0).getSenha().equals(senha)
                && banco.getContas().get(0).getCodLetras().equals(codigo)) {
            System.out.println("Conta: " + banco.getContas().get(0).getNumero() + "\nEfetuou saque");
        } else {
            System.out.println("Senha ou código inválidos.");
        }

    }

    @Override
    public void efetuarDeposito() {
        String senha = JOptionPane.showInputDialog("Insira a senha:");
        String codigo = JOptionPane.showInputDialog("Insira o codigo:");

        if (banco.getContas().get(0).getSenha().equals(senha)
                && banco.getContas().get(0).getCodLetras().equals(codigo)) {
            System.out.println("Conta: " + banco.getContas().get(0).getNumero() + "\nEfetuou depósito");
        } else {
            System.out.println("Senha ou código inválidos.");
        }

    }

    @Override
    public void efetuarTransferencia() {
        String senha = JOptionPane.showInputDialog("Insira a senha:");
        String codigo = JOptionPane.showInputDialog("Insira o codigo:");

        if (banco.getContas().get(0).getSenha().equals(senha)
                && banco.getContas().get(0).getCodLetras().equals(codigo)) {
            System.out.println("Conta: " + banco.getContas().get(0).getNumero() + "\nEfetuou transferência");
        } else {
            System.out.println("Senha ou código inválidos.");
        }

    }

    @Override
    public void alterarDadosPessoais() {
        String senha = JOptionPane.showInputDialog("Insira a senha:");
        String codigo = JOptionPane.showInputDialog("Insira o codigo:");

        if (banco.getContas().get(0).getSenha().equals(senha)
                && banco.getContas().get(0).getCodLetras().equals(codigo)) {
            System.out.println("Conta: " + banco.getContas().get(0).getNumero() + "\nAlterou dados pessoais");
        } else {
            System.out.println("Senha ou código inválidos.");
        }

    }
}
