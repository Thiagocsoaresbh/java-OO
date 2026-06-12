package Java_16_Interfaces;

// Uma classe pode implementar MULTIPLAS interfaces (diferente de heranca)
public class Aluno implements Descricao, Calculavel {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Implementando o contrato de Descricao
    @Override
    public String getDescricao() {
        return "Aluno: " + nome + " | notas: " + nota1 + " e " + nota2;
    }

    // Implementando o contrato de Calculavel
    @Override
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getNome() { return nome; }

}
