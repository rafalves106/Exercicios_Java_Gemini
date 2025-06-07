/**
 * @author falvesmac
 */

package br.com.falves.Generics2;

import java.util.List;

public class UtilitariosLista {

  public static <E> void imprimirLista(List<E> lista) {
    for (E listas : lista) {
      System.out.println(listas);
    }
  }

}