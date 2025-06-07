 /**

  * @author falvesmac

  */

package br.com.falves.PadroesDeProjeto2;

 public abstract class VeiculoBase implements IVeiculoMotorizado {
    private String marca, modelo;
    private boolean ligado;

    public VeiculoBase(String marca, String modelo) {
      this.marca = marca;
      this.modelo = modelo;
      this.ligado = false;
    }

    @Override
    public void ligar() {
      if (!this.ligado) {
        this.ligado = true;
        System.out.println(this.modelo + " está ligando! ");
      } else {
        System.out.println(this.modelo + " já estava ligado! ");
      }
    }

    @Override
    public void desligar() {
      if (this.ligado) {
        this.ligado = false;
        System.out.println(this.modelo + " está desligando! ");
      } else {
        System.out.println(this.modelo + " já estava desligado!");
      }
    }

    public boolean isLigado() {
      return this.ligado;
    }

    @Override
    public abstract void acelerar(int incremento);

    public String getModelo() { return modelo; }

    public String getMarca() { return marca; }
  }