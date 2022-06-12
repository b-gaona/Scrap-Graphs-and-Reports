package paquete1;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class eliminarDatos extends javax.swing.JPanel {

    public eliminarDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGrupo = new javax.swing.ButtonGroup();
        etiquetaEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNombre = new javax.swing.JTable();
        botonFA = new javax.swing.JRadioButton();
        botonEmpleado = new javax.swing.JRadioButton();
        cajaAyuda = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        botonGrupo.add(botonFA);
        botonGrupo.add(botonEmpleado);

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaEliminar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaEliminar.setText("Seleccione lo que quiere eliminar:");
        add(etiquetaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        tablaNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
            }
        ));
        tablaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNombreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaNombre);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 170));

        botonFA.setBackground(new java.awt.Color(204, 204, 204));
        botonFA.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        botonFA.setText("FA");
        botonFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFAActionPerformed(evt);
            }
        });
        add(botonFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        botonEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        botonEmpleado.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        botonEmpleado.setText("Empleado");
        botonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadoActionPerformed(evt);
            }
        });
        add(botonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        cajaAyuda.setVisible(false);
        add(cajaAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 260, -1));

        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusPainted(false);
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 30));

        jLabel1.setText("ELIMINAR");
        jLabel1.setVisible(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 124, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoInfo.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void rellenartabla() {
        if (botonFA.isSelected()) {
            DefaultTableModel modeloTabla = new DefaultTableModel();
            tablaNombre.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                Connection conexion = ConexionABD.getConnection();
                ps = conexion.prepareStatement("select nombreFA, numeroSerie from FAs");
                rs = ps.executeQuery();
                modeloTabla.addColumn("FA");
                modeloTabla.addColumn("N. de Serie");
                //PARA HACER CONTEOS DE COLUMNAS A MYSQL
                ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
                int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
                //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
                int[] anchos = {25, 50}; //Definimos el ancho de cada una de las columnas
                for (int i = 0; i < cantidadColumnas; i++) {
                    tablaNombre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }
                while (rs.next()) {
                    Object fila[] = new Object[4]; //Cuatro porque son cuatro columnas
                    //De tipo object porque esos abarcan TODO.
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    modeloTabla.addRow(fila);
                }
            } catch (SQLException ex) {
                System.out.println("Error " + ex);
            }
        } else if (botonEmpleado.isSelected()) {
            contarEmpleados();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            tablaNombre.setModel(modeloTabla);
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                Connection conexion = ConexionABD.getConnection();
                ps = conexion.prepareStatement("select nombre from empleados where idFA=1");
                rs = ps.executeQuery();
                modeloTabla.addColumn("Nombre de tecnico");
                //PARA HACER CONTEOS DE COLUMNAS A MYSQL
                ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
                int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
                //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
                int[] anchos = {75}; //Definimos el ancho de cada una de las columnas
                for (int i = 0; i < cantidadColumnas; i++) {
                    tablaNombre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }
                while (rs.next()) {
                    Object fila[] = new Object[4]; //Cuatro porque son cuatro columnas
                    //De tipo object porque esos abarcan TODO.
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    modeloTabla.addRow(fila);
                }
            } catch (SQLException ex) {
                System.out.println("Error " + ex);
            }
        }
    }

    private void eliminarFA() {
        PreparedStatement ps = null; //Para ver los datos de MySQL
        try {
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("delete from FAs where nombreFA=?");
            ps.setString(1, cajaAyuda.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error" + ex);

        }
    }

    private void eliminarEmpleado() {
        PreparedStatement ps = null; //Para ver los datos de MySQL
        try {
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("delete from empleados where nombre=?");
            ps.setString(1, cajaAyuda.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    private int contarFAs() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from FAs");
            rs = ps.executeQuery();
            if (rs.next()) { //Si si hubo algo que leer, quiere decir que si hay uno con ese
                i = Integer.parseInt(rs.getString("conteo"));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
            return i;
        }
        return i;
    }

    private int contarEmpleados() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from empleados where idFA=1");
            rs = ps.executeQuery();
            if (rs.next()) { //Si si hubo algo que leer, quiere decir que si hay uno con ese
                i = Integer.parseInt(rs.getString("conteo"));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
            return i;
        }
        return i;
    }

    private void tablaNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNombreMouseClicked
        if (botonFA.isSelected()) {
            PreparedStatement ps = null; //Para ver los datos de MySQL
            ResultSet rs = null; //Para traer datos

            try {
                Connection conexion = ConexionABD.getConnection();
                //Obtenemos la fila seleccionada de la tabla que tiene el evento.
                int fila = tablaNombre.getSelectedRow();
                /*El codigo sirve para hacer la consulta. Con ese metodo lo que se hace es que se obtiene el valor de el codigo de la fila
            mencionada, la primer coordenada es la fila, y la siguiente la columna.*/
                String nombreFA = tablaNombre.getValueAt(fila, 0).toString(); //El primer dato es fila, y la otra es columna
                ps = conexion.prepareStatement("select nombreFA, numeroSerie from FAs where nombreFA=?");
                ps.setString(1, nombreFA); //Se manda su codigo.
                rs = ps.executeQuery();
                while (rs.next()) { //Mientras sigamos obteniendo registros
                    cajaAyuda.setText(rs.getString("nombreFA"));
                }
            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
        } else if (botonEmpleado.isSelected()) {
            PreparedStatement ps = null; //Para ver los datos de MySQL
            ResultSet rs = null; //Para traer datos

            try {
                Connection conexion = ConexionABD.getConnection();
                //Obtenemos la fila seleccionada de la tabla que tiene el evento.
                int fila = tablaNombre.getSelectedRow();
                /*El codigo sirve para hacer la consulta. Con ese metodo lo que se hace es que se obtiene el valor de el codigo de la fila
            mencionada, la primer coordenada es la fila, y la siguiente la columna.*/
                String nombreFA = tablaNombre.getValueAt(fila, 0).toString(); //El primer dato es fila, y la otra es columna
                ps = conexion.prepareStatement("select nombre from empleados where nombre=?");
                ps.setString(1, nombreFA); //Se manda su codigo.
                rs = ps.executeQuery();
                while (rs.next()) { //Mientras sigamos obteniendo registros
                    cajaAyuda.setText(rs.getString("nombre"));
                }
            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
        }
    }//GEN-LAST:event_tablaNombreMouseClicked

    private void botonFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFAActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaNombre.setModel(modeloTabla);
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select nombreFA, numeroSerie from FAs");
            rs = ps.executeQuery();
            modeloTabla.addColumn("FA");
            modeloTabla.addColumn("N. de Serie");
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {25, 50}; //Definimos el ancho de cada una de las columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaNombre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[4]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_botonFAActionPerformed

    private void botonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadoActionPerformed
        contarEmpleados();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaNombre.setModel(modeloTabla);
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conexion = ConexionABD.getConnection();
            ps = conexion.prepareStatement("select nombre from empleados where idFA=1");
            rs = ps.executeQuery();
            modeloTabla.addColumn("Nombre del técnico");
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {75}; //Definimos el ancho de cada una de las columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaNombre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[4]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_botonEmpleadoActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (botonFA.isSelected()) {
            eliminarFA();
        } else if (botonEmpleado.isSelected()) {
            eliminarEmpleado();
        }
        rellenartabla();
        botonGrupo.clearSelection();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "\nSi se desea eliminar, hacer lo siguiente:\n-Seleccionar 'FA' o 'Empleado'\nSeleccionar en la tabla el objeto a eliminar\n-Presionar el boton 'Eliminar'", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
        botonEliminar.setBackground(Color.orange);
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        botonEliminar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonEliminarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JRadioButton botonEmpleado;
    private javax.swing.JRadioButton botonFA;
    private javax.swing.ButtonGroup botonGrupo;
    private javax.swing.JTextField cajaAyuda;
    private javax.swing.JLabel etiquetaEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaNombre;
    // End of variables declaration//GEN-END:variables
}
