package lab4;

public interface ControleDeEstacionamento {

    default void cadastrarEntradaVeiculo(String placa, int horaEntrada, int minutoEntrada){}

    default void cadastrarSaidaVeiculo(String placa, int horaSaida, int minutoSaida){}

    default void calcularValorEstacionamento(String placa){}

    default void exibirVeiculosEstacionados(){}

    default float obterTaxaDeOcupacao(){
        return 0;
    }

    default int obterNumeroTotalDeVagas(){
        return 0;
    }

    default int obterNumeroTotalDeAutomoveis(){
        return 0;
    }
}
