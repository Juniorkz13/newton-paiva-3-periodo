package u3.classeAbstrata;

public abstract class Ave extends Animal {

    public Ave(String imagem, String alimento, String localizacao, boolean comFome) {
        super(imagem, alimento, localizacao, comFome);
       
    }

    @Override
    public void comer() {
        System.out.println("Comendo com o bico");
    }

    public abstract void andar();

    public abstract void fazerBarulho();
}
