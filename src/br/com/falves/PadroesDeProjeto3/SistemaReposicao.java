/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto3;

public class SistemaReposicao implements IObservadorEstoque{

    @Override
    public void notificar(String nomeProduto, int quantidadeAtual) {
        System.out.println("SISTEMA: Disparando ordem de reposição para o produto " + nomeProduto + ".");
    }
}