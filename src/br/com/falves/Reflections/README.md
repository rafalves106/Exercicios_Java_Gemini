# Exercício 17: Reflection - Lendo Anotações em Tempo de Execução

Este exercício demonstra o poder da **API de Reflection** do Java para inspecionar código em tempo de execução e ler metadados de anotações customizadas.

**Objetivo:**
O objetivo é dar uma utilidade prática para a anotação `@InformacaoMetodo` criada no exercício anterior. Vamos construir um "analisador" que lê uma classe, encontra os métodos que foram anotados e exibe as informações (metadados) contidas na anotação.

---

### Implementação:

O projeto utiliza as classes do exercício anterior e adiciona uma classe analisadora que usa Reflection.

1.  **`@InformacaoMetodo.java` e `Pessoa.java`:**
    * A anotação `@InformacaoMetodo` (com `RetentionPolicy.RUNTIME`) e a classe `Pessoa` (com o método `exibirDetalhes` anotado) são a base deste exercício. Elas servem como o "alvo" da nossa inspeção.

2.  **`AnalisadorDeCodigo.java` (O Inspetor):**
    * Esta classe contém o método `main` e é responsável por realizar a "mágica" da Reflection.
    * **Fluxo de Execução:**
        1.  **Obter a Referência da Classe:** O primeiro passo é obter um objeto do tipo `Class` que representa a estrutura da classe `Pessoa`, usando `Pessoa.class`. Este é o ponto de entrada para a API de Reflection.
        2.  **Listar os Métodos:** O método `classe.getDeclaredMethods()` é chamado para obter um array com todos os métodos declarados na classe `Pessoa`.
        3.  **Iterar e Inspecionar:** Um loop `for-each` percorre cada `Method` encontrado.
        4.  **Verificar a Anotação:** Para cada método, `metodo.isAnnotationPresent(InformacaoMetodo.class)` é usado para verificar se a nossa anotação customizada está presente.
        5.  **Ler os Dados da Anotação:** Se a anotação for encontrada, `metodo.getAnnotation(InformacaoMetodo.class)` é chamado para obter uma instância da anotação. A partir dessa instância, é possível acessar seus elementos como se fossem métodos (ex: `anotacao.autor()`).
        6.  **Exibir o Relatório:** As informações lidas da anotação (autor e versão) são impressas no console, junto com o nome do método ao qual pertencem.

---

### Conceitos Praticados:

* **Reflection API (`java.lang.reflect`):** Uso prático das classes `Class` e `Method`.
* **Introspecção de Código:** A capacidade de um programa examinar a si mesmo em tempo de execução.
* **Processamento de Anotações:** Leitura de metadados de anotações em tempo de execução, que é um dos principais casos de uso para Reflection.
* **`isAnnotationPresent()` e `getAnnotation()`:** Métodos chave para trabalhar com anotações via Reflection.
* **Relação Anotação-Reflection:** Entendimento de que anotações com `@Retention(RetentionPolicy.RUNTIME)` são projetadas para serem acessadas desta forma.
* **Metaprogramação:** Escrita de código que opera sobre outro código.