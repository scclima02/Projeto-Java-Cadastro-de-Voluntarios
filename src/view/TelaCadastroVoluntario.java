/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beto
 */
public class TelaCadastroVoluntario extends JFrame {
    private final JTextField campoNome;
    private final JButton botaoCadastrar;

    public TelaCadastroVoluntario() {
        setTitle("Cadastro de Voluntário");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        campoNome = new JTextField();
        botaoCadastrar = new JButton("Cadastrar");

        add(new JLabel("Nome:"));
        add(campoNome);
        add(botaoCadastrar);

        botaoCadastrar.addActionListener(e -> cadastrarVoluntario());
    }

    private void cadastrarVoluntario() {
        String nome = campoNome.getText();
        if (!nome.isEmpty()) {
            // Simular adição de voluntário
            JOptionPane.showMessageDialog(this, "Voluntário cadastrado: " + nome);
            campoNome.setText(""); // Limpar campo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira um nome");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroVoluntario().setVisible(true));
    }
}

