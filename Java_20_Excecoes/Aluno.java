package Java_20_Excecoes;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota invalida: " + nota + ". Deve ser entre 0 e 10.");
        }
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public double getNota() { return nota; }

    public void apresentar() {
        System.out.println("Matricula: " + matricula + " | Nome: " + nome + " | Nota: " + nota);
    }

}
