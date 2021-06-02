package modelo;

import java.time.LocalDate;
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
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    private String nome;

    private String cpf;

    @Column(name = "data_adm")
    private LocalDate dataAdm;

    private String cbo;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Cargo cargo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "funcionario_id")
    private List<ExtratoSalario> extratos;

    public Funcionario() {
    }

    public Funcionario(String codigo, String nome, String cpf, LocalDate dataAdm, String cbo) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdm = dataAdm;
        this.cbo = cbo;
        this.extratos = new ArrayList<ExtratoSalario>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataAdm() {
        return this.dataAdm;
    }

    public void setDataAdm(LocalDate dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCbo() {
        return this.cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public List<ExtratoSalario> getExtratos() {
        return this.extratos;
    }

    public void setExtratos(List<ExtratoSalario> extratos) {
        this.extratos = extratos;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void adicionarExtrato(ExtratoSalario ex) {
        this.extratos.add(ex);
        ex.setFuncionario(this);
    }

    public void removerExtrato(ExtratoSalario ex) {
        this.extratos.remove(ex);
        ex.setFuncionario(null);
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dataAdm="
                + dataAdm + ", cbo=" + cbo + ", cargo=" + cargo.getNome() + ", empresa=" + empresa.getNome() + "]";
    }

}
