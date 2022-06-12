package paquete1;

import controlador.Causas;
import controlador.Empleados;
import controlador.FA;
import controlador.RegistroCausas;
import controlador.Tareas;
import controlador.ZonaFA;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static paquete1.ConexionABD.getConnection;

public class panelRegistrosAntiguos extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;

    public panelRegistrosAntiguos() {
        initComponents();
        FA fa = new FA();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(fa.mostrarFA());
        comboFA.setModel(modelo);
        seleccionarHoraRegistro.setText("12:00 AM");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {}
        horaInicio = new cambodia.raven.Time();
        try{
            UIManager.setLookAndFeel(previousLF);
        }
        catch (UnsupportedLookAndFeelException e) {}
        comboFA = new javax.swing.JComboBox<>();
        etiquetaSeleccionar = new javax.swing.JLabel();
        etiquetaZona = new javax.swing.JLabel();
        comboZona = new javax.swing.JComboBox<>();
        etiquetaTarea = new javax.swing.JLabel();
        comboTarea = new javax.swing.JComboBox<>();
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
        etiquetaExpiracion = new javax.swing.JLabel();
        seleccionarFecha = new com.toedter.calendar.JDateChooser();
        etiquetaOtraCausa = new javax.swing.JLabel();
        cajaOtraCausa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        etiquetaHoraInicio = new javax.swing.JLabel();
        seleccionarHoraRegistro = new javax.swing.JTextField();
        botonHoraInicio = new javax.swing.JButton();
        etiquetaFechaInicio = new javax.swing.JLabel();
        seleccionarFechaRegistro = new com.toedter.calendar.JDateChooser();

        horaInicio.setTextRefernce(seleccionarHoraRegistro);

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
        add(etiquetaZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        comboZona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboZona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboZonaItemStateChanged(evt);
            }
        });
        add(comboZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, -1));

        etiquetaTarea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaTarea.setText("Seleccione la tarea:");
        add(etiquetaTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        comboTarea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTareaItemStateChanged(evt);
            }
        });
        add(comboTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, -1));

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
        etiquetaCausa.setVisible(false);
        add(etiquetaCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        comboCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboCausa.setVisible(false);
        comboCausa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCausaItemStateChanged(evt);
            }
        });
        add(comboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 290, -1));

        areaInfo.setEditable(false);
        areaInfo.setColumns(20);
        areaInfo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        areaInfo.setRows(5);
        areaInfo.setEditable(false);
        jScrollPane1.setViewportView(areaInfo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 360, 110));

        cajaIDTarea.setVisible(false);
        add(cajaIDTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 80, -1));

        cajaOtros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaOtros.setVisible(false);
        cajaOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaOtrosKeyTyped(evt);
            }
        });
        add(cajaOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 220, 40));

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
        etiquetaAVariar.setText("jLabel1");
        etiquetaAVariar.setVisible(false);
        add(etiquetaAVariar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        etiquetaExpiracion.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaExpiracion.setText("Fecha de expiracion: ");
        etiquetaExpiracion.setVisible(false);
        add(etiquetaExpiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        seleccionarFecha.setDateFormatString("dd/MM/yyyy");
        seleccionarFecha.setFont(new Font("arial", 1, 18));
        seleccionarFecha.setVisible(false);
        seleccionarFecha.setDateFormatString("dd/MM/yyyy");
        seleccionarFecha.getJCalendar().setPreferredSize(new Dimension(500,270));
        add(seleccionarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 220, 40));

        etiquetaOtraCausa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaOtraCausa.setText("Otra causa: ");
        etiquetaOtraCausa.setVisible(false);
        add(etiquetaOtraCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        cajaOtraCausa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cajaOtraCausa.setVisible(false);
        cajaOtraCausa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaOtraCausaKeyTyped(evt);
            }
        });
        add(cajaOtraCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 290, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR REGISTROS ANTIGUOS DE SCRAP");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        etiquetaHoraInicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaHoraInicio.setText("Hora de registro: ");
        etiquetaHoraInicio.setVisible(false);
        add(etiquetaHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        seleccionarHoraRegistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seleccionarHoraRegistro.setVisible(false);
        add(seleccionarHoraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 40));

        botonHoraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        botonHoraInicio.setVisible(false);
        botonHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHoraInicioActionPerformed(evt);
            }
        });
        add(botonHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 40, 40));

        etiquetaFechaInicio.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaFechaInicio.setText("Fecha de registro: ");
        etiquetaFechaInicio.setVisible(false);
        add(etiquetaFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        seleccionarFechaRegistro.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaRegistro.setFont(new Font("arial", 1, 18));
        seleccionarFechaRegistro.setVisible(false);
        seleccionarFechaRegistro.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaRegistro.getJCalendar().setPreferredSize(new Dimension(500,270));
        add(seleccionarFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (comboFA.getSelectedIndex() == 0 || comboNombre.getSelectedIndex() == 0 || comboZona.getSelectedIndex() == 0 || comboTarea.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Le falto rellenar un campo");
        } else if (seleccionarFechaRegistro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Le falto seleccionar la fecha de registro");
        } else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("cambio de cubeta")) {
            if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Cambio de cubeta") && cajaOtros.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Escriba en el campo el numero de lote");
            } else if (seleccionarFecha.getDate() == null && comboTarea.getSelectedItem().toString().equalsIgnoreCase("Cambio de cubeta")) {
                JOptionPane.showMessageDialog(null, "Escriba en el campo la fecha de expiracion");
            } else {
                try {
                    Connection conexion = null;
                    conexion = getConnection(); //Establecemos la conexion
                    Causas causa = new Causas();
                    RegistroCausas registrocausas = new RegistroCausas();
                    causa.setNombreCausa("Cambio de Cubeta");
                    causa.setIdtarea(Integer.parseInt(cajaIDTarea.getText()));
                    causa.setEstado(true);

                    Date date = seleccionarFecha.getDate(); //Obtenemos la fecha de el chooser
                    long d = date.getTime();
                    java.sql.Date fecha = new java.sql.Date(d);
                    DateFormat fecha_hora = new SimpleDateFormat("dd/MM/yyyy");
                    Date date1 = seleccionarFechaRegistro.getDate(); //Obtenemos la fecha de el chooser
                    long d1 = date1.getTime();
                    java.sql.Date fechaDate = new java.sql.Date(d1);
                    DateFormat fecha_hora1 = new SimpleDateFormat("MM/dd/yyyy");

                    String fecha1 = String.valueOf(fecha_hora1.format(fechaDate));
                    String fechaCorregida = fecha1 + " " + seleccionarHoraRegistro.getText();
                    if (fechaCorregida.contains(" PM")) {
                        fechaCorregida = fechaCorregida.replace(" PM", ":01 PM");
                    } else {
                        fechaCorregida = fechaCorregida.replace(" AM", ":01 AM");
                    }
                    causa.setFecha_causa(fechaCorregida);
                    causa.setNumlote(cajaOtros.getText());
                    causa.setFecha_expiracion(fecha_hora.format(fecha));
                    //Si cumple con todas las validaciones, registramos el usuario
                    if (registrocausas.registrarCubeta(causa)) {
                        JOptionPane.showMessageDialog(null, "Registrado correctamente");
                    }
                    comboFA.setSelectedIndex(0);
                    comboZona.removeAllItems();
                    limpiarTodo();
                } catch (HeadlessException | NumberFormatException ex) {
                    System.out.println("Error, " + ex);
                }
            }
        } else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
            if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("") && comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                JOptionPane.showMessageDialog(null, "Le falto seleccionar la causa");
            } else if (cajaOtros.getText().equalsIgnoreCase("") && comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                JOptionPane.showMessageDialog(null, "Escriba en el campo la cantidad de desperdicio");
            } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otros")) {
                if (cajaOtraCausa.getText().equalsIgnoreCase("") && comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                    JOptionPane.showMessageDialog(null, "Escriba en el campo la otra causa");
                } else {
                    try {
                        Connection conexion = null;
                        conexion = getConnection(); //Establecemos la conexion
                        Causas causa = new Causas();
                        RegistroCausas registrocausas = new RegistroCausas();
                        causa.setNombreCausa(cajaOtraCausa.getText());
                        causa.setIdtarea(Integer.parseInt(cajaIDTarea.getText()));
                        causa.setEstado(false);

                        Date date1 = seleccionarFechaRegistro.getDate(); //Obtenemos la fecha de el chooser
                        long d1 = date1.getTime();
                        java.sql.Date fechaDate = new java.sql.Date(d1);
                        DateFormat fecha_hora1 = new SimpleDateFormat("MM/dd/yyyy");

                        String fecha1 = String.valueOf(fecha_hora1.format(fechaDate));
                        String fechaCorregida = fecha1 + " " + seleccionarHoraRegistro.getText();
                        if (fechaCorregida.contains(" PM")) {
                            fechaCorregida = fechaCorregida.replace(" PM", ":01 PM");
                        } else {
                            fechaCorregida = fechaCorregida.replace(" AM", ":01 AM");
                        }
                        causa.setFecha_causa(fechaCorregida);
                        causa.setDesperdicio(Double.parseDouble(cajaOtros.getText()));
                        //Si cumple con todas las validaciones, registramos el usuario
                        if (registrocausas.registrarGel(causa)) {
                            JOptionPane.showMessageDialog(null, "Registrado correctamente");
                        }
                        comboFA.setSelectedIndex(0);
                        comboZona.removeAllItems();
                        limpiarTodo();
                    } catch (HeadlessException | NumberFormatException ex) {
                        System.out.println("Error, " + ex);
                    }
                }
            } else {
                try {
                    Connection conexion = null;
                    conexion = getConnection(); //Establecemos la conexion
                    Causas causa = new Causas();
                    RegistroCausas registrocausas = new RegistroCausas();
                    causa.setNombreCausa(comboCausa.getSelectedItem().toString());
                    causa.setIdtarea(Integer.parseInt(cajaIDTarea.getText()));
                    causa.setEstado(true);

                    Date date1 = seleccionarFechaRegistro.getDate(); //Obtenemos la fecha de el chooser
                    long d1 = date1.getTime();
                    java.sql.Date fechaDate = new java.sql.Date(d1);
                    DateFormat fecha_hora1 = new SimpleDateFormat("MM/dd/yyyy");

                    String fecha1 = String.valueOf(fecha_hora1.format(fechaDate));
                    String fechaCorregida = fecha1 + " " + seleccionarHoraRegistro.getText();
                    if (fechaCorregida.contains(" PM")) {
                        fechaCorregida = fechaCorregida.replace(" PM", ":01 PM");
                    } else {
                        fechaCorregida = fechaCorregida.replace(" AM", ":01 AM");
                    }
                    causa.setFecha_causa(fechaCorregida);
                    causa.setDesperdicio(Double.parseDouble(cajaOtros.getText()));
                    //Si cumple con todas las validaciones, registramos el usuario
                    if (registrocausas.registrarGel(causa)) {
                        JOptionPane.showMessageDialog(null, "Registrado correctamente");
                    }
                    comboFA.setSelectedIndex(0);
                    comboZona.removeAllItems();
                    limpiarTodo();
                } catch (HeadlessException | NumberFormatException ex) {
                    System.out.println("Error, " + ex);
                }
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
            comboTarea.removeAllItems();
            comboCausa.removeAllItems();
            comboZona.removeAllItems();
            limpiarTodo();
            etiquetaCausa.setVisible(false);
            comboCausa.setVisible(false);
        }
    }//GEN-LAST:event_comboFAItemStateChanged

    private void comboZonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboZonaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
            Tareas tarea = new Tareas();
            cajaIDZona.setText(String.valueOf(zona.getIdZona()));
            DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(tarea.mostrarTareas(zona.getIdZona()));
            comboTarea.setModel(modelo3);
            comboCausa.removeAllItems();
            limpiarTodo();
            etiquetaCausa.setVisible(false);
            comboCausa.setVisible(false);
        }
    }//GEN-LAST:event_comboZonaItemStateChanged

    private void comboTareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTareaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("cambio de cubeta")) {
                //Desparecemos las causas pq solo es CAMBIO DE CUBETA
                etiquetaCausa.setVisible(false);
                comboCausa.setVisible(false);
                //Creamos los obbjetos para obtener el idtarea
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                cajaIDTarea.setText(String.valueOf(tarea.getIdtarea()));
                limpiarGel();
                limpiarOtraCausa();
                etiquetaAVariar.setVisible(true);
                etiquetaAVariar.setText("Numero de lote: ");
                cajaOtros.setVisible(true);
                seleccionarFecha.setVisible(true);
                etiquetaExpiracion.setVisible(true);
                seleccionarFechaRegistro.setVisible(true);
                seleccionarHoraRegistro.setVisible(true);
                botonHoraInicio.setVisible(true);
                etiquetaFechaInicio.setVisible(true);
                etiquetaHoraInicio.setVisible(true);
                FA fa = (FA) comboFA.getSelectedItem();
                ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nZona: " + zona.getNombreZona()
                        + "\nTarea: " + tarea.getNombreTarea());
                areaInfo.setFont(new Font("Arial", 3, 15));
            } else {
                etiquetaCausa.setVisible(true);
                comboCausa.setVisible(true);
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                Causas causa = new Causas();
                cajaIDTarea.setText(String.valueOf(tarea.getIdtarea()));
                DefaultComboBoxModel modelo4 = new DefaultComboBoxModel(causa.mostrarCausas(tarea.getIdtarea()));
                comboCausa.setModel(modelo4);
                limpiarCubeta();
            }
        }
    }//GEN-LAST:event_comboTareaItemStateChanged

    private void comboCausaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCausaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            etiquetaAVariar.setVisible(true);
            etiquetaAVariar.setText("Desperdicio en gramos: ");
            cajaOtros.setVisible(true);
            seleccionarFechaRegistro.setVisible(true);
            seleccionarHoraRegistro.setVisible(true);
            botonHoraInicio.setVisible(true);
            etiquetaFechaInicio.setVisible(true);
            etiquetaHoraInicio.setVisible(true);
            cajaOtros.setText("");
            if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otros")) {
                etiquetaOtraCausa.setVisible(true);
                cajaOtraCausa.setVisible(true);
                FA fa = (FA) comboFA.getSelectedItem();
                ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                String causa = cajaOtros.getText();
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nZona: " + zona.getNombreZona()
                        + "\nTarea: " + tarea.getNombreTarea() + "\nCausa: " + causa);
                areaInfo.setFont(new Font("Arial", 3, 15));
            } else {
                limpiarOtraCausa();
                FA fa = (FA) comboFA.getSelectedItem();
                ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                Causas causa = (Causas) comboCausa.getSelectedItem();
                Empleados empleado = (Empleados) comboNombre.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
                areaInfo.setText("Datos a enviar: \n" + "Nombre: " + empleado + "\nFA: " + fa.getNombreFA() + "\nZona: " + zona.getNombreZona()
                        + "\nTarea: " + tarea.getNombreTarea() + "\nCausa: " + causa.getNombreCausa());
                areaInfo.setFont(new Font("Arial", 3, 15));
            }
        }
    }//GEN-LAST:event_comboCausaItemStateChanged

    private void comboNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNombreItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            Empleados empleado = new Empleados();
            empleado = (Empleados) comboNombre.getSelectedItem();
            ZonaFA zona = new ZonaFA();
            DefaultComboBoxModel modelo2 = new DefaultComboBoxModel(zona.mostrarZonas(empleado.getIdempleado()));
            comboZona.setModel(modelo2);
            cajaIDEmpleado.setText(String.valueOf(empleado.getIdempleado()));
            comboTarea.removeAllItems();
            comboCausa.removeAllItems();
            etiquetaCausa.setVisible(false);
            comboCausa.setVisible(false);
        }
    }//GEN-LAST:event_comboNombreItemStateChanged

    private void cajaOtrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaOtrosKeyTyped
        if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
            if (Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_PERIOD || evt.getKeyChar() == KeyEvent.VK_DECIMAL) {
                if ((evt.getKeyChar() == KeyEvent.VK_PERIOD || evt.getKeyChar() == KeyEvent.VK_DECIMAL) && cajaOtros.getText().contains(".")) {
                    evt.consume();
                }
            } else if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_cajaOtrosKeyTyped

    private void cajaOtraCausaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaOtraCausaKeyTyped
        if (cajaOtraCausa.getText().length() >= 30) { // limit textfield to 3 characters
            evt.consume();
        }
    }//GEN-LAST:event_cajaOtraCausaKeyTyped

    private void botonHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHoraInicioActionPerformed
        horaInicio.showPopup();
    }//GEN-LAST:event_botonHoraInicioActionPerformed

    private void botonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseEntered
        botonRegistrar.setBackground(Color.orange);
    }//GEN-LAST:event_botonRegistrarMouseEntered

    private void botonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseExited
        botonRegistrar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonRegistrarMouseExited

    private void limpiarCubeta() {
        etiquetaAVariar.setVisible(false);
        cajaOtros.setVisible(false);
        seleccionarFecha.setVisible(false);
        etiquetaExpiracion.setVisible(false);
        seleccionarFechaRegistro.setVisible(false);
        seleccionarHoraRegistro.setVisible(false);
        botonHoraInicio.setVisible(false);
        etiquetaFechaInicio.setVisible(false);
        etiquetaHoraInicio.setVisible(false);
        seleccionarFechaRegistro.setDate(null);
        seleccionarHoraRegistro.setText("12:00 AM");
    }

    private void limpiarGel() {
        etiquetaAVariar.setVisible(false);
        cajaOtros.setVisible(false);
        seleccionarFechaRegistro.setVisible(false);
        seleccionarHoraRegistro.setVisible(false);
        botonHoraInicio.setVisible(false);
        etiquetaFechaInicio.setVisible(false);
        etiquetaHoraInicio.setVisible(false);
        seleccionarFechaRegistro.setDate(null);
        seleccionarHoraRegistro.setText("12:00 AM");
    }

    private void limpiarOtraCausa() {
        etiquetaOtraCausa.setVisible(false);
        cajaOtraCausa.setVisible(false);
        seleccionarFechaRegistro.setDate(null);
        seleccionarHoraRegistro.setText("12:00 AM");
    }

    private void limpiarTodo() {
        areaInfo.setText("");
        etiquetaAVariar.setVisible(false);
        cajaOtros.setVisible(false);
        seleccionarFechaRegistro.setVisible(false);
        seleccionarHoraRegistro.setVisible(false);
        botonHoraInicio.setVisible(false);
        etiquetaFechaInicio.setVisible(false);
        etiquetaHoraInicio.setVisible(false);
        seleccionarFecha.setVisible(false);
        seleccionarFecha.setDate(null);
        seleccionarFechaRegistro.setDate(null);
        seleccionarHoraRegistro.setText("12:00 AM");
        cajaOtros.setText("");
        cajaOtraCausa.setText("");
        etiquetaExpiracion.setVisible(false);
        etiquetaOtraCausa.setVisible(false);
        cajaOtraCausa.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInfo;
    private javax.swing.JButton botonHoraInicio;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaIDCausa;
    private javax.swing.JTextField cajaIDEmpleado;
    private javax.swing.JTextField cajaIDFA;
    private javax.swing.JTextField cajaIDTarea;
    private javax.swing.JTextField cajaIDZona;
    private javax.swing.JTextField cajaOtraCausa;
    private javax.swing.JTextField cajaOtros;
    private javax.swing.JComboBox<String> comboCausa;
    private javax.swing.JComboBox<String> comboFA;
    private javax.swing.JComboBox<String> comboNombre;
    private javax.swing.JComboBox<String> comboTarea;
    private javax.swing.JComboBox<String> comboZona;
    private javax.swing.JLabel etiquetaAVariar;
    private javax.swing.JLabel etiquetaCausa;
    private javax.swing.JLabel etiquetaExpiracion;
    private javax.swing.JLabel etiquetaFechaInicio;
    private javax.swing.JLabel etiquetaHoraInicio;
    private javax.swing.JLabel etiquetaOtraCausa;
    private javax.swing.JLabel etiquetaSeleccionar;
    private javax.swing.JLabel etiquetaSeleccionar1;
    private javax.swing.JLabel etiquetaTarea;
    private javax.swing.JLabel etiquetaZona;
    private cambodia.raven.Time horaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser seleccionarFecha;
    private com.toedter.calendar.JDateChooser seleccionarFechaRegistro;
    private javax.swing.JTextField seleccionarHoraRegistro;
    // End of variables declaration//GEN-END:variables
}
