package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import paquete1.ConexionABD;

public class Empleados {

    private int idempleado;
    private String nombre;

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Vector<Empleados> mostrarEmpleados(Integer idFA) {
        PreparedStatement ps;
        ResultSet rs;
        Vector<Empleados> vectorEmpleados = new Vector<>();
        Empleados empleado = null;

        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select * from empleados where idFA=" + idFA);
            rs = ps.executeQuery();
            empleado = new Empleados();
            empleado.setNombre("");
            vectorEmpleados.add(empleado);
            empleado.setIdempleado(0);

            while (rs.next()) {
                empleado = new Empleados();
                empleado.setIdempleado(rs.getInt("idempleado"));
                empleado.setNombre(rs.getString("nombre"));
                vectorEmpleados.add(empleado);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error " + ex);
        }
        return vectorEmpleados;
    }

}
