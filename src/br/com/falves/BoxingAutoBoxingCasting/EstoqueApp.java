/**
 * @author falvesmac
 */

package br.com.falves.BoxingAutoBoxingCasting;

public class EstoqueApp {
    public static void main(String[] args) {

        // Autoboxing
        Produto prod = new Produto("Prato", 25d, 1, 20);

        // Unboxing
        double valorTotalItem = prod.getPreco() * prod.getQuantidadeEmEstoque();
        System.out.println(valorTotalItem);

        // Parsing
        Produto prod2 = new Produto();
        prod2.setNome("Faca");
        prod2.setPreco(10d);
        prod2.setCodigo(2);
        String quantEmString = "25";
        int quantEmInt = Integer.parseInt(quantEmString);
        prod2.setQuantidadeEmEstoque(quantEmInt);
        System.out.println(prod2.getQuantidadeEmEstoque());

        // Casting
        Long codEmLong = (long) prod2.getCodigo();
        System.out.println(codEmLong);
    }
}