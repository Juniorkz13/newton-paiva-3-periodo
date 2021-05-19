package u3.classeAbstrata;

public abstract class Felino extends Animal {

    public Felino(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);
    }

    public abstract void fazerBarulho();

    public abstract void comer();

    @Override
    public void andar() {
        System.out.println("Felino andando...");

    }

}
