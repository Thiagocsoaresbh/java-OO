# Java 04 - Objeto vazio e valores padrao - Gabarito do Professor

---

## Atividade 1 - Rodando o programa

**Saida esperada:**

```text
Java 04 - Objeto nasce vazio (com valores padrao).
nome (String) = null
idade (int)   = 0
```

**Qual valor apareceu para `nome`? O que significa esse valor?**

Apareceu `null`. Significa que a referencia do tipo `String` nao aponta para nenhum texto - nenhum valor foi atribuido.

**Qual valor apareceu para `idade`? Por que nao aparece vazio?**

Apareceu `0`. O tipo `int` e primitivo em Java e nao pode ser `null` - seu valor padrao e sempre `0`.

---

## Atividade 2 - Preenchendo os atributos

**Saida esperada:**

```text
Java 04 - Objeto nasce vazio (com valores padrao).
nome (String) = null
idade (int)   = 0
Depois de preencher:
nome  = Ana
idade = 17
```

**O que muda quando voce preenche `nome` e `idade` manualmente?**

Os atributos passam a ter os valores atribuidos. O objeto continua sendo o mesmo - apenas seus dados foram atualizados.

---
