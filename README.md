# Exercícios Java — Orientação a Objetos (javaOO)

Conjunto de exercícios para suporte e prática no aprendizado de **Java** e **Orientação a Objetos**.

## Estrutura

- `Exercicio01_Classe/`
- `Exercicio02_Objeto/`
- `Exercicio03_New/`
- `Exercicio04_Vazio/`
- `Exercicio05_Preencher/`
- `Exercicio06_Ler_Atributos/`

Cada pasta geralmente possui:

- `Aluno.java`
- `Principal.java`
- um enunciado (`Exercicio_XX_*.md`)
- um arquivo de respostas (`Resposta_Exercicio_XX.md`)

## Como executar no Windows (PowerShell / CMD)

Os arquivos usam `package`, então a forma mais simples é compilar e executar a partir da **raiz** do repositório.

Exemplo (Exercício 04):

```bat
javac Exercicio04_Vazio\Aluno.java Exercicio04_Vazio\Principal.java
java Exercicio04_Vazio.Principal
```

Observação: em **PowerShell antigo (5.x)** o operador `&&` pode não funcionar. Prefira rodar em duas linhas (como acima).

## Como responder os exercícios

- Leia o enunciado `Exercicio_XX_*.md`.
- Rode o `Principal.java`.
- Copie a saída do console (quando solicitado).
- Responda as perguntas no `Resposta_Exercicio_XX.md` (ou no seu caderno).

## Fork: recebendo atualizações do repositório original (upstream)

Se você fez um fork e quer trazer atualizações do repositório original (upstream) para o seu fork (origin):

### 1) Configurar o upstream (uma vez)

```bat
git remote add upstream URL_DO_REPOSITORIO_ORIGINAL.git
git remote -v
```

### 2) Buscar atualizações

```bat
git fetch upstream
```

### 3) Mesclar na sua branch principal

```bat
git checkout main
git merge upstream/main
```

Se houver conflitos, resolva-os e finalize o merge.

### 4) Enviar para o seu fork (origin)

```bat
git push origin main
```

### Alternativa (interface do GitHub)

No seu fork, use **Sync fork** → **Update branch** quando houver atualizações.
