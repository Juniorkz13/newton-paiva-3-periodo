package modelo;

import javax.persistence.Embeddable;

@Embeddable
public class ItemExtrato {
    
    private int codigo;
    private String descricao;
    private String ref;
    private double valor;


    public ItemExtrato() {
    }


    public ItemExtrato(int codigo, String descricao, String ref, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ref = ref;
        this.valor = valor;
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
