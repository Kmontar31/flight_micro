package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KEVIN MONTOYA ARDILA
 */
public class conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=flight_micro;"
                + "user=sa;"
                + "password=sa;";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
    }
    
}
