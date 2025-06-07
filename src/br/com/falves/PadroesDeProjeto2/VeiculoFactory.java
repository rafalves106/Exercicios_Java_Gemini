 /**

  * @author falvesmac

  */

package br.com.falves.PadroesDeProjeto2;

 public class VeiculoFactory {

    public VeiculoBase criarVeiculo(String tipo) {
      VeiculoBase veiculoBase = null;

      if (tipo.equalsIgnoreCase("moto")) {
        veiculoBase = new Moto("Honda", "CBR");
      } else if (tipo.equalsIgnoreCase("carro")) {
        veiculoBase = new Carro("Honda", "Civic");
      } else {
        System.out.println("Digite um veículo válido. ");
        return null;
      }
      return veiculoBase;
    }

  }