package prova2;



import java.util.Objects;

public class Proprietario {

    private String cpf;


    public Proprietario(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{" +
            " cpf='" + getCpf() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proprietario)) {
            return false;
        }
        Proprietario proprietario = (Proprietario) o;
        return Objects.equals(cpf, proprietario.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }


    
}
