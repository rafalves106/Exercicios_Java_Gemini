# Exercício 4: Verificador de Nível de Óleo

Este exercício expande a classe `Moto` (criada anteriormente) para incluir funcionalidades relacionadas ao controle do nível de óleo, focando no uso de estruturas de controle de fluxo.

**Objetivo:**
Implementar um sistema de monitoramento e simulação do nível de óleo de uma moto.

**Funcionalidades Adicionadas à Classe `Moto`:**
* Atributo privado `nivelOleo` (int) inicializado com um valor padrão no construtor.
* Método público `verificarNivelOleo()` que utiliza condicionais `if-else if-else` para classificar e imprimir o estado do nível de óleo (baixo, aceitável, ótimo).
* Método público `simularUso(int kmRodados)` que decrementa o `nivelOleo` com base na quilometragem informada (ex: -5 a cada 100km), garantindo que o nível não fique negativo.
* Uma classe `Garagem` para testar as novas funcionalidades da moto.

**Conceitos Praticados:**
* Modificação e extensão de classes existentes.
* Estruturas de controle de fluxo (`if-else if-else`).
* Lógica condicional para tomada de decisões.
* Atualização do estado de um objeto com base em operações.
* Validação de dados (ex: `kmRodados` não negativo, `nivelOleo` não negativo).