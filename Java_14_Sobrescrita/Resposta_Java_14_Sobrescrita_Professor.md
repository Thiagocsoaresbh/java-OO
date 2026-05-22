# Java 14 - Sobrescrita de Metodos - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 14 - Sobrescrita de Metodos (@Override) ===

--- Pessoa (sem sobrescrita) ---
Pessoa: Carlos, 45 anos.

--- Aluno (com @Override) ---
Aluno: Maria | idade: 20 | matricula: 2024001

--- Professor (com @Override) ---
Professor: Sergio | disciplina: Java OO

--- Chamando super.apresentar() de dentro de Aluno ---
(versao Pessoa) -> Pessoa: Maria, 20 anos.

--- Todos chamando apresentar() ---
Pessoa: Carlos, 45 anos.
Aluno: Maria | idade: 20 | matricula: 2024001
Professor: Sergio | disciplina: Java OO

=== Conclusao ===
@Override substitui o metodo da superclasse.
super.metodo() acessa a versao da superclasse.
Cada subclasse pode ter seu proprio comportamento.
```

---

## Atividade 2 - Entendendo @Override

**O que `@Override` significa?**

E uma anotacao que avisa ao compilador: "este metodo esta sobrescrevendo um metodo da superclasse". O compilador verifica se o metodo realmente existe na superclasse com a mesma assinatura.

**O que aconteceria com `@Override` em metodo inexistente na superclasse?**

O compilador gera um erro: "method does not override or implement a method from a supertype". Impede a compilacao.

**Para que serve `@Override` se funciona sem ele?**

Sem ele, um erro de digitacao no nome criaria um novo metodo em vez de sobrescrever, sem avisar. `@Override` torna o erro detectavel em tempo de compilacao.

---

## Atividade 3 - Comparando as saidas

| Chamada | Saida esperada |
|---------|----------------|
| `pessoa1.apresentar()` | `Pessoa: Carlos, 45 anos.` |
| `aluno1.apresentar()` | `Aluno: Maria \| idade: 20 \| matricula: 2024001` |
| `prof1.apresentar()` | `Professor: Sergio \| disciplina: Java OO` |
| `aluno1.apresentarOriginal()` | `(versao Pessoa) -> Pessoa: Maria, 20 anos.` |

---

## Atividade 4 - super.metodo()

**O que faz `super.apresentar()`?**

Chama o metodo `apresentar()` da superclasse (`Pessoa`), ignorando a versao sobrescrita da propria classe.

**Quando seria util?**

Quando a subclasse quer ESTENDER o comportamento original (adicionar coisas) em vez de substituir totalmente. Ex: chamar `super.apresentar()` e depois imprimir informacoes extras.

---

## Atividade 5 - Experimentando

**Sem `@Override` e com nome errado (`apressentar`):**

O codigo compila sem erro! O Java cria um metodo novo chamado `apressentar` sem sobrescrever nada. Ao chamar `aluno1.apresentar()`, o Java usaria o metodo herdado de `Pessoa`.

**Com `@Override` e nome errado:**

O compilador gera erro: o metodo anotado nao existe na superclasse. O problema e detectado antes de executar.

**Vantagem do `@Override`:**

Detecta erros de digitacao e mudancas na superclasse em tempo de compilacao, evitando bugs silenciosos.

---

## Atividade 6 - Perguntas finais

**O que e sobrescrita (override)?**

Redefinir em uma subclasse um metodo que ja existe na superclasse, com a mesma assinatura, para mudar seu comportamento.

**Diferenca entre sobrescrita e sobrecarga:**

Sobrescrita (override): mesmo nome, mesma assinatura, em classes diferentes (subclasse sobrescreve superclasse). Sobrecarga (overloading): mesmo nome, assinaturas diferentes, na mesma classe.

**O que faz `super.metodo()`?**

Chama a versao do metodo que esta na superclasse, ignorando a versao da propria classe.

**Por que `@Override` e boa pratica?**

Documenta a intencao, permite que o compilador verifique a corretude, e facilita a manutencao (se a superclasse mudar, o compilador avisara).

---
