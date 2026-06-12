# Java 19 - ArrayList - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 19 - ArrayList ===

--- Criando o ArrayList ---
Tamanho inicial: 0

--- Adicionando elementos com add() ---
Tamanho apos 3 adds: 3

--- Acessando com get() ---
turma.get(0).getNome(): Ana
turma.get(2).getNome(): Carla

--- For-each ---
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024002 | Nome: Bruno | Nota: 6.0
Matricula: 2024003 | Nome: Carla | Nota: 9.2

--- Removendo por indice ---
Removendo turma.remove(1) (Bruno)...
Tamanho apos remove: 2
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024003 | Nome: Carla | Nota: 9.2

--- Adicionando apos remover ---
Tamanho: 3
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024003 | Nome: Carla | Nota: 9.2
Matricula: 2024004 | Nome: Daniel | Nota: 7.8

--- Comparacao: Array vs ArrayList ---
Array:     tamanho fixo, definido na criacao
ArrayList: tamanho dinamico, cresce e encolhe automaticamente
Array:     acesso com turma[i]
ArrayList: acesso com turma.get(i)
Array:     tamanho com turma.length
ArrayList: tamanho com turma.size()
Array:     permite tipos primitivos (int[], double[])
ArrayList: requer tipos objeto (Integer, Double)

=== Conclusao ===
ArrayList e uma lista dinamica: add() adiciona, remove() remove, get() acessa.
Use ArrayList quando nao souber quantos objetos vao existir.
Use Array quando o tamanho for fixo e conhecido desde o inicio.
```

---

## Atividade 2 - Criando e adicionando

**O que significa `ArrayList<Aluno>` e o `<Aluno>`?**

`ArrayList<Aluno>` e uma lista dinamica que so aceita objetos do tipo `Aluno`. O `<Aluno>` e o tipo generico (generic) que informa ao compilador quais objetos a lista pode armazenar, evitando erros de tipo em tempo de execucao.

**Qual era o tamanho inicial e por que?**

`0`. Um `ArrayList` recem-criado nao contem nenhum elemento. Ao contrario do array, ele nao precisa declarar capacidade inicial — começa vazio e cresce conforme elementos sao adicionados.

**O que faz `add()` e e necessario indicar a posicao?**

`add(objeto)` insere o objeto no final da lista. Nao e necessario indicar posicao — o ArrayList gerencia o tamanho e o indice automaticamente. Existe tambem `add(indice, objeto)` para inserir em uma posicao especifica.

---

## Atividade 3 - Acessando elementos

**Como acessar por indice no ArrayList vs array?**

- Array: `turma[0]` (colchetes)
- ArrayList: `turma.get(0)` (metodo `get`)

**O que aconteceria com `turma.get(10)` numa lista de 3 elementos?**

Lancaria `IndexOutOfBoundsException` em tempo de execucao — similar ao `ArrayIndexOutOfBoundsException` do array.

---

## Atividade 4 - Removendo e redimensionando

**Qual aluno foi removido e por que?**

Bruno. `remove(1)` remove o elemento no indice 1 (zero-based), que era Bruno (adicionado como segundo elemento).

**Apos a remocao, qual passou a ser o indice de Carla?**

Indice `1`. Quando um elemento e removido, todos os elementos seguintes se deslocam uma posicao para a esquerda. Carla estava no indice 2 e passou para o indice 1.

**E possivel fazer `remove()` em um array normal?**

Nao. Arrays tem tamanho fixo — nao existe metodo `remove()`. Para "remover" de um array, seria necessario recriar um novo array menor ou definir a posicao como `null` manualmente.

---

## Atividade 5 - Comparacao Array vs ArrayList

| Caracteristica         | Array                  | ArrayList              |
|------------------------|------------------------|------------------------|
| Tamanho                | Fixo (definido no new) | Dinamico               |
| Acesso por indice      | `turma[i]`             | `turma.get(i)`         |
| Propriedade de tamanho | `turma.length`         | `turma.size()`         |
| Adicionar elemento     | Nao suportado          | `turma.add(obj)`       |
| Remover elemento       | Nao suportado          | `turma.remove(i)`      |

---

## Atividade 6 - Perguntas finais

**Quando usar Array?**

Quando o numero de elementos e conhecido e fixo desde o inicio. Exemplo: dias da semana (sempre 7), notas de uma prova com numero fixo de questoes. Arrays tem desempenho ligeiramente melhor para acesso direto.

**Quando usar ArrayList?**

Quando o numero de elementos e desconhecido ou pode variar. Exemplo: lista de alunos matriculados (pode crescer ou diminuir ao longo do semestre), resultados de uma busca, itens de um carrinho de compras.

**O que acontece com o tamanho ao remover todos os elementos?**

O `size()` vai a 0. O ArrayList nao e destruido — ele continua existindo, apenas vazio, pronto para receber novos elementos com `add()`.

---
