# Java 07 - Construtores - Gabarito do Professor

---

## Atividade 1 - Execute e observe

**Saida esperada:**

```text
=== Exercicio 07 - Construtores ===

--- Jeito 1: Construtor vazio ---
Criado: aluno1 = new Aluno();
Nome: null
Idade: 0

Depois de preencher:
Nome: Joao Silva
Idade: 18

--- Jeito 2: Construtor com parametros ---
Criado: aluno2 = new Aluno("Maria Santos", 20);
Nome: Maria Santos
Idade: 20

--- Jeito 3: Construtor vazio, depois preenche ---
Nome: Carlos
Idade: 19

--- Jeito 4: Multiplos objetos (construtor parametrizado) ---
Aluno 4: Ana (21 anos)
Aluno 5: Bruno (17 anos)
Aluno 6: Carla (19 anos)

=== Conclusao ===
Construtores permitem inicializar o objeto com dados
desde o momento da criacao, evitando esquecer de preencher.
```

---

## Atividade 2 - Entendendo construtores

**O que e um construtor?**

Um metodo especial da classe executado automaticamente quando criamos um objeto com `new`. Serve para inicializar os atributos.

**Quando ele e chamado automaticamente?**

Toda vez que escrevemos `new Aluno()` ou `new Aluno("nome", idade)`.

---

## Atividade 3 - Comparando os jeitos

**Tabela preenchida:**

| Jeito | Codigo | O que acontece | Construtor usado |
|-------|--------|----------------|------------------|
| 1 | `new Aluno()` depois `aluno1.nome = ...` | Cria vazio, preenche depois | `Aluno()` sem parametros |
| 2 | `new Aluno("Maria", 20)` | Cria ja preenchido | `Aluno(String, int)` com parametros |
| 3 | `new Aluno()` depois `aluno3.nome = ...` | Cria vazio, preenche depois | `Aluno()` sem parametros |
| 4 | `new Aluno("Ana", 21)` | Cria ja preenchido | `Aluno(String, int)` com parametros |

---

## Atividade 4 - Entendendo this

**O que significa `this.nome` nessa linha?**

`this.nome` e o atributo do objeto.

**O que significa `nome` (sem this) nessa linha?**

`nome` (sem this) e o parametro recebido no construtor.

**Por que sem `this` o Java ficaria confuso?**

Porque os dois tem o mesmo nome - sem `this` o Java nao saberia qual e o atributo e qual e o parametro.

---

## Atividade 5 - Perguntas

**O que e um construtor?**

Um metodo especial executado automaticamente pelo `new` para inicializar o objeto.

**O que faz a palavra `new`?**

Cria o objeto na memoria, chama o construtor e retorna uma referencia.

**Qual e a diferenca entre `new Aluno()` e `new Aluno("Joao", 18)`?**

O primeiro chama o construtor vazio - nasce com `null` e `0`. O segundo chama o construtor parametrizado - nasce ja preenchido.

**O que significa `this` no construtor?**

Significa 'este objeto'. Diferencia o atributo do objeto do parametro recebido.

**Por que e vantajoso ter um construtor com parametros?**

Uma linha em vez de tres, sem risco de esquecer de preencher atributos.

**A classe `Aluno` tem quantos construtores? Liste cada um.**

Dois construtores: `public Aluno()` sem parametros e `public Aluno(String nome, int idade)` com parametros.

---

## Atividade 6 - Modificando o codigo

**Saida esperada:**

```text
--- Atividade 6: Criando mais alunos ---
Aluno 7: Fernando (22 anos)
Aluno 8: Gabriela (19 anos)
Aluno 9: Helena (21 anos)
Aluno 10: Igor (20 anos)
```

---

## Atividade 7 - Reflexao final

**Qual jeito voce prefere: construtor vazio ou com parametros? Por que?**

O construtor com parametros e preferivel quando os dados ja sao conhecidos na criacao.

**Se precisasse criar 1000 alunos, qual seria mais pratico?**

O construtor com parametros - uma linha por aluno em vez de tres.

**E possivel ter os dois construtores na mesma classe? Explique.**

Sim. Isso se chama sobrecarga de construtores (overloading). Java permite desde que tenham assinaturas diferentes.

---
