/**
 * @author falvesmac
 */

package br.com.falves.Reflections;

import br.com.falves.Exceptions.IdadeInvalidaException;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("A idade informada é inválida. ");
        } else {
            this.idade = idade;
            this.nome = nome;
        }
    }

    @InformacaoMetodo(autor = "Falves", versao = "1.1")
    public void exibirDetalhes() {
        System.out.println("<-------- Sobre a pessoa -------->");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
    }
}