package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class Tareas {

    private int idtarea;
    private String nombreTarea;

    public int getIdtarea() {
        return idtarea;
    }

    public void setIdtarea(int idtarea) {
        this.idtarea = idtarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    @Override
    public String toString() {
        return nombreTarea;
    }

    public Vector<Tareas> mostrarTareas(Integer idZona) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<Tareas> vectorTareas = new Vector<>();
        Tareas tarea = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from tareas where idZona=" + idZona);
            rs = ps.executeQuery();
            tarea = new Tareas();
            tarea.setIdtarea(0);
            tarea.setNombreTarea("");
            vectorTareas.add(tarea);

            while (rs.next()) {
                tarea = new Tareas();
                tarea.setIdtarea(rs.getInt("idtarea"));
                tarea.setNombreTarea(rs.getString("nombreTarea"));
                vectorTareas.add(tarea);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorTareas;
    }
}
