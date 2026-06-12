# Java 14 - Sobrescrita de Metodos - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Entendendo @Override

**Abra `Aluno.java` e responda:**

**O que `@Override` significa antes de `apresentar()`?**

R.

**O que aconteceria se voce escrevesse `@Override` antes de um metodo que NAO existe na superclasse?**

R.

**Para que serve `@Override` se o programa funciona sem ele?**

R.

---

## Atividade 3 - Comparando as saidas

**Sem executar, escreva o que cada chamada imprime:**

| Chamada | Saida esperada |
|---------|----------------|
| `pessoa1.apresentar()` | ? |
| `aluno1.apresentar()` | ? |
| `prof1.apresentar()` | ? |
| `aluno1.apresentarOriginal()` | ? |

---

## Atividade 4 - super.metodo()

**Responda:**

**O que faz `super.apresentar()` dentro de `Aluno`?**

R.

**Em que situacao seria util chamar `super.metodo()`?**

R.

---

## Atividade 5 - Experimentando

**O que fazer:**

- No `Aluno.java`, remova temporariamente o `@Override` e adicione um erro de digitacao no nome: `apressentar()`.
- Tente compilar. Observe o que acontece.
- Depois corrija e adicione o `@Override` novamente.

**O que aconteceu quando voce removeu o `@Override` e errou o nome?**

R.

**O que aconteceu quando adicionou o `@Override` com o nome errado?**

R.

**Qual e a vantagem do `@Override` para evitar erros?**

R.

---

## Atividade 6 - Perguntas finais

**O que e sobrescrita (override)?**

R.

**Qual e a diferenca entre sobrescrita e sobrecarga (overloading)?**

R.

**O que faz `super.metodo()`?**

R.

**Por que `@Override` e considerado uma boa pratica?**

R.

---
