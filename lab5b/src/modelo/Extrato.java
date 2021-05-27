package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "extratos")
public class Extrato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data")
    private String data;
    private ItemExtrato itemExtrato;
    @ManyToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;


    public Extrato() {
    }


    public Extrato(String data, ItemExtrato itemExtrato, Funcionario funcionario) {
        this.data = data;
        this.itemExtrato = itemExtrato;
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ItemExtrato getItemExtrato() {
        return this.itemExtrato;
    }

    public void setItemExtrato(ItemExtrato itemExtrato) {
        this.itemExtrato = itemExtrato;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}


