/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Beto
 */


import model.Voluntario;

public class Main {
    public static void main(String[] args) {
        // Protótipo de cadastro de voluntário
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("João Silva");
        voluntario.setEmail("joao.silva@example.com");
        voluntario.setTelefone("123456789");
        
        System.out.println("Voluntário cadastrado: " + voluntario.getNome());
    }
}
