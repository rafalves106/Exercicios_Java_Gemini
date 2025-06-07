/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto4;

public class FreteExpresso implements CalculoFreteStrategy{

    @Override
    public double calcularPeso(double pesoKg) {
        return pesoKg * 2.50;
    }
}