/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rashmini Saubagya
 */
public class DB {
    //Create connection between project and mysql
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "java_sport_management";
    private static Integer portNumber = 3306;
    private static String pass = ""; //no password
    
    //Create a function to create and return the connection
    public static Connection getConnection(){
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(pass);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return connection;
        
    }
}
