package u3.classeAbstrata.exercicio;

public abstract class Figura {

    private String nome;

    public Figura(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Figura [nome=" + nome + "]";
    }

    public abstract float calcularArea();

    public abstract float calcularCircunferencia();
}
