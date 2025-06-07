/**
 * @author falvesmac
 */

package br.com.falves.Generics;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Honda", "CBR 600RR", 600, "Preta");
        Moto moto2 = new Moto("Yamaha", "YZF R6", 600, "Prata");

        Caixa<String> caixaDeTexto = new Caixa<>("Teste");
        Caixa<Integer> caixaDeNum = new Caixa<>(100);
        Caixa<Moto> caixaDeMoto = new Caixa<>(moto1);

        System.out.println("------ Verificando a Caixa de Texto ------");
        System.out.println("Conteúdo da caixa de texto: " + caixaDeTexto.getConteudo());
        System.out.println("------ Verificando se a caixa está vazia ------");
        System.out.println("A caixa de texto está vazia? " + caixaDeTexto.estaVazia());
        System.out.println("------ Alterando conteúdo da caixa de texto ------");
        caixaDeTexto.setConteudo("Teste 2");
        System.out.println("Conteúdo da caixa de texto: " + caixaDeTexto.getConteudo());
        System.out.println("---------------------------------");

        System.out.println("------ Verificando a Caixa de Números ------");
        System.out.println("Conteúdo da caixa de números: " + caixaDeNum.getConteudo());
        System.out.println("------ Verificando se a caixa está vazia ------");
        System.out.println("A caixa de números está vazia? " + caixaDeNum.estaVazia());
        System.out.println("------ Alterando conteúdo da caixa de números ------");
        caixaDeNum.setConteudo(50);
        System.out.println("Conteúdo da caixa de números: " + caixaDeNum.getConteudo());
        System.out.println("---------------------------------");

        System.out.println("------ Verificando a Caixa de Motos ------");
        System.out.println("Conteúdo da caixa de motos: " + caixaDeMoto.getConteudo());
        System.out.println("------ Verificando se a caixa está vazia ------");
        System.out.println("A caixa de motos está vazia? " + caixaDeMoto.estaVazia());
        System.out.println("------ Alterando conteúdo da caixa de Motos ------");
        caixaDeMoto.setConteudo(moto2);
        System.out.println("Conteúdo da caixa de motos: " + caixaDeMoto.getConteudo());
        System.out.println("---------------------------------");

    }

}