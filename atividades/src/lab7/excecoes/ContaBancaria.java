package lab7.excecoes;

public class ContaBancaria {

    private float saldo;
    private int numOperacoes = 0;
    private int estado;

    public ContaBancaria(float valor) {
        this.saldo = valor;
        this.estado = 0;
    }

    public void efetuarSaque(float valor) throws ValorSaqueInvalidoException, ContaBloqueadaException, SaldoInsuficienteException {

        if (estado != 0) {

            throw new ContaBloqueadaException();
        }

        if (valor <= 0) {

            throw new ValorSaqueInvalidoException(valor);
        }

        if (valor > this.saldo) {

            throw new SaldoInsuficienteException();
        }

        this.saldo = this.saldo - valor;
        System.out.println("Saldo: " + this.saldo);
    }

    public void efetuarDeposito(float valor) throws ValorDepositoInvalidoException, ContaBloqueadaException {

        if (estado != 0) {

            throw new ContaBloqueadaException();
        }

        if (valor <= 0) {

            throw new ValorDepositoInvalidoException(valor);
        }

        this.saldo = this.saldo + valor;
        System.out.println("Saldo: " + this.saldo);
    }

    public float getSaldo() throws ContaBloqueadaException {

        if (estado != 0) {

            throw new ContaBloqueadaException();
        }

        return saldo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void incrementarContadorOperacoes() {
        this.numOperacoes++;

        System.out.println("Operacoes: " + numOperacoes);
    }
}