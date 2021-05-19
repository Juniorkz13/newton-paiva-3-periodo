package lab5;

public class Aluno {

    private Integer id;

    private String matricula;

    private String cpf;

    private String nome;

    private String dataDeNascimento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Aluno(Integer id, String matricula, String cpf, String nome, String dataDeNascimento) {

        this.id = id;
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome
                + ", dataDeNascimento=" + dataDeNascimento + "]";
    }
}
