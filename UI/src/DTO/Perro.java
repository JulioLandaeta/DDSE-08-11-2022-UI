package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cetecom
 */
public class Perro {
    private String Nombre;
    private String Color;
    private int Chip;
    private boolean castrado;

    public Perro(String Nombre, String Color, int Chip, boolean castrado) {
        this.Nombre = Nombre;
        this.Color = Color;
        this.Chip = Chip;
        this.castrado = castrado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getChip() {
        return Chip;
    }

    public void setChip(int Chip) {
        this.Chip = Chip;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    /*@Override
    public String toString(){
        
    }*/
}
