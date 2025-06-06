/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto1;

public class Main {
  public static void main(String[] args) {

    System.out.println("------ Obtendo Informações ------");
    ConfiguracoesApp config1 = ConfiguracoesApp.getInstancia();
    System.out.println("Nome do app: " + config1.getNomeApp());
    System.out.println("Versão do app: " + config1.getVersaoApp());
    System.out.println("Modo Debug: " + config1.isModoDebug());

    System.out.println("------ Obtendo Informações Config 2 ------");
    ConfiguracoesApp config2 = ConfiguracoesApp.getInstancia();
    System.out.println("Nome do app: " + config2.getNomeApp());
    System.out.println("Versão do app: " + config2.getVersaoApp());
    System.out.println("Modo Debug: " + config2.isModoDebug());


    System.out.println("Verificando se as instâncias são iguais. ");
    if (config1 == config2 ) {
      System.out.println("Iguais. ");
    } else {
      System.out.println("Diferentes. ");
    }
  }
}