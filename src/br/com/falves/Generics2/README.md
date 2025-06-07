# Exercício 14: Métodos Genéricos

Este exercício expande o conhecimento sobre Generics em Java, focando na criação e utilização de **Métodos Genéricos**.

**Objetivo:**
O objetivo é entender como criar um método que possa operar com diferentes tipos de dados sem que a classe que o contém precise ser genérica. Isso é especialmente útil para criar métodos de utilidade estáticos e reutilizáveis.

---

### Implementação:

O projeto consiste em duas classes principais, além da classe de dados `PecaMoto` usada para o teste.

1.  **`UtilitariosLista.java` (A Classe de Utilidade):**
    * Esta é uma classe comum, não genérica.
    * Seu propósito é agrupar métodos de utilidade que operam sobre listas.

2.  **O Método Genérico `imprimirLista`:**
    * A funcionalidade principal está no método `public static <E> void imprimirLista(List<E> lista)`.
    * **`<E>`:** A declaração do parâmetro de tipo `<E>` (de "Elemento") **antes** do tipo de retorno `void` é o que o caracteriza como um método genérico. O tipo `E` é inferido pelo compilador com base no argumento passado na chamada do método.
    * **`List<E> lista`:** O método é projetado para aceitar uma `List` de qualquer tipo de elemento.
    * **Lógica:** O método itera sobre a lista recebida usando um loop `for-each` e imprime cada elemento no console.

3.  **`Main.java` (A Classe de Teste):**
    * Demonstra o poder e a flexibilidade do método genérico.
    * **Demonstrações Realizadas:**
        * Foram criadas quatro listas diferentes, cada uma com um tipo de dado distinto: `List<String>`, `List<Integer>`, `List<Double>` e `List<PecaMoto>`.
        * O **mesmo método estático** `UtilitariosLista.imprimirLista()` foi chamado para cada uma das listas.
        * O resultado prova que um único método foi capaz de processar e imprimir corretamente todos os tipos de listas, sem a necessidade de sobrecarga de métodos (um `imprimirListaDeStrings`, outro `imprimirListaDeInteiros`, etc.).

---

### Conceitos Praticados:

* **Métodos Genéricos:** Definição de métodos com seus próprios parâmetros de tipo, independentes da classe.
* **Métodos Utilitários Estáticos:** Criação de funções `static` que podem ser chamadas diretamente pela classe, sem a necessidade de criar uma instância.
* **Reutilização de Código:** Evitar a duplicação de código criando um método que se adapta a múltiplos tipos de dados.
* **Inferência de Tipo:** O compilador Java infere automaticamente o tipo `E` em cada chamada do método, tornando o código mais limpo.
* **Programação Orientada a Interfaces:** O método aceita qualquer implementação da interface `List` (neste caso, `ArrayList`).
* **Importância do `toString()`:** A impressão da `List<PecaMoto>` funciona de forma legível graças à sobrescrita do método `toString()` na classe `PecaMoto`, uma prática essencial ao trabalhar com Generics e coleções.