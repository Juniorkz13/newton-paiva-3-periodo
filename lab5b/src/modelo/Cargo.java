package modelo;

import java.util.HashSet;
import java.util.Set;

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
@Table(name = "cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cargo")
    private String nome;
    @Column(name = "salario")
    private double salarioBaseHora;

    @ManyToOne(cascade = CascadeType.ALL)
    private Empresa empresa;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "cargo_id")
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Cargo() {
    }

    public Cargo(String nome, double salarioBaseHora, Empresa empresa) {

        this.nome = nome;
        this.salarioBaseHora = salarioBaseHora;
        this.empresa = empresa;

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBaseHora() {
        return this.salarioBaseHora;
    }

    public void setSalarioBaseHora(double salarioBaseHora) {
        this.salarioBaseHora = salarioBaseHora;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        f.setCargo(this);
    }

    public void removerFuncionario(Funcionario f) {
        this.funcionarios.remove(f);
        f.setCargo(null);
    }

}
