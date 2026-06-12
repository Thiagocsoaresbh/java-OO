# Java 09 - Encapsulamento - Gabarito do Professor

---

## Atividade 1 - Execute e observe

**Saida esperada:**

```text
=== Exercicio 09 - Encapsulamento ===

--- Criados dois alunos com sucesso ---

--- Usando GETTERS (leitura via metodo) ---
Aluno 1: Joao Silva (18 anos)
Aluno 2: Maria Santos (16 anos)

--- Usando SETTERS (modificacao com validacao) ---

Tentando mudar nome de aluno1 para 'Carlos':
Nome atualizado com sucesso!

Tentando mudar nome de aluno1 para 'AB':
Erro: Nome deve ter pelo menos 3 caracteres!

Tentando mudar nome de aluno1 para '':
Erro: Nome nao pode ser vazio!

Tentando mudar idade de aluno1 para 19:
Idade atualizada com sucesso!

Tentando mudar idade de aluno1 para -5:
Erro: Idade nao pode ser negativa!

Tentando mudar idade de aluno1 para 200:
Erro: Idade nao pode ser maior que 150 anos!
```

---

## Atividade 2 - Comparando com exercicios anteriores

**O que seria possivel fazer sem encapsulamento que agora e bloqueado?**

Com atributos `public`, era possivel fazer `aluno.nome = ""` ou `aluno.idade = -50` sem nenhum impedimento. Com `private` e setters, essas atribuicoes invalidas sao bloqueadas.

---

## Atividade 3 - Entendendo a validacao

**Qual tentativa de modificar o nome foi aceita?**

A tentativa com 'Carlos' foi aceita.

**Qual foi rejeitada por ser muito curta?**

A tentativa com 'AB' (2 caracteres) foi rejeitada.

**Qual foi rejeitada por ser vazia?**

A tentativa com '' (string vazia) foi rejeitada.

---

## Atividade 4 - Perguntas

**O que e encapsulamento?**

Encapsulamento e um pilar da OO que significa proteger os dados dentro de uma classe e permitir acesso controlado via getters e setters.

**Qual e a diferenca entre `public` e `private`?**

Public: qualquer parte do codigo pode acessar/modificar diretamente. Private: so a propria classe pode acessar.

**O que um getter faz?**

Um getter e um metodo publico que permite ler o valor de um atributo private.

**O que um setter faz?**

Um setter e um metodo publico que permite modificar um atributo private, com validacao.

**Por que usar setters em vez de permitir acesso direto aos atributos?**

Porque sem setters qualquer codigo pode colocar valores invalidos. Com setters ha validacao que garante a integridade dos dados.

**O que significa validacao de dados?**

Validacao significa verificar se um valor e aceitavel antes de atribui-lo.

**Qual e a convencao de nomes para getters e setters em Java?**

A convencao e `get` + nome do atributo com inicial maiuscula para leitura (`getNome()`) e `set` + nome para escrita (`setNome()`).

---

## Atividade 5 - Modificando a validacao

**Saida esperada:**

```text
Erro: Nome nao pode ter mais de 50 caracteres!
```

---

## Atividade 6 - Reflexao final

**Se todos os atributos fossem `public`, qual seria o problema?**

Os dados poderiam ficar invalidos - qualquer codigo poderia atribuir valores absurdos sem controle.

**Se todos fossem `private` sem getters/setters, qual seria o problema?**

O objeto existiria mas seria inutilizavel - nao haveria como ler ou modificar nenhum dado de fora da classe.

**Qual e o balanco correto entre `private` e getters/setters?**

`private` para os atributos + `public` getters para leitura e setters com validacao para escrita.

**Na sua profissao, por que encapsulamento e importante?**

Em sistemas criticos (bancos, hospitais), dados invalidos podem causar erros graves. Encapsulamento garante que os dados sempre estejam em estado valido.

**Voce implementaria encapsulamento em todas as classes que cria?**

Sim, e uma boa pratica em qualquer sistema real.

---
