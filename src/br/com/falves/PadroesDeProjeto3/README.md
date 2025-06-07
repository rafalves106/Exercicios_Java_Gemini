# Exercício 11: Padrão de Projeto - Observer

Este exercício implementa o padrão de projeto comportamental **Observer**.

**Objetivo:**
O objetivo é criar um mecanismo de "inscrição" onde múltiplos objetos "Observadores" (`Observers`) podem se registrar para serem notificados automaticamente sobre mudanças de estado em um objeto central "Observado" (`Subject`). Isso promove um baixo acoplamento, pois o `Subject` não precisa conhecer os detalhes dos seus `Observers`, apenas que eles seguem um contrato comum (uma interface).

O cenário prático deste projeto é um sistema de controle de estoque que notifica diferentes partes interessadas (como um gerente e um sistema de reposição) sempre que o estoque de um produto atinge um nível criticamente baixo.

---

### Estrutura e Papéis do Padrão:

O projeto foi dividido em classes que representam os papéis clássicos do padrão Observer:

1.  **`IObservadorEstoque` (A Interface `Observer`):**
    * Define o contrato que todos os observadores devem seguir.
    * Contém um único método, `notificar(String nomeProduto, int quantidadeAtual)`, que será chamado pelo `Subject` quando uma notificação for necessária.

2.  **`GerenteLoja` e `SistemaReposicao` (Os `Concrete Observers`):**
    * São as classes que têm interesse nas mudanças do `Subject`.
    * Ambas implementam a interface `IObservadorEstoque`.
    * Cada uma fornece uma implementação específica para o método `notificar`, executando uma ação distinta (ex: imprimir um alerta para o gerente, disparar uma ordem de reposição).

3.  **`ProdutoObservavel` (O `Subject` / `Observable`):**
    * É a classe que contém o estado importante (neste caso, `quantidadeEmEstoque`).
    * **Responsabilidades:**
        * Mantém uma lista de todos os observadores que se inscreveram (`private List<IObservadorEstoque> observadores`).
        * Fornece métodos públicos para que os observadores possam se inscrever (`adicionarObservador()`) e cancelar a inscrição (`removerObservador()`).
        * Possui um método `notificarObservador()` que percorre a lista de inscritos e chama o método `notificar()` de cada um.
        * A lógica de negócio (ex: no método `retirarDoEstoque()`) é responsável por verificar a mudança de estado e, se necessário, acionar o método `notificarObservador()`.

4.  **`Main` (O Cliente):**
    * Orquestra o cenário de teste:
        1.  Cria a instância do `Subject` (`ProdutoObservavel`).
        2.  Cria as instâncias dos `Observers` (`GerenteLoja`, `SistemaReposicao`).
        3.  Inscreve os `Observers` no `Subject`.
        4.  Muda o estado do `Subject` (simulando uma retirada de estoque) para acionar a notificação.
        5.  Demonstra o cancelamento da inscrição e um novo acionamento para provar que o observador removido não é mais notificado.

---

### Conceitos Praticados:

* **Padrão de Projeto Observer:** Implementação completa da sua estrutura.
* **Baixo Acoplamento:** O `ProdutoObservavel` não está fortemente acoplado ao `GerenteLoja` ou ao `SistemaReposicao`. Novos tipos de observadores podem ser adicionados no futuro sem qualquer alteração na classe `ProdutoObservavel`.
* **Programação Orientada a Interfaces:** O `Subject` interage com seus dependentes através da interface `IObservadorEstoque`, não de suas classes concretas.
* **Gerenciamento de Coleções (`ArrayList`):** Uso de uma lista para manter o registro dos "assinantes".
* **Delegação:** O `Subject` delega a responsabilidade da "reação à mudança" para os próprios `Observers`.