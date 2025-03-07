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
public class TelaCadastroTarefa extends JFrame {
    private JTextField campoNomeTarefa;
    private JTextField campoDescricao;
    private JButton botaoCadastrar;

    public TelaCadastroTarefa() {
        setTitle("Cadastro de Tarefa");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        campoNomeTarefa = new JTextField();
        campoDescricao = new JTextField();
        botaoCadastrar = new JButton("Cadastrar");

        add(new JLabel("Nome da Tarefa:"));
        add(campoNomeTarefa);
        add(new JLabel("Descrição:"));
        add(campoDescricao);
        add(botaoCadastrar);

        botaoCadastrar.addActionListener(e -> cadastrarTarefa());
    }

    private void cadastrarTarefa() {
        String nomeTarefa = campoNomeTarefa.getText();
        String descricao = campoDescricao.getText();
        if (!nomeTarefa.isEmpty() && !descricao.isEmpty()) {
            // Simular adição de tarefa
            JOptionPane.showMessageDialog(this, "Tarefa cadastrada: " + nomeTarefa);
            campoNomeTarefa.setText(""); // Limpar campo
            campoDescricao.setText(""); // Limpar campo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroTarefa().setVisible(true));
    }
}

