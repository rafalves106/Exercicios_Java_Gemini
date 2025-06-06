package br.com.falves.InterfacesHerancas;

public interface IVeiculoMotorizado {
    void ligar();
    void desligar();
    boolean isLigado();
    void acelerar(int incremento);
}
