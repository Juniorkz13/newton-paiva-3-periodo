package lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estacionamento implements ControleDeEstacionamento {

    private String nome;
    private int totalVagas;
    private float taxaHora;
    private List<Automovel> automoveis;
    private List<Automovel> historico;

    public Estacionamento(String nome, int totalVagas, float taxaHora) {
        this.nome = nome;
        this.totalVagas = totalVagas;
        this.taxaHora = taxaHora;
        this.automoveis = new ArrayList<>();
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public int getTotalVagas() {
        return this.totalVagas;
    }

    public float getTaxaHora() {
        return this.taxaHora;
    }

    public void setTaxaHora(float taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public void exibirVeiculosEstacionados() {
        if (automoveis.size() == 0) {
            System.out.println("====\nNão há veículos estacionados!");
        } else {
            System.out.println("\nVeículos estacionados:");
            for (Automovel automovel : automoveis) {
                System.out.printf("\n====\nPlaca: %s\nHorário de entrada: %02d:%02d\n====\n", automovel.getPlaca(),
                        automovel.getHoraEntrada(), automovel.getMinutoEntrada());
            }
        }
    }

    @Override
    public int obterNumeroTotalDeAutomoveis() {

        return automoveis.size();
    }

    @Override
    public int obterNumeroTotalDeVagas() {

        return totalVagas;
    }

    @Override
    public float obterTaxaDeOcupacao() {

        float taxaDeOcupacao = ((float) automoveis.size() / (float) totalVagas) * 100;

        return taxaDeOcupacao;
    }

    public int obterVagasDisponiveis() {

        int vagasDisponiveis = totalVagas - automoveis.size();
        return vagasDisponiveis;
    }

    public boolean verificaVeiculo(String placa) {
        for (Automovel automovel : automoveis) {
            if (automovel.getPlaca() == placa) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void cadastrarEntradaVeiculo(String placa, int horaEntrada, int minutoEntrada) {

        if (verificaVeiculo(placa) == true) {
            System.out.println("ERRO: Veículo já cadastrado!");
        }

        if (horaEntrada < 0 || horaEntrada > 24) {
            System.out.println("ERRO: verifique a hora digitada!");
        }
        if (minutoEntrada < 0 || minutoEntrada > 60) {
            System.out.println("ERRO: verifique o minuto digitado!");
        }

        else {
            Automovel automovel = new Automovel(placa, horaEntrada, minutoEntrada);
            this.automoveis.add(automovel);
            System.out.printf("\nAutomóvel placa %s cadastrado com sucesso!", placa);

        }

    }

    @Override
    public void cadastrarSaidaVeiculo(String placa, int horaSaida, int minutoSaida) {

        if (verificaVeiculo(placa) == false) {
            System.out.println("ERRO: Veículo não cadastrado!");
        }
        if (horaSaida < 0 || horaSaida > 24) {
            System.out.println("ERRO: verifique a hora digitada!");
        }
        if (minutoSaida < 0 || minutoSaida > 60) {
            System.out.println("ERRO: verifique o minuto digitado!");
        }

        for (Iterator<Automovel> i = automoveis.iterator(); i.hasNext();) {

            Automovel a = i.next();

            if (a.getPlaca().contains(placa)) {
                a.setHoraSaida(horaSaida);
                a.setMinutoSaida(minutoSaida);
                calcularValorEstacionamento(placa);
                historico.add(a);
                i.remove();

                System.out.println(a.toString());
            }
        }

    }

    public void exibirHistorico() {
        if (historico.size() == 0) {
            System.out.println("Não há veículos no histórico!");
        } else {
            System.out.println("Histórico de veículos:");
            for (Automovel automovel : historico) {
                System.out.println(automovel.toString());
            }
        }
    }

    @Override
    public void calcularValorEstacionamento(String placa) {

        for (Iterator<Automovel> i = automoveis.iterator(); i.hasNext();) {

            Automovel a = i.next();

            if (a.getPlaca().contains(placa)) {
                float valor = (((((float) a.getHoraSaida() - (float) a.getHoraEntrada()) * 60)
                        + ((float) a.getMinutoSaida() - (float) a.getMinutoEntrada())) / 60) * getTaxaHora();
                a.setValor(valor);
            }
        }

    }

}