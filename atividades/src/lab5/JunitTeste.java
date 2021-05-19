package lab5;

import org.junit.Test;

import junit.framework.*;

public class JunitTeste extends TestCase {

    private DaoAluno daoAlunoTeste = new DaoAluno();
    private Aluno alunoTeste = new Aluno(123, "xxx", "yyy", "José", "dd/mm/aaaa");

    @Test
    public void testSave() {

        daoAlunoTeste.save(alunoTeste);

        int resultadoEsperado = 1;
        int resultado = daoAlunoTeste.getAll().size();

        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testUpdate() {

        daoAlunoTeste.save(alunoTeste);
        daoAlunoTeste.update(new Aluno(123, "xxx", "yyy", "João", "dd/mm/aaaa"));

        boolean resultadoEsperado = true;
        boolean resultado = alunoTeste.getNome().contains("João");

        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testeGetAll(){

        int resultadoEsperado = 0;
        int resultado = daoAlunoTeste.getAll().size();

        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testDelete() {

        daoAlunoTeste.save(alunoTeste);
        daoAlunoTeste.delete(alunoTeste);
        daoAlunoTeste.getAll();

        int resultadoEsperado = 0;
        int resultado = daoAlunoTeste.getAll().size();

        assertEquals(resultadoEsperado, resultado);

    }
}
