package u3.classeAbstrata;

public class Main2 {

    public static void main(String[] args) {

        // var leao = new Leao("Leão.jpeg", "Zebra", "África", true);

        // var tigre = new Tigre("Tigre.jpeg", "Boi", "Selva", false);
        var gato = new Gato("Gatinho.jpeg", "Whiskas CHACHE", "Telhado", true);
        // var canario = new Canario("Canario.jpeg", "Alpiste", "Gaiola", false);

        // var casa = new Casa(leao); // leao não implementou animalDeEstimacao
        // var casa = new Casa(tigre); // Tigre não implementou animalDeEstimacao

        var casa = new Casa(gato);
        System.out.println(casa);
    }
}
