package u3.classeAbstrata;

public class Tigre extends Felino {

    public Tigre(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Miado do tigre kkk");

    }

    @Override
    public void comer() {
        System.out.println("Comendo como um tigre!");

    }

}
