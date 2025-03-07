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
public class TelaAtribuirTarefa extends JFrame {
    private JTextField campoIdVoluntario;
    private JTextField campoIdTarefa;
    private JButton botaoAtribuir;

    public TelaAtribuirTarefa() {
        setTitle("Atribuir Tarefa");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        campoIdVoluntario = new JTextField();
        campoIdTarefa = new JTextField();
        botaoAtribuir = new JButton("Atribuir");

        add(new JLabel("ID do Voluntário:"));
        add(campoIdVoluntario);
        add(new JLabel("ID da Tarefa:"));
        add(campoIdTarefa);
        add(botaoAtribuir);

        botaoAtribuir.addActionListener(e -> atribuirTarefa());
    }

    private void atribuirTarefa() {
        String idVoluntario = campoIdVoluntario.getText();
        String idTarefa = campoIdTarefa.getText();
        if (!idVoluntario.isEmpty() && !idTarefa.isEmpty()) {
            // Simular atribuição de tarefa
            JOptionPane.showMessageDialog(this, "Tarefa " + idTarefa + " atribuída ao Voluntário " + idVoluntario);
            campoIdVoluntario.setText(""); // Limpar campo
            campoIdTarefa.setText(""); // Limpar campo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaAtribuirTarefa().setVisible(true));
    }
}

