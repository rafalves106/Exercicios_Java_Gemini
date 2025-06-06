 /**

  * @author falvesmac

  */

package br.com.falves.InterfacesHerancas;

  public class Motor {
    private int cilindradas, potencia;

    public int getCilindradas() {
      return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
      this.cilindradas = cilindradas;
    }

    public int getPotencia() {
      return potencia;
    }

    public void setPotencia(int potencia) {
      this.potencia = potencia;
    }

    public Motor(int potencia, int cilindradas) {
      this.potencia = potencia;
      this.cilindradas = cilindradas;
    }
  }