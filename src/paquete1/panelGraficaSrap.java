package paquete1;

import controlador.CausasScrap;
import controlador.ExportarAExcel;
import controlador.FA;
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

public class panelGraficaSrap extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    PreparedStatement ps;
    ResultSet rs;

    public panelGraficaSrap() {
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
        cajaIDCausa = new javax.swing.JTextField();
        comboCausa = new javax.swing.JComboBox<>();
        cajaIDZona = new javax.swing.JTextField();
        cajaIDTarea = new javax.swing.JTextField();
        panelGrafica = new javax.swing.JPanel();
        botonGZonas = new javax.swing.JRadioButton();
        botonGCausas = new javax.swing.JRadioButton();
        etiquetaGrafica = new javax.swing.JLabel();

        botonGrupoFA.add(botonTodasFA);
        botonGrupoFA.add(botonEspecificarFA);

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

        etiquetaCausa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        etiquetaCausa.setText("Seleccione la causa: ");
        add(etiquetaCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        botonTodasCausas.setBackground(new java.awt.Color(204, 204, 204));
        botonTodasCausas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonTodasCausas.setText("TODAS LAS CAUSAS");
        botonTodasCausas.setFocusPainted(false);
        botonTodasCausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodasCausasActionPerformed(evt);
            }
        });
        add(botonTodasCausas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, -1));

        botonEspecificarCausa.setBackground(new java.awt.Color(204, 204, 204));
        botonEspecificarCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEspecificarCausa.setText("ESPECIFICAR");
        botonEspecificarCausa.setFocusPainted(false);
        botonEspecificarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspecificarCausaActionPerformed(evt);
            }
        });
        add(botonEspecificarCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, -1));

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
        botonGenerarGrafica.setText("Generar Grafica");
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

        cajaIDCausa.setVisible(false);
        add(cajaIDCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 80, -1));

        comboCausa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        comboCausa.setVisible(false);
        comboCausa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCausaItemStateChanged(evt);
            }
        });
        add(comboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 230, -1));

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
        add(botonGCausas, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        etiquetaGrafica.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaGrafica.setText("Seleccione que quiere graficar: ");
        etiquetaGrafica.setVisible(false);
        add(etiquetaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void graficarZonas() {
        //Si se selecciono TODAS FA
        if (botonTodasFA.isSelected() == true) {
            try {
                panelGrafica.removeAll();
                //Contadores de las causas
                int FA1 = 0, FA2 = 0, FA3 = 0;
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    if (tabla.getValueAt(i, 2).equals("FA1")) {
                        FA1++;
                    } else if (tabla.getValueAt(i, 2).equals("FA2")) {
                        FA2++;
                    } else if (tabla.getValueAt(i, 2).equals("FA3")) {
                        FA3++;
                    }
                }
                org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
                DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
                if (FA1 != 0) {
                    datos.addValue(FA1, "FA1", "Z4B");
                }
                if (FA2 != 0) {
                    datos.addValue(FA2, "FA2", "Z4F");
                }
                if (FA3 != 0) {
                    datos.addValue(FA3, "FA3", "Z5B");
                }
                DefaultPieDataset datospie = new DefaultPieDataset();
                if (FA1 != 0) {
                    datospie.setValue(("FA1= " + FA1 + " registros"), FA1);
                }
                if (FA2 != 0) {
                    datospie.setValue(("FA2= " + FA2 + " registros"), FA2);
                }
                if (FA3 != 0) {
                    datospie.setValue(("FA3= " + FA3 + " registros"), FA3);
                }
                grafico = ChartFactory.createPieChart("Gràfico FAS con mayores registros", datospie, true, true, false);
                ChartPanel panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
                panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
                panelGrafica.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
                panelGrafica.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
                panelGrafica.validate(); //Validamos para que se resetee por asi decirlo el panel
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        //Si se selecciona atornillado y NO TODAS FA
        if (botonTodasFA.isSelected() == false && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            try {
                panelGrafica.removeAll();
                //Contadores de las causas
                int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0, s6 = 0;
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    if (tabla.getValueAt(i, 5).equals("s1")) {
                        s1++;
                    } else if (tabla.getValueAt(i, 5).equals("s2")) {
                        s2++;
                    } else if (tabla.getValueAt(i, 5).equals("s3")) {
                        s3++;
                    } else if (tabla.getValueAt(i, 5).equals("s4")) {
                        s4++;
                    } else if (tabla.getValueAt(i, 5).equals("s5")) {
                        s5++;
                    } else if (tabla.getValueAt(i, 5).equals("s6")) {
                        s6++;
                    }
                }
                org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
                DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
                if (s1 != 0) {
                    datos.addValue(s1, "FA1", "Z4B");
                }
                if (s2 != 0) {
                    datos.addValue(s2, "FA2", "Z4F");
                }
                if (s3 != 0) {
                    datos.addValue(s3, "FA3", "Z5B");
                }
                if (s4 != 0) {
                    datos.addValue(s4, "FA1", "Z4B");
                }
                if (s5 != 0) {
                    datos.addValue(s5, "FA2", "Z4F");
                }
                if (s6 != 0) {
                    datos.addValue(s6, "FA3", "Z5B");
                }
                DefaultPieDataset datospie = new DefaultPieDataset();
                if (s1 != 0) {
                    datospie.setValue(("s1= " + s1 + " registros"), s1);
                }
                if (s2 != 0) {
                    datospie.setValue(("s2= " + s2 + " registros"), s2);
                }
                if (s3 != 0) {
                    datospie.setValue(("s3= " + s3 + " registros"), s3);
                }
                if (s4 != 0) {
                    datospie.setValue(("s4= " + s4 + " registros"), s4);
                }
                if (s5 != 0) {
                    datospie.setValue(("s5= " + s5 + " registros"), s5);
                }
                if (s6 != 0) {
                    datospie.setValue(("s6= " + s6 + " registros"), s6);
                }
                grafico = ChartFactory.createPieChart("Gràfico posiciones de falla de tornillo", datospie, true, true, false);
                ChartPanel panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
                panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
                panelGrafica.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
                panelGrafica.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
                panelGrafica.validate(); //Validamos para que se resetee por asi decirlo el panel
            } catch (Exception e) {
            }
        }
    }

    private void graficarCausas() {
        if (botonTodasCausas.isSelected()) {
            try {
                panelGrafica.removeAll();
                //Contadores de las causas
                int causaAtornillado = 0, causaDispensado = 0, causaMalCasamiento = 0, causaOtros = 0;
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    if (tabla.getValueAt(i, 0).equals("Atornillado")) {
                        causaAtornillado++;
                    } else if (tabla.getValueAt(i, 0).equals("Dispensado")) {
                        causaDispensado++;
                    } else if (tabla.getValueAt(i, 0).equals("Mal casamiento")) {
                        causaMalCasamiento++;
                    } else if (!tabla.getValueAt(i, 0).equals("Atornillado") && !tabla.getValueAt(i, 0).equals("Dispensado") && !tabla.getValueAt(i, 0).equals("Mal casamiento")) {
                        causaOtros++;
                    }
                }
                org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
                DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
                if (causaAtornillado != 0) {
                    datos.addValue(causaAtornillado, "Atornilladp", "Z4B");
                }
                if (causaDispensado != 0) {
                    datos.addValue(causaDispensado, "Dispensado", "Z4F");
                }
                if (causaMalCasamiento != 0) {
                    datos.addValue(causaMalCasamiento, "Mal casamiento", "Z5B");
                }
                if (causaOtros != 0) {
                    datos.addValue(causaOtros, "Otros", "Z5F");
                }
                DefaultPieDataset datospie = new DefaultPieDataset();
                if (causaAtornillado != 0) {
                    datospie.setValue(("Atornillado= " + causaAtornillado + " registros"), causaAtornillado);
                }
                if (causaDispensado != 0) {
                    datospie.setValue(("Dispensado= " + causaDispensado + " registros"), causaDispensado);
                }
                if (causaMalCasamiento != 0) {
                    datospie.setValue(("Mal casamiento= " + causaMalCasamiento + " registros"), causaMalCasamiento);
                }
                if (causaOtros != 0) {
                    datospie.setValue(("Otros= " + causaOtros + " registros"), causaOtros);
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
        } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            try {
                panelGrafica.removeAll();
                //Contadores de las causas
                int opcTorque = 0, opcAngulo = 0;

                for (int i = 0; i < tabla.getRowCount(); i++) {
                    if (tabla.getValueAt(i, 4).equals("Torque")) {
                        opcTorque++;
                    } else if (tabla.getValueAt(i, 4).equals("Angulo")) {
                        opcAngulo++;
                    }
                }
                org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
                DefaultCategoryDataset datos = new DefaultCategoryDataset(); //Creas el dataset para los datos que graficaremos
                if (opcTorque != 0) {
                    datos.addValue(opcTorque, "Atornilladp", "Z4B");
                }
                if (opcAngulo != 0) {
                    datos.addValue(opcAngulo, "Dispensado", "Z4F");
                }
                DefaultPieDataset datospie = new DefaultPieDataset();
                if (opcTorque != 0) {
                    datospie.setValue(("Torque= " + opcTorque + " registros"), opcTorque);
                }
                if (opcAngulo != 0) {
                    datospie.setValue(("Angulo= " + opcAngulo + " registros"), opcAngulo);
                }
                grafico = ChartFactory.createPieChart("Gràfico de torque u angulo", datospie, true, true, false);
                ChartPanel panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
                panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
                panelGrafica.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
                panelGrafica.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
                panelGrafica.validate(); //Validamos para que se resetee por asi decirlo el panel
            } catch (Exception e) {
            }
        } else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Dispensado")) {
            try {
                panelGrafica.removeAll();
                //Contadores de las zonas
                int z4b = 0, z4f = 0, z5b = 0, z5f = 0;
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    if (tabla.getValueAt(i, 4).equals("Z4B")) {
                        z4b++;
                    } else if (tabla.getValueAt(i, 4).equals("Z4F")) {
                        z4f++;
                    } else if (tabla.getValueAt(i, 4).equals("Z5B")) {
                        z5b++;
                    } else if (tabla.getValueAt(i, 4).equals("Z5F")) {
                        z5f++;
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
                    datospie.setValue(("Z4B =" + z4b + " registros"), z4b);
                }
                if (z4f != 0) {
                    datospie.setValue(("Z4F= " + z4f + " registros"), z4f);
                }
                if (z5b != 0) {
                    datospie.setValue(("Z5B= " + z5b + " registros"), z5b);
                }
                if (z5f != 0) {
                    datospie.setValue(("Z5F= " + z5f + " registros"), z5f);
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
    }

    private void reporteTotal(String fecha_ini, String fecha_fin) {
        ConexionABD con = new ConexionABD();
        try {
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteTodoScrap.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
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

    private void reporteDeLasCincoFormas(String fecha_ini, String fecha_fin, String whereFA, String whereCausa) {
        ConexionABD con = new ConexionABD();
        try {
            JasperReport reporte = null;
            //Para filtrar el reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            whereCausa = comboCausa.getSelectedItem().toString();
            if (whereCausa.equalsIgnoreCase("Atornillado")) {
                Connection conexion = ConexionABD.getConnection();
                String ruta = "C:\\BaseDeDatosReportesFA\\reporteAtornillado.jasper";
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                Map parametro = new HashMap();
                parametro.put("fecha_ini", fecha_ini);
                parametro.put("fecha_fin", fecha_fin);
                parametro.put("whereFA", whereFA);
                parametro.put("whereCausa", whereCausa);
                JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
                JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
                //Para cuando presione la x, se salga
                vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                vistaReporte.setVisible(true);
            } else if (whereCausa.equalsIgnoreCase("Dispensado")) {
                Connection conexion = ConexionABD.getConnection();
                String ruta = "C:\\BaseDeDatosReportesFA\\reporteDispensado.jasper";
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                Map parametro = new HashMap();
                parametro.put("fecha_ini", fecha_ini);
                parametro.put("fecha_fin", fecha_fin);
                parametro.put("whereFA", whereFA);
                parametro.put("whereCausa", whereCausa);
                JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
                JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
                //Para cuando presione la x, se salga
                vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                vistaReporte.setVisible(true);
            } else if (whereCausa.equalsIgnoreCase("Mal casamiento")) {
                Connection conexion = ConexionABD.getConnection();
                String ruta = "C:\\BaseDeDatosReportesFA\\reporteMalCasamiento.jasper";
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                Map parametro = new HashMap();
                parametro.put("fecha_ini", fecha_ini);
                parametro.put("fecha_fin", fecha_fin);
                parametro.put("whereFA", whereFA);
                parametro.put("whereCausa", whereCausa);
                JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
                JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
                //Para cuando presione la x, se salga
                vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                vistaReporte.setVisible(true);
            } else if (whereCausa.equalsIgnoreCase("Otro")) {
                Connection conexion = ConexionABD.getConnection();
                String ruta = "C:\\BaseDeDatosReportesFA\\reporteOtrosScrap.jasper";
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                int estado = 0;
                Map parametro = new HashMap();
                parametro.put("fecha_ini", fecha_ini);
                parametro.put("fecha_fin", fecha_fin);
                parametro.put("whereFA", whereFA);
                parametro.put("whereCausa", estado);
                JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, parametro, conexion);
                JasperViewer vistaReporte = new JasperViewer(imprimirReporte, false);
                //Para cuando presione la x, se salga
                vistaReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                vistaReporte.setVisible(true);
            }
        } catch (JRException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void reporteTotalCausasScrap(String fecha_ini, String fecha_fin, String whereFA) {
        ConexionABD con = new ConexionABD();
        try {
            Connection conexion = ConexionABD.getConnection();
            //Crear objeto para mostrar reporte
            if (whereFA.equals("")) {
                whereFA = "FA*";
            } else {
                whereFA = comboFA.getSelectedItem().toString();
            }
            JasperReport reporte = null;
            String ruta = "C:\\BaseDeDatosReportesFA\\reporteTodasCausasScrap.jasper";
            //Igualamos reporte a la ruta del reporte y casteamos.
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            //LOS SIGUIENTES SON PARA HACER UNA CONSULTA ESPECIFICA
            Map parametro = new HashMap();
            parametro.put("fecha_ini", fecha_ini);
            parametro.put("fecha_fin", fecha_fin);
            parametro.put("whereFA", whereFA);
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
        String[] vector = {"Nombre de la causa", "Técnico", "FA", "Serial Producto", "Opción", "Posición", "Zona FA", "Pedestal", "Serial Housing", "Serial PCB", "TimeStamp"};
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
        modelo.addColumn(vector[10]);
    }

    private void rellenarColumnasAtornillado() {
        String[] vector = {"Nombre de la causa", "Técnico", "FA", "Serial Producto", "Opción", "Posición", "TimeStamp"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
    }

    private void rellenarColumnasDispensado() {
        String[] vector = {"Nombre de la causa", "Técnico", "FA", "Serial Producto", "Zona FA", "pedestal", "TimeStamp"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
    }

    private void rellenarColumnasMalCasamiento() {
        String[] vector = {"Nombre de la causa", "Técnico", "FA", "Serial Producto", "Serial Housing", "Serial PCB", "TimeStamp"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
        modelo.addColumn(vector[5]);
        modelo.addColumn(vector[6]);
    }

    private void rellenarColumnasOtros() {
        String[] vector = {"Nombre de la causa", "Técnico", "FA", "Serial Producto", "TimeStamp"};
        modelo.addColumn(vector[0]);
        modelo.addColumn(vector[1]);
        modelo.addColumn(vector[2]);
        modelo.addColumn(vector[3]);
        modelo.addColumn(vector[4]);
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
        comboCausa.setVisible(false);
        botonGrupoFA.clearSelection();
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
        botonEspecificarCausa.setEnabled(false);
        botonTodasCausas.setEnabled(false);
        botonTodasFA.setEnabled(false);
        botonEspecificarFA.setEnabled(false);
        comboCausa.setEnabled(false);
        comboFA.setEnabled(false);
    }

    private void habilitarTodo() {
        botonGenerarGrafica.setEnabled(true);
        seleccionarFechaIni.setEnabled(true);
        seleccionarFechaFin.setEnabled(true);
        seleccionarHoraInicio.setEnabled(true);
        seleccionarHoraFin.setEnabled(true);
        botonHoraFin.setEnabled(true);
        botonHoraInicio.setEnabled(true);
        botonEspecificarCausa.setEnabled(true);
        botonTodasCausas.setEnabled(true);
        botonTodasFA.setEnabled(true);
        botonEspecificarFA.setEnabled(true);
        comboCausa.setEnabled(true);
        comboFA.setEnabled(true);
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
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, opcion, posicion, zonaFA, pedestal, numSerieHousing, numSeriePCB, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A Access
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {280, 260, 70, 260, 120, 120, 150, 150, 210, 160, 350}; //Ancho de columnas
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

    private void rellenarReporteOpcionAtornillado() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereCausa = "Atornillado";

        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasAtornillado();
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

            reporteDeLasCincoFormas(fecha1, fecha2, whereFA, whereCausa);
            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and nombreCausa= 'Atornillado' " + whereFA;
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, opcion, posicion, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {250, 250, 150, 250, 300, 300, 400}; //Ancho de columnas
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

    private void rellenarReporteOpcionDispensado() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereCausa = "Dispensado";

        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasDispensado();
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

            reporteDeLasCincoFormas(fecha1, fecha2, whereFA, whereCausa);

            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and nombreCausa= 'Dispensado' " + whereFA;
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, zonaFA, pedestal, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {250, 250, 150, 250, 300, 300, 400}; //Ancho de columnas
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

    private void rellenarReporteOpcionMalCasamiento() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereCausa = "Mal casamiento";
        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = " and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasMalCasamiento();
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

            reporteDeLasCincoFormas(fecha1, fecha2, whereFA, whereCausa);
            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and nombreCausa= 'Mal casamiento' " + whereFA;
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, numSerieHousing, numSeriePCB, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {250, 250, 150, 250, 300, 300, 400}; //Ancho de columnas
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

    private void rellenarReporteOpcionOtro() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "", whereCausa = "Otro";

        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
        }
        try {
            tabla.setVisible(true);
            rellenarColumnasOtros();
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

            reporteDeLasCincoFormas(fecha1, fecha2, whereFA, whereCausa);
            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "# and estado= 0 " + whereFA;
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {350, 400, 250, 150, 300}; //Ancho de columnas
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

    private void rellenarReporteOpcionTodasLasCausas() {
        //VARIABLES PARA LOS WHERES
        String whereFA = "";
        if (comboFA.isVisible() == true && !comboFA.getSelectedItem().toString().equals("")) {
            whereFA = "and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
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

            reporteTotalCausasScrap(fecha1, fecha2, whereFA);
            where = "WHERE " + "columna_auxiliar > #" + fecha1 + "# AND columna_auxiliar < #" + fecha2 + "#" + whereFA;
            ps = conexion.prepareStatement("select nombreCausa, nombre, nombreFA, numSerieProducto, opcion, posicion, zonaFA, pedestal, numSerieHousing, numSeriePCB, fecha_causa from registrosJuntosScrap " + where + " order by columna_auxiliar ASC");
            rs = ps.executeQuery();
            //PARA HACER CONTEOS DE COLUMNAS A MYSQL
            ResultSetMetaData rsmd = rs.getMetaData(); //Obtenemos todos los datos con los que trabaja el rs
            int cantidadColumnas = rsmd.getColumnCount(); //Obtenemos el conteo de columnas 
            //PARA CAMBIAR EL TAMAÑO DE COLUMNAS EN JTABLE
            int[] anchos = {280, 260, 70, 260, 120, 120, 150, 150, 210, 160, 350}; //Ancho de columnas
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
        etiquetaGrafica.setVisible(true);
        botonGZonas.setVisible(true);
        botonGCausas.setVisible(true);
    }

    private void botonTodasFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodasFAActionPerformed
        comboFA.removeAllItems();
        ZonaFA zona = new ZonaFA();
        cajaIDFA.setText("1");
        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(zona.mostrarZonas2(1));
        comboCausa.removeAllItems();
        //Agregados recientemente
        comboFA.setVisible(false);
        comboCausa.setVisible(false);
        botonGrupoCausa.clearSelection();
    }//GEN-LAST:event_botonTodasFAActionPerformed

    private void botonEspecificarFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspecificarFAActionPerformed
        comboFA.setVisible(true);
        FA fa = new FA();
        DefaultComboBoxModel modeloFA = new DefaultComboBoxModel(fa.mostrarFA());
        comboFA.setModel(modeloFA);
        //Desactivar las marcas de los RadioButtons
        botonGrupoCausa.clearSelection();

        comboCausa.setVisible(false);
    }//GEN-LAST:event_botonEspecificarFAActionPerformed

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
        CausasScrap causa = new CausasScrap();
        DefaultComboBoxModel modelo4 = new DefaultComboBoxModel(causa.mostrarCausasScrap(1));
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
            CausasScrap causa = new CausasScrap();
            DefaultComboBoxModel modelo3 = new DefaultComboBoxModel(causa.mostrarCausasScrap(1));
            comboCausa.setModel(modelo3);
            limpiarTodo();
        }
    }//GEN-LAST:event_comboFAItemStateChanged

    private void comboCausaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCausaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Algun elemento de mi ComboBox ha sido seleccionado
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
        if (botonGrupoFA.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Le falto especificar un campo de seleccion");
        } //SI ESTAN ACTIVADOS LOS COMBOBOX, VALIDAR QUE HAYAN SIDO SELECCIONADOS
        else if ((comboFA.getSelectedIndex() == 0 && comboFA.isVisible() == true)) {
            JOptionPane.showMessageDialog(null, "Le falto escoger el elemento del combobox");
        } //PARA VALIDAR QUE ESTE SELECCIONADO CADA UNO DE LOS RADIO BUTTONS
        else if (botonGrupoCausa.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Le falto especificar un campo de seleccion");
        } //SI ESTAN ACTIVADOS LOS COMBOBOX, VALIDAR QUE HAYAN SIDO SELECCIONADOS
        else if ((comboCausa.getSelectedIndex() == 0 && comboCausa.isVisible() == true)) {
            JOptionPane.showMessageDialog(null, "Le falto escoger el elemento del combobox");
        } //SI NO SE SELECCIONO NINGUNA FECHA EN LOS CAMPOS
        else if (seleccionarFechaIni.getDate() == null || seleccionarFechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione las fechas a escoger");
        } //Si se seleccionaron todas las FA y todas las causas
        else if (botonTodasFA.isSelected() == true && botonTodasCausas.isSelected() == true) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionTODO();
                establecerReloj();
            }
        } //Si se seleccionaron todas las causas
        else if (botonTodasCausas.isSelected() == true && botonTodasFA.isSelected() == false) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionTodasLasCausas();
                establecerReloj();
            }
        } //Si se selecciona la opcion de Atornillado
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionAtornillado();
                establecerReloj();
            }
        } //Si se selecciona la opcion de Dispensado
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Dispensado")) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionDispensado();
                establecerReloj();
            }
        } //Si se selecciona la opcion de Mal casamiento
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Mal casamiento")) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionMalCasamiento();
                establecerReloj();
            }
        } //Si se selecciona la opcion de Otro
        else if (comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otro")) {
            //VERIFICAR QUE LAS FECHAS NO ESTEN VACIAS
            if (seleccionarFechaIni.getDate() != null || seleccionarFechaFin.getDate() != null) {
                rellenarReporteOpcionOtro();
                establecerReloj();
            }
        }
        if (botonTodasFA.isSelected() == true) {
            botonGZonas.setText("FAs");
        }
        if (botonTodasCausas.isSelected() == true && botonTodasFA.isSelected() == false) {
            botonGZonas.setVisible(false);
        }
        if (comboCausa.isVisible() && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            botonGCausas.setText("Opcion (T/A)");
        }
        if (comboCausa.isVisible() && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Dispensado")) {
            botonGCausas.setText("Zonas");
        }
        if (comboCausa.isVisible() && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Otro")) {
            if (botonTodasFA.isSelected() == true) {
                botonGCausas.setVisible(false);
            } else {
                etiquetaGrafica.setVisible(false);
                botonGCausas.setVisible(false);
                botonGZonas.setVisible(false);
            }
        }
        if (comboCausa.isVisible() && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Mal casamiento")) {
            if (botonTodasFA.isSelected() == true) {
                botonGCausas.setVisible(false);
            } else {
                etiquetaGrafica.setVisible(false);
                botonGCausas.setVisible(false);
                botonGZonas.setVisible(false);
            }
        }
        if (botonTodasFA.isSelected() == false && comboCausa.isVisible() && comboCausa.getSelectedItem().toString().equalsIgnoreCase("Atornillado")) {
            botonGZonas.setText("Tornillo");
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonEspecificarCausa;
    private javax.swing.JRadioButton botonEspecificarFA;
    private javax.swing.JButton botonExportar;
    private javax.swing.JRadioButton botonGCausas;
    private javax.swing.JRadioButton botonGZonas;
    private javax.swing.JButton botonGenerarGrafica;
    private javax.swing.ButtonGroup botonGrupoCausa;
    private javax.swing.ButtonGroup botonGrupoFA;
    private javax.swing.ButtonGroup botonGrupoGraficas;
    private javax.swing.JButton botonHoraFin;
    private javax.swing.JButton botonHoraInicio;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JRadioButton botonTodasCausas;
    private javax.swing.JRadioButton botonTodasFA;
    private javax.swing.JTextField cajaIDCausa;
    private javax.swing.JTextField cajaIDFA;
    private javax.swing.JTextField cajaIDTarea;
    private javax.swing.JTextField cajaIDZona;
    private javax.swing.JComboBox<String> comboCausa;
    private javax.swing.JComboBox<String> comboFA;
    private javax.swing.JLabel etiquetaCausa;
    private javax.swing.JLabel etiquetaFechaFin;
    private javax.swing.JLabel etiquetaFechaInicio;
    private javax.swing.JLabel etiquetaGrafica;
    private javax.swing.JLabel etiquetaHoraFin;
    private javax.swing.JLabel etiquetaHoraInicio;
    private javax.swing.JLabel etiquetaSeleccionar;
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
