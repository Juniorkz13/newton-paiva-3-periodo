package lab7.proxy;

import javax.swing.JOptionPane;

import lab1.ContaBancaria;
import lab7.proxy.services.CaixaBanco;
import lab7.proxy.services.CaixaRapido;
import lab7.proxy.services.OperacoesBancarias;

public class Main {
    
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("103", "789456", "999", "abc");
        
        var caixaBanco = new CaixaBanco(conta);
        System.out.println("---Caixa Banco---");
        caixaBanco.efetuarSaque();
        caixaBanco.efetuarDeposito();
        caixaBanco.efetuarTransferencia();
        caixaBanco.alterarDadosPessoais();

        System.out.println("---Caixa Rápido---");
        OperacoesBancarias caixaRapido = new CaixaRapido(caixaBanco);
        String senha = JOptionPane.showInputDialog("Insira a senha:");
        String codigo = JOptionPane.showInputDialog("Insira o codigo:");

    }
}
