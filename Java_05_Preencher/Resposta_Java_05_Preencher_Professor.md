# Java 05 - Preencher atributos - Gabarito do Professor

---

## Atividade 1 - Preenchendo o objeto

**Saida esperada:**

```text
Joao Silva
18
---apos alterar---
Maria Souza
22
```

---

## Atividade 2 - Perguntas

**Em `aluno.nome = "Joao Silva";`, o que significa `aluno.nome`?**

Significa que estamos acessando o atributo `nome` que pertence ao objeto guardado na variavel `aluno`. O ponto `.` entra no objeto e chega ate aquele atributo especifico.

**O que acontece se voce criar o objeto com `new Aluno()` mas nao preencher `nome` e `idade`?**

Os atributos ficam com os valores padrao: `nome` fica `null` e `idade` fica `0`. O objeto existe na memoria, mas sem dados uteis.

**O que o operador `.` (ponto) permite fazer quando temos um objeto em uma variavel?**

Permite acessar o que esta dentro do objeto - tanto para preencher (`aluno.nome = "Joao"`) quanto para ler o valor (`System.out.println(aluno.nome)`).

---
