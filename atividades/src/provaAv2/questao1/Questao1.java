package provaAv2.questao1;

import javax.swing.JOptionPane;

import provaAv2.questao1.exceptions.AnoException;
import provaAv2.questao1.exceptions.IdadeException;
import provaAv2.questao1.exceptions.MesException;
import provaAv2.questao1.exceptions.NomeException;

public class Questao1 {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        String nome = JOptionPane.showInputDialog("Digite o nome: ");

        try {
            Usuario usuario = new Usuario(nome);
            usuario.setIdade(idade);
            usuario.setMes(mes);
            usuario.setAno(ano);
            JOptionPane.showInternalMessageDialog(null, "Usuário: " + usuario.toString());
        } catch (NomeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IdadeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MesException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (AnoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        // try {
        //     usuario.setIdade(idade);
        // } catch (IdadeException e) {
        //     JOptionPane.showMessageDialog(null, e.getMessage());
        // }

        // try {
        //     usuario.setMes(mes);
        // } catch (MesException e) {
        //     JOptionPane.showMessageDialog(null, e.getMessage());
        // }

        // try {
        //     usuario.setAno(ano);
        // } catch (AnoException e) {
        //     JOptionPane.showMessageDialog(null, e.getMessage());
        // }

    }
}
