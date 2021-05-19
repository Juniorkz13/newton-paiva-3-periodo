package u3.classeAbstrata.exercicio;

public class Quadrado extends Figura {

    private float lado;

    public Quadrado(String nome, float lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float area = lado * lado;
        return area;
    }

    @Override
    public float calcularCircunferencia() {
        float perimetro = lado * 4;
        return perimetro;
    }

}
