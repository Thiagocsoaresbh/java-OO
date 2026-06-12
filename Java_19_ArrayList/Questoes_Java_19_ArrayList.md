# Java 19 - ArrayList - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Criando e adicionando

**Analise o trecho:**

```java
ArrayList<Aluno> turma = new ArrayList<>();
System.out.println("Tamanho inicial: " + turma.size());

turma.add(new Aluno("Ana", 2024001, 8.5));
turma.add(new Aluno("Bruno", 2024002, 6.0));
turma.add(new Aluno("Carla", 2024003, 9.2));
System.out.println("Tamanho apos 3 adds: " + turma.size());
```

**O que significa `ArrayList<Aluno>`? O que indica o `<Aluno>` entre os angulos?**

R.

**Qual era o tamanho inicial? Por que?**

R.

**O que o metodo `add()` faz? E necessario indicar em qual posicao o elemento vai?**

R.

---

## Atividade 3 - Acessando elementos

**Analise o trecho:**

```java
System.out.println("turma.get(0).getNome(): " + turma.get(0).getNome());
```

**Como acessamos um elemento pelo indice no ArrayList? E no array?**

R.

**O que aconteceria se chamassemos `turma.get(10)` em uma lista com apenas 3 elementos?**

R.

---

## Atividade 4 - Removendo e redimensionando

**Analise o trecho:**

```java
turma.remove(1); // remove Bruno
System.out.println("Tamanho apos remove: " + turma.size());
```

**Qual aluno foi removido? Por que?**

R.

**Apos a remocao, qual passou a ser o indice de Carla?**

R.

**E possivel fazer `remove()` em um array normal (`Aluno[] turma`)? Por que?**

R.

---

## Atividade 5 - Comparacao Array vs ArrayList

**Complete a tabela:**

| Caracteristica         | Array           | ArrayList       |
|------------------------|-----------------|-----------------|
| Tamanho                |                 |                 |
| Acesso por indice      |                 |                 |
| Propriedade de tamanho |                 |                 |
| Adicionar elemento     |                 |                 |
| Remover elemento       |                 |                 |

---

## Atividade 6 - Perguntas finais

**Quando e mais adequado usar um Array em vez de ArrayList?**

R.

**Quando e mais adequado usar ArrayList em vez de Array?**

R.

**O que acontece com o tamanho do ArrayList quando removemos todos os elementos?**

R.

---
