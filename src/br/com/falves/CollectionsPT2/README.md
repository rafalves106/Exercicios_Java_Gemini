# Exercício 6: Catálogo de Peças de Moto (Coleções - Parte 2)

Este exercício avança no estudo de Coleções em Java, focando na utilização de `HashMap` para armazenamento de dados no formato chave-valor e `HashSet` para garantir a unicidade de elementos.

**Objetivo:**
Desenvolver um sistema de catálogo de peças de moto para praticar a manipulação de `HashMap` e `HashSet`, entendendo suas principais diferenças e casos de uso.

**Estrutura do Projeto:**

1.  **Classe `PecaMoto`:**
    * Um objeto de modelo (POJO) que representa uma peça de moto.
    * Atributos: `codigo` (String), `nome` (String) e `preco` (double).
    * Possui um construtor para inicializar os atributos e métodos getters para acessá-los.
    * O método `toString()` foi sobrescrito para facilitar a impressão dos detalhes da peça.

2.  **Classe `CatalogoPecas`:**
    * Classe principal que contém o método `main` e toda a lógica de negócio do catálogo.
    * **Funcionalidades Implementadas no `main`:**
        * **Criação de um Catálogo (`HashMap`):** Utiliza um `HashMap<String, PecaMoto>` para mapear um código de peça (a chave) ao objeto `PecaMoto` correspondente (o valor).
        * **Adição de Peças:** Adiciona múltiplos objetos `PecaMoto` ao catálogo.
        * **Busca por Peça:** Implementa uma busca eficiente por uma peça usando seu código. O resultado da busca (`map.get()`) é verificado para ver se a peça foi encontrada (`!= null`) ou não.
        * **Listagem Completa do Catálogo:** Itera sobre as entradas do mapa (`map.entrySet()`) para exibir de forma formatada todos os códigos e os detalhes das peças armazenadas.
        * **Extração de Nomes Únicos (`HashSet`):** Cria um `HashSet<String>` e itera sobre os valores do catálogo para adicionar o nome de cada peça. O `HashSet` automaticamente garante que apenas os nomes únicos sejam armazenados, eliminando duplicatas. O resultado é então impresso no console.

**Conceitos Praticados:**
* **`java.util.HashMap`**: Armazenamento chave-valor, uso dos métodos `put()`, `get()` e `entrySet()`.
* **`java.util.HashSet`**: Armazenamento de elementos únicos e o funcionamento do método `add()`.
* As interfaces `Map` e `Set`.
* Iteração sobre `Map.Entry` para acessar chaves e valores simultaneamente.
* Tratamento de retornos `null` em buscas em mapas.
* Diferenças práticas entre coleções que permitem duplicatas (como `ArrayList`) e as que não permitem (como `HashSet`).