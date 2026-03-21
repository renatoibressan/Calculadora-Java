# 🧮 Calculadora Matemática Modular em Java

Projeto desenvolvido em Java com foco em **modularização, organização por domínio matemático e implementação de algoritmos clássicos**.

Diferente de calculadoras tradicionais, este projeto evolui para uma **mini biblioteca matemática**, cobrindo múltiplas áreas da matemática computacional.

---

## 🚀 Visão Geral

Este sistema foi projetado para:

* Consolidar conceitos de **Programação Orientada a Objetos**
* Implementar algoritmos matemáticos manualmente
* Organizar funcionalidades por **domínio matemático**
* Evoluir de um programa simples para uma arquitetura modular

---

## 📦 Módulos do Sistema

O projeto está dividido em serviços independentes:

### 🔹 Aritmética

* Operações básicas (soma, subtração, multiplicação, divisão)
* Potenciação
* Módulo

---

### 🔹 Avançado

* Raiz quadrada (implementação própria)
* Fatorial
* Funções matemáticas adicionais

---

### 🔹 Trigonometria

* Seno, cosseno e tangente
* Secante, cossecante e cotangente
* Tratamento de indeterminações (ex: divisão por valores próximos de zero)

---

### 🔹 Teoria dos Números

* Verificação de primalidade
* MDC (Algoritmo de Euclides)
* MMC
* Divisores e propriedades numéricas

---

### 🔹 Estatística

* Média, mediana e moda
* Variância (amostral)
* Desvio padrão

---

### 🔹 Álgebra Linear

* Soma de vetores
* Produto escalar
* Norma de vetor
* Soma de matrizes
* Multiplicação de matrizes
* Determinantes

---

## 🧠 Diferenciais Técnicos

* ✔️ Organização modular por domínio matemático
* ✔️ Implementação manual de algoritmos (sem dependência de bibliotecas externas)
* ✔️ Tratamento de exceções para validação de domínio matemático
* ✔️ Separação parcial entre lógica e interface

---

## ⚙️ Estrutura do Projeto

```text
src/
 ├── app/
 │    └── MenuPrincipal.java
 ├── service/
 │    ├── AritmeticaService.java
 │    ├── AvancadoService.java
 │    ├── TrigonometricaService.java
 │    ├── NumeroService.java
 │    ├── EstatisticaService.java
 │    └── AlgebraLinearService.java
 └── utils/
      └── MathUtils.java
```

---

## ▶️ Como Executar

### 🔧 Linux / Terminal

```bash
mkdir -p out
find . -name "*.java" -exec javac -d out {} \;
jar cfe SistemaDeNotas.jar app.MenuPrincipal -C out .
java -jar SistemaDeNotas.jar
```

---

## ⚠️ Validações Implementadas

O sistema trata diversos casos inválidos:

* Divisão por zero
* Raiz de número negativo
* Matrizes incompatíveis
* Vetores de tamanhos diferentes
* Domínios matemáticos inválidos

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Evolução prática em Java
* Construção de código modular
* Implementação de algoritmos fundamentais
* Estruturação de sistemas organizados

---

## 🚀 Melhorias Futuras

* Interface gráfica (JavaFX ou Swing)
* Refatoração da camada de interface (menu)
* Testes automatizados (JUnit)
* Implementação de algoritmos mais avançados
* Entrada de dados mais robusta

---

## 👨‍💻 Autor

Renato Bressan
