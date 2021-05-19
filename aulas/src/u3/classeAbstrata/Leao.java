package u3.classeAbstrata;

public class Leao extends Felino {

    public Leao(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("RUGIDO!");

    }

    @Override
    public void comer() {
        System.out.println("Comendo como um leão!");

    }

}
