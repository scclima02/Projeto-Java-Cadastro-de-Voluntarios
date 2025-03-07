/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.VoluntarioDAO;
import model.Voluntario;
import java.sql.SQLException;

public class VoluntarioController {

    private VoluntarioDAO voluntarioDAO;

    public VoluntarioController() throws SQLException {
        this.voluntarioDAO = new VoluntarioDAO();
    }

    public void cadastrarVoluntario(Voluntario voluntario) throws SQLException {
        voluntarioDAO.cadastrarVoluntario(voluntario);
    }
}

