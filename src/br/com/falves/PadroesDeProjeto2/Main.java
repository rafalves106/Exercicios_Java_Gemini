/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto2;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory minhaFabrica = new VeiculoFactory();

        System.out.println("------- Criando uma Moto -------");
        VeiculoBase minhaMoto = minhaFabrica.criarVeiculo("moto");

        System.out.println("------- Criando um Carro -------");
        VeiculoBase meuCarro = minhaFabrica.criarVeiculo("carro");

        System.out.println("------- Testando a Moto -------");
        if (minhaMoto != null) {
            minhaMoto.ligar();
            minhaMoto.acelerar(100);
            minhaMoto.desligar();
        }

        System.out.println("------- Testando o Carro --------");
        if (meuCarro != null) {
            meuCarro.ligar();
            meuCarro.acelerar(180);
            meuCarro.desligar();
        }
    }
}