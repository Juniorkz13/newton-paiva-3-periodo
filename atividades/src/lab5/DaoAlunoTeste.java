package lab5;

public class DaoAlunoTeste {

    private DaoAluno daoAluno;
    private Aluno alunoTeste;

    public void teste() {

        daoAluno = new DaoAluno();
        alunoTeste = new Aluno(123, "xxx", "yyy", "José", "31/03/1992");

        int resultado = 1;

        daoAluno.save(alunoTeste);

        if (daoAluno.getAll().size() == resultado) {
            System.out.println("Método SAVE funcionando.");
        } else {
            System.out.println("Método SAVE com erro.");
        }

        daoAluno.update(new Aluno(123, "xxx", "999", "João", "31/03/1992"));

        if (alunoTeste.getNome().contains("João")) {
            System.out.println("Método UPDATE funcionando;");
        } else {
            System.out.println("Método UPDATE com erro.");
        }

        resultado = 1;

        if (daoAluno.getAll().size() == resultado) {
            System.out.println("Método GETALL funcionado.");
        } else {
            System.out.println("Método GETALL com erro.");
        }

        resultado = 0;

        daoAluno.delete(alunoTeste);

        if (daoAluno.getAll().size() == resultado) {
            System.out.println("Método DELETE funcionando.");
        } else {
            System.out.println("Método DELETE com erro.");
        }

    }
}
