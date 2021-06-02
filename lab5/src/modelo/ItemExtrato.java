package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_extrato")
public class ItemExtrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer codigo;

    private String descricao;

    private Integer ref;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "extrato_salario_id", referencedColumnName = "id")
    private ExtratoSalario extratoSalario;

    public ItemExtrato() {
    }

    public ItemExtrato(Integer codigo, String descricao, Integer ref, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ref = ref;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRef() {
        return this.ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public ExtratoSalario getExtratoSalario() {
        return this.extratoSalario;
    }

    public void setExtratoSalario(ExtratoSalario extratoSalario) {
        this.extratoSalario = extratoSalario;
    }


}