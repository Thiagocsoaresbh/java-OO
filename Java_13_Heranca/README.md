# Java 13 - Heranca

## Objetivo

Entender o mecanismo de heranca em Java: como uma subclasse reutiliza atributos e metodos
de uma superclasse usando `extends`, como usar `super()` no construtor e o que significa
a relacao "is-a" (todo Aluno E UMA Pessoa).

## Arquivos

- `Pessoa.java` - superclasse com nome e idade.
- `Aluno.java` - subclasse que herda de Pessoa e adiciona matricula.
- `Principal.java` - demonstra heranca, metodos herdados e `instanceof`.
- `Questoes_Java_13_Heranca.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_13_Heranca\Pessoa.java Java_13_Heranca\Aluno.java Java_13_Heranca\Principal.java
java Java_13_Heranca.Principal
```
