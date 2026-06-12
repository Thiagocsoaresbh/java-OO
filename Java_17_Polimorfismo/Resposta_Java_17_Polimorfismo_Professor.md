# Java 17 - Polimorfismo - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 17 - Polimorfismo ===

--- Upcasting (implicito) ---
[Aluno]      Maria | matricula: 2024001
[Funcionario] Sergio | cargo: Professor

--- Vinculacao dinamica (array de Pessoa) ---
[Aluno]      Ana | matricula: 2024002
[Funcionario] Carlos | cargo: Coordenador
[Aluno]      Joao | matricula: 2024003
[Funcionario] Lucia | cargo: Diretora

--- Downcasting (explicito) ---
Downcast OK. Matricula: 2024004

--- Downcast incorreto (ClassCastException) ---
ref2 instanceof Aluno: false
Cast nao realizado: ref2 nao e um Aluno.

=== Conclusao ===
Upcasting   : automatico, subclasse -> superclasse.
Polimorfismo: mesmo metodo, comportamentos diferentes.
Downcasting : manual, use instanceof antes de converter.
```

---

## Atividade 2 - Upcasting

**`Pessoa p1 = new Aluno(...)` e um erro?**

Nao. Todo `Aluno` e uma `Pessoa` (heranca). Atribuir um tipo mais especifico a uma referencia mais generica e sempre valido.

**O que e upcasting?**

Converter uma referencia de um tipo mais especifico (subclasse) para um tipo mais geral (superclasse). O objeto em memoria nao muda — so o tipo da referencia e mais restrito.

**Por que e implicito?**

Porque a heranca garante que a subclasse tem tudo o que a superclasse tem. Nao ha risco de perda — o compilador sabe que e seguro.

---

## Atividade 3 - Vinculacao dinamica

**Como o Java sabe qual `apresentar()` chamar?**

Em tempo de execucao, a JVM verifica o tipo real do objeto em memoria (nao o tipo da referencia) e despacha o metodo correto. Isso e a vinculacao dinamica.

**O que e vinculacao dinamica?**

A decisao de qual versao de um metodo chamar e tomada em tempo de execucao, com base no tipo real do objeto, nao no tipo declarado da referencia.

**Vantagem do array `Pessoa[]`?**

Codigo mais simples e extensivel: um unico loop trata qualquer subclasse de `Pessoa`. Se surgir uma nova subclasse (ex: `Visitante`), o loop funciona sem alteracao.

---

## Atividade 4 - Downcasting

**O que e downcasting?**

Converter uma referencia da superclasse de volta para o tipo da subclasse. E explicito (requer cast manual) e pode falhar em tempo de execucao se o objeto nao for do tipo esperado.

**Por que usar `instanceof` antes do cast?**

Para verificar se o objeto em memoria e realmente do tipo desejado antes de converter. Evita `ClassCastException`.

**O que aconteceria sem verificar?**

Se o objeto nao for do tipo esperado, a JVM lanca `ClassCastException` em tempo de execucao e o programa para.

---

## Atividade 5 - Experimentando

**Erro esperado:**

```text
Exception in thread "main" java.lang.ClassCastException:
class Java_17_Polimorfismo.Funcionario cannot be cast to class Java_17_Polimorfismo.Aluno
```

**Compilacao ou execucao?**

Execucao. O compilador ve apenas que `ref2` e do tipo `Pessoa` e `Aluno` e subclasse — sintaticamente parece valido. Somente em tempo de execucao a JVM verifica o tipo real do objeto e detecta a incompatibilidade.

---

## Atividade 6 - Perguntas finais

**O que e polimorfismo?**

A capacidade de um mesmo metodo ter comportamentos diferentes dependendo do tipo real do objeto que o executa. "Muitas formas" para a mesma chamada.

**Diferenca entre upcasting e downcasting:**

Upcasting: subclasse -> superclasse, implicito, seguro. Downcasting: superclasse -> subclasse, explicito, pode falhar em execucao — use `instanceof`.

**Vinculacao dinamica e polimorfismo:**

A vinculacao dinamica E o mecanismo que implementa o polimorfismo. Sem ela, uma referencia `Pessoa` sempre chamaria `Pessoa.apresentar()` independente do objeto. Com ela, chama o metodo do tipo real.

**Como os exercicios 13-17 se relacionam:**

Heranca (13) fornece a hierarquia. Sobrescrita (14) permite comportamentos diferentes. Classes abstratas (15) forcam a implementacao. Interfaces (16) adicionam contratos multiplos. Polimorfismo (17) une tudo: trata objetos de tipos diferentes de forma uniforme atraves de referencias da superclasse ou interface.

---
