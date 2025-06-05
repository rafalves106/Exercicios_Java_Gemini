/**
 * @author falvesmac
 */

package br.com.falves.BoxingAutoBoxingCasting;

public class Produto {
    private Double preco;
    private Integer codigo, quantidadeEmEstoque;
    private String nome;

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

    public Produto(String nome, Double preco, Integer codigo, Integer quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto() {};
}