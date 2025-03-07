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

/**
 *
 * @author Beto
 */
public class TelaAtualizarStatusTarefa extends JFrame {
    private final JTextField campoIdTarefa;
    private final JTextField campoStatus;
    private final JButton botaoAtualizar;

    public TelaAtualizarStatusTarefa() {
        setTitle("Atualizar Status da Tarefa");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        campoIdTarefa = new JTextField();
        campoStatus = new JTextField();
        botaoAtualizar = new JButton("Atualizar");

        add(new JLabel("ID da Tarefa:"));
        add(campoIdTarefa);
        add(new JLabel("Status:"));
        add(campoStatus);
        add(botaoAtualizar);

        botaoAtualizar.addActionListener(e -> atualizarStatus());
    }

    private void atualizarStatus() {
        String idTarefa = campoIdTarefa.getText();
        String status = campoStatus.getText();
        if (!idTarefa.isEmpty() && !status.isEmpty()) {
            // Simular atualização de status de tarefa
            JOptionPane.showMessageDialog(this, "Status da Tarefa " + idTarefa + " atualizado para: " + status);
            campoIdTarefa.setText(""); // Limpar campo
            campoStatus.setText(""); // Limpar campo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
       

