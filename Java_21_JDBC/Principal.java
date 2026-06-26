package Java_21_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

    private static final String URL = "jdbc:h2:./Java_21_JDBC/escola";

    public static void main(String[] args) throws SQLException {

        System.out.println("=== Exercicio 21 - JDBC Basico ===\n");

        try (Connection conexao = DriverManager.getConnection(URL, "sa", "")) {

            System.out.println("--- Conexao estabelecida ---");
            System.out.println("Conexao aberta: " + (conexao != null && !conexao.isClosed()));

            // --- CRIANDO A TABELA (Statement) ---
            System.out.println("\n--- Criando a tabela com Statement ---");
            try (Statement stmt = conexao.createStatement()) {
                stmt.execute("DROP TABLE IF EXISTS aluno");
                stmt.execute("CREATE TABLE aluno (" +
                        "matricula INT PRIMARY KEY, " +
                        "nome VARCHAR(100), " +
                        "nota DOUBLE)");
                System.out.println("Tabela 'aluno' criada.");
            }

            // --- INSERINDO OBJETOS COM PREPAREDSTATEMENT ---
            System.out.println("\n--- Inserindo objetos Aluno com PreparedStatement ---");
            Aluno[] alunos = {
                    new Aluno("Ana", 2024001, 8.5),
                    new Aluno("Bruno", 2024002, 6.0),
                    new Aluno("Carla", 2024003, 9.2)
            };

            String sqlInsert = "INSERT INTO aluno (matricula, nome, nota) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conexao.prepareStatement(sqlInsert)) {
                for (Aluno a : alunos) {
                    ps.setInt(1, a.getMatricula());
                    ps.setString(2, a.getNome());
                    ps.setDouble(3, a.getNota());
                    ps.executeUpdate();
                    System.out.println("Inserido: " + a.getNome());
                }
            }

            // --- SELECT (ResultSet) ---
            System.out.println("\n--- Consultando com Statement + ResultSet ---");
            try (Statement stmt = conexao.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT matricula, nome, nota FROM aluno ORDER BY matricula")) {
                while (rs.next()) {
                    System.out.println("Matricula: " + rs.getInt("matricula") +
                            " | Nome: " + rs.getString("nome") +
                            " | Nota: " + rs.getDouble("nota"));
                }
            }
            System.out.println("Observacao: o ResultSet devolve colunas soltas, NAO devolve objetos Aluno.");

            // --- UPDATE COM PARAMETRO ---
            System.out.println("\n--- Atualizando nota do Bruno (PreparedStatement) ---");
            try (PreparedStatement ps = conexao.prepareStatement("UPDATE aluno SET nota = ? WHERE matricula = ?")) {
                ps.setDouble(1, 7.0);
                ps.setInt(2, 2024002);
                int linhas = ps.executeUpdate();
                System.out.println("Linhas afetadas: " + linhas);
            }

            // --- DELETE ---
            System.out.println("\n--- Removendo Carla ---");
            try (PreparedStatement ps = conexao.prepareStatement("DELETE FROM aluno WHERE matricula = ?")) {
                ps.setInt(1, 2024003);
                int linhas = ps.executeUpdate();
                System.out.println("Linhas afetadas: " + linhas);
            }

            // --- SELECT FINAL ---
            System.out.println("\n--- Consultando apos update e delete ---");
            try (Statement stmt = conexao.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT matricula, nome, nota FROM aluno ORDER BY matricula")) {
                while (rs.next()) {
                    System.out.println("Matricula: " + rs.getInt("matricula") +
                            " | Nome: " + rs.getString("nome") +
                            " | Nota: " + rs.getDouble("nota"));
                }
            }

            // --- STATEMENT COM CONCATENACAO vs PREPAREDSTATEMENT ---
            System.out.println("\n--- Por que evitar concatenar valores em SQL ---");
            String entradaMaliciosa = "2024001 OR 1=1";
            String sqlVulneravel = "SELECT * FROM aluno WHERE matricula = " + entradaMaliciosa;
            System.out.println("SQL montado por concatenacao (NUNCA fazer isso): " + sqlVulneravel);
            System.out.println("Com PreparedStatement, esse mesmo valor seria tratado como dado, nunca como comando SQL.");

        }

        System.out.println("\n=== Conclusao ===");
        System.out.println("Connection: abre e fecha a ligacao com o banco (use try-with-resources).");
        System.out.println("Statement: executa SQL fixo. PreparedStatement: executa SQL com parametros.");
        System.out.println("ResultSet: percorre linhas de um SELECT, mas devolve colunas, nao objetos.");
        System.out.println("PreparedStatement evita SQL Injection ao tratar valores como dados, nao codigo.");

    }

}