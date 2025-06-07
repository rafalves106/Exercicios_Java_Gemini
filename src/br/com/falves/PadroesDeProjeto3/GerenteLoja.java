/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto3;

public class GerenteLoja  implements IObservadorEstoque {

    @Override
    public void notificar(String nomeProduto, int quantidadeAtual) {
        System.out.println("Atenção, Gerente: O estoque do produto " + nomeProduto + " está baixo, com apenas " + quantidadeAtual + " unidades.");
    }
}