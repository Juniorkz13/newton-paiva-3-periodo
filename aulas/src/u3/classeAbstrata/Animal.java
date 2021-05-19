package u3.classeAbstrata;

public abstract class Animal {

    private String imagem;
    private String alimento;
    private String localizacao;
    private boolean comFome;

    public Animal(String imagem, String alimento, String localizacao, boolean comFome) {
        this.imagem = imagem;
        this.alimento = alimento;
        this.localizacao = localizacao;
        this.comFome = comFome;
    }

    @Override
    public String toString() {
        return "Animal [alimento=" + alimento + ", comFome=" + comFome + ", imagem=" + imagem + ", localizacao="
                + localizacao + "]";
    }

    public abstract void fazerBarulho();

    public abstract void comer();

    public abstract void andar();

}
