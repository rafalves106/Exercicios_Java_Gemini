package br.com.falves.PadroesDeProjeto2;

public interface IVeiculoMotorizado {
    void ligar();
    void desligar();
    boolean isLigado();
    void acelerar(int incremento);
}
