/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import dao.VoluntarioDAO;
import model.Voluntario;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class TelaCadastroVoluntario extends JFrame {
    private final JTextField campoNome;
    private final JTextField campoEmail;
    private final JTextField campoTelefone;
    private final JButton botaoCadastrar;

    public TelaCadastroVoluntario() {
        setTitle("Cadastro de Voluntário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        campoNome = new JTextField();
        campoEmail = new JTextField();
        campoTelefone = new JTextField();
        botaoCadastrar = new JButton("Cadastrar");

        add(new JLabel("Nome:"));
        add(campoNome);
        add(new JLabel("Email:"));
        add(campoEmail);
        add(new JLabel("Telefone:"));
        add(campoTelefone);
        add(botaoCadastrar);

        botaoCadastrar.addActionListener(e -> cadastrarVoluntario());
    }

    private void cadastrarVoluntario() {
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String telefone = campoTelefone.getText();

        if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        Voluntario voluntario = new Voluntario();
        voluntario.setNome(nome);
        voluntario.setEmail(email);
        voluntario.setTelefone(telefone);

        try {
            VoluntarioDAO dao = new VoluntarioDAO();
            dao.cadastrarVoluntario(voluntario);
            JOptionPane.showMessageDialog(this, "Voluntário cadastrado com sucesso!");
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar voluntário: " + ex.getMessage());
        }
    }

    private void limparCampos() {
        campoNome.setText("");
        campoEmail.setText("");
        campoTelefone.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroVoluntario().setVisible(true));
    }
}