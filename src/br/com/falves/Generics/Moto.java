/**
 * @author falvesmac
 */

package br.com.falves.Generics;

public class Moto {

  // Atributos da moto
  private String marca, modelo, cor;
  private int cilindradas, nivelOleo;
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

  public int getNivelOleo() { return nivelOleo; }

  public void setNivelOleo(int nivelOleo) { this.nivelOleo = nivelOleo; }

  // Constructor da moto com parâmetros
  public Moto(String marca, String modelo, int cilindradas, String cor) {
    this.marca = marca;
    this.modelo = modelo;
    this.cilindradas = cilindradas;
    this.cor = cor;
    this.ligada = false;
    this.nivelOleo = 80;
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
    System.out.println("Nível de óleo - " + getNivelOleo() + "%");
    System.out.println("----------------");
  }

  public void verificarNivelOleo() {
    if (getNivelOleo() >= 20 && getNivelOleo() <= 70) {
      System.out.println("Nível de óleo aceitável. ");
    } else if (getNivelOleo() < 20) {
      System.out.println("ALERTA: Nível de óleo baixo! ");
    } else if (getNivelOleo() > 70) {
      System.out.println("Nível de óleo ótimo. ");
    }
  }

  public void simularUso(int kmRodados) {
    if (kmRodados < 0) {
      System.out.println("Quilometragem rodada não pode ser negativa.");
      return;
    }

    int reducoesDoOleo = kmRodados / 100;
    int totalReducao = reducoesDoOleo * 5;

    this.nivelOleo -= totalReducao;
    if (this.nivelOleo < 0){
      nivelOleo = 0;
    }
    System.out.println("Nível do óleo: " + getNivelOleo() + " Após rodar: " + kmRodados + "Kms");
  }

  @Override
  public String toString() {
    return marca + " " + modelo + " " + cilindradas + " " + cor + " .";
  }
}