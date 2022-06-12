package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class Causas {

    private int idcausa;
    private String nombreCausa;
    private boolean estado;
    private String fecha_causa;
    private int idtarea;
    private String numlote;
    private String fecha_expiracion;
    private double desperdicio;

    public int getIdcausa() {
        return idcausa;
    }

    public void setIdcausa(int idcausa) {
        this.idcausa = idcausa;
    }

    public String getNombreCausa() {
        return nombreCausa;
    }

    public void setNombreCausa(String nombreCausa) {
        this.nombreCausa = nombreCausa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha_causa() {
        return fecha_causa;
    }

    public void setFecha_causa(String fecha_causa) {
        this.fecha_causa = fecha_causa;
    }

    public int getIdtarea() {
        return idtarea;
    }

    public void setIdtarea(int idtarea) {
        this.idtarea = idtarea;
    }

    public String getNumlote() {
        return numlote;
    }

    public void setNumlote(String numlote) {
        this.numlote = numlote;
    }

    public String getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(String fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public double getDesperdicio() {
        return desperdicio;
    }

    public void setDesperdicio(double desperdicio) {
        this.desperdicio = desperdicio;
    }

    @Override
    public String toString() {
        return nombreCausa;
    }

    public Vector<Causas> mostrarCausas(Integer idtarea) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<Causas> vectorCausas = new Vector<>();
        Causas causa = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from causas where idtarea=" + idtarea);
            rs = ps.executeQuery();
            causa = new Causas();
            causa.setIdcausa(0);
            causa.setNombreCausa("");
            vectorCausas.add(causa);

            while (rs.next()) {
                causa = new Causas();
                causa.setIdcausa(rs.getInt("idcausa"));
                causa.setNombreCausa(rs.getString("nombreCausa"));
                causa.setEstado(rs.getBoolean("estado"));
                causa.setFecha_causa(rs.getString("fecha_causa"));
                causa.setIdtarea(rs.getInt("idtarea"));
                causa.setFecha_expiracion(rs.getString("fecha_expiracion"));
                causa.setDesperdicio(rs.getDouble("desperdicio"));
                causa.setNumlote(rs.getString("numlote"));
                vectorCausas.add(causa);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorCausas;
    }
}
