 /**

  * @author falvesmac

  */

package br.com.falves.PadroesDeProjeto2;

 public class Moto extends VeiculoBase {

     public Moto(String marca, String modelo) {
      super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
      if (isLigado()) {
        System.out.println("Acelerando a moto " + getMarca() + " " + getModelo() + " a " + incremento + "KM/h");
      } else {
        System.out.println("Não é possível acelerar, a moto " + getMarca() + " " + getModelo() + " está desligada.");
      }
    }
  }