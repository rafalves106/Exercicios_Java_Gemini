# Exercício 15: Exceptions - Validação com Exceção Customizada

Este exercício foca em um dos pilares de um software robusto: o **tratamento de exceções (`Exceptions`)**, com ênfase na criação de exceções customizadas para regras de negócio específicas.

**Objetivo:**
O objetivo é aprender a criar e utilizar uma exceção personalizada (`custom exception`) para sinalizar erros de validação de forma clara e explícita, em vez de retornar valores como `null` ou códigos de erro. A aplicação demonstra o fluxo completo: criar, lançar (`throw`) e capturar (`try-catch`) uma exceção.

---

### Implementação:

O projeto está estruturado em três classes para demonstrar o conceito:

1.  **`IdadeInvalidaException.java` (A Exceção Customizada):**
    * Uma classe que herda de `java.lang.Exception`, tornando-a uma "checked exception" (uma exceção que o compilador obriga o desenvolvedor a tratar).
    * Possui um construtor que aceita uma mensagem de erro (`String`) e a repassa para a superclasse (`super(message)`), permitindo que a causa do erro seja detalhada.

2.  **`Pessoa.java` (A Classe que Lança a Exceção):**
    * Esta classe representa uma entidade de negócio com uma regra específica: a idade deve estar em um intervalo válido (ex: entre 0 e 120 anos).
    * O construtor da classe é o responsável por validar essa regra.
    * **Lançando a Exceção:** Se a idade fornecida for inválida, o construtor utiliza a palavra-chave `throw new IdadeInvalidaException(...)` para interromper a criação do objeto e sinalizar o erro.
    * **Declarando a Exceção:** A assinatura do construtor inclui a cláusula `throws IdadeInvalidaException`, informando a qualquer código que o chame que ele precisa estar preparado para lidar com essa exceção.

3.  **`Main.java` (A Classe que Trata a Exceção):**
    * Demonstra o tratamento seguro e controlado de exceções usando um bloco `try-catch-finally`.
    * **Bloco `try`:** O código "perigoso" – a tentativa de criar objetos `Pessoa` – é colocado aqui.
    * **Bloco `catch`:** Captura especificamente a `IdadeInvalidaException`. Se a exceção for lançada dentro do `try`, o fluxo do programa salta para este bloco, onde o erro é tratado (neste caso, imprimindo a mensagem da exceção) em vez de fazer o programa quebrar.
    * **Bloco `finally`:** Contém código que é executado **sempre**, independentemente de uma exceção ter ocorrido ou não. É ideal para tarefas de "limpeza".

---

### Conceitos Praticados:

* **Gerenciamento de Exceções:** Utilização da estrutura `try-catch-finally` para criar um código resiliente a erros.
* **Exceções Customizadas:** Criação de classes de exceção próprias para representar erros específicos do domínio da aplicação.
* **`throw` vs. `throws`:** A diferença entre a ação de lançar uma exceção (`throw`) e a declaração de que um método é capaz de lançá-la (`throws`).
* **Checked vs. Unchecked Exceptions:** Entendimento prático de uma "checked exception" (que herda de `Exception`) e a obrigatoriedade de seu tratamento.
* **Fluxo de Controle de Exceções:** Observação de como uma exceção interrompe o fluxo normal de um bloco `try` e transfere o controle para o bloco `catch` apropriado.