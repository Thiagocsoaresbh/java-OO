# Java 15 - Classes Abstratas

## Objetivo

Entender o que e uma classe abstrata (`abstract class`), por que ela nao pode ser
instanciada diretamente, o que e um metodo abstrato e como ele obriga as subclasses
a fornecerem sua propria implementacao.

## Arquivos

- `Pessoa.java` - classe abstrata com metodo abstrato `apresentar()`.
- `Aluno.java` - subclasse concreta que implementa `apresentar()`.
- `Funcionario.java` - outra subclasse concreta com implementacao diferente.
- `Principal.java` - demonstra instanciacao, heranca e referencia abstrata.
- `Questoes_Java_15_Abstrato.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_15_Abstrato\Pessoa.java Java_15_Abstrato\Aluno.java Java_15_Abstrato\Funcionario.java Java_15_Abstrato\Principal.java
java Java_15_Abstrato.Principal
```
