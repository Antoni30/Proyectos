
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static java.sql.Connection conn;
   private static final String driver = "com.mysql.jdbc.Driver";
   private static final String user = "root";
   private static final String password = "";
   private static final String url = "jdbc:mysql://localhost/login?user=root&password=";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if (conn!=null) {
                //System.out.println("Coxecion a la Base de Datos Exitosa...");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
                
    }
   public java.sql.Connection getObtener()
   {
       return conn;
   }
   public void deconcectar()
   {
       conn=null;
       System.out.println("Desconcetado de la Base de Datos...");
       System.out.println("Desconexion Exitosa bye :) ");
   }

}
