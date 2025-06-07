# Exercício 10: Padrão de Projeto - Simple Factory

Este exercício foca na implementação do padrão de criação **Simple Factory**.

**Objetivo:**
O objetivo é desacoplar o código "cliente" (que precisa de um objeto) do código de "criação" (a lógica do `new` e a escolha de qual classe concreta instanciar). Com o Simple Factory, centralizamos toda a lógica de criação de objetos de uma mesma família em um único lugar.

---

### Implementação:

O projeto reutiliza a hierarquia de classes do Exercício 7 (`VeiculoBase`, `Moto`, `Carro`) e introduz uma classe "fábrica" para gerenciá-las.

1.  **`VeiculoFactory.java` (A Fábrica):**
    * Esta é a classe central do padrão. Ela tem a única responsabilidade de criar objetos do tipo `VeiculoBase`.
    * **Método Estático `criarVeiculo(String tipo, ...)`:**
        * É o coração da fábrica. Este método público e estático é o único ponto de contato para o código cliente que deseja criar um veículo.
        * Ele recebe uma `String` que identifica o tipo de objeto desejado (ex: "moto", "carro").
        * Internamente, uma lógica condicional (`if-else if`) verifica o tipo solicitado e executa o `new` correspondente (`new Moto(...)` ou `new Carro(...)`).
        * Toda a complexidade da instanciação fica escondida dentro da fábrica.

2.  **Classes de Produto (`Moto.java`, `Carro.java`):**
    * São as classes concretas que herdam de `VeiculoBase` e que serão instanciadas pela fábrica. O código cliente não precisa mais interagir diretamente com elas para a criação.

3.  **`Main.java` (O Cliente):**
    * Atua como o "cliente" da fábrica.
    * Para obter um novo veículo, em vez de chamar `new Moto()`, ele simplesmente chama `VeiculoFactory.criarVeiculo("moto")`.
    * Os objetos retornados pela fábrica são armazenados em variáveis do tipo abstrato `VeiculoBase`, demonstrando o polimorfismo.
    * O `Main` testa os objetos recebidos chamando seus métodos (`ligar`, `acelerar`) para confirmar que a fábrica entregou os produtos corretos e funcionais.

---

### Benefícios Demonstrados:

* **Desacoplamento:** O código `Main` não precisa saber que as classes `Moto` e `Carro` existem. Ele só precisa conhecer a fábrica e o tipo abstrato `VeiculoBase`. Se uma nova classe `Caminhao` for criada, o `Main` não precisa ser alterado; apenas a fábrica é atualizada.
* **Centralização:** Toda a lógica de criação está em um único lugar. Isso facilita a manutenção e evita que a lógica de instanciação se espalhe por todo o código.

### Conceitos Praticados:

* **Padrão de Projeto Simple Factory.**
* **Desacoplamento e Coesão:** Separando a responsabilidade de criação da de utilização.
* **Polimorfismo:** Manipulando objetos `Moto` e `Carro` através da referência da superclasse `VeiculoBase`.
* **Métodos Estáticos (`static`):** Criação de um método de fábrica que pode ser chamado sem instanciar a classe `VeiculoFactory`.
* **Reutilização de Código:** Aproveitando a estrutura de classes de um exercício anterior.