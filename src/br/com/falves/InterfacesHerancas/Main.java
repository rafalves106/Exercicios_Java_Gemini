/**
 * @author falvesmac
 */

package br.com.falves.InterfacesHerancas;

public class Main {
  public static void main(String[] args) {

    Proprietario prop1 = new Proprietario("123.456.789-00", "Falves");

    VeiculoBase moto1 = new Moto("Yamaha", "XTZ 250", prop1);
    VeiculoBase carro1 = new Carro("Nissan", "Eclipse", prop1);

    System.out.println("<---- Testando a MotoHonda ---->");
    moto1.ligar();
    moto1.acelerar(60);
    moto1.desligar();
    moto1.acelerar(60);

    System.out.println("<---- Testando o CarroHonda ---->");
    carro1.ligar();
    carro1.acelerar(180);
    carro1.desligar();
    carro1.acelerar(180);
  }
}