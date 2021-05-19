package u3.classeAbstrata;

public class Gato extends Felino implements AnimalDeEstimacao {

    public Gato(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Gatinho pspspsps");

    }

    @Override
    public void comer() {
        System.out.println("Huuuummm whiskas");

    }

    @Override
    public void brincar() {
       System.out.println("Brincando com o laser...");
        
    }

    @Override
    public void serAmigo() {
        System.out.println("Gato não é amigo, Gato mata o humano");
        
    }

}
