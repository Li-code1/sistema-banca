
# 📚 Sistema de Gerenciamento de Banca de Jornal Digital

Este projeto consiste em uma aplicação em Java desenvolvida para gerenciar o estoque e a política de descontos de uma banca de jornal que está expandindo suas operações para o meio digital. O sistema foi modelado utilizando os pilares da **Programação Orientada a Objetos (POO)**, com foco prático em **Polimorfismo, Herança e Abstração através de Interfaces**.

## 🛠️ Arquitetura do Sistema e Conceitos Aplicados

O projeto foi estruturado seguindo rigorosamente a modelagem UML proposta:

1. **`Produto` (Interface):** Estabelece o contrato básico de mercado para qualquer item comercializado na banca, definindo as assinaturas dos métodos `getPreco()` e `aplicarDesconto(double percentual)`.
2. **`Livro` (Classe Abstrata):** Implementa a interface `Produto`. Reúne os atributos e comportamentos genéricos compartilhados por todas as variações de livros (`titulo` e `preco`). Por ser abstrata, impede a instanciação direta de um objeto genérico "Livro".
3. **Especializações de Livros (Herança):**
   * **`EBook`:** Subclasse que herda de `Livro` e adiciona a propriedade específica `tamanhoEmMB`.
   * **`LivroFisico`:** Subclasse que herda de `Livro` e adiciona a propriedade específica `pesoGramas`.
   * **`Minilivro`:** Subclasse que herda de `Livro` para representar edições compactas/de bolso.
4. **`Revista` (Classe Concreta):** Implementa a interface `Produto` de maneira independente, possuindo suas próprias regras de negócio e propriedades (`nome` e `edicao`).
5. **`BancaControle` (Classe de Controle):** Contém o método `main` que gerencia o fluxo do sistema, utilizando **Polimorfismo de Inclusão** para tratar diferentes objetos (`EBook`, `Revista`, etc.) sob a mesma referência da interface `Produto`.

---

## 📂 Estrutura de Pastas

```text
sistema-banca/
├── README.md
└── src/
    └── banca/
        ├── Produto.java
        ├── Livro.java
        ├── EBook.java
        ├── Minilivro.java
        ├── LivroFisico.java
        ├── Revista.java
        └── BancaControle.java

```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

* **Java JDK** (versão 17 ou superior recomendada) instalado.
* **VS Code** com a extensão **Extension Pack for Java** instalada.

### Passos para Execução no VS Code

1. Abra a pasta raiz do projeto (`sistema-banca`) no VS Code.
2. Navegue até o arquivo `src/banca/BancaControle.java`.
3. Clique no botão **Run** que aparece logo acima do método `public static void main`.
4. O resultado da listagem de estoque e aplicação polimórfica de descontos será exibido no terminal integrado.

---

## 📊 Demonstração de Saída no Terminal

```text
=== ESTOQUE INICIAL DA BANCA ===
Produto: EBook | Preço: R$ 89,90
Produto: Minilivro | Preço: R$ 15,00
Produto: LivroFisico | Preço: R$ 120,00
Produto: Revista | Preço: R$ 19,90

=== APLICANDO DESCONTO DE 10% EM TODOS OS PRODUTOS ===
Novo Preço do EBook: R$ 80,91
Novo Preço do Minilivro: R$ 13,50
Novo Preço do LivroFisico: R$ 108,00
Novo Preço do Revista: R$ 17,91

```

---

Desenvolvido como parte dos estudos de Análise e Desenvolvimento de Sistemas (Foco em POO com Java).

```