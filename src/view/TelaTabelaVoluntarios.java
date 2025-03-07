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
public class TelaTabelaVoluntarios extends JFrame {
    private JTable tabelaVoluntarios;

    public TelaTabelaVoluntarios() {
        setTitle("Tabela de Voluntários");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] nomesColunas = {"ID", "Nome"};
        Object[][] dados = {
            {1, "João Silva"},
            {2, "Maria Oliveira"}
        };

        tabelaVoluntarios = new JTable(dados, nomesColunas);
        add(new JScrollPane(tabelaVoluntarios));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaTabelaVoluntarios().setVisible(true));
    }
}

