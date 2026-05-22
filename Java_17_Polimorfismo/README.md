# Java 17 - Polimorfismo

## Objetivo

Entender polimorfismo em Java: como uma referencia da superclasse pode apontar para
objetos de diferentes subclasses (upcasting), como o metodo correto e escolhido em
tempo de execucao (vinculacao dinamica / dynamic binding) e como fazer downcasting
com seguranca usando `instanceof`.

## Arquivos

- `Pessoa.java` - superclasse abstrata.
- `Aluno.java` - subclasse com `apresentar()` proprio.
- `Funcionario.java` - subclasse com `apresentar()` proprio.
- `Principal.java` - demonstra upcasting, vinculacao dinamica e downcasting.
- `Questoes_Java_17_Polimorfismo.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_17_Polimorfismo\Pessoa.java Java_17_Polimorfismo\Aluno.java Java_17_Polimorfismo\Funcionario.java Java_17_Polimorfismo\Principal.java
java Java_17_Polimorfismo.Principal
```
