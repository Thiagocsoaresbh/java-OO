package Java_21_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {

    private static final String URL = "jdbc:h2:./Java_21_JDBC/escola";

    public static void main(String[] args) throws SQLException {

        System.out.println("=== Consultando o banco ja existente ===\n");

        try (Connection conexao = DriverManager.getConnection(URL, "sa", "");
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT matricula, nome, nota FROM aluno ORDER BY matricula")) {

            while (rs.next()) {
                System.out.println("Matricula: " + rs.getInt("matricula") +
                        " | Nome: " + rs.getString("nome") +
                        " | Nota: " + rs.getDouble("nota"));
            }
        }
    }

}
