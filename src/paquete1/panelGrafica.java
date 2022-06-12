package paquete1;

import controlador.Causas;
import controlador.ExportarAExcel;
import controlador.FA;
import controlador.Tareas;
import controlador.ZonaFA;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class panelGrafica extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    PreparedStatement ps;
    ResultSet rs;

    public panelGrafica() {
        initComponents();
        FA fa = new FA();
        DefaultComboBoxModel modeloFA = new DefaultComboBoxModel(fa.mostrarFA());
        comboFA.setModel(modeloFA);
        seleccionarHoraInicio.setText("12:00 AM");
        seleccionarHoraFin.setText("12:00 AM");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGrupoFA = new javax.swing.ButtonGroup();
        botonGrupoZona = new javax.swing.ButtonGroup();
        botonGrupoTarea = new javax.swing.ButtonGroup();
        botonGrupoCausa = new javax.swing.ButtonGroup();
        LookAndFeel previousLF = UIManager.getLookAndFeel();
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {}
        horaFin = new cambodia.raven.Time();
        try{
            UIManager.setLookAndFeel(previousLF);
        }
        catch (UnsupportedLookAndFeelException e) {}
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException | ClassNotFoundException e) {}
        horaInicio = new cambodia.raven.Time();
        try{
            UIManager.setLookAndFeel(previousLF);
        }
        catch (UnsupportedLookAndFeelException e) {}
        botonGrupoGraficas = new javax.swing.ButtonGroup();
        etiquetaSeleccionar = new javax.swing.JLabel();
        cajaIDFA = new javax.swing.JTextField();
        botonTodasFA = new javax.swing.JRadioButton();
        botonEspecificarFA = new javax.swing.JRadioButton();
        etiquetaZona = new javax.swing.JLabel();
        botonTodasZonas = new javax.swing.JRadioButton();
        botonEspecificarZona = new javax.swing.JRadioButton();
        etiquetaTarea = new javax.swing.JLabel();
        botonTodasTareas = new javax.swing.JRadioButton();
        botonEspecificarTarea = new javax.swing.JRadioButton();
        etiquetaCausa = new javax.swing.JLabel();
        botonTodasCausas = new javax.swing.JRadioButton();
        botonEspecificarCausa = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        etiquetaFechaInicio = new javax.swing.JLabel();
        seleccionarFechaIni = new com.toedter.calendar.JDateChooser();
        etiquetaHoraInicio = new javax.swing.JLabel();
        seleccionarHoraInicio = new javax.swing.JTextField();
        botonHoraInicio = new javax.swing.JButton();
        etiquetaFechaFin = new javax.swing.JLabel();
        seleccionarFechaFin = new com.toedter.calendar.JDateChooser();
        botonLimpiar = new javax.swing.JButton();
        seleccionarHoraFin = new javax.swing.JTextField();
        botonHoraFin = new javax.swing.JButton();
        etiquetaHoraFin = new javax.swing.JLabel();
        botonGenerarGrafica = new javax.swing.JButton();
        botonExportar = new javax.swing.JButton();
        comboFA = new javax.swing.JComboBox<>();
        comboZona = new javax.swing.JComboBox<>();
        cajaIDCausa = new javax.swing.JTextField();
        comboTarea = new javax.swing.JComboBox<>();
        comboCausa = new javax.swing.JComboBox<>();
        cajaIDZona = new javax.swing.JTextField();
        cajaIDTarea = new javax.swing.JTextField();
        panelGrafica = new javax.swing.JPanel();
        botonGZonas = new javax.swing.JRadioButton();
        botonGCausas = new javax.swing.JRadioButton();
        etiquetaGrafica = new javax.swing.JLabel();

        botonGrupoFA.add(botonTodasFA);
        botonGrupoFA.add(botonEspecificarFA);

        botonGrupoZona.add(botonTodasZonas);
        botonGrupoZona.add(botonEspecificarZona);

        botonGrupoTarea.add(botonTodasTareas);
        botonGrupoTarea.add(botonEspecificarTarea);

        botonGrupoCausa.add(botonTodasCausas);
        botonGrupoCausa.add(botonEspecificarCausa);

        horaFin.setTextRefernce(seleccionarHoraFin);

        horaInicio.setTextRefernce(seleccionarHoraInicio);

        botonGrupoGraficas.add(botonGZonas);
        botonGrupoGraficas.add(botonGCausas);

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaSeleccionar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaSeleccionar.setText("Seleccione la FA:");
        add(etiquetaSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cajaIDFA.setVisible(false);
        add(cajaIDFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, -1));

        botonTodasFA.setBackground(new java.awt.Color(204, 204, 204));
        botonTodasFA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonTodasFA.setText("TODAS LAS FA's");
        botonTodasFA.setFocusPainted(false);
        botonTodasFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodasFAActionPerformed(evt);
            }
        });
        add(botonTodasFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        botonEspecificarFA.setBackground(new java.awt.Color(204, 204, 204));
        botonEspecificarFA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEspecificarFA.setText("ESPECIFICAR");
        botonEspecificarFA.setFocusPainted(false);
        botonEspecificarFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecificarFAActionPerformed(evt);
            }
        });
        add(botonEspecificarFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 140, -1));

        etiquetaZona.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaZona.setText("Seleccione la zona:");
        add(etiquetaZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        botonTodasZonas.setBackground(new java.awt.Color(204, 204, 204));
        botonTodasZonas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonTodasZonas.setText("TODAS LAS ZONAS");
        botonTodasZonas.setFocusPainted(false);
        botonTodasZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodasZonasActionPerformed(evt);
            }
        });
        add(botonTodasZonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, -1));

        botonEspecificarZona.setBackground(new java.awt.Color(204, 204, 204));
        botonEspecificarZona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEspecificarZona.setText("ESPECIFICAR");
        botonEspecificarZona.setFocusPainted(false);
        botonEspecificarZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecificarZonaActionPerformed(evt);
            }
        });
        add(botonEspecificarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, -1));

        etiquetaTarea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaTarea.setText("Seleccione la tarea:");
        add(etiquetaTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        botonTodasTareas.setBackground(new java.awt.Color(204, 204, 204));
        botonTodasTareas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonTodasTareas.setText("TODAS LAS TAREAS");
        botonTodasTareas.setFocusPainted(false);
        botonTodasTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodasTareasActionPerformed(evt);
            }
        });
        add(botonTodasTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, -1));

        botonEspecificarTarea.setBackground(new java.awt.Color(204, 204, 204));
        botonEspecificarTarea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEspecificarTarea.setText("ESPECIFICAR");
        botonEspecificarTarea.setFocusPainted(false);
        botonEspecificarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecificarTareaActionPerformed(evt);
            }
        });
        add(botonEspecificarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 140, -1));

        etiquetaCausa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaCausa.setText("Seleccione la causa: ");
        etiquetaCausa.setVisible(false);
        add(etiquetaCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        botonTodasCausas.setBackground(new java.awt.Color(204, 204, 204));
        botonTodasCausas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonTodasCausas.setText("TODAS LAS CAUSAS");
        botonTodasCausas.setFocusPainted(false);
        botonTodasCausas.setVisible(false);
        botonTodasCausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodasCausasActionPerformed(evt);
            }
        });
        add(botonTodasCausas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, -1));

        botonEspecificarCausa.setBackground(new java.awt.Color(204, 204, 204));
        botonEspecificarCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEspecificarCausa.setText("ESPECIFICAR");
        botonEspecificarCausa.setFocusPainted(false);
        botonEspecificarCausa.setVisible(false);
        botonEspecificarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecificarCausaActionPerformed(evt);
            }
        });
        add(botonEspecificarCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, -1));

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setMinimumSize(new java.awt.Dimension(800, 64));
        tabla.setVisible(false);
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 1080, 120));

        etiquetaFechaInicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaFechaInicio.setText("Fecha de inicio: ");
        etiquetaFechaInicio.setVisible(false);
        add(etiquetaFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        seleccionarFechaIni.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaIni.setPreferredSize(new java.awt.Dimension(118, 29));
        seleccionarFechaIni.setFont(new Font("arial", 1, 18));
        seleccionarFechaIni.setVisible(false);
        seleccionarFechaIni.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaIni.getJCalendar().setPreferredSize(new Dimension(500,270));
        add(seleccionarFechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 220, 40));

        etiquetaHoraInicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaHoraInicio.setText("Hora de inicio: ");
        etiquetaHoraInicio.setVisible(false);
        add(etiquetaHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        seleccionarHoraInicio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seleccionarHoraInicio.setVisible(false);
        add(seleccionarHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 100, 40));

        botonHoraInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        botonHoraInicio.setVisible(false);
        botonHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHoraInicioActionPerformed(evt);
            }
        });
        add(botonHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 40, 40));

        etiquetaFechaFin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaFechaFin.setText("Fecha de cierre: ");
        etiquetaFechaFin.setVisible(false);
        add(etiquetaFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        seleccionarFechaFin.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaFin.setFont(new Font("arial", 1, 18));
        seleccionarFechaFin.setVisible(false);
        seleccionarFechaFin.setDateFormatString("MM/dd/yyyy");
        seleccionarFechaFin.getJCalendar().setPreferredSize(new Dimension(500,270));
        add(seleccionarFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 220, 40));

        botonLimpiar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonLimpiar.setText("Limpiar Todo");
        botonLimpiar.setFocusPainted(false);
        botonLimpiar.setVisible(false);
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseExited(evt);
            }
        });
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 230, -1));

        seleccionarHoraFin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        seleccionarHoraFin.setVisible(false);
        add(seleccionarHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 100, 40));

        botonHoraFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        botonHoraFin.setVisible(false);
        botonHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHoraFinActionPerformed(evt);
            }
        });
        add(botonHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 40, 40));

        etiquetaHoraFin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaHoraFin.setText("Hora de cierre: ");
        etiquetaHoraFin.setVisible(false);
        add(etiquetaHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        botonGenerarGrafica.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonGenerarGrafica.setText("Generar gráfica");
        botonGenerarGrafica.setFocusPainted(false);
        botonGenerarGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGenerarGraficaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGenerarGraficaMouseExited(evt);
            }
        });
        botonGenerarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarGraficaActionPerformed(evt);
            }
        });
        add(botonGenerarGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, 230, -1));

        botonExportar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonExportar.setText("Exportar tabla a Excel");
        botonExportar.setFocusPainted(false);
        botonExportar.setVisible(false);
        botonExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonExportarMouseExited(evt);
            }
        });
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });
        add(botonExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 290, -1));

        comboFA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboFA.setVisible(false);
        comboFA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFAItemStateChanged(evt);
            }
        });
        add(comboFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 230, -1));

        comboZona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboZona.setVisible(false);
        comboZona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboZonaItemStateChanged(evt);
            }
        });
        add(comboZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 230, -1));

        cajaIDCausa.setVisible(false);
        add(cajaIDCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 80, -1));

        comboTarea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboTarea.setVisible(false);
        comboTarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTareaItemStateChanged(evt);
            }
        });
        add(comboTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 230, -1));

        comboCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboCausa.setVisible(false);
        comboCausa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCausaItemStateChanged(evt);
            }
        });
        add(comboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 230, -1));

        cajaIDZona.setVisible(false);
        add(cajaIDZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 80, -1));

        cajaIDTarea.setVisible(false);
        add(cajaIDTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 80, -1));
        add(panelGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 490, 300));

        botonGZonas.setBackground(new java.awt.Color(204, 204, 204));
        botonGZonas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonGZonas.setText("Zonas");
        botonGZonas.setFocusPainted(false);
        botonGZonas.setVisible(false);
        botonGZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGZonasActionPerformed(evt);
            }
        });
        add(botonGZonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        botonGCausas.setBackground(new java.awt.Color(204, 204, 204));
        botonGCausas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonGCausas.setText("Causas");
        botonGCausas.setFocusPainted(false);
        botonGCausas.setVisible(false);
        botonGCausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGCausasActionPerformed(evt);
            }
        });
        add(botonGCausas, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        etiquetaGrafica.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaGrafica.setText("Seleccione que quiere graficar: ");
        etiquetaGrafica.setVisible(false);
        add(etiquetaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void graficarZonas() {
        try {
            panelGrafica.removeAll();
            //Contadores de las zonas
            int z4b = 0, z4f = 0, z5b = 0, z5f = 0;
            double cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (tabla.getValueAt(i, 6).equals("Z4B")) {
                    z4b++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont1 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont1 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 6).equals("Z4F")) {
                    z4f++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont2 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont2 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 6).equals("Z5B")) {
                    z5b++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont3 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont3 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 6).equals("Z5F")) {
                    z5f++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont4 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont4 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                }
            }
            org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
            DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
            if (z4b != 0) {
                datos.addValue(z4b, "Zona Z4B", "Z4B");
            }
            if (z4f != 0) {
                datos.addValue(z4f, "Zona Z4F", "Z4F");
            }
            if (z5b != 0) {
                datos.addValue(z5b, "Zona Z5B", "Z5B");
            }
            if (z5f != 0) {
                datos.addValue(z5f, "Zona Z5F", "Z5F");
            }
            DefaultPieDataset datospie = new DefaultPieDataset();
            if (z4b != 0) {
                datospie.setValue(("Z4B =" + z4b + " registros (" + cont1 + "g)"), z4b);
            }
            if (z4f != 0) {
                datospie.setValue(("Z4F= " + z4f + " registros (" + cont2 + "g)"), z4f);
            }
            if (z5b != 0) {
                datospie.setValue(("Z5B= " + z5b + " registros (" + cont3 + "g)"), z5b);
            }
            if (z5f != 0) {
                datospie.setValue(("Z5F= " + z5f + " registros (" + cont4 + "g)"), z5f);
            }
            grafico = ChartFactory.createPieChart("Gràfico de Zonas con mayores registros", datospie, true, true, false);
            ChartPanel panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
            panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
            panelGrafica.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
            panelGrafica.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
            panelGrafica.validate(); //Validamos para que se resetee por asi decirlo el panel
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void graficarCausas() {
        try {
            panelGrafica.removeAll();
            //Contadores de las causas
            int causaCubeta = 0, causaRemanente = 0, causaFuga = 0, causaPurgas = 0, causaOtros = 0;
            double cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (tabla.getValueAt(i, 0).equals("Remanente en cubeta")) {
                    causaRemanente++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont1 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont1 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 0).equals("Fugas por sello")) {
                    causaFuga++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont2 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont2 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 0).equals("Purgas")) {
                    causaPurgas++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont3 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont3 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                } else if (tabla.getValueAt(i, 0).equals("Cambio de Cubeta")) {
                    causaCubeta++;
                } else if (!tabla.getValueAt(i, 0).equals("Remanente en cubeta") && !tabla.getValueAt(i, 0).equals("Fugas por sello") && !tabla.getValueAt(i, 0).equals("Purgas") && !tabla.getValueAt(i, 0).equals("Cambio de Cubeta")) {
                    causaOtros++;
                    if (tabla.getColumnName(7).equals("Desperdicio") || tabla.getColumnName(8).equals("Desperdicio")) {
                        if (tabla.getColumnName(7).equals("Desperdicio")) {
                            cont4 += Double.parseDouble(tabla.getValueAt(i, 7).toString());
                        } else {
                            cont4 += Double.parseDouble(tabla.getValueAt(i, 8).toString());
                        }
                    }
                }
            }
            org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
            DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
            if (causaRemanente != 0) {
                datos.addValue(causaRemanente, "Remanente en cubeta", "Z4B");
            }
            if (causaFuga != 0) {
                datos.addValue(causaFuga, "Fugas por sello", "Z4F");
            }
            if (causaPurgas != 0) {
                datos.addValue(causaPurgas, "Purgas", "Z5B");
            }
            if (causaOtros != 0) {
                datos.addValue(causaOtros, "Otros", "Z5F");
            }
            if (causaCubeta != 0) {
                datos.addValue(causaCubeta, "Cambio de Cubeta", "Z5F");
            }
            DefaultPieDataset datospie = new DefaultPieDataset();
            if (causaRemanente != 0) {
                datospie.setValue(("Remanente en cubeta =" + causaRemanente + " registros (" + cont1 + "g)"), causaRemanente);
            }
            if (causaFuga != 0) {
                datospie.setValue(("Fugas por sello= " + causaFuga + " registros (" + cont2 + "g)"), causaFuga);
            }
            if (causaPurgas != 0) {
                datospie.setValue(("Purgas= " + causaPurgas + " registros (" + cont3 + "g)"), causaPurgas);
            }
            if (causaOtros != 0) {
                datospie.setValue(("Otros= " + causaOtros + " registros (" + cont4 + "g)"), causaOtros);
            }
            if (causaCubeta != 0) {
                datospie.setValue(("Cambio de Cubeta= " + causaCubeta), causaCubeta);
            }
            grafico = ChartFactory.createPieChart("Gràfico Causas con mayores registros", datospie, true, true, false);
            ChartPanel panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
            panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
            panelGrafica.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
            panelGrafica.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
            panelGrafica.validate(); //Validamos para que se resetee por asi decirlo el panel
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void reporteTotal(String fecha_ini, String fecha_fin) {
        ConexionABD con = new ConexionABD();
        try {
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteTodo.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteCubeta(String fecha_ini, String fecha_fin, String whereFA, String whereZona, String whereTarea) {
        try {
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            if (whereZona.equals("")) {
                whereZona = "Z*";
            } else {
                whereZona = comboZona.getSelectedItem().toString();
            }
            if (whereTarea.equals("")) {
                whereTarea = "Cambio de Cubeta";
            } else {
                whereTarea = comboTarea.getSelectedItem().toString();
            }
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteCubeta.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
            parametro.put("whereZona", whereZona);
            parametro.put("whereTarea", whereTarea);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            //La vista del reporte
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteDesperdicio(String fecha_ini, String fecha_fin, String whereFA, String whereZona, String whereTarea, String whereCausa) {
        ConexionABD con = new ConexionABD();
        try {
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            if (whereZona.equals("")) {
                whereZona = "Z*";
            } else {
                whereZona = comboZona.getSelectedItem().toString();
            }
            if (whereTarea.equals("")) {
                whereTarea = "Registrar Desperdicio Gel30";
            } else {
                whereTarea = comboTarea.getSelectedItem().toString();
            }
            if (whereCausa.equals("")) {
                whereCausa = "'Remanente en cubeta' or 'Fugas por sello' or 'Purgas' or 'Otros'";
            } else {
                whereCausa = comboCausa.getSelectedItem().toString();
            }
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteDesperdicio.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
            parametro.put("whereZona", whereZona);
            parametro.put("whereTarea", whereTarea);
            parametro.put("whereCausa", whereCausa);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            //La vista del reporte
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteOtros(String fecha_ini, String fecha_fin, String whereFA, String whereZona, String whereTarea, String whereCausa) {
        ConexionABD con = new ConexionABD();
        try {
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            if (whereZona.equals("")) {
                whereZona = "Z*";
            } else {
                whereZona = comboZona.getSelectedItem().toString();
            }
            if (whereTarea.equals("")) {
                whereTarea = "Registrar Desperdicio Gel30";
            } else {
                whereTarea = comboTarea.getSelectedItem().toString();
            }
            if (whereCausa.equals("")) {
                whereCausa = "0";
            } else {
                whereCausa = "0";
            }
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteOtros.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
            parametro.put("whereZona", whereZona);
            parametro.put("whereTarea", whereTarea);
            parametro.put("whereCausa", whereCausa);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            //La vista del reporte
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteTotalCausas(String fecha_ini, String fecha_fin, String whereFA, String whereZona) {
        ConexionABD con = new ConexionABD();
        try {
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            if (whereZona.equals("")) {
                whereZona = "Z*";
            } else {
                whereZona = comboZona.getSelectedItem().toString();
            }
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteTotalCausas.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
            parametro.put("whereZona", whereZona);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            //La vista del reporte
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteTotalTareas(String fecha_ini, String fecha_fin, String whereFA, String whereZona) {
        ConexionABD con = new ConexionABD();
        try {
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            if (whereZona.equals("")) {
                whereZona = "Z*";
            } else {
                whereZona = comboZona.getSelectedItem().toString();
            }
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteTotalTareas.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
            parametro.put("whereZona", whereZona);
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
            //La vista del reporte
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
            //Para cuando presione la x, se salga
            vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void rellenarTodasColumnas() {
        String[] vector = {"Nombre de la causa", "TimeStamp", "Técnico", "Equipo", "Número de Serie", "Tarea", "Zona", "Fecha de expiración", "Desperdicio", "Número de lote"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
        modelo.addColumn(vector[7]);
        modelo.addColumn(vector[8]);
        modelo.addColumn(vector[9]);
    }

    private void rellenarColumnasDesperdicio() {
        String[] vector = {"Nombre de la causa", "TimeStamp", "Técnico", "Equipo", "Número de Serie", "Tarea", "Zona", "Desperdicio"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
        modelo.addColumn(vector[7]);
    }

    private void rellenarColumnasCubeta() {
        String[] vector = {"Nombre de la causa", "TimeStamp", "Técnico", "Equipo", "Número de Serie", "Tarea", "Zona", "Fecha de expiración", "Número de lote"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
        modelo.addColumn(vector[7]);
        modelo.addColumn(vector[8]);
    }

    private void limpiarDespuesDeReporte() {
        tabla.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        panelGrafica.removeAll();
        panelGrafica.setVisible(false);
        botonGrupoGraficas.clearSelection();
        seleccionarFechaIni.setDate(null);
        seleccionarFechaFin.setDate(null);
        comboFA.setVisible(false);
        comboZona.setVisible(false);
        comboTarea.setVisible(false);
        comboCausa.setVisible(false);
        etiquetaCausa.setVisible(false);
        comboCausa.setVisible(false);
        botonEspecificarCausa.setVisible(false);
        botonTodasCausas.setVisible(false);
        botonGrupoFA.clearSelection();
        botonGrupoZona.clearSelection();
        botonGrupoTarea.clearSelection();
        botonGrupoCausa.clearSelection();
        habilitarTodo();
    }

    private void deshabilitarTodo() {
        botonGenerarGrafica.setEnabled(false);
        seleccionarFechaIni.setEnabled(false);
        seleccionarHoraInicio.setEnabled(false);
        seleccionarHoraFin.setEnabled(false);
        botonHoraFin.setEnabled(false);
        botonHoraInicio.setEnabled(false);
        seleccionarFechaFin.setEnabled(false);
        botonEspecificarZona.setEnabled(false);
        botonTodasZonas.setEnabled(false);
        botonEspecificarTarea.setEnabled(false);
        botonTodasTareas.setEnabled(false);
        botonEspecificarCausa.setEnabled(false);
        botonTodasCausas.setEnabled(false);
        botonTodasFA.setEnabled(false);
        botonEspecificarFA.setEnabled(false);
        comboCausa.setEnabled(false);
        comboFA.setEnabled(false);
        comboTarea.setEnabled(false);
        comboZona.setEnabled(false);
    }

    private void habilitarTodo() {
        botonGenerarGrafica.setEnabled(true);
        seleccionarFechaIni.setEnabled(true);
        seleccionarFechaFin.setEnabled(true);
        seleccionarHoraInicio.setEnabled(true);
        seleccionarHoraFin.setEnabled(true);
        botonHoraFin.setEnabled(true);
        botonHoraInicio.setEnabled(true);
        botonEspecificarZona.setEnabled(true);
        botonTodasZonas.setEnabled(true);
        botonEspecificarTarea.setEnabled(true);
        botonTodasTareas.setEnabled(true);
        botonEspecificarCausa.setEnabled(true);
        botonTodasCausas.setEnabled(true);
        botonTodasFA.setEnabled(true);
        botonEspecificarFA.setEnabled(true);
        comboCausa.setEnabled(true);
        comboFA.setEnabled(true);
        comboTarea.setEnabled(true);
        comboZona.setEnabled(true);
    }

    private void rellenarReporteOpcionTODO() {
        try {
            tabla.setVisible(true);
            rellenarTodasColumnas();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            String where = "";
            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");
            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");
            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));
            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += " " + hora2;
            reporteTotal(fecha1, fecha2);

            where = "WHERE columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "#";
            System.out.println(where);
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, fecha_expiracion, desperdicio, numlote from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A Access
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 

            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {450, 500, 400, 200, 300, 300, 150, 200, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
        etiquetaGrafica.setVisible(true);
    }

    private void rellenarReporteOpcionCUBETA() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereZona = "", whereTarea = "";
        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        if (comboZona.isVisible() == true && !comboZona.getSelectedItem().toString().equals("")) {
            whereZona = "and nombreZona= '" + comboZona.getSelectedItem().toString() + "'";
        }
        if (comboTarea.isVisible() == true && !comboTarea.getSelectedItem().toString().equals("")) {
            whereTarea = "and nombreTarea= '" + comboTarea.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasCubeta();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();

            String where = "";

            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");
            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");

            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));

            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += " " + hora2;

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# " + whereFA + whereZona + whereTarea;
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, fecha_expiracion, numlote from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300, 300, 150, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            reporteCubeta(fecha1, fecha2, whereFA, whereZona, whereTarea);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
        etiquetaGrafica.setVisible(true);
    }

    private void rellenarReporteOpcionOTROS() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereZona = "", whereTarea = "", whereCausa = "";
        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        if (comboZona.isVisible() == true && !comboZona.getSelectedItem().toString().equals("")) {
            whereZona = "and nombreZona= '" + comboZona.getSelectedItem().toString() + "'";
        }
        if (comboTarea.isVisible() == true && !comboTarea.getSelectedItem().toString().equals("")) {
            whereTarea = "and nombreTarea= '" + comboTarea.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasDesperdicio();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();

            String where = "";

            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");

            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");

            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));

            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += " " + hora2;

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and estado=0 " + whereFA + whereZona + whereTarea;
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, desperdicio from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300, 300, 150, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            reporteOtros(fecha1, fecha2, whereFA, whereZona, whereTarea, whereCausa);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
        etiquetaGrafica.setVisible(true);
    }

    private void rellenarReporteOpcionDESPERDICIO() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereZona = "", whereTarea = "", whereCausa = "";
        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = " and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        if (comboZona.isVisible() == true && !comboZona.getSelectedItem().toString().equals("")) {
            whereZona = " and nombreZona= '" + comboZona.getSelectedItem().toString() + "'";
        }
        if (comboTarea.isVisible() == true && !comboTarea.getSelectedItem().toString().equals("")) {
            whereTarea = " and nombreTarea= '" + comboTarea.getSelectedItem().toString() + "'";
        }
        if (comboCausa.isVisible() == true && !comboCausa.getSelectedItem().toString().equals("")) {
            whereCausa = " and nombreCausa= '" + comboCausa.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasDesperdicio();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();

            String where = "";

            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");

            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");

            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));

            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += " " + hora2;

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# " + whereFA + whereZona + whereTarea + whereCausa;
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, desperdicio from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300, 300, 150, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            reporteDesperdicio(fecha1, fecha2, whereFA, whereZona, whereTarea, whereCausa);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
        etiquetaGrafica.setVisible(true);
    }

    private void rellenarReporteOpcionTODASLASCAUSAS() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereZona = "";

        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        if (comboZona.isVisible() == true && !comboZona.getSelectedItem().toString().equals("")) {
            whereZona = "and nombreZona= '" + comboZona.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasDesperdicio();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();

            String where = "";

            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");

            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");

            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));

            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += hora2;

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and nombreTarea= 'Registrar Desperdicio Gel30' " + whereFA + whereZona;
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, desperdicio from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300, 300, 150, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            reporteTotalCausas(fecha1, fecha2, whereFA, whereZona);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
        etiquetaGrafica.setVisible(true);
    }

    private void rellenarReporteOpcionTODASLASTAREAS() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereZona = "";

        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        if (comboZona.isVisible() == true && !comboZona.getSelectedItem().toString().equals("")) {
            whereZona = "and nombreZona= '" + comboZona.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarTodasColumnas();
            tabla.setModel(modelo);
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();

            String where = "";

            Date date = seleccionarFechaIni.getDate(); //Obtenemos la fecha de el chooser
            long d = date.getTime();
            java.sql.Date fechaDate = new java.sql.Date(d);
            DateFormat fecha_hora = new SimpleDateFormat("MM/dd/yyyy");

            Date date2 = seleccionarFechaFin.getDate(); //Obtenemos la fecha de el chooser
            long d2 = date2.getTime();
            java.sql.Date fechaDate2 = new java.sql.Date(d2);
            DateFormat fecha_hora2 = new SimpleDateFormat("MM/dd/yyyy");

            String fecha1 = String.valueOf(fecha_hora.format(fechaDate));
            String fecha2 = String.valueOf(fecha_hora2.format(fechaDate2));

            String hora = seleccionarHoraInicio.getText();
            if (hora.contains("AM") && hora.contains("12:")) {
                hora = hora.replace("12", "00");
            }
            if (hora.contains(" PM")) {
                hora = hora.replace(" PM", ":00 PM");
            } else {
                hora = hora.replace(" AM", ":00 AM");
            }
            String hora2 = seleccionarHoraFin.getText();
            if (hora2.contains("AM") && hora2.contains("12:")) {
                hora2 = hora2.replace("12", "00");
            }
            if (hora2.contains(" PM")) {
                hora2 = hora2.replace(" PM", ":59 PM");
            } else {
                hora2 = hora2.replace(" AM", ":59 AM");
            }

            fecha1 += " " + hora;
            fecha2 += " " + hora2;

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "#" + whereFA + whereZona;
            ps = conexion.prepareStatement("select nombreCausa, fecha_causa, nombre, nombreFA, numeroSerie, nombreTarea, nombreZona, fecha_expiracion, desperdicio, numlote from registrosJuntos " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300, 300, 150, 200, 200, 200}; //Ancho de columnas
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas]; //Cuatro porque son cuatro columnas
                //De tipo object porque esos abarcan TODO.
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            reporteTotalTareas(fecha1, fecha2, whereFA, whereZona);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }

        deshabilitarTodo();
        botonLimpiar.setVisible(true);
        botonExportar.setVisible(true);
        etiquetaGrafica.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
    }

    private void botonTodasFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodasFAActionPerformed
        comboFA.removeAllItems();
        ZonaFA zona = new ZonaFA();
        cajaIDFA.setText("1");
        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(zona.mostrarZonas2(1));
        comboZona.setModel(modelo3);
        comboTarea.removeAllItems();
        comboCausa.removeAllItems();
        //Agregados recientemente
        comboFA.setVisible(false);
        comboZona.setVisible(false);
        comboTarea.setVisible(false);
        comboCausa.setVisible(false);
        botonGrupoZona.clearSelection();
        botonGrupoTarea.clearSelection();
        botonGrupoCausa.clearSelection();
        etiquetaCausa.setVisible(false);
        comboCausa.setVisible(false);
        botonEspecificarCausa.setVisible(false);
        botonTodasCausas.setVisible(false);
    }//GEN-LAST:event_botonTodasFAActionPerformed

    private void botonEspecificarFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecificarFAActionPerformed
        comboFA.setVisible(true);
        FA fa = new FA();
        DefaultComboBoxModel modeloFA = new DefaultComboBoxModel(fa.mostrarFA());
        comboFA.setModel(modeloFA);
        //Desactivar las marcas de los RadioButtons
        botonGrupoZona.clearSelection();
        botonGrupoTarea.clearSelection();
        botonGrupoCausa.clearSelection();
        comboZona.setVisible(false);
        comboTarea.setVisible(false);
        comboCausa.setVisible(false);
    }//GEN-LAST:event_botonEspecificarFAActionPerformed

    private void botonTodasZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodasZonasActionPerformed
        Tareas tarea = new Tareas();
        cajaIDZona.setText("1");
        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(tarea.mostrarTareas(1));
        comboTarea.setModel(modelo3);
        comboCausa.removeAllItems();
        comboZona.setVisible(false);
        //Agregados recientemente
        comboTarea.setVisible(false);
        comboCausa.setVisible(false);
        botonGrupoTarea.clearSelection();
        botonGrupoCausa.clearSelection();
        etiquetaCausa.setVisible(false);
        comboCausa.setVisible(false);
        botonEspecificarCausa.setVisible(false);
        botonTodasCausas.setVisible(false);
    }//GEN-LAST:event_botonTodasZonasActionPerformed

    private void botonEspecificarZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecificarZonaActionPerformed
        comboZona.setVisible(true);
        try {
            comboZona.setSelectedIndex(0);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
        botonGrupoTarea.clearSelection();
        botonGrupoCausa.clearSelection();
        comboTarea.setVisible(false);
        comboCausa.setVisible(false);
    }//GEN-LAST:event_botonEspecificarZonaActionPerformed

    private void botonTodasTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodasTareasActionPerformed
        comboTarea.setVisible(false);
        //Agregados recientemente
        comboCausa.setVisible(false);
        botonGrupoCausa.clearSelection();
        etiquetaCausa.setVisible(false);
        comboCausa.setVisible(false);
        botonEspecificarCausa.setVisible(false);
        botonTodasCausas.setVisible(false);
        //Calendario
        seleccionarFechaIni.setVisible(true);
        etiquetaFechaInicio.setVisible(true);
        seleccionarFechaFin.setVisible(true);
        etiquetaFechaFin.setVisible(true);
        //Hora
        seleccionarHoraInicio.setVisible(true);
        seleccionarHoraFin.setVisible(true);
        etiquetaHoraInicio.setVisible(true);
        etiquetaHoraFin.setVisible(true);
        botonHoraInicio.setVisible(true);
        botonHoraFin.setVisible(true);
    }//GEN-LAST:event_botonTodasTareasActionPerformed

    private void botonEspecificarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecificarTareaActionPerformed
        comboTarea.setVisible(true);
        try {
            comboTarea.setSelectedIndex(0);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
        botonGrupoCausa.clearSelection();
        comboCausa.setVisible(false);
    }//GEN-LAST:event_botonEspecificarTareaActionPerformed

    private void botonTodasCausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodasCausasActionPerformed
        comboCausa.setVisible(false);
        //Calendario
        seleccionarFechaIni.setVisible(true);
        etiquetaFechaInicio.setVisible(true);
        seleccionarFechaFin.setVisible(true);
        etiquetaFechaFin.setVisible(true);
        //Hora
        seleccionarHoraInicio.setVisible(true);
        seleccionarHoraFin.setVisible(true);
        etiquetaHoraInicio.setVisible(true);
        etiquetaHoraFin.setVisible(true);
        botonHoraInicio.setVisible(true);
        botonHoraFin.setVisible(true);
    }//GEN-LAST:event_botonTodasCausasActionPerformed

    private void botonEspecificarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecificarCausaActionPerformed
        comboCausa.setVisible(true);
        Tareas tarea = (Tareas) comboTarea.getSelectedItem();
        Causas causa = new Causas();
        cajaIDTarea.setText(String.valueOf(tarea.getIdtarea()));
        DefaultComboBoxModel modelo4 = new DefaultComboBoxModel(causa.mostrarCausas(tarea.getIdtarea()));
        comboCausa.setModel(modelo4);
    }//GEN-LAST:event_botonEspecificarCausaActionPerformed

    private void botonHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHoraInicioActionPerformed
        horaInicio.showPopup();
    }//GEN-LAST:event_botonHoraInicioActionPerformed

    private void botonHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHoraFinActionPerformed
        horaFin.showPopup();
    }//GEN-LAST:event_botonHoraFinActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
        try {
            ExportarAExcel exportar = new ExportarAExcel();
            exportar.exportarExcel(tabla);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_botonExportarActionPerformed

    private void comboFAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFAItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
            FA fa = (FA) comboFA.getSelectedItem();
            ZonaFA zona = new ZonaFA();
            cajaIDFA.setText(String.valueOf(fa.getIdFA()));
            DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(zona.mostrarZonas2(fa.getIdFA()));
            comboZona.setModel(modelo3);
            comboTarea.removeAllItems();
            comboCausa.removeAllItems();
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
                botonTodasCausas.setVisible(false);
                botonEspecificarCausa.setVisible(false);
                //Creamos los obbjetos para obtener el idtarea
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                cajaIDTarea.setText(String.valueOf(tarea.getIdtarea()));
                //Calendario
                seleccionarFechaIni.setVisible(true);
                etiquetaFechaInicio.setVisible(true);
                seleccionarFechaFin.setVisible(true);
                etiquetaFechaFin.setVisible(true);
                //Hora
                seleccionarHoraInicio.setVisible(true);
                seleccionarHoraFin.setVisible(true);
                etiquetaHoraInicio.setVisible(true);
                etiquetaHoraFin.setVisible(true);
                botonHoraInicio.setVisible(true);
                botonHoraFin.setVisible(true);
            } else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                etiquetaCausa.setVisible(true);
                botonTodasCausas.setVisible(true);
                botonEspecificarCausa.setVisible(true);
                //Calendario
                seleccionarFechaIni.setVisible(true);
                etiquetaFechaInicio.setVisible(true);
                seleccionarFechaFin.setVisible(true);
                etiquetaFechaFin.setVisible(true);
                //Hora
                seleccionarHoraInicio.setVisible(true);
                seleccionarHoraFin.setVisible(true);
                etiquetaHoraInicio.setVisible(true);
                etiquetaHoraFin.setVisible(true);
                botonHoraInicio.setVisible(true);
                botonHoraFin.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboTareaItemStateChanged

    private void comboCausaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCausaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado            cajaOtros.setVisible(true);

            if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otros")) {
                FA fa = (FA) comboFA.getSelectedItem();
                ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                //Calendario
                seleccionarFechaIni.setVisible(true);
                etiquetaFechaInicio.setVisible(true);
                seleccionarFechaFin.setVisible(true);
                etiquetaFechaFin.setVisible(true);
                //Hora
                seleccionarHoraInicio.setVisible(true);
                seleccionarHoraFin.setVisible(true);
                etiquetaHoraInicio.setVisible(true);
                etiquetaHoraFin.setVisible(true);
                botonHoraInicio.setVisible(true);
                botonHoraFin.setVisible(true);
            } else {
                FA fa = (FA) comboFA.getSelectedItem();
                ZonaFA zona = (ZonaFA) comboZona.getSelectedItem();
                Tareas tarea = (Tareas) comboTarea.getSelectedItem();
                Causas causa = (Causas) comboCausa.getSelectedItem();
                cajaIDCausa.setText(String.valueOf(causa.getIdcausa()));
                //Calendario
                seleccionarFechaIni.setVisible(true);
                etiquetaFechaInicio.setVisible(true);
                seleccionarFechaFin.setVisible(true);
                etiquetaFechaFin.setVisible(true);
                //Hora
                seleccionarHoraInicio.setVisible(true);
                seleccionarHoraFin.setVisible(true);
                etiquetaHoraInicio.setVisible(true);
                etiquetaHoraFin.setVisible(true);
                botonHoraInicio.setVisible(true);
                botonHoraFin.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboCausaItemStateChanged

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarDespuesDeReporte();
        botonLimpiar.setVisible(false);
        botonExportar.setVisible(false);
        botonGZonas.setVisible(false);
        botonGCausas.setVisible(false);
        etiquetaGrafica.setVisible(false);
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonGenerarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarGraficaActionPerformed
        //PARA VALIDAR QUE ESTE SELECCIONADO CADA UNO DE LOS RADIO BUTTONS
        if (botonGrupoFA.getSelection() == null || botonGrupoZona.getSelection() == null || botonGrupoTarea.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Le falto especificar un campo de seleccion");
        } //SI ESTAN ACTIVADOS LOS COMBOBOX, VALIDAR QUE HAYAN SIDO SELECCIONADOS
        else if ((comboFA.getSelectedIndex() == 0 && comboFA.isVisible() == true) || (comboZona.getSelectedIndex() == 0 && comboZona.isVisible() == true) || (comboTarea.getSelectedIndex() == 0 && comboTarea.isVisible() == true)) {
            JOptionPane.showMessageDialog(null, "Le falto escoger el elemento del combobox");
        } //SI ESTA SELECCIONADO REGISTRAR DESPERDICIO PERO NO LA CAUSA
        else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30") && botonEspecificarCausa.isSelected() == false && botonTodasCausas.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Le falto seleccionar la causa");
        } //SI ESTA SELECCIONADO ESPECIFICAR EN CAUSA PERO NO SE HA SELECCIONADO NADA
        else if ((comboCausa.isVisible() == true && comboCausa.getSelectedItem().toString().equalsIgnoreCase("")) && comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
            JOptionPane.showMessageDialog(null, "Le falto especificar la causa");
        } //SI NO SE SELECCIONO NINGUNA FECHA EN LOS CAMPOS
        else if (seleccionarFechaIni.getDate() == null || seleccionarFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione las fechas a escoger");
        } //Si se seleccionaron todas las FA, todas las zonas, todas las tareas
        else if (botonTodasFA.isSelected() == true && botonTodasZonas.isSelected() == true && botonTodasTareas.isSelected() == true) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionTODO();
                establecerReloj();
            }
        } //SI SE SELECCIONO LA TAREA DE CAMBIO DE CUBETA EN ESPECIFICACION
        else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("cambio de cubeta")) {
            rellenarReporteOpcionCUBETA();
            establecerReloj();
        } //SI EN SE ESPECIFICO Y APARTE SE SELECCIONO DESPERDICIO
        else if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
            //SE SELECCIONO TODAS LAS CAUSAS
            if (botonTodasCausas.isSelected() == true) {
                rellenarReporteOpcionTODASLASCAUSAS();
                establecerReloj();
            }//SE SELECCIONO LA OPCION OTROS
            else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otros")) {
                rellenarReporteOpcionOTROS();
                establecerReloj();
            } //SE SELECCIONO CUALQUIER OTRA OPCION EN EL COMBO BOX APARTE DE OTROS
            else if (!comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otros") && botonEspecificarCausa.isSelected() == true) {
                rellenarReporteOpcionDESPERDICIO();
                establecerReloj();
            }
        } //SI SE SELECCIONO TODAS LAS TAREAS
        else {
            rellenarReporteOpcionTODASLASTAREAS();
        }
    }//GEN-LAST:event_botonGenerarGraficaActionPerformed

    private void establecerReloj() {
        seleccionarHoraInicio.setText("12:00 AM");
        seleccionarHoraFin.setText("12:00 AM");
    }

    private void botonGZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGZonasActionPerformed
        panelGrafica.setVisible(true);
        graficarZonas();
    }//GEN-LAST:event_botonGZonasActionPerformed

    private void botonGCausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGCausasActionPerformed
        panelGrafica.setVisible(true);
        graficarCausas();
    }//GEN-LAST:event_botonGCausasActionPerformed

    private void botonGenerarGraficaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGenerarGraficaMouseEntered
        botonGenerarGrafica.setBackground(Color.orange);
    }//GEN-LAST:event_botonGenerarGraficaMouseEntered

    private void botonLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseEntered
        botonLimpiar.setBackground(Color.orange);
    }//GEN-LAST:event_botonLimpiarMouseEntered

    private void botonExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExportarMouseEntered
        botonExportar.setBackground(Color.orange);
    }//GEN-LAST:event_botonExportarMouseEntered

    private void botonGenerarGraficaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGenerarGraficaMouseExited
        botonGenerarGrafica.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonGenerarGraficaMouseExited

    private void botonLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseExited
        botonLimpiar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonLimpiarMouseExited

    private void botonExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExportarMouseExited
        botonExportar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonExportarMouseExited

    private void limpiarTodo() {
        seleccionarFechaIni.setDate(null);
        seleccionarFechaFin.setDate(null);
        etiquetaCausa.setVisible(false);
        comboCausa.setVisible(false);
        botonEspecificarCausa.setVisible(false);
        botonTodasCausas.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonEspecificarCausa;
    private javax.swing.JRadioButton botonEspecificarFA;
    private javax.swing.JRadioButton botonEspecificarTarea;
    private javax.swing.JRadioButton botonEspecificarZona;
    private javax.swing.JButton botonExportar;
    private javax.swing.JRadioButton botonGCausas;
    private javax.swing.JRadioButton botonGZonas;
    private javax.swing.JButton botonGenerarGrafica;
    private javax.swing.ButtonGroup botonGrupoCausa;
    private javax.swing.ButtonGroup botonGrupoFA;
    private javax.swing.ButtonGroup botonGrupoGraficas;
    private javax.swing.ButtonGroup botonGrupoTarea;
    private javax.swing.ButtonGroup botonGrupoZona;
    private javax.swing.JButton botonHoraFin;
    private javax.swing.JButton botonHoraInicio;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JRadioButton botonTodasCausas;
    private javax.swing.JRadioButton botonTodasFA;
    private javax.swing.JRadioButton botonTodasTareas;
    private javax.swing.JRadioButton botonTodasZonas;
    private javax.swing.JTextField cajaIDCausa;
    private javax.swing.JTextField cajaIDFA;
    private javax.swing.JTextField cajaIDTarea;
    private javax.swing.JTextField cajaIDZona;
    private javax.swing.JComboBox<String> comboCausa;
    private javax.swing.JComboBox<String> comboFA;
    private javax.swing.JComboBox<String> comboTarea;
    private javax.swing.JComboBox<String> comboZona;
    private javax.swing.JLabel etiquetaCausa;
    private javax.swing.JLabel etiquetaFechaFin;
    private javax.swing.JLabel etiquetaFechaInicio;
    private javax.swing.JLabel etiquetaGrafica;
    private javax.swing.JLabel etiquetaHoraFin;
    private javax.swing.JLabel etiquetaHoraInicio;
    private javax.swing.JLabel etiquetaSeleccionar;
    private javax.swing.JLabel etiquetaTarea;
    private javax.swing.JLabel etiquetaZona;
    private cambodia.raven.Time horaFin;
    private cambodia.raven.Time horaInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGrafica;
    private com.toedter.calendar.JDateChooser seleccionarFechaFin;
    private com.toedter.calendar.JDateChooser seleccionarFechaIni;
    private javax.swing.JTextField seleccionarHoraFin;
    private javax.swing.JTextField seleccionarHoraInicio;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
