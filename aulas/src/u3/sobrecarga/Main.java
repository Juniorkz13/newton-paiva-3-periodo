package u3.sobrecarga;

public class Main {
    public static void main(String[] args) {

        var calc = new Calculadora();

        int r = calc.somar(2, 3);
        System.out.println("2 + 3 = " + r);

        int []v = {5, 6, 7, 3, 2, 1};

        r = calc.somar(v);
        System.out.println("Soma do vetor = " + r);

        var cachorro = new Cao();
        cachorro.latir();
        cachorro.latir(5);
    }
}
