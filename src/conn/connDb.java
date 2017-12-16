/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author RASPUTIN
 */
public class connDb {
    Connection conn = null;
    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/repos?zeroDateTimeBehavior=convertToNull", "root","");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
