# Java 16 - Interfaces - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 16 - Interfaces ===

--- Descricao e calculo de media ---
Aluno: Maria | notas: 8.5 e 7.0
  Media: 7.75 | Aprovado
Aluno: Carlos | notas: 4.0 e 5.5
  Media: 4.75 | Reprovado
Aluno: Ana | notas: 6.0 e 5.0
  Media: 5.5 | Recuperacao

--- Referencia pelo tipo da interface ---
Aluno: Joao | notas: 9.0 e 8.0
Turma: TI-2024-A | vagas: 30

--- Usando interface Calculavel diretamente ---
Media: 7.8 | Aprovado

=== Conclusao ===
Interface = contrato: define o QUE, nao o COMO.
Uma classe pode implementar multiplas interfaces.
Classes nao relacionadas podem assinar o mesmo contrato.
```

---

## Atividade 2 - O que e uma interface

**Diferenca entre `interface` e `class`:**

`interface` define apenas o contrato (o que fazer), sem implementacao. `class` define tanto o contrato quanto a implementacao (como fazer).

**Por que os metodos nao tem corpo?**

Porque a interface nao sabe como implementar — ela apenas exige que quem a implemente forneca o corpo. E o conceito de abstrato total.

**O que significa "implementar uma interface"?**

Assinar o contrato: a classe se compromete a fornecer implementacao para todos os metodos da interface.

---

## Atividade 3 - implements vs extends

**Quantas classes pode `extends`?** Apenas uma (Java nao tem heranca multipla de classe).

**Quantas interfaces pode `implements`?** Quantas quiser — separadas por virgula.

**Por que multiplas interfaces mas nao multiplas classes?**

Com heranca multipla de classes poderia haver conflito de implementacoes concretas (o "problema do diamante"). Interfaces tradicionais so tem contratos sem implementacao, entao nao ha conflito.

---

## Atividade 4 - Metodo default

**O que e um metodo `default`?**

Um metodo com implementacao dentro de uma interface (adicionado no Java 8). Permite adicionar comportamento a interfaces sem quebrar as classes que ja as implementam.

**`Aluno` sobrescreve `classificar()`?**

Nao. `Aluno` usa a implementacao padrao fornecida pela interface. Se precisasse de um comportamento diferente, poderia sobrescrever com `@Override`.

---

## Atividade 5 - Referencia pelo tipo da interface

**Por que funciona chamar `getDescricao()` em `d1` e `d2`?**

Porque ambos (`Aluno` e `Turma`) implementam a interface `Descricao`, garantindo que o metodo `getDescricao()` existe em ambos. O tipo da referencia (`Descricao`) define quais metodos estao disponiveis.

**Consegue chamar `calcularMedia()` usando `d1`?**

Nao. A referencia `d1` e do tipo `Descricao`, que so conhece `getDescricao()`. Para chamar `calcularMedia()`, seria necessario um cast: `((Calculavel) d1).calcularMedia()`, ou declarar `d1` como `Calculavel` ou `Aluno`.

---

## Atividade 6 - Interface vs Classe Abstrata

| Caracteristica | Interface | Classe Abstrata |
|----------------|-----------|-----------------|
| Instanciavel? | Nao | Nao |
| Pode ter atributos de instancia? | Nao (so constantes) | Sim |
| Pode ter metodos concretos? | Sim (default/static) | Sim |
| Suporta multipla "heranca"? | Sim (multiplos implements) | Nao (um so extends) |
| Palavra-chave para usar | `implements` | `extends` |

---

## Atividade 7 - Perguntas finais

**O que e uma interface?**

Um contrato que define quais metodos uma classe deve implementar, sem fornecer o como. Permite que classes nao relacionadas compartilhem comportamentos comuns.

**Quando usar interface em vez de classe abstrata?**

Interface: quando classes nao relacionadas precisam do mesmo comportamento (ex: `Aluno` e `Turma` ambos sao `Descricao`). Classe abstrata: quando ha relacao hierarquica real e codigo concreto compartilhado.

**O que e um metodo `default` e por que foi adicionado no Java 8?**

Metodo com implementacao dentro de uma interface. Foi adicionado para permitir evoluir interfaces existentes sem quebrar todas as classes que ja as implementavam.

---
