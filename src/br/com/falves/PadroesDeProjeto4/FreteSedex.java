/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto4;

public class FreteSedex implements CalculoFreteStrategy{

    @Override
    public double calcularPeso(double pesoKg) {
        return pesoKg * 3.75;
    }
}