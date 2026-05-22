# Java 15 - Classes Abstratas - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 15 - Classes Abstratas ===

--- Instanciando subclasses ---
[Aluno] Maria | matricula: 2024001
[Funcionario] Sergio | cargo: Professor | salario: R$ 5000.0

--- Metodo concreto herdado (exibirIdade) ---
Maria tem 20 anos.
Sergio tem 40 anos.

--- Referencia do tipo Pessoa (abstrato) ---
[Aluno] Carlos | matricula: 2024002
[Funcionario] Ana | cargo: Coordenadora | salario: R$ 7000.0

=== Conclusao ===
Classe abstrata: nao pode ser instanciada diretamente.
Metodo abstrato: obriga subclasses a implementar.
Referencia abstrata: pode apontar para qualquer subclasse.
```

---

## Atividade 2 - Classe abstrata

**O que `abstract` antes de `class` significa?**

A classe e incompleta por design. Ela define o que as subclasses devem ter, mas nao pode ser usada para criar objetos diretamente.

**Por que nao faz sentido `new Pessoa("X", 0)`?**

`Pessoa` e um conceito geral demais. Na realidade, toda pessoa e especificamente um aluno, funcionario, cliente, etc. A classe abstrata forca o uso de uma subclasse concreta.

**O que e um metodo abstrato?**

Um metodo sem implementacao (sem corpo `{}`), declarado com `abstract`. Define o que a subclasse deve fazer, mas nao como.

**Diferenca entre `apresentar()` e `exibirIdade()`:**

`apresentar()` e abstrato: sem corpo, obriga subclasse a implementar. `exibirIdade()` e concreto: tem implementacao, e herdado sem necessidade de sobrescrever.

---

## Atividade 3 - Tentando instanciar

**Mensagem de erro:**

```text
error: Pessoa is abstract; cannot be instantiated
        Pessoa p = new Pessoa("X", 0);
                   ^
```

**O que o erro diz?**

Que `Pessoa` e abstrata e nao pode ser instanciada. O Java detecta isso em tempo de compilacao.

---

## Atividade 4 - Obrigatoriedade de implementacao

**Mensagem de erro:**

```text
error: Aluno is not abstract and does not override abstract method apresentar() in Pessoa
public class Aluno extends Pessoa {
       ^
```

**O que o erro diz?**

Que `Aluno` nao e abstrata e nao implementou o metodo abstrato `apresentar()` herdado de `Pessoa`. O compilador obriga a implementacao.

---

## Atividade 5 - Referencia abstrata

**`p1` e do tipo `Pessoa` ou `Aluno`?**

A referencia `p1` e do tipo `Pessoa` (declarada como `Pessoa p1`), mas o objeto em memoria e um `Aluno` (criado com `new Aluno(...)`).

**Qual versao de `apresentar()` e chamada?**

A versao de `Aluno`. Em Java, o metodo chamado e determinado pelo tipo real do objeto em memoria, nao pelo tipo da referencia. Isso e o polimorfismo dinamico.

**Vantagem de usar tipo abstrato como referencia?**

Permite escrever codigo que funciona para qualquer subclasse. Um metodo que recebe `Pessoa` funciona com `Aluno`, `Funcionario` ou qualquer futura subclasse.

---

## Atividade 6 - Perguntas finais

**Quando usar classe abstrata?**

Quando temos um conceito que e generalizacao demais para instanciar diretamente, mas que define comportamentos comuns e obrigatorios para suas especializacoes.

**Diferenca entre abstrata e concreta?**

Abstrata: pode ter metodos sem implementacao, nao pode ser instanciada. Concreta: todos os metodos tem implementacao, pode ser instanciada.

**Classe abstrata pode ter metodos concretos?**

Sim. Pode misturar metodos abstratos (obrigatorios nas subclasses) e concretos (herdados como estao).

**Classe abstrata pode ter construtores?**

Sim. O construtor nao e usado diretamente (pois nao da para instanciar), mas e chamado via `super()` pelas subclasses.

---
