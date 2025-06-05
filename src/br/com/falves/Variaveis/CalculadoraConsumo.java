/**
 * @author falvesmac
 */

package br.com.falves.Variaveis;

public class CalculadoraConsumo {
  public static void main(String[] args) {
    double distanciaPercorrida = 150, litrosCombustivelGastos = 10, precoLitroCombustivel = 5.5, gastosComLanche = 100, custoTotal = 0, gastosGasolina;

    System.out.println("Consumo médio da moto é " + distanciaPercorrida/litrosCombustivelGastos);

    gastosGasolina = litrosCombustivelGastos * precoLitroCombustivel;
    custoTotal += gastosGasolina;
    System.out.println("Gasto da viagem com gasolina " + gastosGasolina);

    System.out.println("Foram gastos em lanches: " + gastosComLanche);

    custoTotal += gastosComLanche;
    System.out.println("Gasto total da viagem: " + custoTotal);
  }
}