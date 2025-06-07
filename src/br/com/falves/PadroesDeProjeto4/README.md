# Exercício 12: Padrão de Projeto - Strategy

Este exercício implementa o padrão de projeto comportamental **Strategy** (Estratégia).

**Objetivo:**
O objetivo é definir uma família de algoritmos, encapsular cada um deles em uma classe separada e permitir que eles sejam trocados dinamicamente em tempo de execução. Isso permite que o comportamento de uma classe (o "Contexto") seja alterado sem modificar seu próprio código, apenas trocando a "estratégia" que ela utiliza.

O cenário prático deste projeto é um serviço de cálculo de frete, onde o método de cálculo pode variar (ex: Normal, Expresso, Sedex).

---

### Estrutura e Papéis do Padrão:

O projeto foi dividido em classes que representam os papéis clássicos do padrão Strategy:

1.  **`CalculoFreteStrategy` (A Interface `Strategy`):**
    * Define o contrato comum que todas as estratégias de cálculo de frete devem seguir.
    * Contém um único método, `calcularPeso(double pesoKg)`, que representa a operação do algoritmo.

2.  **`FreteNormal`, `FreteExpresso`, `FreteSedex` (As `Concrete Strategies`):**
    * São as implementações concretas dos diferentes algoritmos de frete.
    * Cada classe implementa a interface `CalculoFreteStrategy` e fornece a lógica de cálculo específica para aquele tipo de frete.

3.  **`ServicoDeFrete` (O `Context`):**
    * Esta é a classe que precisa realizar o cálculo, mas não quer estar acoplada a uma lógica de cálculo específica.
    * **Responsabilidades:**
        * Mantém uma referência a um objeto do tipo `CalculoFreteStrategy`.
        * Possui um método `setEstrategia()` que permite ao cliente (o `main`) injetar ou trocar a estratégia de cálculo a qualquer momento.
        * Possui um método `calcularFrete()` que, em vez de fazer o cálculo, **delega** a chamada para o objeto de estratégia que está configurado no momento.

4.  **`Main` (O Cliente):**
    * Orquestra o cenário de uso do padrão.
    * **Fluxo de Execução:**
        1.  Cria uma única instância do `ServicoDeFrete`.
        2.  Cria instâncias das diferentes estratégias (`FreteNormal`, `FreteExpresso`, etc.).
        3.  Configura o `ServicoDeFrete` com uma estratégia inicial usando `setEstrategia()` e calcula o frete.
        4.  **Troca a estratégia** no mesmo objeto `ServicoDeFrete` (chamando `setEstrategia()` novamente com outro objeto) e recalcula o frete, demonstrando a mudança de comportamento em tempo de execução.

---

### Benefícios Demonstrados:

* **Algoritmos Intercambiáveis:** O comportamento do `ServicoDeFrete` pode ser alterado dinamicamente.
* **Princípio Aberto/Fechado:** É possível adicionar novas estratégias de frete (novas classes) sem modificar a classe `ServicoDeFrete`.
* **Desacoplamento:** O `ServicoDeFrete` não conhece os detalhes de implementação das estratégias concretas. Ele só conhece o contrato (a interface).
* **Eliminação de Condicionais:** Evita o uso de grandes blocos `if-else` ou `switch` dentro da classe de contexto para selecionar o algoritmo.

### Conceitos Praticados:

* **Padrão de Projeto Strategy.**
* **Encapsulamento de Algoritmos:** Cada lógica de cálculo está isolada em sua própria classe.
* **Composição e Delegação:** O `ServicoDeFrete` é composto por uma estratégia e delega a ela a responsabilidade do cálculo.
* **Programação Orientada a Interfaces:** A interação entre o contexto e as estratégias é feita através de uma interface comum.
* **Alteração de Comportamento em Tempo de Execução.**