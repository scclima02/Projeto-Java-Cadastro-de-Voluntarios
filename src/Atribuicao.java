/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Beto
 */


public class Atribuicao {
    private int id;
    private int voluntarioId;
    private int tarefaId;
    
    public Atribuicao() {}

    public Atribuicao(int id, int voluntarioId, int tarefaId) {
        this.id = id;
        this.voluntarioId = voluntarioId;
        this.tarefaId = tarefaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoluntarioId() {
        return voluntarioId;
    }

    public void setVoluntarioId(int voluntarioId) {
        this.voluntarioId = voluntarioId;
    }

    public int getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }
}

