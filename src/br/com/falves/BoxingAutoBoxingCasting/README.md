# Exercício 3: Gerenciador de Estoque Simples

Este exercício foca na utilização de tipos complexos (Wrapper Classes) e nas operações de boxing, unboxing e casting em Java, através da criação de um sistema simples de gerenciamento de produtos em estoque.

**Objetivo:**
Demonstrar e praticar os conceitos de:
* Autoboxing (conversão automática de tipo primitivo para seu respectivo Wrapper).
* Unboxing (conversão automática de Wrapper para seu respectivo tipo primitivo).
* Parsing de `String` para tipos numéricos (ex: `Integer.parseInt()`).
* Casting explícito entre tipos numéricos.

**Estrutura:**
* Uma classe `Produto` com atributos como `codigo` (Integer), `nome` (String), `preco` (Double) e `quantidadeEmEstoque` (Integer).
* Uma classe `EstoqueApp` com o método `main` para:
    * Instanciar `Produto`.
    * Realizar atribuições que demonstrem autoboxing.
    * Realizar operações que demonstrem unboxing (ex: em cálculos aritméticos).
    * Converter uma `String` (simulando entrada de dados) para `int` e depois atribuir a um `Integer` (parsing + autoboxing).
    * Realizar um casting explícito de um `Integer` para `long` e imprimir.

**Conceitos Praticados:**
* Classes Wrapper (`Integer`, `Double`).
* Autoboxing e Unboxing.
* Método `Integer.parseInt()`.
* Casting explícito de tipos.