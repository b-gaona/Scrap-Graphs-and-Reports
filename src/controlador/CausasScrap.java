package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class CausasScrap {

    private int idcausa;
    private String nombreCausa;
    private boolean estado;
    private String fecha_causa;
    private int idempleado;
    private String numSerieProducto;
    private String opcion;
    private String posicion;
    private String zonaFA;
    private String pedestal;
    private String numSerieHousing;
    private String numSeriePCB;

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

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNumSerieProducto() {
        return numSerieProducto;
    }

    public void setNumSerieProducto(String numSerieProducto) {
        this.numSerieProducto = numSerieProducto;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getZonaFA() {
        return zonaFA;
    }

    public void setZonaFA(String zonaFA) {
        this.zonaFA = zonaFA;
    }

    public String getPedestal() {
        return pedestal;
    }

    public void setPedestal(String pedestal) {
        this.pedestal = pedestal;
    }

    public String getNumSerieHousing() {
        return numSerieHousing;
    }

    public void setNumSerieHousing(String numSerieHousing) {
        this.numSerieHousing = numSerieHousing;
    }

    public String getNumSeriePCB() {
        return numSeriePCB;
    }

    public void setNumSeriePCB(String numSeriePCB) {
        this.numSeriePCB = numSeriePCB;
    }

    @Override
    public String toString() {
        return nombreCausa;
    }

    public Vector<CausasScrap> mostrarCausasScrap(Integer idempleado) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<CausasScrap> vectorCausas = new Vector<>();
        CausasScrap causa = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from causasScrap where idempleado=" + idempleado);
            rs = ps.executeQuery();
            causa = new CausasScrap();
            causa.setIdcausa(0);
            causa.setNombreCausa("");
            vectorCausas.add(causa);

            while (rs.next()) {
                causa = new CausasScrap();
                causa.setIdcausa(rs.getInt("idScrap"));
                causa.setNombreCausa(rs.getString("nombreCausa"));
                causa.setIdempleado(rs.getInt("idempleado"));
                causa.setNumSerieProducto(rs.getString("numSerieProducto"));
                causa.setOpcion(rs.getString("opcion"));
                causa.setPosicion(rs.getString("posicion"));
                causa.setZonaFA(rs.getString("zonaFA"));
                causa.setPedestal(rs.getString("pedestal"));
                causa.setNumSerieHousing(rs.getString("numSerieHousing"));
                causa.setNumSeriePCB(rs.getString("numSeriePCB"));
                causa.setEstado(rs.getBoolean("estado"));
                causa.setFecha_causa(rs.getString("fecha_causa"));
                vectorCausas.add(causa);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorCausas;
    }
}
