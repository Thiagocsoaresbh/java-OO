# Java 18 - Arrays de Objetos - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 18 - Arrays de Objetos ===

--- Criando o array ---
turma[0] antes de preencher: null
Tamanho do array: 4

--- Preenchendo o array ---
turma[0] depois de preencher: Java_18_Arrays.Aluno@<hashcode>
turma[0].getNome(): Ana

--- For tradicional (com indice) ---
turma[0] -> Matricula: 2024001 | Nome: Ana | Nota: 8.5
turma[1] -> Matricula: 2024002 | Nome: Bruno | Nota: 6.0
turma[2] -> Matricula: 2024003 | Nome: Carla | Nota: 9.2
turma[3] -> Matricula: 2024004 | Nome: Daniel | Nota: 7.8

--- For-each (sem indice) ---
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024002 | Nome: Bruno | Nota: 6.0
Matricula: 2024003 | Nome: Carla | Nota: 9.2
Matricula: 2024004 | Nome: Daniel | Nota: 7.8

--- Aluno com maior nota ---
Maior nota: Carla (9.2)

--- Array com posicao vazia ---
Matricula: 2024005 | Nome: Eva | Nota: 7.0
lista[1] -> vazia (null)
Matricula: 2024006 | Nome: Felipe | Nota: 8.0

=== Conclusao ===
Array de objetos: armazena referencias, nao os objetos diretamente.
new Aluno[4]: reserva 4 espacos, todos null inicialmente.
Sempre verifique null antes de usar posicoes que podem estar vazias.
```

Obs.: `<hashcode>` varia a cada execucao (ex: `Aluno@3764951d`). Isso e normal.

---

## Atividade 2 - Criando o array

**O que e impresso e por que?**

`null`. Ao criar o array com `new Aluno[4]`, Java reserva 4 posicoes de memoria mas nao cria nenhum objeto `Aluno`. Cada posicao e inicializada com `null` (ausencia de referencia).

**Diferenca entre `new Aluno[4]` e `new Aluno(...)`:**

`new Aluno[4]` cria o contêiner (o array com 4 slots), sem nenhum objeto dentro. `new Aluno(...)` cria um objeto `Aluno` de fato. Para ter 4 alunos no array, e necessario fazer os dois: criar o array e depois criar cada objeto individualmente.

**O que e `turma.length`?**

A capacidade total do array, ou seja, quantas posicoes ele tem. No caso, `4`. Nao muda apos a criacao do array.

---

## Atividade 3 - Preenchendo e acessando

**Por que imprime algo como `Java_18_Arrays.Aluno@3764951d`?**

Porque `turma[0]` contem uma referencia ao objeto, e o `println` chama implicitamente o `toString()` da classe. Como `Aluno` nao sobrescreve `toString()`, Java usa a implementacao padrao de `Object`, que exibe o nome da classe seguido do hashcode em hexadecimal.

**Como acessamos o nome?**

Chamando o metodo getter: `turma[0].getNome()`. O operador `.` acessa o objeto referenciado pela posicao do array.

**O array armazena o objeto ou uma referencia?**

Uma referencia. O objeto `Aluno` vive no heap da JVM; o array armazena apenas o endereco (referencia) para esse objeto. Dois arrays diferentes poderiam referenciar o mesmo objeto.

---

## Atividade 4 - For tradicional vs For-each

**Vantagem do for tradicional:**

Acesso ao indice `i`, que permite: modificar posicoes especificas, comparar elementos adjacentes, iterar de tras para frente, ou preencher o array durante o loop.

**Vantagem do for-each:**

Codigo mais legivel e conciso quando apenas a leitura e necessaria. Elimina o risco de `ArrayIndexOutOfBoundsException` por erro no indice.

**Quando e obrigatorio usar o for tradicional?**

Quando e necessario o indice: por exemplo, ao buscar o maior elemento (precisamos de `i` para comparar `turma[i]` com o atual destaque), ao preencher posicoes durante o loop, ou ao percorrer dois arrays em paralelo.

---

## Atividade 5 - Posicao vazia (null)

**O que aconteceria sem o `if (lista[i] != null)`?**

Ao tentar chamar `lista[1].apresentar()`, a JVM tentaria acessar um objeto atraves de uma referencia nula — operacao invalida.

**Qual erro seria lancado?**

`NullPointerException` em tempo de execucao. O programa pararia na linha do acesso nulo.

**Por que verificar `null`?**

Porque um array de objetos pode ter posicoes nao preenchidas (intencionalmente ou por logica do programa). Acessar qualquer metodo ou atributo de uma referencia `null` sempre lanca `NullPointerException`.

---

## Atividade 6 - Perguntas finais

**O que e um array de objetos?**

Uma estrutura de tamanho fixo que armazena referencias a objetos do mesmo tipo. As posicoes sao indexadas a partir de 0 e cada uma pode conter uma referencia a um objeto ou `null`.

**Valor padrao de cada posicao recem-criada?**

`null`. Arrays de tipos primitivos (int, double, etc.) iniciam com 0 ou false; arrays de objetos iniciam com `null`.

**Como percorremos todos os elementos?**

Com `for` tradicional (`for (int i = 0; i < array.length; i++)`) ou com `for-each` (`for (Tipo elemento : array)`). Quando ha posicoes nulas, usar o for tradicional com verificacao `!= null` e mais seguro.

**Diferenca entre `length` e quantidade preenchida?**

`length` e a capacidade total (fixa desde a criacao). A quantidade preenchida e o numero de posicoes que ja receberam um objeto (nao sao `null`). Exemplo: `new Aluno[10]` tem `length == 10`, mas se apenas 3 posicoes foram preenchidas, so 3 referencias sao validas.

---