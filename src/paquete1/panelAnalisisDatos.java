package paquete1;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class panelAnalisisDatos extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;
    XYLineAndShapeRenderer xylineandshaperenderer = null;
    ChartPanel panelGrafico;
    XYPlot xyplot;

    public panelAnalisisDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaAnio1 = new javax.swing.JLabel();
        botonInfo = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        botonGraficar = new javax.swing.JButton();
        comboMes1 = new javax.swing.JComboBox<>();
        etiquetaMes1 = new javax.swing.JLabel();
        comboAnio1 = new javax.swing.JComboBox<>();
        botonComparar = new javax.swing.JRadioButton();
        comboAnio2 = new javax.swing.JComboBox<>();
        etiquetaAnio2 = new javax.swing.JLabel();
        comboMes2 = new javax.swing.JComboBox<>();
        etiquetaMes2 = new javax.swing.JLabel();
        etiquetaMes3 = new javax.swing.JLabel();
        comboFA = new javax.swing.JComboBox<>();
        etiquetaMes4 = new javax.swing.JLabel();
        comboTarea = new javax.swing.JComboBox<>();
        botonDatos = new javax.swing.JRadioButton();
        comboSemana = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaAnio1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaAnio1.setText("Seleccione un año:");
        add(etiquetaAnio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        botonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoInfo.png"))); // NOI18N
        botonInfo.setBorder(null);
        botonInfo.setBorderPainted(false);
        botonInfo.setContentAreaFilled(false);
        botonInfo.setFocusPainted(false);
        botonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInfoActionPerformed(evt);
            }
        });
        add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        panel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 860, 560));

        botonGraficar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonGraficar.setText("GRAFICAR");
        botonGraficar.setFocusPainted(false);
        botonGraficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGraficarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGraficarMouseExited(evt);
            }
        });
        botonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficarActionPerformed(evt);
            }
        });
        add(botonGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 280, 40));

        comboMes1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        add(comboMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, -1));

        etiquetaMes1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaMes1.setText("Seleccione un mes:");
        add(etiquetaMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        comboAnio1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        int year= Year.now().getValue();
        modelo.addElement("");
        for(int i=year; i>=year-1; i--){
            modelo.addElement(i);
        }
        comboAnio1.setModel(modelo);
        add(comboAnio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, -1));

        botonComparar.setBackground(new java.awt.Color(204, 204, 204));
        botonComparar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonComparar.setText("Comparar");
        botonComparar.setFocusPainted(false);
        botonComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompararActionPerformed(evt);
            }
        });
        add(botonComparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        comboAnio2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboAnio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboAnio2.setVisible(false);
        DefaultComboBoxModel modelo1= new DefaultComboBoxModel();
        int year1= Year.now().getValue();
        modelo1.addElement("");
        for(int i=year1; i>=year1-1; i--){
            modelo1.addElement(i);
        }
        comboAnio2.setModel(modelo1);
        add(comboAnio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 240, -1));

        etiquetaAnio2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaAnio2.setText("Seleccione un año:");
        etiquetaAnio2.setVisible(false);
        add(etiquetaAnio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        comboMes2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes2.setVisible(false);
        add(comboMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 240, -1));

        etiquetaMes2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaMes2.setText("Seleccione un mes:");
        etiquetaMes2.setVisible(false);
        add(etiquetaMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        etiquetaMes3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaMes3.setText("FA:");
        add(etiquetaMes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        comboFA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DefaultComboBoxModel modeloFA= new DefaultComboBoxModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
        modeloFA.addElement("");
        try {
            Connection conexion = ConexionABD.getConnection();

            ps = conexion.prepareStatement("select nombreFA from FAs");
            rs = ps.executeQuery();
            int i=0;
            while (rs.next()) {
                modeloFA.addElement(rs.getObject(i+1));
            }

        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        modeloFA.addElement("Todas las FA");
        comboFA.setModel(modeloFA);
        comboFA.setSelectedItem("Todas las FA");
        add(comboFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        etiquetaMes4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etiquetaMes4.setText("Tarea:");
        add(etiquetaMes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        comboTarea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DefaultComboBoxModel modeloTarea= new DefaultComboBoxModel();
        modeloTarea.addElement("");
        try {
            Connection conexion = ConexionABD.getConnection();

            ps = conexion.prepareStatement("select nombreTarea from tareas where idZona=1");
            rs = ps.executeQuery();
            int i=0;
            while (rs.next()) {
                modeloTarea.addElement(rs.getObject(i+1));
            }

        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
        comboTarea.setModel(modeloTarea);
        comboTarea.setSelectedIndex(2);
        add(comboTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 290, -1));

        botonDatos.setBackground(new java.awt.Color(204, 204, 204));
        botonDatos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonDatos.setText("Datos");
        botonDatos.setFocusPainted(false);
        botonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosActionPerformed(evt);
            }
        });
        add(botonDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, -1, -1));

        comboSemana.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semana 1", "Semana 2", "Semana 3", "Semana 4", "Todas las semanas" }));
        comboSemana.setSelectedItem("Todas las semanas");
        comboSemana.setVisible(false);
        comboSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSemanaActionPerformed(evt);
            }
        });
        add(comboSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        comboSemana.setVisible(true);
        XYDataset xydataset = null;
        if (botonComparar.isSelected()) {
            if (comboMes2.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un mes en la comparación");
            } else if (comboAnio2.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un año en la comparación");
            } else if (comboMes1.getSelectedItem().toString().equals(comboMes2.getSelectedItem().toString()) && comboAnio1.getSelectedItem().toString().equals(comboAnio2.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, "No se puede comparar, son iguales");
            } else {
                xydataset = xyDataset(busquedaDeDatos(devolverMes(comboMes1), devolverAnio(comboAnio1)), busquedaDeDatos(devolverMes(comboMes2), devolverAnio(comboAnio2)));
                hacerGrafica(xydataset);
            }
        } else {
            if (comboMes1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un mes");
            } else if (comboAnio1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un año");
            } else {
                xydataset = xyDataset(busquedaDeDatos(devolverMes(comboMes1), devolverAnio(comboAnio1)));
                hacerGrafica(xydataset);
            }
        }
    }//GEN-LAST:event_botonGraficarActionPerformed

    private void hacerGrafica(XYDataset xydataset) {
        panel.removeAll(); //Limpiamos si es que hay algun dato en el panel
        org.jfree.chart.JFreeChart grafico = null; //Creamos un grafico que inicialice en null, DEBE SER ESA CLASE ESPECIFICA
        if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
            grafico = ChartFactory.createXYLineChart("Gráfico de desperdicio de gel 30", "Días", "Cantidad en gramos de desperdicio", xydataset, PlotOrientation.VERTICAL, true, true, false);
        } else {
            grafico = ChartFactory.createXYLineChart("Gráfico de cambio de cubetas", "Días", "Cantidad de cambio de cubetas", xydataset, PlotOrientation.VERTICAL, true, true, false);
        }
        //Crea los puntos XY de cada dato
        xyplot = (XYPlot) grafico.getPlot();
        xylineandshaperenderer = (XYLineAndShapeRenderer) xyplot.getRenderer();
        xylineandshaperenderer.setBaseShapesVisible(true);
        if (botonDatos.isSelected()) {
            //Muestra los valores en cada punto XY
            XYItemLabelGenerator xy = new StandardXYItemLabelGenerator();
            xylineandshaperenderer.setBaseItemLabelGenerator(xy);
            xylineandshaperenderer.setBaseItemLabelsVisible(true);
            xylineandshaperenderer.setBaseLinesVisible(true);
            xylineandshaperenderer.setBaseItemLabelsVisible(true);
        }
        //Para declarar el grosor de la linea
        XYItemRenderer renderer = grafico.getXYPlot().getRenderer();
        renderer.setBaseStroke(new BasicStroke(2.5f));
        renderer.setBaseItemLabelFont(new Font("arial", 1, 12));
        ((AbstractRenderer) renderer).setAutoPopulateSeriesStroke(false);
        panelGrafico = new ChartPanel(grafico); //Creamos un panel para el grafico
        panelGrafico.setVisible(true);
        panelGrafico.setMouseWheelEnabled(true); //Que se pueda usar la rueda de raton
        panel.setLayout(new java.awt.BorderLayout()); //Le ponemos de layout un borde al panel
        panel.add(panelGrafico, BorderLayout.CENTER); //Agregamos al panel el panel del chart y lo centramos
        panel.validate(); //Validamos para que se resetee por asi decirlo el panel
        comboSemana.setSelectedItem("Todas las semanas");
    }

    private void aparecerDatos(XYLineAndShapeRenderer xylineandshaperenderer) {
        //Muestra los valores en cada punto XY
        XYItemLabelGenerator xy = new StandardXYItemLabelGenerator();
        xylineandshaperenderer.setBaseItemLabelGenerator(xy);
        xylineandshaperenderer.setBaseItemLabelsVisible(true);
        xylineandshaperenderer.setBaseLinesVisible(true);
        xylineandshaperenderer.setBaseItemLabelsVisible(true);
    }

    private void desaparecerDatos(XYLineAndShapeRenderer xylineandshaperenderer) {
        //Muestra los valores en cada punto XY
        XYItemLabelGenerator xy = new StandardXYItemLabelGenerator();
        xylineandshaperenderer.setBaseItemLabelGenerator(xy);
        xylineandshaperenderer.setBaseItemLabelsVisible(false);
        xylineandshaperenderer.setBaseLinesVisible(true);
        xylineandshaperenderer.setBaseItemLabelsVisible(false);
    }

    private void botonCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompararActionPerformed
        if (botonComparar.isSelected()) {
            etiquetaAnio2.setVisible(true);
            etiquetaMes2.setVisible(true);
            comboAnio2.setVisible(true);
            comboMes2.setVisible(true);
        } else {
            comboMes2.setSelectedIndex(0);
            comboAnio2.setSelectedIndex(0);
            etiquetaAnio2.setVisible(false);
            etiquetaMes2.setVisible(false);
            comboAnio2.setVisible(false);
            comboMes2.setVisible(false);
        }
    }//GEN-LAST:event_botonCompararActionPerformed

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed
        JOptionPane.showMessageDialog(null, "\nSeleccione el mes y año que desea graficar, posteriormente, \npresione el botón graficar."
                + "\nEl botón de comparar sirve para comparar los datos \nentre dos meses, ya sea del mismo año o no.\nEl botón de datos sirve para mostrar el dato específico\ndel día.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonInfoActionPerformed

    private void botonGraficarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGraficarMouseEntered
        botonGraficar.setBackground(Color.orange);
    }//GEN-LAST:event_botonGraficarMouseEntered

    private void botonGraficarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGraficarMouseExited
        botonGraficar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_botonGraficarMouseExited

    private void botonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosActionPerformed
        try {
            if (xylineandshaperenderer != null) {
                if (botonDatos.isSelected()) {
                    aparecerDatos(xylineandshaperenderer);
                } else {
                    desaparecerDatos(xylineandshaperenderer);
                }
            } else {
                botonDatos.setSelected(false);
                JOptionPane.showMessageDialog(null, "Primero debe de graficar");
            }
        } catch (java.lang.NullPointerException ex) {
            //System.err.println(ex);
        }
    }//GEN-LAST:event_botonDatosActionPerformed

    private void comboSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSemanaActionPerformed
        if (botonComparar.isSelected()) {
            rangoSemanal(xyplot, devolverMes(comboMes1), devolverMes(comboMes2), devolverAnio(comboAnio1), devolverAnio(comboAnio1));
        } else {
            rangoSemanal(xyplot, devolverMes(comboMes1), devolverAnio(comboAnio1));
        }
    }//GEN-LAST:event_comboSemanaActionPerformed

    private void rangoSemanal(XYPlot xyplot, String mes, String mesito, String year, String year2) {
        int mes1 = Integer.parseInt(mes);
        int mes2 = Integer.parseInt(mesito);
        int anio = Integer.parseInt(year);
        int anio2 = Integer.parseInt(year2);
        double limite = 0;

        YearMonth yearMonthObject = YearMonth.of(anio, mes1);
        int diasDelMes = yearMonthObject.lengthOfMonth();
        YearMonth yearMonthObject2 = YearMonth.of(anio2, mes2);
        int diasDelMes2 = yearMonthObject2.lengthOfMonth();

        if (diasDelMes > diasDelMes2) {
            limite = diasDelMes + 1;
        } else {
            limite = diasDelMes2 + 1;
        }
        if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 1")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(0.8, 7.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 2")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(6.8, 14.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 3")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(13.8, 21.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 4")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(20.8, limite - 0.8);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Todas las semanas")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(0, limite);
        }
    }

    private void rangoSemanal(XYPlot xyplot, String mes, String year) {
        int mes1 = Integer.parseInt(mes);
        int anio = Integer.parseInt(year);
        double limite = 0;

        YearMonth yearMonthObject = YearMonth.of(anio, mes1);
        int diasDelMes = yearMonthObject.lengthOfMonth();
        limite = diasDelMes + 1;

        if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 1")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(0.8, 7.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 2")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(6.8, 14.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 3")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(13.8, 21.2);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Semana 4")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(20.8, limite - 0.8);
        } else if (comboSemana.getSelectedItem().toString().equalsIgnoreCase("Todas las semanas")) {
            NumberAxis domain = (NumberAxis) xyplot.getDomainAxis();
            domain.setRange(0, limite);
        }
    }

    private XYDataset xyDataset(ArrayList<Double> arreglo) {
        //Se declaran las series y se llenan los datos
        XYSeries serieDatos = new XYSeries("Datos del mes " + comboMes1.getSelectedItem().toString() + " " + comboAnio1.getSelectedItem().toString());

        try {
            for (int i = 0; i < arreglo.size(); i++) {
                serieDatos.add(i + 1, arreglo.get(i));
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            //System.err.println("Error: "+ex);
        }
        XYSeriesCollection xyseriescollection = new XYSeriesCollection();
        xyseriescollection.addSeries(serieDatos);
        return xyseriescollection;
    }

    private XYDataset xyDataset(ArrayList<Double> arreglo, ArrayList<Double> arreglo2) {
        //Se declaran las series y se llenan los datos
        XYSeries serieDatos = new XYSeries("Datos del mes " + comboMes1.getSelectedItem().toString() + " " + comboAnio1.getSelectedItem().toString());
        XYSeries serieDatos2 = new XYSeries("Datos del mes " + comboMes2.getSelectedItem().toString() + " " + comboAnio2.getSelectedItem().toString());

        try {
            for (int i = 0; i < arreglo.size(); i++) {
                serieDatos.add(i + 1, arreglo.get(i));
            }
            for (int i = 0; i < arreglo2.size(); i++) {
                serieDatos2.add(i + 1, arreglo2.get(i));
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex);
        }
        XYSeriesCollection xyseriescollection = new XYSeriesCollection();
        xyseriescollection.addSeries(serieDatos);
        xyseriescollection.addSeries(serieDatos2);
        return xyseriescollection;
    }

    private String devolverMes(javax.swing.JComboBox<String> combo) {
        String mesSeleccionado = combo.getSelectedItem().toString();
        switch (mesSeleccionado) {
            case "Enero":
                mesSeleccionado = "01";
                break;
            case "Febrero":
                mesSeleccionado = "02";
                break;
            case "Marzo":
                mesSeleccionado = "03";
                break;
            case "Abril":
                mesSeleccionado = "04";
                break;
            case "Mayo":
                mesSeleccionado = "05";
                break;
            case "Junio":
                mesSeleccionado = "06";
                break;
            case "Julio":
                mesSeleccionado = "07";
                break;
            case "Agosto":
                mesSeleccionado = "08";
                break;
            case "Septiembre":
                mesSeleccionado = "09";
                break;
            case "Octubre":
                mesSeleccionado = "10";
                break;
            case "Noviembre":
                mesSeleccionado = "11";
                break;
            case "Diciembre":
                mesSeleccionado = "12";
                break;
        }
        return mesSeleccionado;
    }

    private String devolverAnio(javax.swing.JComboBox<String> combo) {
        String anioSeleccionado = combo.getSelectedItem().toString();
        return anioSeleccionado;
    }

    private ArrayList<Double> busquedaDeDatos(String mes, String anio) {
        try {
            ConexionABD co = new ConexionABD();
            Connection conexion = ConexionABD.getConnection();
            String where;
            ArrayList<Double> contadorDesperdicio = new ArrayList<>();
            ArrayList<Double> contadorCubetas = new ArrayList<>();
            int contDias = 1;
            int anioSelec = Integer.parseInt(anio);
            int mesSelec = Integer.parseInt(mes);

            //Para obtener el numero exacto de dias
            YearMonth yearMonthObject = YearMonth.of(anioSelec, mesSelec);
            int diasDelMes = yearMonthObject.lengthOfMonth(); //28  
            while (contDias <= diasDelMes) {
                String whereFA = "";
                if (!comboFA.getSelectedItem().toString().equals("")) {
                    whereFA = " and nombreFA= '" + comboFA.getSelectedItem().toString() + "'";
                }
                if (comboFA.getSelectedItem().toString().equals("Todas las FA")) {
                    whereFA = " and nombreFA like 'FA*'";
                }
                if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                    contadorDesperdicio.add(contDias - 1, 0d);
                    where = "WHERE columna_auxiliar > #" + mes + "/" + contDias + "/" + anio + " 00:00:00 AM# AND columna_auxiliar < #" + mes + "/" + contDias + "/" + anio + " 11:59:59 PM#" + whereFA;
                    ps = conexion.prepareStatement("select desperdicio from registrosJuntos " + where + " order by columna_auxiliar ASC");
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        contadorDesperdicio.set(contDias - 1, contadorDesperdicio.get(contDias - 1) + rs.getDouble("desperdicio"));
                    }
                } //SI ES SELECCIONADO CAMBIO DE CUBETA
                else {
                    contadorCubetas.add(contDias - 1, 0d);
                    where = "WHERE columna_auxiliar > #" + mes + "/" + contDias + "/" + anio + " 00:00:00 AM# AND columna_auxiliar < #" + mes + "/" + contDias + "/" + anio + " 11:59:59 PM# AND nombreTarea= 'Cambio de Cubeta'" + whereFA;
                    ps = conexion.prepareStatement("select nombreTarea from registrosJuntos " + where + " order by columna_auxiliar ASC");
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        contadorCubetas.set(contDias - 1, (contadorCubetas.get(contDias - 1) + 1));
                    }
                }
                contDias++;
            }
            if (comboTarea.getSelectedItem().toString().equalsIgnoreCase("Registrar Desperdicio Gel30")) {
                return contadorDesperdicio;
            } else {
                return contadorCubetas;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonComparar;
    private javax.swing.JRadioButton botonDatos;
    private javax.swing.JButton botonGraficar;
    private javax.swing.JButton botonInfo;
    private javax.swing.JComboBox<String> comboAnio1;
    private javax.swing.JComboBox<String> comboAnio2;
    private javax.swing.JComboBox<String> comboFA;
    private javax.swing.JComboBox<String> comboMes1;
    private javax.swing.JComboBox<String> comboMes2;
    private javax.swing.JComboBox<String> comboSemana;
    private javax.swing.JComboBox<String> comboTarea;
    private javax.swing.JLabel etiquetaAnio1;
    private javax.swing.JLabel etiquetaAnio2;
    private javax.swing.JLabel etiquetaMes1;
    private javax.swing.JLabel etiquetaMes2;
    private javax.swing.JLabel etiquetaMes3;
    private javax.swing.JLabel etiquetaMes4;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
