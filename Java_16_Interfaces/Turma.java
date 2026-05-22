package Java_16_Interfaces;

// Turma tambem implementa Descricao — mostra que a interface e um contrato
// que classes nao relacionadas podem assinar
public class Turma implements Descricao {

    private String codigo;
    private int vagas;

    public Turma(String codigo, int vagas) {
        this.codigo = codigo;
        this.vagas = vagas;
    }

    @Override
    public String getDescricao() {
        return "Turma: " + codigo + " | vagas: " + vagas;
    }

}
