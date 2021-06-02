package teste;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cargo;
import modelo.Empresa;
import modelo.ExtratoSalario;
import modelo.Funcionario;
import modelo.ItemExtrato;

public class Main {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("holerite");

    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {

        var e = new Empresa("Newton Paiva Sistemas", "123.456-0001/32", "Caiçara, BH, MG");

        salvar(e);

        e.setCnpj("987.654-0001/32");
        e.setNome("Newton Paiva Software");
        e.setEndereço("Av. Carlos luz 220");

        atualizar(e);

        var f = new Funcionario("00012", "José Pereira", "123.456.789-01", LocalDate.now(), "122");
        var c = new Cargo("001", "Diretor", 50.0);
        var i1 = new ItemExtrato(1, "SALARIO", 160, 0.0);
        var i2 = new ItemExtrato(2, "INSS", 0, 98.50);
        var i3 = new ItemExtrato(3, "FALTAS", 40, 0.0);
        var ex = new ExtratoSalario("2021", "Junho");

        e.adicionarFuncionario(f);
        e.adicionarCargo(c);
        c.adicionarFuncionario(f);
        f.adicionarExtrato(ex);
        ex.adicionarItem(i1);
        ex.adicionarItem(i2);
        ex.adicionarItem(i3);
        atualizar(e);

        var buscarFuncionario = entityManager.find(Funcionario.class,
        e.getFuncionarios().get(0).getId());
        System.out.println(buscarFuncionario);
        System.out.println();

        // // recuperar por listagem
        // var empresas = entityManager.createQuery("select e from Empresa e",
        // Empresa.class).getResultList();
        // System.out.println(empresas);
        // System.out.println();
    }

    private static void atualizar(Empresa e) {
        entityManager.getTransaction().begin();
        entityManager.merge(e);
        entityManager.getTransaction().commit();
        System.out.println(e);
        System.out.println();
    }

    private static void salvar(Empresa e) {
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
        System.out.println(e);
        System.out.println();
    }

    // private static void buscar(Empresa e) {
    //     entityManager.find(Empresa.class, e.getId());
    //     System.out.println(e);
    //     System.out.println();
    // }

    // private static void remover(Empresa e) {
    // entityManager.getTransaction().begin();
    // entityManager.remove(e);
    // entityManager.getTransaction().commit();
    // System.out.println("Removido");
    // System.out.println();
    // }
}