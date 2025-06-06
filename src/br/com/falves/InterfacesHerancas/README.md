# Exercício 7: Sistema de Veículos (Interfaces, Herança e Composição)

Este exercício é um projeto mais aprofundado que visa aplicar e conectar vários conceitos fundamentais de Programação Orientada a Objetos (POO) para criar uma hierarquia de classes de veículos.

**Objetivo:**
Praticar e diferenciar os conceitos de:
* Interfaces
* Classes Abstratas
* Herança
* Polimorfismo
* Composição
* Agregação

**Estrutura do Projeto:**

1.  **Interface `IVeiculoMotorizado`:**
    * Define um "contrato" que todo veículo motorizado deve seguir.
    * Especifica os métodos de ação `ligar()`, `desligar()`, `acelerar()` e o método de consulta `isLigado()`.

2.  **Classe Abstrata `VeiculoBase`:**
    * Serve como um modelo base para todos os veículos, implementando a interface `IVeiculoMotorizado`.
    * Contém atributos e comportamentos comuns (marca, modelo, estado `ligado`).
    * Fornece uma implementação padrão para `ligar()`, `desligar()` e `isLigado()`.
    * Deixa o método `acelerar()` como `abstract`, forçando as subclasses a definirem seu próprio comportamento de aceleração.

3.  **Classes Concretas `Moto` e `Carro`:**
    * Herdeiras da `VeiculoBase`, representam tipos específicos de veículos.
    * Fornecem uma implementação concreta e específica para o método `acelerar()`.

4.  **Relações entre Objetos:**
    * **Composição:** As classes `Moto` e `Carro` "possuem um" `Motor`. O objeto `Motor` é instanciado *dentro* do construtor do veículo, significando que o ciclo de vida do motor está atrelado ao do veículo.
    * **Agregação:** As classes `Moto` e `Carro` "têm um" `Proprietario`. O objeto `Proprietario` é criado *fora* e passado como parâmetro para o construtor do veículo, significando que o proprietário pode existir independentemente do veículo.

5.  **Classe `Main`:**
    * Serve como ponto de entrada para testar a aplicação.
    * Demonstra a criação de objetos, a agregação (criando o `Proprietario` primeiro) e o polimorfismo ao testar o comportamento dos diferentes veículos.

**Conceitos Praticados:**
* **Interface:** Definição de um contrato de comportamento.
* **Classe Abstrata:** Criação de um modelo base com implementações parciais.
* **Herança:** Reutilização e extensão de código (`extends`).
* **Polimorfismo:** Tratar objetos `Moto` e `Carro` como instâncias de `VeiculoBase`.
* **Composição:** Relação de posse forte entre objetos.
* **Agregação:** Relação de "conhecimento" fraca entre objetos.
* **Encapsulamento:** Proteção de atributos com o modificador `private`.
* **Sobrescrita de Métodos (`@Override`)**: Especialização de comportamento nas subclasses.
* **Chamada ao Construtor Pai (`super()`)**: Inicialização da parte herdada do objeto.