package lab7.adapter;

public class Main {
    public static void main(String[] args) {

        Data dado = new Data("Cadeia de caracteres");
        ToASCII toASCII = new ToASCII();

        System.out.println(toASCII.adaptar(dado.getData()));
    }
}