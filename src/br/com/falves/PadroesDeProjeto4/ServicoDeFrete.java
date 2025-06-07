/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto4;

public class ServicoDeFrete {
  private CalculoFreteStrategy estrategia;

  public double calcularFrete (double pesoKg) {
    if (estrategia == null) {
      throw new IllegalStateException("Nenhuma estratégia de frete definida! ");
    }
    return estrategia.calcularPeso(pesoKg);
  }

  public void setEstrategia(CalculoFreteStrategy estrategia) {
    this.estrategia = estrategia;
  }


}