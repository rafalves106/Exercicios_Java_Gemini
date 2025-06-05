/**
 * @author falvesmac
 */

package br.com.falves.CollectionsPT2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CatalogoPecas {
  public static void main(String[] args) {
    PecaMoto embreagem = new PecaMoto("Embreagem", "A00B01", 1400d);
    PecaMoto kitTrocaDeOleo = new PecaMoto("Kit Troca de Óleo", "A00B02", 450d);
    PecaMoto retrovisorD = new PecaMoto("Retrovisor Direito", "A00B03", 150d);
    PecaMoto retrovisorE = new PecaMoto("Retrovisor Esquerdo", "A00B04", 150d);
    PecaMoto tampaTanque = new PecaMoto("Tampa do Tanque", "A00B05", 40d);

    Map<String, PecaMoto> catalogo = new HashMap<>();
    catalogo.put(embreagem.getCodigo(), embreagem);
    catalogo.put(kitTrocaDeOleo.getCodigo(), kitTrocaDeOleo);
    catalogo.put(retrovisorD.getCodigo(), retrovisorD);
    catalogo.put(retrovisorE.getCodigo(), retrovisorE);
    catalogo.put(tampaTanque.getCodigo(), tampaTanque);

    // Procurar peça no catálogo
    System.out.println("--- Buscando Peça no Catálogo ---");
    String codigoDigitado = "A00B01";
    PecaMoto pecaEncontrada = catalogo.get(codigoDigitado);

    if (pecaEncontrada == null) {
      System.out.println("Peça com código '" + codigoDigitado + "' não encontrada.");
    } else {
      System.out.println("Peça encontrada: " + pecaEncontrada);
    }

    // Imprimir todos os itens do catálogo
    System.out.println("\n--- Itens no Catálogo (Formatado) ---");
    for (Map.Entry<String, PecaMoto> entrada : catalogo.entrySet()) {
      String codigo = entrada.getKey();
      PecaMoto peca = entrada.getValue();
      System.out.println("Código: " + codigo + " -> " + peca);
    }

    // Utilizando HashSet para guardar nomes das peças
    System.out.println("\n--- Nomes Únicos de Peças (Usando HashSet) ---");
    HashSet<String> nomesUnicos = new HashSet<>();

    for (PecaMoto peca : catalogo.values()) {
      nomesUnicos.add(peca.getNome());
    }

    System.out.println(nomesUnicos);

  }
}