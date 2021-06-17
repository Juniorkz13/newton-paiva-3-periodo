package lab6.model;

public class Veiculo {

    private int portas;
    private int janelas;
    private int rodas;
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private int potenciaEmHp;
    private String cor;

    public Veiculo(int portas, int janelas, int rodas, String marca, String modelo, int ano, int km, int potenciaEmHp,
            String cor) {
        this.portas = portas;
        this.janelas = janelas;
        this.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.potenciaEmHp = potenciaEmHp;
        this.cor = cor;
    }

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getJanelas() {
        return this.janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getRodas() {
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPotenciaEmHp() {
        return this.potenciaEmHp;
    }

    public void setPotenciaEmHp(int potenciaEmHp) {
        this.potenciaEmHp = potenciaEmHp;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" + " portas='" + getPortas() + "'" + ", janelas='" + getJanelas() + "'" + ", rodas='" + getRodas()
                + "'" + ", marca='" + getMarca() + "'" + ", modelo='" + getModelo() + "'" + ", ano='" + getAno() + "'"
                + ", km='" + getKm() + "'" + ", potenciaEmHp='" + getPotenciaEmHp() + "'" + ", cor='" + getCor() + "'"
                + "}";
    }

}
