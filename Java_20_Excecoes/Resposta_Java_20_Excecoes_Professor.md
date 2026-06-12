# Java 20 - Excecoes - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 20 - Excecoes ===

--- Try-catch basico ---
Excecao capturada: / by zero
Programa continua apos o catch.

--- NullPointerException ---
Excecao capturada: tentativa de usar objeto nulo.

--- ArrayIndexOutOfBoundsException ---
Excecao capturada: Index 5 out of bounds for length 3

--- Multiplos catch ---
TEXTO
Item null no indice: 1
Tipo incorreto no indice: 2
Indice fora do limite: 3

--- Throw: lancando excecao com regra de negocio ---
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Excecao capturada: Nota invalida: 15.0. Deve ser entre 0 e 10.

--- Finally ---
Dentro do try
Dentro do catch: / by zero
Dentro do finally — executa SEMPRE

=== Conclusao ===
Excecoes sinalizam erros em tempo de execucao.
try-catch impede que o programa quebre.
throw permite criar regras de negocio com validacao.
finally executa sempre, seja com excecao ou sem.
```

Obs.: A mensagem exata de `ArrayIndexOutOfBoundsException` pode variar entre versoes do Java.

---

## Atividade 2 - Try-catch basico

**O que e uma excecao?**

Um evento anormal que ocorre durante a execucao do programa — como divisao por zero, acesso a objeto nulo ou indice fora dos limites. Quando ocorre, Java cria um objeto representando o erro e interrompe o fluxo normal.

**O que teria acontecido sem try-catch?**

O programa teria encerrado imediatamente com uma mensagem de erro no terminal (stack trace), e nenhuma linha apos a excecao seria executada.

**A linha `System.out.println("Resultado: " + resultado)` e executada?**

Nao. A excecao e lancada na linha `10 / 0`, antes de qualquer atribuicao. O fluxo salta diretamente para o bloco `catch`, pulando o `println`.

**O que e `e.getMessage()`?**

Retorna a mensagem de texto associada a excecao — uma descricao do erro definida pelo proprio Java ou pelo programador ao lancar a excecao com `throw`. Para `ArithmeticException` de divisao por zero, a mensagem e `"/ by zero"`.

**Apos o catch, o programa continua?**

Sim. Apos o bloco `catch` ser executado, o programa segue normalmente a partir da linha apos o bloco try-catch.

---

## Atividade 3 - NullPointerException

**O que e NullPointerException e quando ocorre?**

E uma excecao lancada pela JVM quando tentamos usar (`chamar metodo`, `acessar atributo`) uma variavel que contem `null` — ou seja, que nao referencia nenhum objeto. E uma das excecoes mais comuns em Java.

**No exercicio 18, quando poderia acontecer?**

No exercicio 18, se o trecho `lista[i].apresentar()` fosse chamado sem o `if (lista[i] != null)`, a posicao `lista[1]` (que estava `null`) causaria `NullPointerException` ao tentar chamar `apresentar()` em uma referencia nula.

---

## Atividade 4 - Multiplos catch

**Para cada indice, qual excecao e lancada:**

- i = 0: Nenhuma. `itens[0]` e `"texto"`, cast para String funciona, `toUpperCase()` retorna `"TEXTO"`.
- i = 1: `NullPointerException`. `itens[1]` e `null`; ao tentar chamar `toUpperCase()` em `null`, a JVM lanca NPE.
- i = 2: `ClassCastException`. `itens[2]` e um `Integer` (42); ao tentar fazer cast `(String) 42`, o cast falha em tempo de execucao.
- i = 3: `ArrayIndexOutOfBoundsException`. O loop vai ate `i <= itens.length` (i=3), mas o ultimo indice valido e 2.

**Por que multiplos catch sao uteis?**

Permitem tratar cada tipo de erro de forma especifica. Um catch generico (`catch (Exception e)`) captura tudo, mas nao permite distinguir o motivo do erro nem agir de forma diferente para cada caso.

**A ordem dos catch importa?**

Sim. Java testa os catch de cima para baixo. Se `catch (Exception e)` viesse primeiro, ele capturaria todas as excecoes antes dos catch especificos — estes nunca seriam alcancados. O compilador inclusive rejeita essa ordem com um erro de compilacao.

---

## Atividade 5 - Throw

**O que faz `throw`?**

Lanca uma excecao de forma explicita no codigo. O fluxo e interrompido imediatamente na linha do `throw` e o controle passa para o catch correspondente mais proximo na pilha de chamadas.

**Por que validar no construtor e boa pratica?**

Porque garante que um objeto `Aluno` invalido nunca seja criado. Se a validacao ficasse no `Principal.java`, seria responsabilidade de cada parte do codigo lembrar de validar — o que leva a inconsistencias. Ao validar no construtor, a classe se auto-protege: e impossivel instanciar `Aluno` com nota fora do intervalo.

**O que aconteceria sem o catch de `IllegalArgumentException`?**

A excecao subiria pela pilha de chamadas sem ser capturada, encerraria o programa com um stack trace no terminal. O `Aluno` valido (Ana) ainda seria criado e seu `apresentar()` executado, pois o throw ocorre so ao tentar criar o segundo objeto.

---

## Atividade 6 - Finally

**O `finally` executa sempre?**

Sim. O bloco `finally` executa em todas as situacoes: quando o `try` termina normalmente (sem excecao), quando uma excecao e capturada pelo `catch`, e ate quando a excecao nao e capturada (o `finally` executa antes de propagar o erro).

**Uso mais comum do `finally` em aplicacoes reais?**

Fechar recursos que foram abertos no `try`: conexoes com banco de dados, arquivos, streams de entrada/saida. Isso garante que o recurso seja liberado mesmo que ocorra um erro durante o processamento.

---

## Atividade 7 - Perguntas finais

**Diferenca entre erro de compilacao e excecao em tempo de execucao?**

Erro de compilacao: detectado pelo compilador Java (`javac`) antes de o programa rodar. Exemplo: variavel nao declarada, tipo errado. O programa nem e gerado.
Excecao em tempo de execucao: ocorre enquanto o programa esta rodando. O compilador nao consegue prever (ex: o valor do denominador so e conhecido durante a execucao). O programa e compilado normalmente, mas falha ao rodar.

**O que significa lancar (`throw`) e capturar (`catch`) uma excecao?**

Lancar (`throw`): sinalizando que algo de errado aconteceu, criando um objeto de excecao e interrompendo o fluxo atual.
Capturar (`catch`): interceptar essa excecao em um ponto da pilha de chamadas, tratando o erro e permitindo que o programa continue.

**Cite duas excecoes e quando ocorrem:**

- `NullPointerException`: ao tentar chamar um metodo ou acessar um atributo de uma variavel que e `null`.
- `ArithmeticException`: ao tentar dividir um numero inteiro por zero.
- `ArrayIndexOutOfBoundsException`: ao acessar um indice negativo ou maior ou igual ao tamanho do array.
- `ClassCastException`: ao tentar converter (cast) um objeto para um tipo incompativel.
- `IllegalArgumentException`: ao passar um argumento invalido para um metodo ou construtor (geralmente lancada pelo proprio codigo com `throw`).

(Qualquer duas das listadas acima sao validas.)

---
