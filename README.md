# 🧮 Calculadora Matemática Modular em Java

Projeto desenvolvido em Java com foco em **modularização, organização por domínio matemático e implementação manual de algoritmos clássicos**. Mais do que uma calculadora simples, este sistema funciona como uma **mini biblioteca matemática**, cobrindo múltiplas áreas da matemática computacional.

---

## 📋 Índice

- [Visão Geral](#-visão-geral)
- [Módulos do Sistema](#-módulos-do-sistema)
- [Diferenciais Técnicos](#-diferenciais-técnicos)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [Validações Implementadas](#-validações-implementadas)
- [Melhorias Futuras](#-melhorias-futuras)
- [Autor](#-autor)

---

## 🚀 Visão Geral

Este sistema foi projetado para:

- Consolidar conceitos de **Programação Orientada a Objetos (POO)**
- Implementar algoritmos matemáticos **sem dependência de bibliotecas externas**
- Organizar funcionalidades por **domínio matemático**
- Evoluir de um programa simples para uma **arquitetura modular e escalável**

---

## 📦 Módulos do Sistema

### 🔹 Aritmética
- Soma, subtração, multiplicação e divisão
- Potenciação
- Módulo (resto da divisão)

### 🔹 Avançado
- Raiz quadrada (implementação própria)
- Fatorial
- Funções matemáticas adicionais

### 🔹 Trigonometria
- Seno, cosseno e tangente
- Secante, cossecante e cotangente
- Tratamento de indeterminações (ex: divisão por valores próximos de zero)

### 🔹 Teoria dos Números
- Verificação de primalidade
- MDC via Algoritmo de Euclides
- MMC
- Divisores e propriedades numéricas

### 🔹 Estatística
- Média, mediana e moda
- Variância amostral
- Desvio padrão

### 🔹 Álgebra Linear
- Soma de vetores
- Produto escalar e norma de vetor
- Soma e multiplicação de matrizes
- Cálculo de determinantes

---

## 🧠 Diferenciais Técnicos

- ✅ Organização modular por domínio matemático
- ✅ Implementação manual de algoritmos (sem uso de `Math.*` onde aplicável)
- ✅ Tratamento de exceções para validação de domínio matemático
- ✅ Separação entre lógica de negócio e interface (menu)

---

## ⚙️ Estrutura do Projeto
```
Calculadora-Java/
├── src/
│   └── main/
│       └── java/
│           └── com/renato/calculadora/
│               ├── app/
│               │   └── MenuPrincipal.java
│               ├── service/
│               │   ├── AritmeticaService.java
│               │   ├── AvancadoService.java
│               │   ├── TrigonometricaService.java
│               │   ├── NumeroService.java
│               │   ├── EstatisticaService.java
│               │   └── AlgebraLinearService.java
│               └── utils/
│                   └── MathUtils.java
├── target/
├── pom.xml
└── README.md
```

---

## ▶️ Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/) (recomendado)

### Clonando o repositório
```bash
git clone https://github.com/renatoibressan/Calculadora-Java.git
cd Calculadora-Java
```

### Com Maven
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.renato.calculadora.app.MenuPrincipal"
```

### Manualmente (Linux/Terminal)
```bash
mkdir -p out
find . -name "*.java" -exec javac -d out {} \;
jar cfe Calculadora.jar com.renato.calculadora.app.MenuPrincipal -C out .
java -jar Calculadora.jar
```

### Via IDE

Importe o projeto como **Maven Project** no Eclipse, IntelliJ IDEA ou NetBeans e execute a classe `MenuPrincipal`.

---

## ⚠️ Validações Implementadas

O sistema trata os seguintes casos inválidos:

- Divisão por zero
- Raiz quadrada de número negativo
- Matrizes com dimensões incompatíveis
- Vetores de tamanhos diferentes
- Entradas fora do domínio matemático esperado

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

- Evolução prática em Java
- Construção de código limpo e modular
- Implementação de algoritmos matemáticos fundamentais
- Estruturação de sistemas organizados por responsabilidade

---

## 🚀 Melhorias Futuras

- [ ] Interface gráfica com JavaFX ou Swing
- [ ] Testes automatizados com JUnit
- [ ] Entrada de dados mais robusta e validada
- [ ] Implementação de algoritmos mais avançados
- [ ] Refatoração completa da camada de menu

---

## 👨‍💻 Autor

Desenvolvido por **Renato Bressan**

[![GitHub](https://img.shields.io/badge/GitHub-renatoibressan-181717?style=flat&logo=github)](https://github.com/renatoibressan)
