package u3.classeAbstrata.exercicio;

public class Retangulo extends Figura {

    private float lado1;
    private float lado2;

    public Retangulo(String nome, float lado1, float lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public float calcularArea() {
        float area = lado1 * lado2;
        return area;
    }

    @Override
    public float calcularCircunferencia() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

}
