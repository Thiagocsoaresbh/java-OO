# Java 16 - Interfaces - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - O que e uma interface

**Abra `Descricao.java` e responda:**

**Qual e a diferenca entre `interface` e `class`?**

R.

**Por que os metodos da interface nao tem corpo `{}`?**

R.

**O que significa "implementar uma interface"?**

R.

---

## Atividade 3 - implements vs extends

**Responda:**

**Quantas classes uma classe pode `extends`?**

R.

**Quantas interfaces uma classe pode `implements`?**

R.

**Por que Java nao permite heranca multipla de classes mas permite multiplas interfaces?**

R.

---

## Atividade 4 - Metodo default

**Abra `Calculavel.java` e observe o metodo `classificar`.**

**O que e um metodo `default` em uma interface?**

R.

**`Aluno` sobrescreve `classificar()`? O que acontece se nao sobrescrever?**

R.

---

## Atividade 5 - Referencia pelo tipo da interface

**Analise o trecho:**

```java
Descricao d1 = new Aluno("Joao", 9.0, 8.0);
Descricao d2 = new Turma("TI-2024-A", 30);
```

**`d1` e `d2` sao de tipos diferentes, mas os dois chamam `getDescricao()`. Por que isso funciona?**

R.

**Usando a referencia `d1` do tipo `Descricao`, voce consegue chamar `calcularMedia()`? Por que?**

R.

---

## Atividade 6 - Interface vs Classe Abstrata

**Complete a tabela comparativa:**

| Caracteristica | Interface | Classe Abstrata |
|----------------|-----------|-----------------|
| Instanciavel? | ? | ? |
| Pode ter atributos de instancia? | ? | ? |
| Pode ter metodos concretos? | ? | ? |
| Suporta multipla "heranca"? | ? | ? |
| Palavra-chave para usar | ? | ? |

---

## Atividade 7 - Perguntas finais

**O que e uma interface em Java?**

R.

**Quando devemos usar interface em vez de classe abstrata?**

R.

**O que e um metodo `default` e por que foi adicionado no Java 8?**

R.

---
