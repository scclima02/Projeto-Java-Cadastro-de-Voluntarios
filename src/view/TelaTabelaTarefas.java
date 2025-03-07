/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beto
 */
public class TelaTabelaTarefas extends JFrame {
    private JTable tabelaTarefas;

    public TelaTabelaTarefas() {
        setTitle("Tabela de Tarefas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] nomesColunas = {"ID", "Nome da Tarefa", "Descrição"};
        Object[][] dados = {
            {1, "Limpar o parque", "Limpar o parque da cidade"},
            {2, "Ajudar no abrigo", "Auxiliar no abrigo local"}
        };

        tabelaTarefas = new JTable(dados, nomesColunas);
        add(new JScrollPane(tabelaTarefas));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaTabelaTarefas().setVisible(true));
    }
}

