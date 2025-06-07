/**
 * @author falvesmac
 */

package br.com.falves.Generics2;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Pedro");
    nomes.add("Thiago");
    nomes.add("Carlos");

    List<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(50);
    nums.add(180);

    List<Double> numsD = new ArrayList<>();
    numsD.add(20d);
    numsD.add(5d);
    numsD.add(200d);

    List<PecaMoto> pecas = new ArrayList<>();
    PecaMoto radiador = new PecaMoto("Radiador", "1", 100);
    PecaMoto retrovisorD = new PecaMoto("Retrovisor Direito", "2", 180);
    PecaMoto retrovisorE = new PecaMoto("Retrovisor Esquerdo", "3", 180);
    pecas.add(radiador);
    pecas.add(retrovisorE);
    pecas.add(retrovisorD);

    System.out.println("------ Imprimindo a lista de nomes: -------");
    UtilitariosLista.imprimirLista(nomes);

    System.out.println("------ Imprimindo a lista de números: -------");
    UtilitariosLista.imprimirLista(nums);

    System.out.println("------ Imprimindo a lista de doubles: -------");
    UtilitariosLista.imprimirLista(numsD);

    System.out.println("------ Imprimindo a lista de peças: -------");
    UtilitariosLista.imprimirLista(pecas);
  }

}