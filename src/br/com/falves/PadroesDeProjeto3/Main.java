/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto3;

public class Main {
    public static void main(String[] args) {
        ProdutoObservavel parafuso = new ProdutoObservavel("Parafuso Sextavado", 100d, 1, 38);
        GerenteLoja gerente = new GerenteLoja();
        SistemaReposicao sistema = new SistemaReposicao();

        parafuso.adicionarObservador(gerente);
        parafuso.adicionarObservador(sistema);

        parafuso.retirarDoEstoque(30);

        parafuso.setQuantidadeEmEstoque(100);
        parafuso.removerObservador(gerente);
        parafuso.retirarDoEstoque(97);


    }

}