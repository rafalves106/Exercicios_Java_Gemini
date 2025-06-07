/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto3;

import java.util.ArrayList;
import java.util.List;

public class ProdutoObservavel {
    private Double preco;
    private Integer codigo, quantidadeEmEstoque;
    private String nome;

    private List<IObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(IObservadorEstoque obs){
        observadores.add(obs);
    }

    public void removerObservador(IObservadorEstoque obs) {
        observadores.remove(obs);
    }

    public void notificarObservador(){
        for (IObservadorEstoque obs : observadores) {
            obs.notificar(getNome(), getQuantidadeEmEstoque());
        }
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoObservavel(String nome, Double preco, Integer codigo, Integer quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void retirarDoEstoque(int quantidadeRetirada) {
        quantidadeEmEstoque = quantidadeEmEstoque - quantidadeRetirada;

        if (quantidadeEmEstoque < 10) {
            notificarObservador();
        }
    }

}