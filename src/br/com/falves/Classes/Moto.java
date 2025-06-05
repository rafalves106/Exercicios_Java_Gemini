/**
 * @author falvesmac
 */

package br.com.falves.Classes;

public class Moto {

  // Atributos da moto
  private String marca, modelo, cor;
  private int cilindradas;
  private boolean ligada;

  // Getters e Setters
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public boolean isLigada() {
    return ligada;
  }

  // Constructor da moto com parâmetros
  public Moto(String marca, String modelo, int cilindradas, String cor) {
    this.marca = marca;
    this.modelo = modelo;
    this.cilindradas = cilindradas;
    this.cor = cor;
    this.ligada = false;
  }

  // Constructor limpo
  public Moto() {}

  // Method que verifica se a moto está ligada e liga a moto
  public void ligar() {
    if (this.ligada) {
      System.out.println("A " + getModelo() + " já está ligada. ");
    } else {
      System.out.println("Ligando a " + getModelo());
      this.ligada = true;
    }
  }

  // Method que verifica se a moto está ligada e desliga a moto
  public void desligar() {
    if (!this.ligada) {
      System.out.println("----------------");
      System.out.println("A " + getModelo() + " já está desligada. ");
    } else {
      System.out.println("----------------");
      System.out.println("Desligando a " + getModelo());
      this.ligada = false;
    }
  }

  // Method que exibe os detalhes da moto
  public void exibirDetalhes() {
    System.out.println("----------------");
    System.out.println("Destalhes do modelo: ");
    System.out.println("Marca - " + getMarca());
    System.out.println("Modelo - " + getModelo());
    System.out.println("Cilindradas - " + getCilindradas());
    System.out.println("Cor - " + getCor());
    if (isLigada()) {
      System.out.println("A moto está ligada. ");
    } else {
      System.out.println("A moto está desligada. ");
    }
    System.out.println("----------------");
  }

}