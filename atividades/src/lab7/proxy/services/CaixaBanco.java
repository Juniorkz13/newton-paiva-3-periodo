package lab7.proxy.services;

import lab7.proxy.model.ContaBancaria;

public class CaixaBanco implements OperacoesBancarias {
    private ContaBancaria conta;


    public CaixaBanco(ContaBancaria conta) {
        this.conta = conta;
    }
 

    @Override
    public void efetuarSaque() {
        System.out.println("Conta: " + conta.getNumero() + "\nEfetuou saque");

    }

    @Override
    public void efetuarDeposito() {
        System.out.println("Conta: " + conta.getNumero() + "\nEfetuou depósito");

    }

    @Override
    public void efetuarTransferencia() {
        System.out.println("Conta: " + conta.getNumero() + "\nEfetuou transferência");

    }

    @Override
    public void alterarDadosPessoais() {
        System.out.println("Conta: " + conta.getNumero() + "\nAlterou dados pessoais");

    }

    public ContaBancaria getConta() {
        return this.conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

}
