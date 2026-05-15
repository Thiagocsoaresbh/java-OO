# Java 08 - Metodos - Gabarito do Professor

---

## Atividade 1 - Execute e observe

**Saida esperada:**

```text
=== Exercicio 08 - Metodos ===

--- Metodo VOID: apresentar() ---
Ola, meu nome e Joao Silva e tenho 18 anos.
Ola, meu nome e Maria Santos e tenho 16 anos.

--- Metodo VOID com parametro: fazer(nota) ---
Joao Silva fez um teste com nota 85
Maria Santos fez um teste com nota 92

--- Metodo com RETORNO (int): calcularAnoNascimento() ---
Joao nasceu em: 2008
Maria nasceu em: 2010

--- Metodo com RETORNO (String): obterCategoria() ---
Joao Silva e: Maior de idade
Maria Santos e: Menor de idade

--- Metodo com parametro E retorno: multiplicarIdade(int) ---
Idade de Joao vezes 2: 36
Idade de Maria vezes 3: 48
```

---

## Atividade 2 - Tabela de metodos

**Tabela preenchida:**

| Metodo | Imprime algo? | Retorna valor? | Recebe parametro? |
|--------|--------------|----------------|-------------------|
| `apresentar()` | sim | nao | nao |
| `fazer(nota)` | sim | nao | sim |
| `calcularAnoNascimento()` | nao | sim (int) | nao |
| `obterCategoria()` | nao | sim (String) | nao |
| `multiplicarIdade(mult)` | nao | sim (int) | sim |
| `exibirInfo()` | sim | nao | nao |

---

## Atividade 3 - Perguntas

**O que e um metodo em Java?**

Um bloco de codigo nomeado dentro de uma classe que define uma acao que os objetos podem executar.

**Qual e a diferenca entre um atributo e um metodo?**

O atributo guarda um dado. O metodo define um comportamento - algo que o objeto faz.

**O que significa `void` em um metodo?**

Significa que o metodo nao retorna nenhum valor - executa uma acao e termina.

**Quando usar um metodo void vs um metodo com retorno?**

Void quando so precisa fazer algo. Com retorno quando precisa devolver um resultado para usar em outro lugar.

**Como voce chama um metodo?**

Usando a notacao `objeto.nomeDoMetodo()`.

**A classe `Aluno` tem quantos metodos? Liste todos.**

6 metodos: `apresentar()`, `fazer(nota)`, `calcularAnoNascimento()`, `obterCategoria()`, `multiplicarIdade(mult)`, `exibirInfo()`.

**Qual e o metodo mais util na pratica? Por que?**

Depende do contexto. `exibirInfo()` e pratico para ver todos os dados de uma vez.

---

## Atividade 4 - Modificando o codigo

**Saida esperada:**

```text
Joao Silva tem aproximadamente 6570.0 dias de vida.
```

---

## Atividade 5 - Reflexao final

**Um metodo pode ter multiplos parametros?**

Sim, um metodo pode receber multiplos parametros.

**Qual e a vantagem de usar metodos em vez de deixar tudo no `main`?**

Os metodos encapsulam acoes, evitam repeticao de codigo e tornam o programa mais organizado.

**Se voce tivesse 1000 alunos, seria mais facil usar metodos ou repetir codigo?**

Muito mais facil usar metodos - uma chamada funciona para qualquer objeto.

**Qual metodo voce criaria para a classe `Aluno` que seria util na pratica?**

Exemplos: `verificarSePassou(int nota)`, `calcularMedia(int n1, int n2)`, `estaEmIdadeEscolar()`.

---
