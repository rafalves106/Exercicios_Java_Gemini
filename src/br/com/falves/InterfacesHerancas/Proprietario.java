/**
 * @author falvesmac
 */

package br.com.falves.InterfacesHerancas;

public class Proprietario {
    private String nome, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Proprietario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
}