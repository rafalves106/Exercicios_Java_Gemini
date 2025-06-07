package br.com.falves.PadroesDeProjeto3;

public interface IObservadorEstoque {

    void notificar(String nomeProduto, int quantidadeAtual);

}
