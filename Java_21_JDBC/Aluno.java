package Java_21_JDBC;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
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