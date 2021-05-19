package u3.classeAbstrata.exercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var quadrado = new Quadrado("quadrado", 5);
        var circulo = new Circulo("circulo", 10);
        var retangulo = new Retangulo("retângulo", 20, 30);

        var lista = new ArrayList<Figura>();

        lista.add(quadrado);
        lista.add(circulo);
        lista.add(retangulo);

        for (Figura figura : lista) {
            System.out.println(figura);
            System.out.println("Imprimindo área -> " + figura.calcularArea());
            System.out.println("Imprimindo perímetro/circunferência -> " + figura.calcularCircunferencia());
        }
    }
}
