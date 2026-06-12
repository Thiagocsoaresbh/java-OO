# Java 02 - Objeto (instancia) - Gabarito do Professor

---

## Atividade 1 - Executando o codigo original

**Saida esperada:**

```text
Java_02_Objeto.Aluno@XXXXXXXX
Java 02 - Objeto criado com sucesso.
Esse objetoAluno e um Aluno real (instancia) criado a partir da classe Aluno.
```

**O que e um objeto?**

Um objeto e uma instancia real na memoria, criada a partir de uma classe (molde).

**O que a palavra `new` faz no codigo?**

Cria o objeto na memoria e devolve uma referencia para ele, guardada na variavel.

**O que significa dizer que um objeto e uma instancia de uma classe?**

Significa que ele foi criado seguindo o molde daquela classe e possui os atributos definidos nela.

---

## Atividade 2 - Criando mais um objeto

**Saida esperada:**

```text
Java_02_Objeto.Aluno@XXXXXXXX
Java_02_Objeto.Aluno@YYYYYYYY
```

**Por que os dois objetos sao diferentes?**

Porque cada `new Aluno()` cria uma nova instancia independente na memoria.

**O que significa cada objeto ocupar um espaco diferente na memoria?**

Que sao entidades separadas - mudar os dados de um nao afeta o outro.

---

## Atividade 3 - Preenchendo atributos

**Saida esperada:**

```text
Carlos
20
```

**O que significa preencher um atributo?**

Atribuir um valor a um campo do objeto usando `objeto.atributo = valor`.

**O que os atributos `nome` e `idade` representam no objeto?**

As caracteristicas do aluno guardadas dentro daquela instancia especifica.

---

## Atividade 4 - Alterando os valores

**Saida esperada:**

```text
Maria
18
```

**Por que foi possivel alterar os valores do objeto?**

Porque atributos sao variaveis do objeto e podem ser reatribuidos a qualquer momento.

**O objeto continua sendo o mesmo?**

Sim. Os dados foram alterados, mas e o mesmo objeto - a referencia nao mudou.

---

## Atividade 5 - Criando outro aluno

**Saida esperada:**

```text
Pedro
22
```

**O que diferencia `objetoAluno` de `objetoAluno2`?**

Sao instancias diferentes, cada uma com seu proprio espaco na memoria e seus proprios valores.

**Por que os dois podem ter valores diferentes?**

Porque cada objeto guarda seu proprio conjunto de atributos independentemente.

---

## Atividade 6 - Observando o objeto na memoria

**Saida esperada:**

```text
Java_02_Objeto.Aluno@4e25154f
Java_02_Objeto.Aluno@70dea4e
```

**Por que aparecem codigos diferentes?**

Porque sao objetos distintos. O Java exibe o nome da classe seguido de um hashcode baseado no endereco de memoria de cada instancia.

**O que isso representa na memoria?**

Dois objetos distintos, cada um com sua propria referencia na memoria.

---

## Atividade 7 - Explicacao final

**O que e um objeto em Java?**

Uma instancia criada na memoria a partir de uma classe.

**Qual e a diferenca entre classe e objeto?**

A classe e o molde; o objeto e a instancia criada com `new`.

**O que faz a palavra `new`?**

Cria o objeto na memoria, chama o construtor e retorna uma referencia.

**O que sao atributos?**

Variaveis que pertencem ao objeto e guardam suas caracteristicas.

**O que voce aprendeu neste exercicio?**

Criar instancias com `new`, preencher atributos e perceber que cada objeto e independente.

---
