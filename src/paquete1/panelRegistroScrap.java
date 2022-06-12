package paquete1;

import controlador.CausasScrap;
import controlador.Empleados;
import controlador.FA;
import controlador.RegistroCausas;
import controlador.ZonaFA;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static paquete1.ConexionABD.getConnection;

public class panelRegistroScrap extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;

    public panelRegistroScrap() {
        initComponents();
        FA fa = new FA();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(fa.mostrarFA());
        comboFA.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpciones = new javax.swing.ButtonGroup();
        comboFA = new javax.swing.JComboBox<>();
        etiquetaSeleccionar = new javax.swing.JLabel();
        etiquetaZona = new javax.swing.JLabel();
        comboZona = new javax.swing.JComboBox<>();
        botonRegistrar = new javax.swing.JButton();
        etiquetaCausa = new javax.swing.JLabel();
        comboCausa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInfo = new javax.swing.JTextArea();
        cajaIDTarea = new javax.swing.JTextField();
        cajaOtros = new javax.swing.JTextField();
        etiquetaSeleccionar1 = new javax.swing.JLabel();
        comboNombre = new javax.swing.JComboBox<>();
        cajaIDEmpleado = new javax.swing.JTextField();
        cajaIDFA = new javax.swing.JTextField();
        cajaIDZona = new javax.swing.JTextField();
        cajaIDCausa = new javax.swing.JTextField();
        etiquetaAVariar = new javax.swing.JLabel();
        etiquetaOtraCausa = new javax.swing.JLabel();
        cajaOtraCausa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcionTorque = new javax.swing.JRadioButton();
        opcionAngulo = new javax.swing.JRadioButton();
        etiquetaOpcion = new javax.swing.JLabel();
        comboPosicion = new javax.swing.JComboBox<>();
        etiquetaPedestal = new javax.swing.JLabel();
        cajaPedestal = new javax.swing.JTextField();
        etiquetaHousing = new javax.swing.JLabel();
        cajaHousing = new javax.swing.JTextField();
        etiquetaPCB = new javax.swing.JLabel();
        cajaPCB = new javax.swing.JTextField();
        etiquetaPosicion = new javax.swing.JLabel();

        grupoOpciones.add(opcionTorque);
        grupoOpciones.add(opcionAngulo);

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboFA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFAItemStateChanged(evt);
            }
        });
        add(comboFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, -1));

        etiquetaSeleccionar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaSeleccionar.setText("Seleccione la FA:");
        add(etiquetaSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        etiquetaZona.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaZona.setText("Seleccione la zona:");
        etiquetaZona.setVisible(false);
        add(etiquetaZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        comboZona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboZona.setVisible(false);
        comboZona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboZonaItemStateChanged(evt);
            }
        });
        add(comboZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, -1));

        botonRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.setFocusPainted(false);
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseExited(evt);
            }
        });
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 160, -1));

        etiquetaCausa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaCausa.setText("Seleccione la causa: ");
        add(etiquetaCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        comboCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboCausa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCausaItemStateChanged(evt);
            }
        });
        add(comboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, -1));

        areaInfo.setEditable(false);
        areaInfo.setColumns(20);
        areaInfo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        areaInfo.setRows(5);
        areaInfo.setEditable(false);
        jScrollPane1.setViewportView(areaInfo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 360, 150));

        cajaIDTarea.setVisible(false);
        add(cajaIDTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 80, -1));

        cajaOtros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaOtros.setVisible(false);
        add(cajaOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 220, 40));

        etiquetaSeleccionar1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaSeleccionar1.setText("Seleccione su nombre:");
        add(etiquetaSeleccionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        comboNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNombreItemStateChanged(evt);
            }
        });
        add(comboNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, -1));

        cajaIDEmpleado.setVisible(false);
        add(cajaIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 70, -1));

        cajaIDFA.setVisible(false);
        add(cajaIDFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 80, -1));

        cajaIDZona.setVisible(false);
        add(cajaIDZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 80, -1));

        cajaIDCausa.setVisible(false);
        add(cajaIDCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 80, -1));

        etiquetaAVariar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaAVariar.setText("Num. Serie Producto:");
        etiquetaAVariar.setVisible(false);
        add(etiquetaAVariar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        etiquetaOtraCausa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaOtraCausa.setText("Otra causa: ");
        etiquetaOtraCausa.setVisible(false);
        add(etiquetaOtraCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        cajaOtraCausa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaOtraCausa.setVisible(false);
        cajaOtraCausa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaOtraCausaKeyTyped(evt);
            }
        });
        add(cajaOtraCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 290, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ESTACIONES DE ENSAMBLE FINAL (DAT ECU)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aptiv.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 190, 40));

        opcionTorque.setBackground(new java.awt.Color(204, 204, 204));
        opcionTorque.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        opcionTorque.setText("Torque");
        opcionTorque.setFocusPainted(false);
        opcionTorque.setVisible(false);
        add(opcionTorque, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        opcionAngulo.setBackground(new java.awt.Color(204, 204, 204));
        opcionAngulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        opcionAngulo.setText("Ángulo");
        opcionAngulo.setFocusPainted(false);
        opcionAngulo.setVisible(false);
        add(opcionAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        etiquetaOpcion.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaOpcion.setText("Seleccione una opción: ");
        etiquetaOpcion.setVisible(false);
        add(etiquetaOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        comboPosicion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "s1", "s2", "s3", "s4", "s5", "s6" }));
        comboPosicion.setVisible(false);
        add(comboPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 60, 30));

        etiquetaPedestal.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaPedestal.setText("Indique pedestal:");
        etiquetaPedestal.setVisible(false);
        add(etiquetaPedestal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        cajaPedestal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaPedestal.setVisible(false);
        add(cajaPedestal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 220, 40));

        etiquetaHousing.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaHousing.setText("Num. Serie Housing:");
        etiquetaHousing.setVisible(false);
        add(etiquetaHousing, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        cajaHousing.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaHousing.setVisible(false);
        add(cajaHousing, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 220, 40));

        etiquetaPCB.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaPCB.setText("Num. Serie PCB:");
        etiquetaPCB.setVisible(false);
        add(etiquetaPCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        cajaPCB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaPCB.setVisible(false);
        add(cajaPCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 220, 40));

        etiquetaPosicion.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaPosicion.setText("<html>Posición del tornillo: <html>");
        etiquetaPosicion.setVisible(false);
        add(etiquetaPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (comboFA.getSelectedIndex() == 0 || comboNombre.getSelectedIndex() == 0 || comboCausa.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Le falto rellenar un campo");
        } //Si selecciona la causa de Atornillado
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            if (cajaOtros.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de serie del producto");
            } else if (opcionAngulo.isSelected() == false && opcionTorque.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Seleccione la opcion 'Torque' u 'Angulo'");
            } else if (comboPosicion.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione la posicion de falla del tornillo");
            } else {
                try {
                    Connection conexion = null;
                    conexion = getConnection(); //Establecemos la conexion
                    CausasScrap causa = new CausasScrap();
                    RegistroCausas registrocausas = new RegistroCausas();
                    causa.setNombreCausa(comboCausa.getSelectedItem().toString());
                    causa.setIdempleado(Integer.parseInt(cajaIDEmpleado.getText()));
                    causa.setNumSerieProducto(cajaOtros.getText());
                    causa.setOpcion(opcionAngulo.isSelected() ? "Angulo" : "Torque");
                    causa.setPosicion(comboPosicion.getSelectedItem().toString());
                    causa.setEstado(true);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
                    String fechaCorregida = dtf.format(LocalDateTime.now());

                    if (fechaCorregida.contains(":59 AM")) {
                        fechaCorregida = fechaCorregida.replace(":59 AM", ":58 AM");
                    } else if (fechaCorregida.contains(":59 PM")) {
                        fechaCorregida = fechaCorregida.replace(":59 PM", ":58 PM");
                    }
                    causa.setFecha_causa(fechaCorregida);
                    //Si cumple con todas las validaciones, registramos el usuario
                    if (registrocausas.registrarScrap(causa)) {
                        JOptionPane.showMessageDialog(null, "Registrado correctamente");
                    }
                    comboFA.setSelectedIndex(0);
                    limpiarTodo();
                } catch (HeadlessException | NumberFormatException ex) {
                    System.out.println("Error, " + ex);
                }
            }
        } //Si selecciona la causa de Dispensado
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Dispensado")) {
            if (cajaOtros.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de serie del producto");
            } else if (comboZona.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione una Zona");
            } else if (cajaPedestal.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo de pedestal");
            } else {
                try {
                    Connection conexion = null;
                    conexion = getConnection(); //Establecemos la conexion
                    CausasScrap causa = new CausasScrap();
                    RegistroCausas registrocausas = new RegistroCausas();
                    causa.setNombreCausa(comboCausa.getSelectedItem().toString());
                    causa.setIdempleado(Integer.parseInt(cajaIDEmpleado.getText()));
                    causa.setNumSerieProducto(cajaOtros.getText());
                    causa.setZonaFA(comboZona.getSelectedItem().toString());
                    causa.setPedestal(cajaPedestal.getText());
                    causa.setEstado(true);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
                    String fechaCorregida = dtf.format(LocalDateTime.now());

                    if (fechaCorregida.contains(":59 AM")) {
                        fechaCorregida = fechaCorregida.replace(":59 AM", ":58 AM");
                    } else if (fechaCorregida.contains(":59 PM")) {
                        fechaCorregida = fechaCorregida.replace(":59 PM", ":58 PM");
                    }
                    causa.setFecha_causa(fechaCorregida);
                    //Si cumple con todas las validaciones, registramos el usuario
                    if (registrocausas.registrarScrap(causa)) {
                        JOptionPane.showMessageDialog(null, "Registrado correctamente");
                    }
                    comboFA.setSelectedIndex(0);
                    limpiarTodo();
                } catch (HeadlessException | NumberFormatException ex) {
                    System.out.println("Error, " + ex);
                }
            }
        } //Si selecciona la causa de Mal casamiento
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Mal casamiento")) {
            if (cajaOtros.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Escriba el numero de serie del producto");
            } else if (cajaHousing.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo de numero de serie Housing");
            } else if (cajaPCB.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Rellene el campo de numero de serie PCB");
            } else {
                try {
                    Connection conexion = null;
                    conexion = getConnection(); //Establecemos la conexion
                    CausasScrap causa = new CausasScrap();
                    RegistroCausas registrocausas = new RegistroCausas();
                    causa.setNombreCausa(comboCausa.getSelectedItem().toString());
                    causa.setIdempleado(Integer.parseInt(cajaIDEmpleado.getText()));
                    causa.setNumSerieProducto(cajaOtros.getText());
                    causa.setNumSerieHousing(cajaHousing.getText());
                    causa.setNumSeriePCB(cajaPCB.getText());
                    causa.setEstado(true);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
                    String fechaCorregida = dtf.format(LocalDateTime.now());

                    if (fechaCorregida.contains(":59 AM")) {
                        fechaCorregida = fechaCorregida.replace(":59 AM", ":58 AM");
                    } else if (fechaCorregida.contains(":59 PM")) {
                        fechaCorregida = fechaCorregida.replace(":59 PM", ":58 PM");
                    }
                    causa.setFecha_causa(fechaCorregida);
                    //Si cumple con todas las validaciones, registramos el usuario
                    if (registrocausas.registrarScrap(causa)) {
                        JOptionPane.showMessageDialog(null, "Registrado correctamente");
                    }
                    comboFA.setSelectedIndex(0);
                    limpiarTodo();
                } catch (HeadlessException | NumberFormatException ex) {
                    System.out.println("Error, " + ex);
                }
            }
        } //Si se selecciona OTRO
        else {
            try {
                Connection conexion = null;
                conexion = getConnection(); //Establecemos la conexion
                CausasScrap causa = new CausasScrap();
                RegistroCausas registrocausas = new RegistroCausas();
                causa.setNombreCausa(cajaOtraCausa.getText());
                causa.setIdempleado(Integer.parseInt(cajaIDEmpleado.getText()));
                causa.setNumSerieProducto(cajaOtros.getText());
                causa.setEstado(false);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
                String fechaCorregida = dtf.format(LocalDateTime.now());

                if (fechaCorregida.contains(":59 AM")) {
                    fechaCorregida = fechaCorregida.replace(":59 AM", ":58 AM");
                } else if (fechaCorregida.contains(":59 PM")) {
                    fechaCorregida = fechaCorregida.replace(":59 PM", ":58 PM");
                }
                causa.setFecha_causa(fechaCorregida);
                //Si cumple con todas las validaciones, registramos el usuario
                if (registrocausas.registrarScrap(causa)) {
                    JOptionPane.showMessageDialog(null, "Registrado correctamente");
                }
                comboFA.setSelectedIndex(0);
                limpiarTodo();
            } catch (HeadlessException | NumberFormatException ex) {
                System.out.println("Error, " + ex);
            }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void comboFAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFAItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            FA fa = (FA) comboFA.getSelectedItem();
            Empleados empleado = new Empleados();
            cajaIDFA.setText(String.valueOf(fa.getIdFA()));
            DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(empleado.mostrarEmpleados(fa.getIdFA()));
            comboNombre.setModel(modelo3);
            comboCausa.removeAllItems();
            limpiarTodo();
        }
    }//GEN-LAST:event_comboFAItemStateChanged

    private void comboCausaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCausaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            etiquetaAVariar.setVisible(true);
            cajaOtros.setVisible(true);
            cajaOtros.setText("");
            etiquetaZona.setVisible(false);
            comboZona.setVisible(false);
            if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otro")) {
                CausasScrap causa1 = (CausasScrap) comboCausa.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa1.getIdcausa()));
                FA fa = (FA) comboFA.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                String causa = cajaOtros.getText();
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nTarea: Registrar Scrap" + "\nCausa: " + causa);
                areaInfo.setFont(new Font("Arial", 3, 15));
                etiquetaOtraCausa.setVisible(true);
                cajaOtraCausa.setVisible(true);
                limpiarAtornillado();
                limpiarDispensado();
                limpiarMalCasamiento();
            } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Dispensado")) {
                CausasScrap causa = (CausasScrap) comboCausa.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
                etiquetaZona.setVisible(true);
                comboZona.setVisible(true);
                ZonaFA zona = new ZonaFA();
                DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(zona.mostrarZonas(1));
                comboZona.setModel(modelo3);
                etiquetaZona.setVisible(true);
                comboZona.setVisible(true);
                etiquetaPedestal.setVisible(true);
                cajaPedestal.setVisible(true);
                limpiarAtornillado();
                limpiarMalCasamiento();
                limpiarOtros();
            } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
                FA fa = (FA) comboFA.getSelectedItem();
                CausasScrap causa = (CausasScrap) comboCausa.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nTarea: Registrar Scrap" + "\nCausa: " + causa.getNombreCausa());
                areaInfo.setFont(new Font("Arial", 3, 15));
                etiquetaOpcion.setVisible(true);
                opcionAngulo.setVisible(true);
                opcionTorque.setVisible(true);
                comboPosicion.setVisible(true);
                etiquetaPosicion.setVisible(true);
                limpiarDispensado();
                limpiarMalCasamiento();
                limpiarOtros();
            } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Mal casamiento")) {
                FA fa = (FA) comboFA.getSelectedItem();
                CausasScrap causa = (CausasScrap) comboCausa.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nTarea: Registrar Scrap" + "\nCausa: " + causa.getNombreCausa());
                areaInfo.setFont(new Font("Arial", 3, 15));
                cajaHousing.setVisible(true);
                cajaPCB.setVisible(true);
                etiquetaHousing.setVisible(true);
                etiquetaPCB.setVisible(true);
                limpiarDispensado();
                limpiarAtornillado();
                limpiarOtros();
            }
        }
    }//GEN-LAST:event_comboCausaItemStateChanged

    private void comboNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNombreItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            Empleados empleado = new Empleados();
            empleado = (Empleados) comboNombre.getSelectedItem();
            CausasScrap causa = new CausasScrap();
            cajaIDEmpleado.setText(String.valueOf(empleado.getIdempleado()));
            DefaultComboBoxModel modelo2 = new DefaultComboBoxModel(causa.mostrarCausasScrap(empleado.getIdempleado()));
            comboCausa.setModel(modelo2);
        }
    }//GEN-LAST:event_comboNombreItemStateChanged

    private void cajaOtraCausaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaOtraCausaKeyTyped
        if (cajaOtraCausa.getText().length() >= 30) { // limit textfield to 3 characters
            evt.consume();
        }
    }//GEN-LAST:event_cajaOtraCausaKeyTyped

    private void comboZonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboZonaItemStateChanged
        ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
        CausasScrap causa = (CausasScrap) comboCausa.getSelectedItem();
        Empleados empleado = (Empleados) comboNombre.getSelectedItem();
        FA fa = (FA) comboFA.getSelectedItem();
        cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
        areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nTarea: Registrar Scrap" + "\nZona: " + zona + "\nCausa: " + causa.getNombreCausa());
        areaInfo.setFont(new Font("Arial", 3, 15));
    }//GEN-LAST:event_comboZonaItemStateChanged

    private void botonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseEntered
        botonRegistrar.setBackground(Color.orange);
    }//GEN-LAST:event_botonRegistrarMouseEntered

    private void botonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseExited
        botonRegistrar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonRegistrarMouseExited

    private void limpiarAtornillado() {
        etiquetaOpcion.setVisible(false);
        opcionAngulo.setVisible(false);
        opcionTorque.setVisible(false);
        grupoOpciones.clearSelection();
        comboPosicion.setVisible(false);
        comboPosicion.setSelectedIndex(0);
        etiquetaPosicion.setVisible(false);
    }

    private void limpiarDispensado() {
        etiquetaZona.setVisible(false);
        comboZona.setVisible(false);
        etiquetaPedestal.setVisible(false);
        cajaPedestal.setVisible(false);
        cajaPedestal.setText("");
    }

    private void limpiarMalCasamiento() {
        cajaHousing.setText("");
        cajaPCB.setText("");
        cajaHousing.setVisible(false);
        cajaPCB.setVisible(false);
        etiquetaHousing.setVisible(false);
        etiquetaPCB.setVisible(false);
    }

    private void limpiarOtros() {
        cajaOtraCausa.setText("");
        etiquetaOtraCausa.setVisible(false);
        cajaOtraCausa.setVisible(false);
    }

    private void limpiarTodo() {
        areaInfo.setText("");
        etiquetaAVariar.setVisible(false);
        cajaOtros.setVisible(false);
        cajaOtros.setText("");
        limpiarAtornillado();
        limpiarDispensado();
        limpiarMalCasamiento();
        limpiarOtros();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInfo;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaHousing;
    private javax.swing.JTextField cajaIDCausa;
    private javax.swing.JTextField cajaIDEmpleado;
    private javax.swing.JTextField cajaIDFA;
    private javax.swing.JTextField cajaIDTarea;
    private javax.swing.JTextField cajaIDZona;
    private javax.swing.JTextField cajaOtraCausa;
    private javax.swing.JTextField cajaOtros;
    private javax.swing.JTextField cajaPCB;
    private javax.swing.JTextField cajaPedestal;
    private javax.swing.JComboBox<String> comboCausa;
    private javax.swing.JComboBox<String> comboFA;
    private javax.swing.JComboBox<String> comboNombre;
    private javax.swing.JComboBox<String> comboPosicion;
    private javax.swing.JComboBox<String> comboZona;
    private javax.swing.JLabel etiquetaAVariar;
    private javax.swing.JLabel etiquetaCausa;
    private javax.swing.JLabel etiquetaHousing;
    private javax.swing.JLabel etiquetaOpcion;
    private javax.swing.JLabel etiquetaOtraCausa;
    private javax.swing.JLabel etiquetaPCB;
    private javax.swing.JLabel etiquetaPedestal;
    private javax.swing.JLabel etiquetaPosicion;
    private javax.swing.JLabel etiquetaSeleccionar;
    private javax.swing.JLabel etiquetaSeleccionar1;
    private javax.swing.JLabel etiquetaZona;
    private javax.swing.ButtonGroup grupoOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcionAngulo;
    private javax.swing.JRadioButton opcionTorque;
    // End of variables declaration//GEN-END:variables
}
