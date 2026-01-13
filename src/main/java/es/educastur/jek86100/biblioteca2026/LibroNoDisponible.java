package es.educastur.jek86100.biblioteca2026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1dawd04
 */
public class LibroNoDisponible extends Exception {
    public LibroNoDisponible(String cadena){
        super(cadena); //Permite llamar al constructor de exception
    }
}
