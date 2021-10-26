/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author dmoth
 */
public class DB {

    public static Connection c;

    public static void SetUpConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3309/FLY", "root", "123");
    }

    public static void IUD(String sql) throws Exception {
        if (c == null) {
            SetUpConnection();
        }
        c.createStatement().executeUpdate(sql);  
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            SetUpConnection();
        }
        return c.createStatement().executeQuery(sql);
    }
}
