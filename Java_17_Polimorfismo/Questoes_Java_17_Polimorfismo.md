# Java 17 - Polimorfismo - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Upcasting

**Analise o trecho:**

```java
Pessoa p1 = new Aluno("Maria", 20, 2024001);
```

**`p1` e declarado como `Pessoa`, mas o objeto criado e `Aluno`. Isso e um erro?**

R.

**O que e upcasting?**

R.

**Por que o upcasting e automatico (implicito) em Java?**

R.

---

## Atividade 3 - Vinculacao dinamica

**Analise o loop:**

```java
for (Pessoa p : pessoas) {
    p.apresentar();
}
```

**O array e do tipo `Pessoa[]`, mas contem objetos de tipos diferentes. Como o Java sabe qual `apresentar()` chamar para cada elemento?**

R.

**O que e vinculacao dinamica (dynamic binding)?**

R.

**Qual e a vantagem de ter um array de `Pessoa` em vez de arrays separados `Aluno[]` e `Funcionario[]`?**

R.

---

## Atividade 4 - Downcasting

**Analise o trecho:**

```java
Pessoa ref = new Aluno("Bruno", 22, 2024004);
if (ref instanceof Aluno) {
    Aluno a = (Aluno) ref;
    System.out.println("Matricula: " + a.getMatricula());
}
```

**O que e downcasting?**

R.

**Por que usamos `instanceof` antes do cast?**

R.

**O que aconteceria se fizessemos o cast sem verificar e o objeto nao fosse do tipo esperado?**

R.

---

## Atividade 5 - Experimentando

**O que fazer:**

- No `Principal.java`, remova o `if (ref instanceof Aluno)` e tente fazer o cast direto:

```java
Aluno a2 = (Aluno) ref2; // ref2 e um Funcionario
System.out.println(a2.getMatricula());
```

- Execute e observe o erro em tempo de execucao.

**Qual erro ocorreu?**

```text

```

**Em que momento o erro apareceu: compilacao ou execucao? Por que?**

R.

---

## Atividade 6 - Perguntas finais

**O que e polimorfismo?**

R.

**Qual e a diferenca entre upcasting e downcasting?**

R.

**O que e vinculacao dinamica e por que ela e essencial para o polimorfismo?**

R.

**Como os conceitos de heranca (Ex13), sobrescrita (Ex14), classes abstratas (Ex15), interfaces (Ex16) e polimorfismo (Ex17) se relacionam?**

R.

---
