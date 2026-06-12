# Java 11 - Estado do Objeto - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada (os valores de codigo variam a cada execucao):**

```text
=== Exercicio 11 - Estado do Objeto ===

--- Estado inicial de aluno1 ---
=== Estado do Objeto Aluno ===
Nome : Maria
Idade: 20
Cod. : 0.743821  (valor varia)
==============================

--- Alterando o estado (definirNome) ---
=== Estado do Objeto Aluno ===
Nome : Maria Santos
Idade: 21
Cod. : 0.743821  (mesmo codigo - nao foi alterado)
==============================

--- Dois objetos: estados independentes ---
aluno1 nome : Maria Santos
aluno2 nome : Carlos
aluno1 cod. : 0.743821  (valor do aluno1)
aluno2 cod. : 0.219043  (valor diferente, gerado para aluno2)
(Codigos diferentes: cada objeto tem seu proprio estado)

--- Ciclo de vida: Garbage Collection ---
Objeto criado  : Temporario
Referencia removida (temporario = null)
O objeto nao tem mais referencia -> pode ser destruido pela JVM.
System.gc() chamado -> JVM decidira quando coletar.

=== Conclusao ===
Estado      = valores dos atributos no momento.
Comportamento = acoes que o objeto realiza (metodos).
GC          = JVM destroi objetos sem referencia automaticamente.
```

**Os dois `codigoIdentificador` sao iguais?**

Nao. Cada objeto gera seu proprio codigo no construtor usando `Random.nextDouble()`, que retorna um numero aleatorio diferente a cada chamada.

---

## Atividade 2 - Estado do objeto

**O que define o ESTADO de um objeto?**

O conjunto de valores dos seus atributos em um determinado momento.

**Atributos que compoem o estado de `Aluno`:**

`nome`, `idade`, `codigoIdentificador` e `aleatorio`.

**O que define o COMPORTAMENTO de um objeto?**

Os metodos que ele possui — as acoes que ele e capaz de realizar.

**Metodos de comportamento em `Aluno`:**

`definirNome`, `definirIdade`, `getNome`, `getIdade`, `getCodigoIdentificador`, `exibirEstado`.

---

## Atividade 3 - Mudanca de estado

**Estado apos criacao:**

Nome = "Maria", Idade = 20, Codigo = valor aleatorio gerado.

**Estado apos `definirNome` e `definirIdade`:**

Nome = "Maria Santos", Idade = 21, Codigo = mesmo valor (nao foi alterado).

**O `codigoIdentificador` mudou?**

Nao. Ele so e gerado uma vez, dentro do construtor. Nao ha metodo que o altere depois.

---

## Atividade 4 - Random e codigo unico

**`this.aleatorio = new Random()`:**

Instancia um objeto da classe `Random`, que e capaz de gerar numeros aleatorios. O atributo `aleatorio` passa a referenciar esse objeto.

**`this.codigoIdentificador = aleatorio.nextDouble()`:**

Chama o metodo `nextDouble()` do objeto `Random`, que retorna um numero decimal aleatorio entre 0.0 e 1.0, e o armazena como codigo unico do aluno.

**Por que gerar codigo automatico no construtor?**

Para garantir que todo objeto criado ja nasca com um identificador unico, sem depender do programador que usa a classe.

**Os codigos sao iguais entre execucoes?**

Nao. `Random` gera valores diferentes a cada execucao (por padrao usa a hora atual como semente).

---

## Atividade 5 - Garbage Collection

**O que acontece com `temporario = null`?**

A variavel `temporario` deixa de apontar para o objeto na memoria. O objeto perde sua unica referencia e se torna inacessivel.

**O que e o Garbage Collector?**

Um mecanismo da JVM que varre a memoria em busca de objetos sem referencia e os destroi, liberando memoria automaticamente.

**O que faz `System.gc()`?**

Solicita (sugere) ao JVM que execute o Garbage Collector. Nao e uma ordem — a JVM decide quando e se vai executar a coleta.

**O programador pode destruir um objeto manualmente em Java?**

Nao. Em Java nao existe instrucao para destruir um objeto diretamente (como `delete` em C++). O programador pode apenas remover referencias; a destruicao e responsabilidade exclusiva do GC.

---

## Atividade 6 - Perguntas finais

**O estado de um objeto e definido por:** seus atributos (e os valores que eles armazenam no momento).

**O comportamento de um objeto e definido por:** seus metodos.

**Quando um objeto nao tem mais nenhuma referencia apontando para ele, ele:** se torna elegivel para o Garbage Collector, que pode destrui-lo e liberar a memoria.

**`import java.util.Random` serve para:** informar ao compilador que a classe `Random`, do pacote `java.util`, sera usada neste arquivo.

---
