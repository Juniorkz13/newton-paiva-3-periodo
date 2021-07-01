package provaAv2.questao2;

import provaAv2.questao2.model.PessoaFisica;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        PessoaFisica pessoa1 = new PessoaFisica("José", "123456", "31/03/1992");
        PessoaFisica clonePessoa1 = pessoa1.clone();

        System.out.println(pessoa1);
        System.out.println(clonePessoa1);

    }
}
