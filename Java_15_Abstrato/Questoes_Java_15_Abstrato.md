# Java 15 - Classes Abstratas - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Classe abstrata

**Abra `Pessoa.java` e responda:**

**O que a palavra `abstract` antes de `class` significa?**

R.

**Por que nao faz sentido criar um objeto `new Pessoa("X", 0)` diretamente?**

R.

**O que e um metodo abstrato?**

R.

**Qual a diferenca entre `apresentar()` (abstrato) e `exibirIdade()` (concreto) em `Pessoa`?**

R.

---

## Atividade 3 - Tentando instanciar

**O que fazer:**

- No `Principal.java`, descomente a linha: `Pessoa p = new Pessoa("X", 0);`
- Tente compilar e observe o erro.
- Depois comente novamente.

**Cole a mensagem de erro abaixo.**

```text

```

**O que o erro diz?**

R.

---

## Atividade 4 - Obrigatoriedade de implementacao

**O que fazer:**

- Em `Aluno.java`, remova o metodo `apresentar()` completamente.
- Tente compilar e observe o erro.
- Depois restaure o metodo.

**Cole a mensagem de erro abaixo.**

```text

```

**O que o erro diz sobre a obrigatoriedade?**

R.

---

## Atividade 5 - Referencia abstrata

**Analise o trecho:**

```java
Pessoa p1 = new Aluno("Carlos", 22, 2024002);
p1.apresentar();
```

**`p1` e do tipo `Pessoa` ou `Aluno`?**

R.

**Qual versao de `apresentar()` e chamada? Por que?**

R.

**Que vantagem tem usar o tipo abstrato como referencia?**

R.

---

## Atividade 6 - Perguntas finais

**Quando devemos usar uma classe abstrata?**

R.

**Qual a diferenca entre classe abstrata e classe concreta?**

R.

**Uma classe abstrata pode ter metodos concretos (nao abstratos)?**

R.

**Uma classe abstrata pode ter construtores?**

R.

---
