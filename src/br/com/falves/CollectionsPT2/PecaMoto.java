/**
 * @author falvesmac
 */

package br.com.falves.CollectionsPT2;

import java.util.Objects;

public class PecaMoto {
    private String nome, codigo;
    private double preco;

    public PecaMoto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PecaMoto pecaMoto = (PecaMoto) o;
        return Double.compare(preco, pecaMoto.preco) == 0 && Objects.equals(nome, pecaMoto.nome) && Objects.equals(codigo, pecaMoto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo, preco);
    }
}