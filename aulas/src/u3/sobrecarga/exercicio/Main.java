package u3.sobrecarga.exercicio;

public class Main {
    public static void main(String[] args) {

        var calc = new Calculadora();
        System.out.println("1 + 2 = " + calc.somar(1, 2));
        System.out.println("1 + 2 + 3 = " + calc.somar(1, 2, 3));
        System.out.println("1 + 2 + 3 + 4 = " + calc.somar(1, 2, 3, 4));

        var veic = new Veiculo();
        veic.andar();
        var aviao = new Aviao();
        aviao.andar();
        var bicicleta = new Bicicleta();
        bicicleta.andar();

    }
}
