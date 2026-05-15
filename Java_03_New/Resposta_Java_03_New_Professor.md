# Java 03 - A palavra new e multiplos objetos - Gabarito do Professor

---

## Atividade 1 - Criando o primeiro objeto

**Saida esperada:**

```text
Java 03 - Criacao de multiplos objetos.
Java_03_New.Aluno@XXXXXXXX
```

**O que e um objeto criado com `new`?**

E uma instancia real criada na memoria a partir da classe `Aluno`.

**O que acontece quando executamos `Aluno aluno1 = new Aluno();`?**

O Java cria um objeto do tipo `Aluno` na memoria e guarda em `aluno1` uma referencia para esse objeto.

---

## Atividade 2 - Criando varios objetos

**Saida esperada:**

```text
Tres objetos foram criados.
```

**Por que foi possivel criar tres objetos da mesma classe?**

Porque uma classe e um molde reutilizavel - podemos chamar `new Aluno()` quantas vezes quisermos.

**O que significa dizer que todos foram criados a partir do mesmo molde?**

Que todos tem a mesma estrutura (mesmos atributos), mas sao instancias independentes na memoria.

---

## Atividade 3 - Preenchendo os dados dos objetos

**Saida esperada:**

```text
Carlos
Maria
Pedro
```

**Por que cada objeto possui valores diferentes?**

Porque cada instancia tem seu proprio conjunto de atributos. Atribuir um valor a `aluno1.nome` nao afeta `aluno2.nome`.

**O que isso mostra sobre como os objetos sao armazenados na memoria?**

Que sao armazenados em espacos separados na memoria - mudar um nao muda os outros.

---

## Atividade 4 - Mostrando todos os dados

**Saida esperada:**

```text
Carlos - 20
Maria - 19
Pedro - 22
```

**Por que cada aluno mantem seus proprios dados?**

Porque os atributos pertencem a cada objeto individualmente.

**O que aconteceria se todos os objetos compartilhassem os mesmos valores?**

Se apontassem para a mesma referencia, mudar um mudaria todos. Mas aqui sao instancias distintas.

---

## Atividade 5 - Observando as referencias na memoria

**Saida esperada:**

```text
Java_03_New.Aluno@5acf9800
Java_03_New.Aluno@4617c264
Java_03_New.Aluno@36baf30c
```

**Por que aparecem codigos diferentes para cada objeto?**

Cada objeto tem sua propria referencia (hashcode) na memoria.

**O que esses codigos representam na memoria?**

Que existem tres objetos distintos, cada um alocado em um lugar diferente na memoria.

---

## Atividade 6 - Explicacao final

**O que acontece quando criamos varios objetos da mesma classe?**

Criamos varias instancias independentes com a mesma estrutura, mas dados proprios.

**O que significa cada objeto possuir sua propria referencia?**

Cada variavel aponta para um objeto diferente na memoria.

**Qual e a relacao entre classe e objeto?**

A classe e o molde; o objeto e a instancia concreta criada com `new`.

**O que voce aprendeu neste exercicio?**

Que podemos criar multiplos objetos com `new`, cada um independente, com seus proprios atributos.

---
