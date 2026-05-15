# Java 12 - Relacoes entre Objetos - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 12 - Relacoes entre Objetos ===

--- Criando a Escola (composicao: Endereco criado junto) ---

--- Criando Departamentos (composicao) ---
Departamentos criados. Se a Escola for extinta, eles tambem serao.

--- Criando Alunos fora da Escola (agregacao) ---
Alunos criados independentemente.
Se a Escola for extinta, os alunos continuam existindo!

--- Matriculando alunos (agregacao) ---

--- Estado completo da Escola ---
=== Escola: Escola Tecnica Java ===
CNPJ: 12.345.678/0001-99
  Endereco: Av. da Tecnologia, 100, Sao Paulo - CEP: 01310-100
Departamentos (3):
  Departamento: Informatica
  Departamento: Matematica
  Departamento: Portugues
Alunos matriculados (3):
  Aluno: Ana Lima (matricula: 1001)
  Aluno: Bruno Costa (matricula: 1002)
  Aluno: Carla Dias (matricula: 1003)

--- Alunos existem independente da Escola ---
aluno1 fora da escola:   Aluno: Ana Lima (matricula: 1001)
aluno2 fora da escola:   Aluno: Bruno Costa (matricula: 1002)

=== Resumo das Relacoes ===
ASSOCIACAO  -> objetos se usam, existencias independentes
AGREGACAO   -> pai contem filho, filho SOBREVIVE ao pai
              Exemplo: Escola-Aluno
COMPOSICAO  -> pai contem filho, filho NAO EXISTE sem o pai
              Exemplo: Escola-Departamento, Escola-Endereco
```

---

## Atividade 2 - Identificando as relacoes

**Endereco criado no construtor da Escola:**

Composicao. O `Endereco` e instanciado dentro do proprio construtor de `Escola` e nao tem existencia fora dela.

**Aluno criado fora e passado para `matricularAluno`:**

Agregacao. O `Aluno` ja existia antes de ser associado a `Escola`. Sua existencia e independente.

**Departamento criado por `criarDepartamento`:**

Composicao. O `Departamento` e criado e gerenciado inteiramente pela `Escola`. Sem ela, nao existiria.

---

## Atividade 3 - Agregacao vs Composicao

| Relacao | Classes | O filho sobrevive sem o pai? | Tipo |
|---------|---------|------------------------------|------|
| Escola - Aluno | Escola contem Alunos | Sim | Agregacao |
| Escola - Departamento | Escola contem Departamentos | Nao | Composicao |
| Escola - Endereco | Escola possui Endereco | Nao | Composicao |

---

## Atividade 4 - Cardinalidade

**Escola-Departamento:** Um para varios (1 escola para ate 10 departamentos).

**Escola-Aluno:** Um para varios (1 escola para ate 1000 alunos).

**Escola-Endereco:** Um para um (1 escola tem exatamente 1 endereco).

---

## Atividade 5 - Ciclo de vida

**O que acontece com os `Departamento` quando a Escola fecha?**

Eles sao destruidos junto com a Escola. Como foram criados dentro dela e nao ha referencia externa para eles, o GC os coleta.

**O que acontece com os `Aluno`?**

Os objetos `Aluno` continuam existindo. Eles foram criados externamente no `Principal.java` e as variaveis `aluno1`, `aluno2`, `aluno3` ainda os referenciam.

**O que acontece com o `Endereco`?**

E destruido junto com a Escola, pois foi criado internamente e nao ha referencia externa para ele.

**Por que a diferenca importa no design?**

Em sistemas reais, um aluno pode ser transferido para outra escola, ter historico preservado mesmo apos fechar uma instituicao, etc. Usar composicao para aluno destruiria dados que deveriam persistir. O tipo correto de relacao garante integridade dos dados.

---

## Atividade 6 - Perguntas finais

**O que e Associacao?**

A relacao mais fraca entre objetos. Objetos se usam (consomem servicos um do outro), mas cada um tem existencia totalmente independente.

**Qual e a diferenca principal entre Agregacao e Composicao?**

Na agregacao, o objeto filho sobrevive ao pai. Na composicao, o filho nao pode existir sem o pai — seu ciclo de vida e subordinado ao do pai.

**Composicao e um caso especial de qual outra relacao?**

Composicao e um caso especial (mais restritivo) de Agregacao.

**Exemplos reais:**

- Associacao: Um `Motorista` usa um `Carro` (ambos existem independentemente).
- Agregacao: Um `Time` tem `Jogadores` (se o time for dissolvido, os jogadores continuam existindo).
- Composicao: Um `Pedido` tem `ItensDoPedido` (se o pedido for cancelado, os itens daquele pedido deixam de existir).

---
