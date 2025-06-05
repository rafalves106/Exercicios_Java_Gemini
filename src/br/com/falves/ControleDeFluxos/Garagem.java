/**
 * @author falvesmac
 */

package br.com.falves.ControleDeFluxos;

public class Garagem {
    public static void main(String[] args) {

        // Instancing Moto1
        Moto moto1 = new Moto();
        moto1.setMarca("BMW");
        moto1.setModelo("F750 GS");
        moto1.setCilindradas(850);
        moto1.setCor("Triple Black");
        moto1.setNivelOleo(100);

        moto1.exibirDetalhes();
        moto1.verificarNivelOleo();

        moto1.simularUso(10000);
        moto1.verificarNivelOleo();
    }

}