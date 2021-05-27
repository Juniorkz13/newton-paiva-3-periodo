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
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String dataAdm;
    private String cbo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cargo cargo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "funcionario_id")
    private Set<Extrato> extratos = new HashSet<>();

    public Funcionario() {
    }


    public Funcionario(String nome, String cpf, String dataAdm, String cbo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdm = dataAdm;
        this.cbo = cbo;
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

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAdm() {
        return this.dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCbo() {
        return this.cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void adicionarExtrato(Extrato e) {
        this.extratos.add(e);

        if (e != null) { 
            e.setFuncionario(this);
        }
    }

    
}
