package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import paquete1.ConexionABD;

public class RegistroCausas {

    public boolean registrarCubeta(Causas causa) { //De tipo booleano para mandar true si se registro o false si no.
        ConexionABD con = new ConexionABD();
        PreparedStatement ps;
        try {
            //Escribimos los datos que ya tenemos guardados en el objeto persona de la clase Registro
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("insert into registros (nombrecausa, idtarea, estado, fecha_causa, fecha_expiracion, numlote) values (?, ?, ?, ?, ?, ?)");
            ps.setString(1, causa.getNombreCausa()); //Se pone 1 porque es el primer campo de los 6 signos a rellenar
            ps.setInt(2, causa.getIdtarea());
            ps.setBoolean(3, causa.isEstado());
            ps.setString(4, causa.getFecha_causa());
            ps.setString(5, causa.getFecha_expiracion());
            ps.setString(6, causa.getNumlote());
            ps.executeUpdate();
            return true; //Se regresa true si si se pudo ingresar
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
            return false; //Se regresa false si hubo un error y no se puede ingresar
        }
    }

    public boolean registrarGel(Causas causa) { //De tipo booleano para mandar true si se registro o false si no.
        ConexionABD con = new ConexionABD();
        PreparedStatement ps;

        try {
            //Escribimos los datos que ya tenemos guardados en el objeto persona de la clase Registro
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("insert into registros (nombrecausa, idtarea, estado, fecha_causa, desperdicio) values (?, ?, ?, ?, ?)");
            ps.setString(1, causa.getNombreCausa()); //Se pone 1 porque es el primer campo de los 6 signos a rellenar
            ps.setInt(2, causa.getIdtarea());
            ps.setBoolean(3, causa.isEstado());
            ps.setString(4, causa.getFecha_causa());
            ps.setDouble(5, causa.getDesperdicio());
            ps.executeUpdate();
            return true; //Se regresa true si si se pudo ingresar
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
            return false; //Se regresa false si hubo un error y no se puede ingresar
        }
    }

    public boolean registrarScrap(CausasScrap causa) { //De tipo booleano para mandar true si se registro o false si no.
        ConexionABD con = new ConexionABD();
        PreparedStatement ps;

        try {
            //Escribimos los datos que ya tenemos guardados en el objeto persona de la clase Registro
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("insert into registrosScrap (nombrecausa, idempleado, numSerieProducto, opcion, posicion, zonaFA, pedestal, numSerieHousing, numSeriePCB, estado, fecha_causa) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, causa.getNombreCausa()); //Se pone 1 porque es el primer campo de los 6 signos a rellenar
            ps.setInt(2, causa.getIdempleado());
            ps.setString(3, causa.getNumSerieProducto());
            ps.setString(4, causa.getOpcion());
            ps.setString(5, causa.getPosicion());
            ps.setString(6, causa.getZonaFA());
            ps.setString(7, causa.getPedestal());
            ps.setString(8, causa.getNumSerieHousing());
            ps.setString(9, causa.getNumSeriePCB());
            ps.setBoolean(10, causa.isEstado());
            ps.setString(11, causa.getFecha_causa());
            ps.executeUpdate();
            return true; //Se regresa true si si se pudo ingresar
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
            return false; //Se regresa false si hubo un error y no se puede ingresar
        }
    }
}
