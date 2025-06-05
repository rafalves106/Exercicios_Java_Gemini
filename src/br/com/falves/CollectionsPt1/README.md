# Exercício 5: Lista de Tarefas da Academia (Coleções - Parte 1)

Este exercício introduz o uso de Coleções em Java, especificamente a classe `ArrayList`, para gerenciar uma lista de objetos personalizados.

**Objetivo:**
Criar um sistema simples para gerenciar uma lista de exercícios de academia, praticando a criação e manipulação de `ArrayLists` contendo objetos.

**Estrutura do Projeto:**

1.  **Classe `ExercicioAcademia`:**
    * Representa um exercício de academia com atributos como `nome` (String) e `series` (int).
    * Possui um construtor para inicializar os atributos.
    * Inclui métodos getters para acessar os atributos.
    * Sobrescreve o método `toString()` para fornecer uma representação textual amigável do objeto (ex: "Supino Reto - 3 séries").

2.  **Classe `TreinoDiario`:**
    * Contém o método `main` onde a lógica de manipulação da lista é executada.
    * **Funcionalidades Implementadas no `main`:**
        * Criação de uma `ArrayList` para armazenar objetos do tipo `ExercicioAcademia`.
        * Adição de múltiplos objetos `ExercicioAcademia` à lista.
        * Impressão de todos os exercícios da lista utilizando um loop `for-each` (aproveitando o método `toString()` da classe `ExercicioAcademia`).
        * Remoção de um exercício da lista pelo seu índice.
        * Verificação da existência de um exercício específico na lista, buscando pelo nome do exercício (ignorando maiúsculas/minúsculas).
        * Impressão do tamanho atual da lista.

**Conceitos Praticados:**
* Uso da classe `java.util.ArrayList`.
* Armazenamento de objetos de classes personalizadas em coleções.
* Adição de elementos (`add()`).
* Remoção de elementos por índice (`remove()`).
* Iteração sobre coleções (loop `for-each`).
* Verificação do tamanho da coleção (`size()`).
* Implementação de uma lógica básica de busca em uma lista.
* Sobrescrita do método `toString()` para melhor representação de objetos.
* Criação de métodos auxiliares para organizar o código (como o método para imprimir a lista).