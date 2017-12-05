/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rukundomysqljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ELIEZEL
 */
public class Myconnection {
    Connection con;

    public Myconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            //pou afficher l erreur
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque", "root", "root");
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    Connection obtenirconnexion() {
        return con;
    }
}
    


    

