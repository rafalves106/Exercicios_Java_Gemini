# Exercício 16: Annotations - Criando uma Anotação Customizada

Este exercício introduz a criação de **Annotations** (Anotações) customizadas em Java.

**Objetivo:**
O objetivo é aprender a sintaxe e a estrutura para definir uma anotação própria. Anotações são uma forma de adicionar metadados (informações sobre o código) ao próprio código. Elas não alteram a lógica de execução diretamente, mas podem ser lidas em tempo de compilação ou execução por outras ferramentas ou pelo próprio programa para realizar ações específicas.

---

### Implementação:

O projeto consiste na criação de uma anotação e sua posterior aplicação em uma classe existente.

1.  **`@InformacaoMetodo.java` (A Definição da Anotação):**
    * Foi criada uma nova anotação usando a palavra-chave `@interface`.
    * **Elementos:** Foram definidos dois "elementos" para a anotação, que funcionam como seus atributos:
        * `String autor()`: Para identificar o autor do método.
        * `String versao()`: Para identificar a versão do método.
        * Ambos possuem um valor `default`, tornando seu preenchimento opcional ao usar a anotação.
    * **Meta-Anotações:** A definição da anotação foi, ela mesma, "anotada" com meta-anotações que configuram seu comportamento:
        * `@Retention(RetentionPolicy.RUNTIME)`: Garante que a anotação e seus valores fiquem disponíveis para serem lidos enquanto o programa está em execução (essencial para o próximo tópico, *Reflection*).
        * `@Target(ElementType.METHOD)`: Restringe o uso desta anotação para que ela só possa ser aplicada em métodos.

2.  **`Pessoa.java` (A Aplicação da Anotação):**
    * A anotação recém-criada, `@InformacaoMetodo`, foi aplicada a um método (`exibirDetalhes`) dentro da classe `Pessoa`.
    * Foi demonstrado como fornecer valores específicos para os elementos da anotação: `@InformacaoMetodo(autor = "Falves", versao = "1.1")`.

---

### Observação Importante:

Este exercício cobre apenas a **criação e a aplicação** da anotação. Neste ponto, ela funciona apenas como uma "etiqueta" informativa no código, sem qualquer impacto funcional. A leitura e o processamento desses metadados em tempo de execução serão o foco do próximo tópico: **Reflection**.

### Conceitos Praticados:

* **Criação de Anotações Customizadas (`@interface`).**
* **Definição de Elementos** e valores `default`.
* **Uso de Meta-Anotações** (`@Retention`, `@Target`).
* **Políticas de Retenção (`RetentionPolicy`):** Entendimento do `RUNTIME`.
* **Tipos de Alvo (`ElementType`):** Entendimento do `METHOD`.
* **Aplicação de Anotações** em código-fonte.