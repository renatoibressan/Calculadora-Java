# 🧮 Calculadora em Java (CLI)

Uma calculadora simples desenvolvida em Java para execução via terminal (CLI), com diversas operações matemáticas organizadas em menus interativos.

---

## 📌 Funcionalidades

O programa é dividido em três abas principais:

### 🔹 Aba A — Operações Básicas

* Adição
* Subtração
* Multiplicação
* Divisão
* Resto da divisão

### 🔹 Aba B — Operações Avançadas

* Potenciação
* Fatorial
* Média de dois números
* Somatório em intervalo
* Produtório em intervalo

### 🔹 Aba C — Comparações

* Igualdade
* Diferença
* Maior que
* Menor que
* Maior ou igual
* Menor ou igual

---

## 🧱 Estrutura do Projeto

O projeto foi modularizado para separar responsabilidades:

```
src/
 └── calculadora/
      ├── main/        # Classe principal (Main)
      ├── service/     # Regras de negócio (operações matemáticas)
      ├── ui/          # Interface via terminal (menus e abas)
      └── util/        # Funções auxiliares
```

---

## ⚙️ Pré-requisitos

* Java JDK 8 ou superior
* Terminal Linux (ou compatível com bash)

---

## 🚀 Como compilar e executar (Linux)

### 1. Clonar o repositório

```bash
git clone https://github.com/renatoibressan/Calculadora-Java.git
cd Calculadora-Java
```

---

### 2. Compilar o projeto

```bash
mkdir -p ../out
javac -d ../out $(find . -name "*.java")
```

---

### 3. Gerar o arquivo `.jar`

```bash
jar cfe ../Calculadora.jar calculadora.main.Main -C ../out .
```

---

### 4. Executar

```bash
cd ..
java -jar Calculadora.jar
```

---

## 🧠 Observações importantes

* O projeto utiliza entrada via `Scanner`, portanto requer interação no terminal.
* A aplicação foi pensada para fins educacionais, focando em lógica e organização de código.
* Não há tratamento completo de erros para todos os cenários possíveis (ex: overflow, entradas inválidas complexas).

---

## 📈 Possíveis melhorias

* Substituir menus baseados em `switch` por padrões de projeto (ex: Command)
* Criar versão com interface gráfica (Swing ou JavaFX)
* Transformar em API REST
* Adicionar testes automatizados (JUnit)

---

## 📄 Licença

Este projeto é livre para uso e modificação para fins de estudo.

---

## 👤 Autor

Desenvolvido por Renato Bressan
