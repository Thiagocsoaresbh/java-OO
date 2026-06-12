# Java 20 - Excecoes - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Try-catch basico

**Analise o trecho:**

```java
try {
    int resultado = 10 / 0;
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Excecao capturada: " + e.getMessage());
}
System.out.println("Programa continua apos o catch.");
```

**O que e uma excecao em Java?**

R.

**O que teria acontecido se nao houvesse o try-catch?**

R.

**A linha `System.out.println("Resultado: " + resultado)` e executada? Por que?**

R.

**O que e `e.getMessage()`?**

R.

**Apos o catch, o programa continua ou encerra?**

R.

---

## Atividade 3 - NullPointerException

**Analise o trecho:**

```java
Aluno aluno = null;
try {
    aluno.apresentar();
} catch (NullPointerException e) {
    System.out.println("Excecao capturada: tentativa de usar objeto nulo.");
}
```

**O que e NullPointerException? Quando ela ocorre?**

R.

**No exercicio 18, qual era a situacao em que esse erro poderia acontecer sem o try-catch?**

R.

---

## Atividade 4 - Multiplos catch

**Analise o trecho:**

```java
Object[] itens = {"texto", null, 42};
for (int i = 0; i <= itens.length; i++) {
    try {
        System.out.println(((String) itens[i]).toUpperCase());
    } catch (ArrayIndexOutOfBoundsException e) { ... }
      catch (NullPointerException e)            { ... }
      catch (ClassCastException e)              { ... }
}
```

**Para cada valor do indice `i`, qual excecao e lancada e por que?**

- i = 0: 
- i = 1: 
- i = 2: 
- i = 3: 

**Por que e util ter multiplos catch em vez de um unico catch generico?**

R.

**A ordem dos blocos catch importa? O que aconteceria se o catch de `Exception` viesse primeiro?**

R.

---

## Atividade 5 - Throw

**Analise o construtor de `Aluno.java`:**

```java
public Aluno(String nome, int matricula, double nota) {
    if (nota < 0 || nota > 10) {
        throw new IllegalArgumentException("Nota invalida: " + nota + ". Deve ser entre 0 e 10.");
    }
    ...
}
```

**O que faz a palavra-chave `throw`?**

R.

**Por que e uma boa pratica colocar a validacao no construtor em vez de no `Principal.java`?**

R.

**O que aconteceria se o `catch` de `IllegalArgumentException` fosse removido do `Principal.java`?**

R.

---

## Atividade 6 - Finally

**Analise o trecho:**

```java
try {
    System.out.println("Dentro do try");
    System.out.println(5 / 0);
} catch (ArithmeticException e) {
    System.out.println("Dentro do catch: " + e.getMessage());
} finally {
    System.out.println("Dentro do finally — executa SEMPRE");
}
```

**O bloco `finally` executa mesmo quando ha excecao? E quando nao ha excecao?**

R.

**Qual e o uso mais comum do `finally` em aplicacoes reais?**

R.

---

## Atividade 7 - Perguntas finais

**Qual a diferenca entre um erro de compilacao e uma excecao em tempo de execucao?**

R.

**O que significa "lancar" uma excecao (`throw`) e "capturar" uma excecao (`catch`)?**

R.

**Cite duas excecoes que voce viu neste exercicio e quando cada uma ocorre.**

R.

---
