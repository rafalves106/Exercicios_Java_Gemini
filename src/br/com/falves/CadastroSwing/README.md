# Projeto 1: Aplicação de Cadastro de Clientes com Java Swing

Este é um projeto prático que consiste em uma aplicação de desktop para o gerenciamento de clientes, desenvolvida em Java com a biblioteca de interface gráfica Swing. O objetivo é aplicar e integrar diversos conceitos de Java para criar um sistema com funcionalidades de CRUD (Create, Read, Update, Delete) completo.

**Objetivo Principal:**
Desenvolver uma aplicação funcional que permita ao usuário adicionar, visualizar, atualizar e remover registros de clientes, com os dados sendo exibidos em uma tabela e manipulados através de uma interface intuitiva.

---

### Funcionalidades Implementadas:

A aplicação possui uma única janela com todas as funcionalidades centralizadas:

* **Create (Adicionar):**
    * O usuário pode preencher os campos de Nome, CPF e Telefone.
    * Ao clicar no botão "Adicionar", os dados são validados (campos obrigatórios) e um novo cliente é adicionado ao sistema.
    * Uma mensagem de sucesso confirma a operação.

* **Read (Ler/Listar):**
    * Todos os clientes cadastrados são exibidos em tempo real em uma `JTable`.
    * A tabela é automaticamente atualizada sempre que um cliente é adicionado, atualizado ou removido, garantindo que a visualização esteja sempre sincronizada com os dados.

* **Update (Atualizar):**
    * Ao clicar em um cliente na tabela, seus dados são automaticamente carregados nos campos de texto, prontos para edição.
    * Após modificar os dados, o usuário pode clicar no botão "Atualizar" para salvar as alterações no registro selecionado.

* **Delete (Remover):**
    * O usuário pode selecionar um cliente na tabela e clicar no botão "Remover".
    * Uma caixa de diálogo de confirmação (`JOptionPane`) é exibida para prevenir a exclusão acidental.
    * Se confirmado, o cliente é removido do sistema.

* **Limpar Campos:**
    * Um botão "Limpar" foi adicionado para limpar todos os campos de texto do formulário, facilitando a inserção de um novo cliente.

---

### Desafio Adicional: Persistência de Dados

A versão atual do projeto armazena os dados em uma `ArrayList` em memória, o que significa que os dados são perdidos quando a aplicação é fechada. O desafio final do projeto é implementar a **persistência de dados**, com as seguintes funcionalidades:

* **Salvar em Arquivo:** Ao adicionar, atualizar ou remover um cliente, a lista completa de clientes é salva em um arquivo de texto (`clientes.csv`).
* **Carregar do Arquivo:** Ao iniciar a aplicação, os dados do arquivo `clientes.csv` são lidos e carregados no sistema, preenchendo a tabela com os registros da última sessão.

---

### Conceitos e Tecnologias Praticadas:

* **Java Swing (GUI):**
    * Criação e configuração de `JFrame` e `JPanel`.
    * Uso de componentes como `JTextField`, `JButton` e `JTable` para entrada e exibição de dados.
    * Utilização do `JOptionPane` para exibir diálogos de informação, erro, aviso e confirmação.
* **Gerenciamento de Eventos:**
    * Implementação de `ActionListener` para capturar cliques nos botões.
    * Implementação de `MouseListener` para detectar a seleção de itens na tabela.
* **Modelo de Tabela (TableModel):**
    * Uso do `DefaultTableModel` para gerenciar dinamicamente os dados exibidos na `JTable`.
* **Coleções (`Collections`):**
    * Utilização de `ArrayList` como uma estrutura de dados em memória para armazenar e manipular a lista de objetos `Cliente`.
* **Programação Orientada a Objetos (POO):**
    * Criação de uma classe de modelo (`Cliente`) para encapsular os dados.
    * Organização do código em métodos com responsabilidades bem definidas (`limparCampos()`, `atualizarTabela()`).
* **(Opcional) Entrada e Saída de Arquivos (File I/O):**
    * Leitura e escrita em arquivos de texto para implementar a persistência de dados.