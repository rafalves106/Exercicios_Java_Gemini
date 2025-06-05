/**
 * @author falvesmac
 */

package br.com.falves.ColectionsPt1;

public class ExercicioAcademia {
  private String nome;
  private int series;

  public ExercicioAcademia(String nome, int series) {
    this.nome = nome;
    this.series = series;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getSeries() {
    return series;
  }

  public void setSeries(int series) {
    this.series = series;
  }

  @Override
  public String toString() {
    return nome + " " + series + " séries";
  }
}