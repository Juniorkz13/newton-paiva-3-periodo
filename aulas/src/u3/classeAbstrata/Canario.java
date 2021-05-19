package u3.classeAbstrata;

public class Canario extends Ave implements AnimalDeEstimacao {

    public Canario(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);

    }

    @Override
    public void andar() {
        System.out.println("Canarinho pula na gaiola");

    }

    @Override
    public void fazerBarulho() {
        System.out.println("Cantando fiufiufiu");

    }

    @Override
    public void brincar() {
        System.out.println("Pula na gaiola depressivamente");
        
    }

    @Override
    public void serAmigo() {
        System.out.println("Não bica seu olho...");
        
    }

}
