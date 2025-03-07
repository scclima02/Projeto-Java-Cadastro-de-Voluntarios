/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("Sistema de Voluntários");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnCadastroVoluntario = new JButton("Cadastrar Voluntário");
        JButton btnCadastroTarefa = new JButton("Cadastrar Tarefa");
        JButton btnListarVoluntarios = new JButton("Listar Voluntários");

        panel.add(btnCadastroVoluntario);
        panel.add(btnCadastroTarefa);
        panel.add(btnListarVoluntarios);

        add(panel);

        btnCadastroVoluntario.addActionListener(e -> new TelaCadastroVoluntario().setVisible(true));
        btnCadastroTarefa.addActionListener(e -> new TelaCadastroTarefa().setVisible(true));
        btnListarVoluntarios.addActionListener(e -> new TelaTabelaVoluntarios().setVisible(true));
    }
}