# Exercício 9: Padrão de Projeto - Singleton

Este exercício foca na implementação de um dos Padrões de Projeto mais fundamentais e conhecidos: o **Singleton**.

**Objetivo:**
O objetivo principal é criar uma classe em Java que garanta que apenas **uma única instância** de si mesma seja criada durante toda a execução da aplicação. Além disso, a classe deve fornecer um ponto de acesso global para essa instância única.

Este padrão é ideal para gerenciar recursos que são, por natureza, únicos e compartilhados, como configurações globais, um pool de conexões com o banco de dados, ou um gerenciador de logs.

---

### Implementação:

O projeto consiste em duas classes:

1.  **`ConfiguracoesApp.java` (A classe Singleton):**
    * Esta classe simula um repositório de configurações globais da aplicação (nome do app, versão, modo de depuração).
    * Para garantir sua unicidade, o padrão Singleton foi implementado da seguinte forma:
        * **Construtor Privado (`private ConfiguracoesApp()`):** Impede que outras classes criem novas instâncias de `ConfiguracoesApp` utilizando o operador `new`. Os valores das configurações são inicializados dentro deste construtor.
        * **Instância Estática Privada (`private static ConfiguracoesApp instancia`):** Uma variável estática que armazena a única instância da classe.
        * **Método de Acesso Estático (`public static ConfiguracoesApp getInstancia()`):** O único ponto de acesso público para obter a instância. Este método utiliza "inicialização preguiçosa" (lazy initialization): ele verifica se a instância já existe e, somente se ela for nula, cria o novo objeto. Em todas as chamadas subsequentes, ele simplesmente retorna a instância que já foi criada.

2.  **`Main.java` (A classe de Teste):**
    * Esta classe foi criada para demonstrar e provar que o padrão Singleton está funcionando corretamente.
    * O teste consiste em:
        1.  Chamar `ConfiguracoesApp.getInstancia()` duas vezes e armazenar o resultado em duas variáveis diferentes (`config1` e `config2`).
        2.  Imprimir os dados de configuração acessados através de `config1` e `config2` para mostrar que ambos acessam as mesmas informações.
        3.  Comparar as duas variáveis com o operador `==` para verificar se elas apontam para o **mesmo objeto na memória**, confirmando que nenhuma nova instância foi criada na segunda chamada.

---

### Conceitos Praticados:

* **Padrão de Projeto Singleton:** Implementação de sua estrutura clássica.
* **Controle de Instanciação:** Uso de construtores privados para limitar a criação de objetos.
* **Membros Estáticos (`static`):** Utilização de variáveis e métodos estáticos para criar um estado e comportamento no nível da classe, e não da instância.
* **Inicialização Preguiçosa (Lazy Initialization):** O objeto só é criado no momento em que é necessário pela primeira vez.
* **Ponto de Acesso Global:** Fornecimento de um método `public static` para acesso controlado.
* **Comparação de Referência de Objeto (`==`):** Verificação de que múltiplas variáveis apontam para a mesma localização na memória.