 /**

  * @author falvesmac

  */

package br.com.falves.PadroesDeProjeto2;

 public class Carro extends VeiculoBase {

     public Carro(String marca, String modelo) {
         super(marca, modelo);
     }

     @Override
     public void acelerar(int incremento) {
         if (isLigado()) {
             System.out.println("Acelerando o carro " + getMarca()+ " " + getModelo() + " a " + incremento + "KM/h");
         } else {
             System.out.println("Não é possível acelerar, o carro " + getMarca() + " " + getModelo() + " está desligada.");
         }
     }
  }