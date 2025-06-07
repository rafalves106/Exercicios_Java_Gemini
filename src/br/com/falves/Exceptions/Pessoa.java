/**
 * @author falvesmac
 */

package br.com.falves.Exceptions;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException{
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("A idade informada é inválida. ");
        } else {
            this.idade = idade;
            this.nome = nome;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}