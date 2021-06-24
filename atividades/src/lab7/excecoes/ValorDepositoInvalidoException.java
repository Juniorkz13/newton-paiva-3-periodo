package lab7.excecoes;

public class ValorDepositoInvalidoException extends Exception {

    public ValorDepositoInvalidoException(float valor) {
        super("Valor de depósito inválido: " + valor);
    }
    
}
