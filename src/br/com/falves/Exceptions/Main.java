/**
 * @author falvesmac
 */

package br.com.falves.Exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Pessoa p1 = new Pessoa("Rafaela", 30);
            System.out.println(p1);
            Pessoa p2 = new Pessoa("Pedro", 125);
            System.out.println(p2);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao criar pessoa: " + e.getMessage());
        } finally {
            System.out.println("Fim da tentativa de criação. ");
        }
    }

}