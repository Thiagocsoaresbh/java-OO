# Java 18 - Arrays de Objetos - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Criando o array

**Analise o trecho:**

```java
Aluno[] turma = new Aluno[4];
System.out.println("turma[0] antes de preencher: " + turma[0]);
```

**O que e impresso na linha acima? Por que?**

R.

**Qual e a diferenca entre `new Aluno[4]` e `new Aluno(...)`?**

R.

**O que significa `turma.length`?**

R.

---

## Atividade 3 - Preenchendo e acessando

**Analise o trecho:**

```java
turma[0] = new Aluno("Ana", 2024001, 8.5);
System.out.println("turma[0] depois de preencher: " + turma[0]);
System.out.println("turma[0].getNome(): " + turma[0].getNome());
```

**Por que `turma[0]` imprime algo como `Java_18_Arrays.Aluno@3764951d` em vez do nome?**

R.

**Como acessamos o nome do objeto armazenado na posicao 0?**

R.

**O array armazena o objeto ou uma referencia ao objeto? Explique.**

R.

---

## Atividade 4 - For tradicional vs For-each

**Compare os dois trechos:**

```java
// For tradicional
for (int i = 0; i < turma.length; i++) {
    turma[i].apresentar();
}

// For-each
for (Aluno a : turma) {
    a.apresentar();
}
```

**Qual e a vantagem do for tradicional em relacao ao for-each?**

R.

**Qual e a vantagem do for-each?**

R.

**Em qual situacao voce PRECISA usar o for tradicional e nao pode usar o for-each?**

R.

---

## Atividade 5 - Posicao vazia (null)

**Analise o trecho:**

```java
Aluno[] lista = new Aluno[3];
lista[0] = new Aluno("Eva", 2024005, 7.0);
// lista[1] continua null
lista[2] = new Aluno("Felipe", 2024006, 8.0);

for (int i = 0; i < lista.length; i++) {
    if (lista[i] != null) {
        lista[i].apresentar();
    } else {
        System.out.println("lista[" + i + "] -> vazia (null)");
    }
}
```

**O que aconteceria se removessemos o `if (lista[i] != null)` e chamassemos `lista[i].apresentar()` diretamente?**

R.

**Qual erro seria lancado?**

R.

**Por que e importante verificar `null` antes de usar uma posicao do array?**

R.

---

## Atividade 6 - Perguntas finais

**O que e um array de objetos em Java?**

R.

**Qual e o valor padrao de cada posicao de um array de objetos recem-criado?**

R.

**Como percorremos todos os elementos de um array de objetos?**

R.

**Qual e a diferenca entre o tamanho do array (`length`) e a quantidade de objetos realmente preenchidos?**

R.

---