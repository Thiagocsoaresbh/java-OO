# Java 14 - Sobrescrita de Metodos (@Override)

## Objetivo

Entender como uma subclasse pode redefinir (sobrescrever) um metodo da superclasse usando
`@Override`, como chamar a versao original com `super.metodo()` e por que cada subclasse
pode ter um comportamento diferente para o mesmo metodo.

## Arquivos

- `Pessoa.java` - superclasse com `apresentar()` base.
- `Aluno.java` - sobrescreve `apresentar()` com dados do aluno.
- `ProfessorJava.java` - sobrescreve `apresentar()` com dados do professor.
- `Principal.java` - demonstra a sobrescrita e o uso de `super`.
- `Questoes_Java_14_Sobrescrita.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_14_Sobrescrita\Pessoa.java Java_14_Sobrescrita\Aluno.java Java_14_Sobrescrita\ProfessorJava.java Java_14_Sobrescrita\Principal.java
java Java_14_Sobrescrita.Principal
```
