package lab6.builder;

import lab6.builder.model.Veiculo;
import lab6.builder.model.builder.VeiculoBuilder;

public class Client {

    public static void main(String[] args) {

        Veiculo carro = new VeiculoBuilder("Hyundai", "i30").addAno(2012).addCor("Prata").addJanelas(4).addKm(40000)
                .addPortas(4).addPotenciaEmHp(145).addRodas(4).construir();

        System.out.println(carro);

        Veiculo moto = new VeiculoBuilder("Honda", "CB 1000R").addAno(2021).addCor("Preto").addKm(0)
                .addPotenciaEmHp(142).addRodas(2).construir();

        System.out.println(moto);

        Veiculo aviao = new VeiculoBuilder("Beechcraft", "Baron G58").addCor("Branco").addJanelas(8).addKm(0)
                .addPortas(1).addPotenciaEmHp(600).addRodas(3).construir();

        System.out.println(aviao);
    }

}
