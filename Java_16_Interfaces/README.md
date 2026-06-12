# Java 16 - Interfaces

## Objetivo

Entender o que e uma interface em Java: um contrato que define O QUE uma classe deve
fazer sem dizer COMO. Aprender a usar `implements` com multiplas interfaces e a diferenca
entre interface e classe abstrata.

## Arquivos

- `Descricao.java` - interface com contrato `getDescricao()`.
- `Calculavel.java` - interface com contrato `calcularMedia()` e metodo `default`.
- `Aluno.java` - implementa ambas as interfaces.
- `Turma.java` - implementa apenas `Descricao` (classes nao relacionadas, mesmo contrato).
- `Principal.java` - demonstra uso das interfaces e referencia pelo tipo da interface.
- `Questoes_Java_16_Interfaces.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_16_Interfaces\Descricao.java Java_16_Interfaces\Calculavel.java Java_16_Interfaces\Aluno.java Java_16_Interfaces\Turma.java Java_16_Interfaces\Principal.java
java Java_16_Interfaces.Principal
```
