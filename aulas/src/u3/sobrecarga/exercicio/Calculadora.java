package u3.sobrecarga.exercicio;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public int somar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int subtrair(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}
