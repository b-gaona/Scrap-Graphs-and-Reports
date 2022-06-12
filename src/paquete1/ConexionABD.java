package paquete1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionABD {

    static Connection conn = null;
    static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    static String url = "jdbc:ucanaccess://C:\\BaseDeDatosReportesFA\\FADB_Prueba_Scrap.accdb";

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            conn = null;
        }
        return conn;
    }
}
