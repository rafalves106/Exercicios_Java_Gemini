 /**

  * @author falvesmac

  */

package br.com.falves.InterfacesHerancas;

  public class Moto extends VeiculoBase{

    private Motor motor;
    private Proprietario prop;

    public Moto(String marca, String modelo, Proprietario prop) {
      super(marca, modelo);
      this.motor = new Motor(100, 20);
      this.prop = prop;
      System.out.println("MotoHonda de " + this.prop.getNome() + " criada.");
    }

    @Override
    public void acelerar(int incremento) {
      if (isLigado()) {
        System.out.println("Acelerando a moto " + getModelo() + " a " + incremento + "KM/h");
      } else {
        System.out.println("Não é possível acelerar, a moto " + getModelo() + " está desligada.");
      }
    }
  }