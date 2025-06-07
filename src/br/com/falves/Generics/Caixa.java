/**
 * @author falvesmac
 */

package br.com.falves.Generics;

public class Caixa<T> {

    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public boolean estaVazia() {
        if (conteudo == null) {
            return true;
        } else {
            return false;
        }
    }
}