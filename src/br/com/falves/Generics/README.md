# Exercício 13: Generics - A Caixa Genérica

Este exercício introduz o conceito de **Generics** em Java.

**Objetivo:**
O objetivo é criar uma classe "container" genérica e reutilizável, chamada `Caixa`, que seja capaz de armazenar um objeto de qualquer tipo de forma segura. Este exercício demonstra como os Generics aumentam a segurança de tipos (type safety) e a reutilização de código.

---

### Implementação:

O projeto consiste em duas classes principais (além da classe de dados `Moto` para fins de teste):

1.  **`Caixa<T>.java` (A Classe Genérica):**
    * Esta classe é definida com um parâmetro de tipo `<T>`, o que a torna genérica. `T` atua como um placeholder para um tipo de dado real que será especificado no momento da criação de um objeto `Caixa`.
    * Possui um atributo `private T conteudo;`, cujo tipo é determinado pelo que for passado para `T`.
    * **Métodos Implementados:**
        * `Caixa(T conteudo)`: Um construtor que inicializa a caixa com um objeto do tipo `T`.
        * `getConteudo()`: Retorna o objeto armazenado.
        * `setConteudo(T conteudo)`: Permite alterar o objeto armazenado.
        * `estaVazia()`: Um método que verifica se a caixa contém um objeto ou se está vazia (`null`).

2.  **`Main.java` (A classe de Teste):**
    * Esta classe demonstra a versatilidade e a segurança da classe `Caixa<T>`.
    * **Demonstrações Realizadas:**
        * **Reutilização:** Foram criadas múltiplas instâncias da mesma classe `Caixa`, cada uma especializada para um tipo diferente:
            * `Caixa<String>` para armazenar um texto.
            * `Caixa<Integer>` para armazenar um número.
            * `Caixa<Moto>` para armazenar um objeto complexo.
        * **Type Safety (Segurança de Tipo):** O compilador garante que apenas objetos do tipo especificado possam ser inseridos em cada caixa. Por exemplo, não seria possível adicionar um `Integer` a uma `Caixa<String>`.
        * **Uso dos Métodos:** Todos os métodos da classe `Caixa` foram testados com cada tipo de instância, provando que a lógica funciona de forma idêntica para qualquer tipo de dado.

---

### Conceitos Praticados:

* **Generics:** Definição de uma classe com um parâmetro de tipo (`<T>`).
* **Segurança de Tipo:** Como os Generics evitam a necessidade de `casting` e previnem erros de tipo em tempo de compilação, em vez de em tempo de execução.
* **Reutilização de Código:** Criação de uma única classe que pode ser usada para um número ilimitado de tipos de dados.
* **Instanciação de Tipos Genéricos:** Uso do "operador diamante" (`<>`) para uma sintaxe de instanciação mais limpa.
* **Importância do `toString()`:** A demonstração com `Caixa<Moto>` reforça a utilidade de sobrescrever o método `toString()` em classes de modelo para obter uma saída de dados legível.