package u3.classeAbstrata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        var lista = new ArrayList<Animal>();

        var leao = new Leao("Leão.jpeg", "Zebra", "África", true);
        lista.add(leao);

        var tigre = new Tigre("Tigre.jpeg", "Boi", "Selva", false);
        lista.add(tigre);
        lista.add(new Gato("Gatinho.jpeg", "Whiskas CHACHE", "Telhado", true));
        lista.add(new Canario("Canario.jpeg", "Alpiste", "Gaiola", false));

        for (Animal animal : lista) {
            System.out.println(animal);
            animal.andar();
            animal.comer();
            animal.fazerBarulho();
        }
    }
    
}
