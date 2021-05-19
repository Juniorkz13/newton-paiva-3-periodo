package u3.classeAbstrata;

public class Casa {

    private AnimalDeEstimacao animal;

    public Casa(AnimalDeEstimacao animal) {
        this.animal = animal;
        animal.brincar();
        animal.serAmigo();
    }

    @Override
    public String toString() {
        return "Casa [animal=" + animal + "]";
    }

}
