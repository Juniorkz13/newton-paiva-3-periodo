package lab8;

import javax.swing.JOptionPane;

import lab8.exception.DivisaoPorZeroException;

public class Contexto {

    // 4a estratégia via interface
    private Strategy estrategia;

    public void setEstrategia(Strategy estrategia) {
        System.out.println("Setando a estratégia: " + estrategia + "\n");

        this.estrategia = estrategia;
    }

    public int executar(int a, int b) {
        if (estrategia == null) {
            System.out.println("ERRO: estratégia não definida.");

            return 0;
        }

        try {
            return estrategia.execute(a, b);
        } catch (DivisaoPorZeroException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return 0;
    }
}
