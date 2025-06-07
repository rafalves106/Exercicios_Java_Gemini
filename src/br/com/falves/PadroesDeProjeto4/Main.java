/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto4;

public class Main {
    public static void main(String[] args) {
        ServicoDeFrete serv = new ServicoDeFrete();
        FreteNormal freteNormal = new FreteNormal();
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteSedex freteSedex = new FreteSedex();

        double pesoPacote = 10;

        System.out.println("Calculando seu custo com Frete Normal: ");
        serv.setEstrategia(freteNormal);
        double custo1 = serv.calcularFrete(pesoPacote);
        System.out.println("O valor do Frete Normal é: R$" + custo1);
        System.out.println("-----------------");

        System.out.println("Calculando seu custo com Frete Expresso: ");
        serv.setEstrategia(freteExpresso);
        double custo2 = serv.calcularFrete(pesoPacote);
        System.out.println("O valor do Frete Expresso é: R$" + custo2);
        System.out.println("-----------------");

        System.out.println("Calculando seu custo com Frete Sedex: ");
        serv.setEstrategia(freteSedex);
        double custo3 = serv.calcularFrete(pesoPacote);
        System.out.println("O valor do Frete Sedex é: R$" + custo3);
        System.out.println("-----------------");
    }

}