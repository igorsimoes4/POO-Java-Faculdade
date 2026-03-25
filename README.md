# POO-Java-Faculdade

Este repositório contém códigos e exemplos desenvolvidos durante as aulas de Programação Orientada a Objetos (POO) em Java na faculdade. Os exemplos demonstram conceitos fundamentais da POO, como classes, objetos, encapsulamento, construtores e métodos.

## Sumário

- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Conceitos Abordados](#conceitos-abordados)
- [Aulas Detalhadas](#aulas-detalhadas)

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Codigo-aula/src/**: Pasta principal com os códigos fonte.
  - **Main.java**: Classe principal que demonstra o uso da classe `Pessoa`, criando um objeto e exibindo suas informações.
  - **Pessoa.java**: Classe `Pessoa` com atributos privados (nome, sobrenome, idade, etc.) e métodos getters/setters para encapsulamento.
  - **aula24032026A/Produto.java**: Classe `Produto` que calcula desconto sobre o preço de um produto.
  - **aula24032026B/Aluno.java**: Classe `Aluno` que calcula a média de três notas.
  - **aula24032026C/Pessoa.java**: Versão simplificada da classe `Pessoa` que verifica se a pessoa é maior de idade.
  - **aula24032026D/Semana.java**: Classe `Semana` que exibe uma mensagem de saudação baseada no dia da semana, utilizando entrada do usuário via Scanner.
  - **aula24032026E/Contagem.java**: Classe `Contagem` que realiza uma contagem de 1 até um número informado pelo usuário.

## Pré-requisitos

- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um IDE como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java.

## Como Executar

1. Clone ou baixe o repositório.
2. Abra o projeto em sua IDE (recomendado: IntelliJ IDEA, pois há arquivos `.iml`).
3. Navegue até a classe desejada (ex.: `Main.java` ou uma das aulas).
4. Execute a classe principal (método `main`).

### Execução via Linha de Comando

Para executar via terminal (PowerShell no Windows):

- Navegue até a pasta raiz do projeto: `cd E:\POO-Java-Faculdade\Codigo-aula\src`
- Para classes na raiz (como `Main.java`):
  - Compile: `javac *.java`
  - Execute: `java Main`
- Para classes em pacotes (ex.: `aula24032026A.Produto`):
  - Compile: `javac aula24032026A\Produto.java`
  - Execute: `java aula24032026A.Produto`

Nota: Algumas classes utilizam entrada do usuário (Scanner), então execute no terminal para interagir. Para classes com pacotes, ajuste o classpath se necessário.

## Conceitos Abordados

- Encapsulamento (getters/setters).
- Construtores.
- Métodos estáticos e de instância.
- Entrada de dados com Scanner.
- Estruturas de controle (if, switch, for).
- Arrays e listas (ArrayList).

## Aulas Detalhadas

### Aula 24/03/2026 A - Produto
- **Arquivo**: `aula24032026A/Produto.java`
- **Descrição**: Demonstra o uso de construtores, métodos de instância e cálculos simples. Cria um produto e calcula desconto.
- **Conceito Principal**: Métodos e operações aritméticas em objetos.

### Aula 24/03/2026 B - Aluno
- **Arquivo**: `aula24032026B/Aluno.java`
- **Descrição**: Classe `Aluno` com notas, calcula a média aritmética.
- **Conceito Principal**: Construtores e métodos de cálculo.

### Aula 24/03/2026 C - Pessoa (Simplificada)
- **Arquivo**: `aula24032026C/Pessoa.java`
- **Descrição**: Versão básica da classe `Pessoa` que verifica maioridade.
- **Conceito Principal**: Estruturas condicionais (if-else).

### Aula 24/03/2026 D - Semana
- **Arquivo**: `aula24032026D/Semana.java`
- **Descrição**: Usa switch para dias da semana e entrada do usuário.
- **Conceito Principal**: Estruturas de seleção (switch) e entrada com Scanner.

### Aula 24/03/2026 E - Contagem
- **Arquivo**: `aula24032026E/Contagem.java`
- **Descrição**: Realiza uma contagem usando loop for.
- **Conceito Principal**: Laços de repetição (for).

Este projeto serve como material de estudo para os alunos da disciplina de POO. Boa sorte nas aulas!
