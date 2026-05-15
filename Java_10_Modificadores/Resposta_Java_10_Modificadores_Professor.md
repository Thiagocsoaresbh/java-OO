# Java 10 - Modificadores de Acesso - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 10 - Modificadores de Acesso ===

--- Acesso a atributos ---
nome  (public)    : Joao
idade (via getter) : 18
turma (protected) : TI-01
escola (sem mod.) : Escola Padrao

--- Chamando metodos publicos ---
Nome: Joao | Turma: TI-01 | Idade: 18
Codigo: TI-01-J18

--- Modificando atributos ---
Nome alterado: Joao Silva

=== Resumo dos Modificadores ===
public    -> visivel para todos
private   -> visivel so dentro da propria classe
protected -> visivel na classe e em subclasses
(nenhum)  -> visivel apenas no mesmo pacote
```

---

## Atividade 2 - A declaracao correta de uma classe

**Alternativa correta: D) `public class Aluno{}`**

**Por que as outras estao erradas:**

- A) `Private class Aluno{}`: Classes de nivel superior nao podem ser `private`. Esse modificador so e valido para classes internas (inner classes).

- B) `Class Aluno{}`: `Class` com C maiusculo nao existe em Java. A palavra-chave e `class` (minusculo). Sem modificador, a classe seria package-private.

- C) `Protected class Aluno{}`: `protected` nao e valido para classes de nivel superior, apenas para membros (atributos e metodos) e classes internas.

- E) `extends class Aluno{}`: `extends` nao e modificador de classe, e uma palavra-chave usada para heranca (`class Filho extends Pai`). A sintaxe esta completamente errada.

---

## Atividade 3 - Identificando os modificadores

| Atributo/Metodo | Modificador | Visibilidade |
|-----------------|-------------|--------------|
| `nome` | `public` | Todos (qualquer classe, qualquer pacote) |
| `idade` | `private` | Somente dentro de `Aluno` |
| `turma` | `protected` | Classe + subclasses + mesmo pacote |
| `escola` | (nenhum) | Somente no mesmo pacote |
| `getIdade()` | `public` | Todos |
| `gerarCodigo()` | `private` | Somente dentro de `Aluno` |
| `exibirCodigo()` | `public` | Todos |

---

## Atividade 4 - Tentando acessar o que nao pode

**Mensagem de erro esperada:**

```text
error: idade has private access in Aluno
        aluno1.idade = 25;
              ^
1 error
```

**Por que o compilador nao permite esse acesso?**

Porque `idade` foi declarado como `private`, o que restringe seu acesso exclusivamente ao interior da classe `Aluno`. A classe `Principal` e externa, portanto nao pode acessar diretamente.

**Como e possivel alterar a idade de forma correta?**

Criando um metodo setter publico na classe `Aluno`, por exemplo `public void setIdade(int idade)`, e chamando `aluno1.setIdade(25)` a partir do `Principal`.

---

## Atividade 5 - Composicao de modificadores

- `public`: modificador de acesso — o metodo e visivel de qualquer lugar.
- `static`: o metodo pertence a classe e nao a uma instancia. Pode ser chamado sem criar objeto.
- `void`: tipo de retorno — o metodo nao retorna nenhum valor.
- `main`: nome do metodo — nome especial reconhecido pela JVM como ponto de entrada do programa.

---

## Atividade 6 - Perguntas finais

**O que e um modificador de acesso?**

Uma palavra-chave que define quem pode acessar um atributo ou metodo: `public`, `private`, `protected` ou nenhum (package-private).

**Qual modificador torna um atributo acessivel SOMENTE dentro da propria classe?**

`private`.

**Qual modificador torna um atributo acessivel de qualquer lugar?**

`public`.

**Por que usamos getters em vez de deixar tudo `public`?**

Para controlar e validar o acesso aos dados. Com getters podemos adicionar logica (ex: validacao) antes de retornar ou alterar um valor, mantendo a integridade do objeto.

**O que e um metodo `private` e quando ele e util?**

E um metodo que so pode ser chamado dentro da propria classe. E util para encapsular logica interna que nao deve ser exposta para o exterior, como o metodo `gerarCodigo()` neste exercicio.

---
