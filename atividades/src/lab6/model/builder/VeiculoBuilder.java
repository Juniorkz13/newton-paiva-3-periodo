package lab6.model.builder;

import lab6.model.Veiculo;

public class VeiculoBuilder {

    private String marca;
    private String modelo;

    private int portas;
    private int janelas;
    private int rodas;
    private int ano;
    private int km;
    private int potenciaEmHp;
    private String cor;

    public VeiculoBuilder(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public VeiculoBuilder addPortas(int portas) {
        this.portas = portas;
        return this;
    }

    public VeiculoBuilder addJanelas(int janelas) {
        this.janelas = janelas;
        return this;
    }

    public VeiculoBuilder addRodas(int rodas) {
        this.rodas = rodas;
        return this;
    }

    public VeiculoBuilder addAno(int ano) {
        this.ano = ano;
        return this;
    }

    public VeiculoBuilder addKm(int km) {
        this.km = km;
        return this;
    }

    public VeiculoBuilder addPotenciaEmHp(int potenciaEmHp) {
        this.potenciaEmHp = potenciaEmHp;
        return this;
    }

    public VeiculoBuilder addCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Veiculo construir() {
        return new Veiculo(portas, janelas, rodas, marca, modelo, ano, km, potenciaEmHp, cor);
    }
}
