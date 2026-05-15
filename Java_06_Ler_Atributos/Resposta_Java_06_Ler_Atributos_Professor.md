# Java 06 - Ler atributos - Gabarito do Professor

---

## Atividade 1 - Executando o codigo base

**Saida esperada:**

```text
Maria
20
```

**O que significa ler um atributo?**

Significa acessar o valor armazenado em um atributo do objeto, sem altera-lo.

**Qual atributo foi lido em cada `println`?**

O primeiro leu `objetoAluno.nome` ('Maria'). O segundo leu `objetoAluno.idade` (20).

---

## Atividade 2 - Alterando valores e lendo novamente

**Saida esperada:**

```text
Ana
17
```

**O que mudou na leitura dos atributos?**

Os valores impressos mudaram de 'Maria'/20 para 'Ana'/17.

**Por que a saida mudou?**

Porque os atributos foram reatribuidos. O `println` sempre imprime o valor atual no momento em que e executado.

---

## Atividade 3 - Lendo em forma de texto

**Saida esperada:**

```text
Aluno: Ana
Idade: 17
```

**Qual e a diferenca entre imprimir apenas o valor e imprimir com texto?**

Imprimir so o valor exibe o dado bruto. Com texto concatenado, a saida fica mais legivel.

**O conteudo lido mudou?**

Nao. O valor do atributo continua o mesmo - apenas a forma de exibicao mudou.

---

## Atividade 4 - Lendo antes de preencher

**Saida esperada:**

```text
null
0
Lucas
21
```

**Quais valores aparecem antes de preencher?**

`null` para `nome` e `0` para `idade`.

**Por que esses valores aparecem?**

Sao os valores padrao que o Java atribui automaticamente quando um objeto e criado sem dados preenchidos.

---

## Atividade 5 - Lendo valores de mais de um objeto

**Saida esperada:**

```text
Ana
17
Lucas
21
```

**Como a leitura confirma que existem objetos diferentes?**

Cada objeto retorna seus proprios valores. Se fossem o mesmo objeto, os valores seriam identicos.

**O que aconteceria se ambos os objetos fossem o mesmo?**

As duas leituras produziriam a mesma saida, pois ambas as variaveis apontariam para o mesmo espaco na memoria.

---

## Atividade 6 - Explicacao final

**O que e ler um atributo em Java?**

Acessar o valor armazenado usando `objeto.atributo` sem modifica-lo.

**Qual a diferenca entre preencher e ler?**

Preencher grava um valor. Ler acessa esse valor sem altera-lo.

**O que significa acessar `objeto.atributo`?**

Entrar no espaco de memoria daquele objeto e buscar o valor guardado naquele campo.

**O que voce aprendeu neste exercicio?**

Que ler atributos e simples e sempre retorna o valor atual - antes de preencher, retorna os valores padrao.

---
