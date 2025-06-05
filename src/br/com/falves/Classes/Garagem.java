/**
 * @author falvesmac
 */

package br.com.falves.Classes;

public class Garagem {
    public static void main(String[] args) {

        // Instancing Moto1
        Moto moto1 = new Moto();
        moto1.setMarca("BMW");
        moto1.setModelo("F750 GS");
        moto1.setCilindradas(850);
        moto1.setCor("Triple Black");

        moto1.ligar();
        moto1.desligar();
        moto1.exibirDetalhes();


        // Instancing Moto2
        Moto moto2 = new Moto("Yamaha", "MT07", 700, "Branca");
        moto2.desligar();
        moto2.ligar();
        moto2.exibirDetalhes();
    }

}