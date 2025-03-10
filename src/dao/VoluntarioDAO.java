/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Voluntario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoluntarioDAO {

    // Cadastrar um novo voluntário
    public void cadastrarVoluntario(Voluntario voluntario) throws SQLException {
        String sql = "INSERT INTO Voluntarios (nome, email, telefone) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, voluntario.getNome());
            stmt.setString(2, voluntario.getEmail());
            stmt.setString(3, voluntario.getTelefone());
            stmt.executeUpdate();
        }
    }

    // Listar todos os voluntários
    public List<Voluntario> listarVoluntarios() throws SQLException {
        String sql = "SELECT * FROM Voluntarios";
        List<Voluntario> voluntarios = new ArrayList<>();
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Voluntario voluntario = new Voluntario();
                voluntario.setId(rs.getInt("id"));
                voluntario.setNome(rs.getString("nome"));
                voluntario.setEmail(rs.getString("email"));
                voluntario.setTelefone(rs.getString("telefone"));
                voluntarios.add(voluntario);
            }
        }
        return voluntarios;
    }

    // Atualizar um voluntário existente
    public void atualizarVoluntario(Voluntario voluntario) throws SQLException {
        String sql = "UPDATE Voluntarios SET nome = ?, email = ?, telefone = ? WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, voluntario.getNome());
            stmt.setString(2, voluntario.getEmail());
            stmt.setString(3, voluntario.getTelefone());
            stmt.setInt(4, voluntario.getId());
            stmt.executeUpdate();
        }
    }

    // Excluir um voluntário pelo ID
    public void excluirVoluntario(int id) throws SQLException {
        String sql = "DELETE FROM Voluntarios WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}