 /**

  * @author falvesmac

  */

package br.com.falves.InterfacesHerancas;

  public class Carro extends VeiculoBase{

    private Motor motor;
    private Proprietario prop;

    public Carro(String marca, String modelo, Proprietario prop) {
      super(marca, modelo);
      this.motor = new Motor(260, 2000);
      this.prop = prop;
      System.out.println("CarroHonda de " + this.prop.getNome() + " criada.");
    }

    @Override
    public void acelerar(int incremento) {
      if (isLigado()) {
        System.out.println("Acelerando o carro " + getModelo() + " a " + incremento + "KM/h");
      } else {
        System.out.println("Não é possível acelerar, o carro " + getModelo() + " está desligada.");
      }
    }
  }