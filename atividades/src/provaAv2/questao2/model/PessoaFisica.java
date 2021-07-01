package provaAv2.questao2.model;

public class PessoaFisica implements Cloneable {

    private String nome;
    private String cpf;
    private String dataNasc;

    public PessoaFisica(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", cpf='" + getCpf() + "'" + ", dataNasc='" + getDataNasc() + "'"
                + "}";
    }

    public PessoaFisica clone() throws CloneNotSupportedException {

        return (PessoaFisica) super.clone();
    }
}
