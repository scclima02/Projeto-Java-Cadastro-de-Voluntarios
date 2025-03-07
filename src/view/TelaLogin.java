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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beto
 */
public class TelaLogin extends JFrame {
    private final JTextField campoUsuario;
    private final JPasswordField campoSenha;
    private final JButton botaoLogin;

    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();
        botaoLogin = new JButton("Login");

        add(new JLabel("Usuário:"));
        add(campoUsuario);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(botaoLogin);

        botaoLogin.addActionListener(e -> fazerLogin());
    }

    private void fazerLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());
        if ("admin".equals(usuario) && "admin".equals(senha)) {
            new TelaPrincipal().setVisible(true); // Abre a tela principal
            this.dispose(); // Fecha a tela de login
        } else {
            JOptionPane.showMessageDialog(this, "Credenciais inválidas");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}

