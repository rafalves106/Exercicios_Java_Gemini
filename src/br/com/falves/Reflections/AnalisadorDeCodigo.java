/**
 * @author falvesmac
 */

package br.com.falves.Reflections;

import java.lang.reflect.Method;

public class AnalisadorDeCodigo {
    public static void main(String[] args) {
        Class<?> classePessoa = Pessoa.class;

        Method[] metodos = classePessoa.getDeclaredMethods();

        for (Method met : metodos) {
            if (met.isAnnotationPresent(InformacaoMetodo.class)) {
                System.out.println("A anotação foi encontrada, veja seus valores: ");
                InformacaoMetodo anotacao = met.getAnnotation(InformacaoMetodo.class);
                String autor = anotacao.autor();
                String versao = anotacao.versao();
                System.out.println("Autor: " + autor);
                System.out.println("Versão: " + versao);
                System.out.println("----------------------");
            }
        }

        System.out.println("Análise concluída. ");
    }

}