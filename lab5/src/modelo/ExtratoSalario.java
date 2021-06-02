package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "extrato_salario")
public class ExtratoSalario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ano;

    private String mes;

    @Column(name = "total_com_desconto")
    private Double totalComDesconto = 0.0;

    @Column(name = "total_sem_desconto")
    private Double totalSemDesconto = 0.0;

    @Column(name = "horas_trabalhadas")
    private Integer horasTrabalhadas;

    @Column(name = "horas_falta")
    private Integer horasfalta;

    private Double irpf = 0.0;

    private Double inss;

    @ManyToOne
    Funcionario funcionario;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "extrato_salario_id")
    private List<ItemExtrato> itens;

    public ExtratoSalario() {
    }

    public ExtratoSalario(String ano, String mes) {
        this.ano = ano;
        this.mes = mes;
        this.itens = new ArrayList<ItemExtrato>();
    }

    public Integer getId() {
        return this.id;
    }

    public Double getTotalComDesconto() {
        return this.totalComDesconto;
    }

    public void setTotalComDesconto(Double totalComDesconto) {
        this.totalComDesconto = totalComDesconto;
    }

    public Double getTotalSemDesconto() {
        return this.totalSemDesconto;
    }

    public void setTotalSemDesconto(Double totalSemDesconto) {
        this.totalSemDesconto = totalSemDesconto;
    }

    public Integer getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Integer getHorasfalta() {
        return this.horasfalta;
    }

    public void setHorasfalta(Integer horasfalta) {
        this.horasfalta = horasfalta;
    }

    public Double getIrpf() {
        return this.irpf;
    }

    public void setIrpf(Double irpf) {
        this.irpf = irpf;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getInss() {
        return this.inss;
    }

    public void setInss(Double inss) {
        this.inss = inss;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public List<ItemExtrato> getItens() {
        return this.itens;
    }

    public void setItens(List<ItemExtrato> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemExtrato i) {
        this.itens.add(i);
        i.setExtratoSalario(this);
        if (i.getCodigo() == 1){
            this.horasTrabalhadas = i.getRef();
            Double valor = this.funcionario.getCargo().getSalarioBaseHora() * this.horasTrabalhadas;
            i.setValor(valor);
            this.totalSemDesconto += valor;
            this.totalComDesconto += valor;
            this.irpf = valor;
        } else if (i.getCodigo() == 2){
            this.inss = i.getValor();
            this.totalComDesconto -= inss;
        } else if (i.getCodigo() == 3){
            this.horasfalta = i.getRef();
            Double valor = this.funcionario.getCargo().getSalarioBaseHora() * this.horasfalta;
            i.setValor(valor);
            this.totalComDesconto -= valor;
            this.irpf -= valor;
        }
    }

    public void removerItem(ItemExtrato i) {
        this.itens.remove(i);
        i.setExtratoSalario(null);
    }

}
