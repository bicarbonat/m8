/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author yves
 */
class LlibreBD {

    Connection conn;

    public LlibreBD() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/examen", "administrador", "admin");
    }

    public void tancar() throws Exception {
        conn.close();
    }

    public void afegirLlibre(Llibre c) throws Exception {
        Statement update = conn.createStatement();
        String valors = "'" + c.getBn() + "'," + "'" + c.getEditorial() + "'," + "'" + c.getAutor() + "'," + "'" + c.getCategoria() + "'," + "'" + c.getTitol() + "'," + "'" + c.getUbicacio() + "'";

        update.executeUpdate("INSERT INTO LLIBRES VALUES(" + valors + ")");
    }

}
