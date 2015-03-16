/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author yves
 */
class Llibre {

    private String bn;
    private String editorial;
    private String autor;
    private String categoria;
    private String titol;
    private String ubicacio;

    public Llibre(String b, String ed, String au, String ca, String ti, String ub) {
        bn = b;
        editorial = ed;
        autor = au;
        categoria = ca;
        titol = ti;
        ubicacio = ub;

    }

    public String getBn() {
        return bn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitol() {
        return titol;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    @Override
    public String toString() {
        return bn + " \t " + editorial + " \t " + autor + " \t " + categoria + " \t " + titol + " \t " + ubicacio;
    }

}
