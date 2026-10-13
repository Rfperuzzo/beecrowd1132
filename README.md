# Exercício 1132 – Múltiplos de 13 | Java

## 📌 Descrição

Este projeto resolve o exercício **1132 – Múltiplos de 13**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1132).

O programa recebe dois números inteiros e calcula a soma de todos os números existentes entre eles, incluindo os extremos, que **não são múltiplos de 13**.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `for`
- Estrutura condicional `if`
- Operador módulo `%`

## 🧠 Lógica do programa

1. Lê dois números inteiros, `x` e `y`.
2. Verifica qual é o menor e o maior valor.
3. Percorre todos os números do intervalo, incluindo os extremos.
4. Verifica se cada número não é divisível por 13 usando `i % 13 != 0`.
5. Soma os números que atendem à condição.
6. Exibe o resultado final.

## 💻 Código Java

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, soma = 0, aux;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        scanner.close();
    }
}
```

## 📥 Exemplo de entrada

```text
10
15
```

## 📤 Exemplo de saída

```text
62
```

## 🔎 Explicação

Os números do intervalo são 10, 11, 12, 13, 14 e 15.

O número 13 é excluído porque é múltiplo de 13.

**Soma = 10 + 11 + 12 + 14 + 15 = 62**

## 📚 Conceitos praticados

- Estrutura de repetição `for`
- Condições com `if`
- Operador módulo `%`
- Troca de valores entre variáveis
- Acumuladores
- Manipulação de intervalos numéricos

## 🎯 Objetivo

Praticar estruturas de repetição e operadores matemáticos em Java, identificando e somando números que não são múltiplos de 13.

---

**Plataforma:** Beecrowd  
**Problema:** 1132 – Múltiplos de 13  
**Linguagem:** Java
