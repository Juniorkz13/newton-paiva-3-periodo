package teste;

import infra.DAO;
import modelo.Cargo;
import modelo.Empresa;
import modelo.Endereco;
import modelo.Extrato;
import modelo.Funcionario;
import modelo.ItemExtrato;

public class Teste {
    public static void main(String[] args) {
        
        DAO<Empresa> dao = new DAO<>(Empresa.class);

        Endereco endereco = new Endereco("Av. Presidente Carlos Luz, 220 - Caiçaras, Belo Horizonte - MG ");
        Empresa empresa = new Empresa("Newton Paiva SA", "123.456.789", endereco);
        Cargo cargo = new Cargo("Professor", 10000.0, empresa);
        Funcionario funcionario = new Funcionario("Maria Silva", "963.852.741", "27/05/2021", "234");
        ItemExtrato itemExtrato = new ItemExtrato(1, "Descontos", "ref", 100.0);
        Extrato extrato = new Extrato("05/04/2021", itemExtrato, funcionario);

        empresa.adicionarCargo(cargo);
        cargo.adicionarFuncionario(funcionario);
        funcionario.adicionarExtrato(extrato);
        dao.salvar(empresa).fechar();
    }

}
