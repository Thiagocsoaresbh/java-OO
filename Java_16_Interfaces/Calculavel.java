package Java_16_Interfaces;

// Segunda interface: define outro contrato independente
public interface Calculavel {

    double calcularMedia();

    // Metodo default (Java 8+): tem implementacao padrao, pode ser sobrescrito
    default String classificar(double media) {
        if (media >= 7.0) return "Aprovado";
        if (media >= 5.0) return "Recuperacao";
        return "Reprovado";
    }

}
