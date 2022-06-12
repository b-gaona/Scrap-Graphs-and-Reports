package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class FA {

    private int idFA;
    private String nombreFA;
    private String numeroSerie;

    public int getIdFA() {
        return idFA;
    }

    public void setIdFA(int idFA) {
        this.idFA = idFA;
    }

    public String getNombreFA() {
        return nombreFA;
    }

    public void setNombreFA(String nombreFA) {
        this.nombreFA = nombreFA;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return nombreFA;
    }

    public Vector<FA> mostrarFA() {
        PreparedStatement ps;
        ResultSet rs;
        Vector<FA> vectorFA = new Vector<>();
        FA fa = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from FAs");
            rs = ps.executeQuery();
            fa = new FA();
            fa.setNombreFA("");
            vectorFA.add(fa);
            fa.setIdFA(0);

            while (rs.next()) {
                fa = new FA();
                fa.setIdFA(rs.getInt("idFA"));
                fa.setNombreFA(rs.getString("nombreFA"));
                fa.setNumeroSerie(rs.getString("numeroSerie"));
                vectorFA.add(fa);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorFA;
    }
}
