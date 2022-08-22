/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jhon fredy ospina ya
 */
public class Conexion {
    private static final String bbdd="jdbc:mysql://localhost:3306/senasoft";
    private static final String user="root";
    private static final String password="";
    private static Connection con;
    public static Connection connection(){
        try {
            Class.forName("com.jdbc.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(bbdd, user, password);
            System.out.println("Conexión exitosa");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }
            
}
