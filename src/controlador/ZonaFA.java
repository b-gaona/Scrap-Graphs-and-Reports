package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class ZonaFA {

    private int idZona;
    private String nombreZona;

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    @Override
    public String toString() {
        return nombreZona;
    }

    public Vector<ZonaFA> mostrarZonas(Integer idempleado) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<ZonaFA> vectorZonas = new Vector<>();
        ZonaFA zona = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from zonaFA where idempleado=" + idempleado);
            rs = ps.executeQuery();
            zona = new ZonaFA();
            zona.setIdZona(0);
            zona.setNombreZona("");
            vectorZonas.add(zona);

            while (rs.next()) {
                zona = new ZonaFA();
                zona.setIdZona(rs.getInt("idZona"));
                zona.setNombreZona(rs.getString("nombreZona"));
                vectorZonas.add(zona);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorZonas;
    }

    public Vector<ZonaFA> mostrarZonas2(Integer idFA) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<ZonaFA> vectorZonas = new Vector<>();
        ZonaFA zona = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from zonaFAGrafica where idFA=" + idFA);
            rs = ps.executeQuery();
            zona = new ZonaFA();
            zona.setIdZona(0);
            zona.setNombreZona("");
            vectorZonas.add(zona);

            while (rs.next()) {
                zona = new ZonaFA();
                zona.setIdZona(rs.getInt("idZona"));
                zona.setNombreZona(rs.getString("nombreZona"));
                vectorZonas.add(zona);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorZonas;
    }
}
