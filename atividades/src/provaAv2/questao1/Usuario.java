package provaAv2.questao1;

import java.util.Calendar;
import java.util.Date;

import provaAv2.questao1.exceptions.AnoException;
import provaAv2.questao1.exceptions.IdadeException;
import provaAv2.questao1.exceptions.MesException;
import provaAv2.questao1.exceptions.NomeException;

public class Usuario {

    private int idade;
    private int mes;
    private int ano;
    private String nome;


    public Usuario(String nome) throws NomeException{
        if(nome.equals(" ") || nome == null){
            throw new NomeException();
        } else {
        this.nome = nome;
        }
    }
   
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) throws IdadeException {
        if (idade < 18 || idade > 100) {
            throw new IdadeException();
        } else {
            this.idade = idade;
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) throws MesException {
        if (mes < 1 || mes > 12) {
            throw new MesException();
        } else {
            this.mes = mes;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) throws AnoException {
        Date data = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        int dataAno = calendario.get(Calendar.YEAR);
        if (ano < 1980 || ano > dataAno) {
            throw new AnoException();
        } else {
            this.ano = ano;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "{" +
            " idade='" + getIdade() + "'" +
            ", mes='" + getMes() + "'" +
            ", ano='" + getAno() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}
