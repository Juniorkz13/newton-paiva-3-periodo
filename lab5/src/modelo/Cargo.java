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
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    private String nome;

    @Column(name = "salario_base_hora")
    private Double salarioBaseHora;

    @ManyToOne
    private Empresa empresa;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "cargo_id")
    private List<Funcionario> funcionarios;

    public Cargo() {
    }

    public Cargo(String codigo, String nome, Double salarioBaseHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBaseHora = salarioBaseHora;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public Integer getId() {
        return this.id;
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

    public Double getSalarioBaseHora() {
        return this.salarioBaseHora;
    }

    public void setSalarioBaseHora(Double salarioBaseHora) {
        this.salarioBaseHora = salarioBaseHora;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        f.setCargo(this);
    }

    public void removerFuncionario(Funcionario f) {
        this.funcionarios.remove(f);
        f.setCargo(null);
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    @Override
    public String toString() {
        return "Cargo [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", salarioBaseHora=" + salarioBaseHora
                + ", empresa=" + empresa.getNome() + "]";
    }

}
