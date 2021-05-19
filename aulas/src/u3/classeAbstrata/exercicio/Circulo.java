package u3.classeAbstrata.exercicio;

public class Circulo extends Figura {

    private float raio;

    public Circulo(String nome, float raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        float area = 2 * 3.14f * raio;
        return area;
    }

    @Override
    public float calcularCircunferencia() {
        float circunferencia = 3.14f * raio;
        return circunferencia;
    }

}
