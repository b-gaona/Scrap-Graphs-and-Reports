
package paquete1;

import controlador.Causas;
import controlador.CausasScrap;
import controlador.Empleados;
import controlador.FA;
import controlador.Tareas;
import controlador.ZonaFA;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class agregarDatos extends javax.swing.JPanel {

    public agregarDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGrupo = new javax.swing.ButtonGroup();
        etiquetaAgregar = new javax.swing.JLabel();
        botonFA = new javax.swing.JRadioButton();
        botonEmpleado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNombre = new javax.swing.JTable();
        etiquetaNombre = new javax.swing.JLabel();
        insertarNombre = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        etiquetaNumSerie = new javax.swing.JLabel();
        insertarNumSerie = new javax.swing.JTextField();
        cajaAyuda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaInfo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        botonGrupo.add(botonFA);
        botonGrupo.add(botonEmpleado);

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(550, 475));
        setPreferredSize(new java.awt.Dimension(550, 475));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaAgregar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaAgregar.setText("Seleccione lo que quiere agregar o modificar:");
        add(etiquetaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaNombre.setText("Escriba el nombre:");
        add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        insertarNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(insertarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 250, 35));

        botonAgregar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.setFocusPainted(false);
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 150, 30));

        botonModificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setFocusPainted(false);
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonModificarMouseExited(evt);
            }
        });
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 30));

        etiquetaNumSerie.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaNumSerie.setText("Numero de serie: ");
        etiquetaNumSerie.setVisible(false);
        add(etiquetaNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 40));

        insertarNumSerie.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertarNumSerie.setVisible(false);
        add(insertarNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, 35));

        cajaAyuda.setVisible(false);
        add(cajaAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 260, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        areaInfo.setColumns(20);
        areaInfo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        areaInfo.setRows(3);
        areaInfo.setText(" Espere hasta que se le indique que el registro fue \n modificado u agregado.");
        areaInfo.setEditable(false);
        jScrollPane2.setViewportView(areaInfo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 440, 70));

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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void rellenartabla() {
        if (botonFA.isSelected()) {
            limpiar();
            etiquetaNumSerie.setVisible(true);
            insertarNumSerie.setVisible(true);
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
            limpiar();
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

    private void limpiar() {
        etiquetaNumSerie.setVisible(false);
        insertarNumSerie.setVisible(false);
        insertarNombre.setText("");
        insertarNumSerie.setText("");
    }

    private void botonFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFAActionPerformed
        limpiar();
        etiquetaNumSerie.setVisible(true);
        insertarNumSerie.setVisible(true);
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
        limpiar();
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
                    insertarNombre.setText(rs.getString("nombreFA"));
                    cajaAyuda.setText(rs.getString("nombreFA"));
                    insertarNumSerie.setText(rs.getString("numeroSerie"));
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
                    insertarNombre.setText(rs.getString("nombre"));
                }
            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
        }
    }//GEN-LAST:event_tablaNombreMouseClicked

    private void modificarFA() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = ConexionABD.getConnection();
            boolean bandera = false;
            ps = conexion.prepareStatement("select numeroSerie, nombreFA from FAs");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (insertarNumSerie.getText().equals(rs.getString("numeroSerie")) && insertarNombre.getText().equals(rs.getString("nombreFA"))) {
                    bandera = true;
                }
            }
            if (bandera == true) { //Si ya existe, no hacemos la insercion.Sino que solo indicamos que ese codigo ya existe.
                JOptionPane.showMessageDialog(null, "Ese nombre o numero de serie ya existe");
            } else {
                bandera = false;
                ps = conexion.prepareStatement("update FAs set nombreFA=?, numeroSerie=? where nombreFA=?");
                ps.setString(1, insertarNombre.getText());
                ps.setString(2, insertarNumSerie.getText());
                ps.setString(3, cajaAyuda.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    private void modificarEmpleado() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = ConexionABD.getConnection();
            boolean bandera = false;
            //Agregamos esto para que no se puedan agregar mas codigos con ese mismo nombre
            ps = conexion.prepareStatement("select nombre from empleados");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (insertarNombre.getText().equals(rs.getString("nombre"))) {
                    bandera = true;
                }
            }
            if (bandera == true) { //Si ya existe, no hacemos la insercion.Sino que solo indicamos que ese codigo ya existe.
                JOptionPane.showMessageDialog(null, "Ese nombre ya existe en la BD");
            } else {
                bandera = false;
                ps = conexion.prepareStatement("update empleados set nombre=? where nombre=?");
                ps.setString(1, insertarNombre.getText());
                ps.setString(2, cajaAyuda.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error" + ex);
        }
    }

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if (botonFA.isSelected() == false && botonEmpleado.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else if (insertarNombre.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Rellene el campo del nombre");
        } else if (insertarNumSerie.getText().equalsIgnoreCase("") && botonFA.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de numero de serie");
        } else {
            if (botonFA.isSelected()) {
                opcionFA();
                rellenartabla();
                botonGrupo.clearSelection();
            } else if (botonEmpleado.isSelected()) {
                opcionEmpleado();
                rellenartabla();
                botonGrupo.clearSelection();
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (botonFA.isSelected() == false && botonEmpleado.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else if (insertarNombre.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Rellene el campo del nombre");
        } else if (insertarNumSerie.getText().equalsIgnoreCase("") && botonFA.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Rellene el campo de numero de serie");
        } else {
            if (botonFA.isSelected()) {
                modificarFA();
                rellenartabla();
                botonGrupo.clearSelection();
            } else if (botonEmpleado.isSelected()) {
                modificarEmpleado();
                rellenartabla();
                botonGrupo.clearSelection();
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "\nSi se desea modificar, hacer lo siguiente:"
                + "\n-Seleccionar 'FA' o 'Empleado'\n-Seleccionar en la tabla el objeto a modificar\n-Reescribir lo que se quiera modificar\n-Presionar el boton 'Modificar'"
                + "\n\nSi se desea agregar, hacer lo siguiente: "
                + "\n-Seleccionar 'FA' o 'Empleado'\n-Rellenar los campos con los datos requeridos\n-Presionar el boton 'Agregar'", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        botonAgregar.setBackground(Color.orange);
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseEntered
        botonModificar.setBackground(Color.orange);
    }//GEN-LAST:event_botonModificarMouseEntered

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        botonAgregar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseExited
        botonModificar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonModificarMouseExited

    private void opcionFA() {
        PreparedStatement ps = null; //Para ver los datos de MySQL
        ResultSet rs = null; //Para traer datos

        try {
            Connection conexion = ConexionABD.getConnection();
            boolean bandera = false;
            //Agregamos esto para que no se puedan agregar mas codigos con ese mismo nombre
            ps = conexion.prepareStatement("select numeroSerie, nombreFA from FAs");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (insertarNumSerie.getText().equals(rs.getString("numeroSerie"))) {
                    bandera = true;
                }
                if (insertarNombre.getText().equals(rs.getString("nombreFA"))) {
                    bandera = true;
                }
            }
            if (bandera == true) { //Si ya existe, no hacemos la insercion.Sino que solo indicamos que ese codigo ya existe.
                JOptionPane.showMessageDialog(null, "Ese nombre o numero de serie ya existe");
            } else {
                bandera = false;
                //Para la creacion de la FA
                ps = conexion.prepareStatement("insert into FAs (nombreFA, numeroSerie) values (?, ?)");
                ps.setString(1, insertarNombre.getText());
                ps.setString(2, insertarNumSerie.getText());
                ps.executeUpdate();
                limpiar();
                //Para la creacion de los empleados
                for (int i = 1; i <= contarEmpleados(); i++) {
                    FA fa = new FA();
                    Empleados empleado = new Empleados();
                    Vector<FA> vectorFA = fa.mostrarFA();
                    int ultimaFA = vectorFA.elementAt(contarFAs()).getIdFA();
                    Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(1);
                    ps = conexion.prepareStatement("insert into empleados (nombre, idFA) values (?, ?)");
                    ps.setString(1, vectorEmpleado.elementAt(i).getNombre());
                    ps.setInt(2, ultimaFA);
                    ps.executeUpdate();
                    limpiar();
                }
                //Para la creacion de las zonas graficas
                for (int i = 1; i <= contarZonas(); i++) {
                    FA fa = new FA();
                    ZonaFA zona = new ZonaFA();
                    Vector<FA> vectorFA = fa.mostrarFA();
                    int ultimaFA = vectorFA.elementAt(contarFAs()).getIdFA();
                    Vector<ZonaFA> vectorZona = zona.mostrarZonas(1);
                    ps = conexion.prepareStatement("insert into zonaFAGrafica (nombreZona, idFA) values (?, ?)");
                    ps.setString(1, vectorZona.elementAt(i).getNombreZona());
                    ps.setInt(2, ultimaFA);
                    ps.executeUpdate();
                    limpiar();
                }
                //Para la creacion de las zonas
                for (int i2 = 1; i2 <= contarEmpleados(); i2++) {
                    for (int j = 1; j <= contarZonas(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        Empleados empleado = new Empleados();
                        ZonaFA zona = new ZonaFA();
                        Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(contarFAs());
                        Vector<ZonaFA> vectorZona = zona.mostrarZonas(1);
                        ps = conexion.prepareStatement("insert into zonaFA (nombreZona, idempleado) values (?, ?)");
                        ps.setString(1, vectorZona.elementAt(j).getNombreZona());
                        ps.setInt(2, vectorEmpleado.elementAt(i2).getIdempleado());
                        ps.executeUpdate();
                        limpiar();
                    }
                }
                //Para la creacion de tareas
                for (int i1 = 1; i1 <= contarEmpleados(); i1++) {
                    for (int i2 = 1; i2 <= contarZonas(); i2++) {
                        for (int j = 1; j <= contarTareas(); j++) {
                            Empleados empleado = new Empleados();
                            ZonaFA zona = new ZonaFA();
                            Tareas tarea = new Tareas();
                            Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(contarFAs());
                            Vector<ZonaFA> vectorZona = zona.mostrarZonas(vectorEmpleado.elementAt(i1).getIdempleado());
                            Vector<Tareas> vectorTareas = tarea.mostrarTareas(1);
                            ps = conexion.prepareStatement("insert into tareas (nombreTarea, idZona) values (?, ?)");
                            ps.setString(1, vectorTareas.elementAt(j).getNombreTarea());
                            ps.setInt(2, vectorZona.elementAt(i2).getIdZona());
                            ps.executeUpdate();
                            limpiar();
                        }
                    }
                }
                //Para la creacion de causas
                for (int i1 = 1; i1 <= contarEmpleados(); i1++) {
                    for (int i2 = 1; i2 <= contarZonas(); i2++) {
                        for (int j = 1; j <= contarTareas(); j++) {
                            for (int z = 1; z <= contarCausas(); z++) {
                                Empleados empleado = new Empleados();
                                ZonaFA zona = new ZonaFA();
                                Tareas tarea = new Tareas();
                                Causas causa = new Causas();
                                Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(contarFAs());
                                Vector<ZonaFA> vectorZona = zona.mostrarZonas(vectorEmpleado.elementAt(i1).getIdempleado());
                                Vector<Tareas> vectorTareas = tarea.mostrarTareas(vectorZona.elementAt(i2).getIdZona());
                                Vector<Causas> vectorCausas = causa.mostrarCausas(61);
                                if (vectorTareas.elementAt(j).getIdtarea() % 2 == 0) {
                                    ps = conexion.prepareStatement("insert into causas (nombreCausa, idtarea) values (?, ?)");
                                    ps.setString(1, vectorCausas.elementAt(z).getNombreCausa());
                                    ps.setInt(2, vectorTareas.elementAt(j).getIdtarea());
                                    ps.executeUpdate();
                                    limpiar();
                                }
                            }
                        }
                    }
                }
                //Para la creacion de las causas de Scrap 
                for (int i2 = 1; i2 <= contarEmpleados(); i2++) {
                    for (int j = 1; j <= contarCausasScrap(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        Empleados empleado = new Empleados();
                        CausasScrap causaScrap = new CausasScrap();
                        Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(contarFAs());
                        Vector<CausasScrap> vectorCausaScrap = causaScrap.mostrarCausasScrap(1);
                        ps = conexion.prepareStatement("insert into causasScrap (nombreCausa, idempleado) values (?, ?)");
                        ps.setString(1, vectorCausaScrap.elementAt(j).getNombreCausa());
                        ps.setInt(2, vectorEmpleado.elementAt(i2).getIdempleado());
                        ps.executeUpdate();
                        limpiar();
                    }
                }
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
            limpiar();
        }
    }

    private void opcionEmpleado() {
        PreparedStatement ps = null; //Para ver los datos de MySQL
        ResultSet rs = null; //Para traer datos

        try {
            Connection conexion = ConexionABD.getConnection();
            boolean bandera = false;
            //Agregamos esto para que no se puedan agregar mas codigos con ese mismo nombre
            ps = conexion.prepareStatement("select nombre from empleados");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (insertarNombre.getText().equals(rs.getString("nombre"))) {
                    bandera = true;
                }
            }
            if (bandera) { //Si ya existe, no hacemos la insercion.Sino que solo indicamos que ese codigo ya existe.
                JOptionPane.showMessageDialog(null, "Ese nombre ya existe en la BD");
            } else {
                bandera = false;
                //Para la creacion de los empleados
                for (int i = 1; i <= contarFAs(); i++) {
                    FA fa = new FA();
                    Vector<FA> vectorFA = fa.mostrarFA();
                    ps = conexion.prepareStatement("insert into empleados (nombre, idFA) values (?, ?)");
                    ps.setString(1, insertarNombre.getText());
                    ps.setInt(2, vectorFA.elementAt(i).getIdFA());
                    ps.executeUpdate();
                }
                //Para la creacion de las zonas
                for (int i2 = 1; i2 <= contarFAs(); i2++) {
                    for (int j = 1; j <= contarZonas(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        Empleados empleado = new Empleados();
                        ZonaFA zona = new ZonaFA();
                        Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(i2);
                        int ultimoEmpleado = vectorEmpleado.elementAt(contarEmpleados()).getIdempleado();
                        Vector<ZonaFA> vectorZona = zona.mostrarZonas(1);
                        ps = conexion.prepareStatement("insert into zonaFA (nombreZona, idempleado) values (?, ?)");
                        ps.setString(1, vectorZona.elementAt(j).getNombreZona());
                        ps.setInt(2, ultimoEmpleado);
                        ps.executeUpdate();
                        limpiar();
                    }
                }
                //Para la creacion de tareas
                for (int i2 = 1; i2 <= contarFAs(); i2++) {
                    for (int j = 1; j <= contarZonas(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        for (int j2 = 1; j2 <= contarTareas(); j2++) {
                            Empleados empleado = new Empleados();
                            ZonaFA zona = new ZonaFA();
                            Tareas tarea = new Tareas();
                            Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(i2);
                            int ultimoEmpleado = vectorEmpleado.elementAt(contarEmpleados()).getIdempleado();
                            Vector<ZonaFA> vectorZona = zona.mostrarZonas(ultimoEmpleado);
                            Vector<Tareas> vectorTareas = tarea.mostrarTareas(1);
                            ps = conexion.prepareStatement("insert into tareas (nombreTarea, idZona) values (?, ?)");
                            ps.setString(1, vectorTareas.elementAt(j2).getNombreTarea());
                            ps.setInt(2, vectorZona.elementAt(j).getIdZona());
                            ps.executeUpdate();
                            limpiar();
                        }
                    }
                }
                //Para la creacion de causas
                for (int i2 = 1; i2 <= contarFAs(); i2++) {
                    for (int j = 1; j <= contarZonas(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        for (int j2 = 1; j2 <= contarTareas(); j2++) {
                            for (int z = 1; z <= contarCausas(); z++) {
                                Empleados empleado = new Empleados();
                                ZonaFA zona = new ZonaFA();
                                Tareas tarea = new Tareas();
                                Causas causa = new Causas();
                                Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(i2);
                                int ultimoEmpleado = vectorEmpleado.elementAt(contarEmpleados()).getIdempleado();
                                Vector<ZonaFA> vectorZona = zona.mostrarZonas(ultimoEmpleado);
                                Vector<Tareas> vectorTareas = tarea.mostrarTareas(vectorZona.elementAt(j).getIdZona());
                                Vector<Causas> vectorCausas = causa.mostrarCausas(61);
                                if (vectorTareas.elementAt(j2).getIdtarea() % 2 == 0) {
                                    ps = conexion.prepareStatement("insert into causas (nombreCausa, idtarea) values (?, ?)");
                                    ps.setString(1, vectorCausas.elementAt(z).getNombreCausa());
                                    ps.setInt(2, vectorTareas.elementAt(j2).getIdtarea());
                                    ps.executeUpdate();
                                    limpiar();
                                }
                            }
                        }
                    }
                }
                //Para la creacion de las causas de Scrap
                for (int i2 = 1; i2 <= contarFAs(); i2++) {
                    for (int j = 1; j <= contarCausasScrap(); j++) { //Se rellenan las zonas DE UN EMPLEADO
                        Empleados empleado = new Empleados();
                        CausasScrap causa = new CausasScrap();
                        Vector<Empleados> vectorEmpleado = empleado.mostrarEmpleados(i2);
                        int ultimoEmpleado = vectorEmpleado.elementAt(contarEmpleados()).getIdempleado();
                        Vector<CausasScrap> vectorCausas = causa.mostrarCausasScrap(1);
                        ps = conexion.prepareStatement("insert into causasScrap (nombreCausa, idempleado) values (?, ?)");
                        ps.setString(1, vectorCausas.elementAt(j).getNombreCausa());
                        ps.setInt(2, ultimoEmpleado);
                        ps.executeUpdate();
                        limpiar();
                    }
                }
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
            limpiar();
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

    private int contarZonas() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from zonaFA where idempleado=1");
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

    private int contarTareas() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from tareas where idZona=1");
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

    private int contarCausas() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from causas where idtarea=61");
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

    private int contarCausasScrap() {
        PreparedStatement ps;
        ResultSet rs;
        int i = 0;
        try {
            Connection conexion = ConexionABD.getConnection();
            //Obtenemos el conteo de cuantos id existen con el nombreusuario que mandemos como parametro
            ps = conexion.prepareStatement("select count (*) as conteo from causasScrap where idempleado=1");
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInfo;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JRadioButton botonEmpleado;
    private javax.swing.JRadioButton botonFA;
    private javax.swing.ButtonGroup botonGrupo;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaAyuda;
    private javax.swing.JLabel etiquetaAgregar;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNumSerie;
    private javax.swing.JTextField insertarNombre;
    private javax.swing.JTextField insertarNumSerie;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaNombre;
    // End of variables declaration//GEN-END:variables
}
