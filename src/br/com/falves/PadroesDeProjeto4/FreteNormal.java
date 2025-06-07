/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto4;

public class FreteNormal implements CalculoFreteStrategy{

    @Override
    public double calcularPeso(double pesoKg) {
        return pesoKg * 1.25;
    }
}