package paquete1;

import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.Font;
import java.awt.Image;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaPrincipal extends javax.swing.JFrame {

    panelRegistroScrap panelScrap = new panelRegistroScrap();
    panelRegistro panelr = new panelRegistro();
    panelGrafica panelg = new panelGrafica();
    panelRegistrosAntiguos panelre = new panelRegistrosAntiguos();
    panelRegistrosAntiguosScrap panelScrapAntiguo = new panelRegistrosAntiguosScrap();
    panelGraficaSrap panelgScrap = new panelGraficaSrap();
    panelAnalisisDatos panelAnalisis = new panelAnalisisDatos();

    public VentanaPrincipal() {
        initComponents();
        this.setContentPane(panelr);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemRegistro = new javax.swing.JMenuItem();
        itemGrafica = new javax.swing.JMenuItem();
        itemScrap = new javax.swing.JMenuItem();
        itemGraficaScrap = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRegistrosAntiguos = new javax.swing.JMenuItem();
        menuAgregarDatos = new javax.swing.JMenuItem();
        menuEliminarDatos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemAnalisis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros y Reportes");
        setResizable(false);

        panelPrincipal.setMinimumSize(new java.awt.Dimension(650, 327));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu1.setText("Menú");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemRegistro.setText("Ingresar registro");
        itemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(itemRegistro);

        itemGrafica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemGrafica.setText("Generar reporte");
        itemGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGraficaActionPerformed(evt);
            }
        });
        jMenu1.add(itemGrafica);

        itemScrap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemScrap.setText("Registrar Scrap");
        itemScrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemScrapActionPerformed(evt);
            }
        });
        jMenu1.add(itemScrap);

        itemGraficaScrap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemGraficaScrap.setText("Generar reporte Scrap");
        itemGraficaScrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGraficaScrapActionPerformed(evt);
            }
        });
        jMenu1.add(itemGraficaScrap);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modificar datos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuRegistrosAntiguos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuRegistrosAntiguos.setText("Insertar registros antiguos");
        menuRegistrosAntiguos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrosAntiguosActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegistrosAntiguos);

        menuAgregarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAgregarDatos.setText("Agregar o modificar datos");
        menuAgregarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarDatosActionPerformed(evt);
            }
        });
        jMenu2.add(menuAgregarDatos);

        menuEliminarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuEliminarDatos.setText("Eliminar datos");
        menuEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarDatosActionPerformed(evt);
            }
        });
        jMenu2.add(menuEliminarDatos);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Registros antiguos Scrap");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Análisis de datos");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemAnalisis.setText("Gráfica de estados");
        itemAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnalisisActionPerformed(evt);
            }
        });
        jMenu3.add(itemAnalisis);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Icono() {
        Image icon = new ImageIcon(getClass().getResource("/imagenes/maquinaria.png")).getImage();
        setIconImage(icon);
    }

    private void itemGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGraficaActionPerformed
        this.setSize(1150, 700);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setContentPane(panelg);
        this.revalidate();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemGraficaActionPerformed

    private void itemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroActionPerformed
        this.setSize(750, 500);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setContentPane(panelr);
        this.revalidate();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemRegistroActionPerformed

    private void menuAgregarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarDatosActionPerformed
        JPasswordField pwd = new JPasswordField();
        pwd.setFont(new Font("Arial", 2, 16));
        int action = JOptionPane.showConfirmDialog(null, pwd, "Permisos de administrador", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
        } else if (action == 0) {
            if (String.valueOf(pwd.getPassword()).equalsIgnoreCase("aptiv135")) {
                dispose();
                modificarDatos vs = new modificarDatos(this, true);
                vs.setLocationRelativeTo(null);
                vs.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Permiso denegado, contraseña incorrecta.");
            }
        }
    }//GEN-LAST:event_menuAgregarDatosActionPerformed

    private void menuEliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarDatosActionPerformed
        JPasswordField pwd = new JPasswordField();
        pwd.setFont(new Font("Arial", 2, 16));
        int action = JOptionPane.showConfirmDialog(null, pwd, "Permisos de administrador", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
        } else if (action == 0) {
            if (String.valueOf(pwd.getPassword()).equalsIgnoreCase("aptiv135")) {
                dispose();
                modificarDatos vs = new modificarDatos(this, true);
                vs.changeSize(580, 300);
                vs.setLocationRelativeTo(null);
                eliminarDatos e2 = new eliminarDatos();
                vs.setContentPane(e2);
                vs.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Permiso denegado, contraseña incorrecta.");
            }
        }
    }//GEN-LAST:event_menuEliminarDatosActionPerformed

    private void menuRegistrosAntiguosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrosAntiguosActionPerformed
        JPasswordField pwd = new JPasswordField();
        pwd.setFont(new Font("Arial", 2, 16));
        int action = JOptionPane.showConfirmDialog(null, pwd, "Permisos de administrador", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
        } else if (action == 0) {
            if (String.valueOf(pwd.getPassword()).equalsIgnoreCase("aptiv135")) {
                this.setSize(750, 500);
                panelPrincipal.removeAll();
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
                this.setContentPane(panelre);
                this.revalidate();
                this.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "Permiso denegado, contraseña incorrecta.");
            }
        }
    }//GEN-LAST:event_menuRegistrosAntiguosActionPerformed

    private void itemScrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemScrapActionPerformed
        this.setSize(750, 500);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setContentPane(panelScrap);
        this.revalidate();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemScrapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JPasswordField pwd = new JPasswordField();
        pwd.setFont(new Font("Arial", 2, 16));
        int action = JOptionPane.showConfirmDialog(null, pwd, "Permisos de administrador", JOptionPane.OK_CANCEL_OPTION);
        if (action < 0) {
        } else if (action == 0) {
            if (String.valueOf(pwd.getPassword()).equalsIgnoreCase("aptiv135")) {
                this.setSize(750, 500);
                panelPrincipal.removeAll();
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
                this.setContentPane(panelScrapAntiguo);
                this.revalidate();
                this.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "Permiso denegado, contraseña incorrecta.");
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemGraficaScrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGraficaScrapActionPerformed
        this.setSize(1150, 700);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setContentPane(panelgScrap);
        this.revalidate();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemGraficaScrapActionPerformed

    private void itemAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnalisisActionPerformed
        this.setSize(1200, 700);
        panelPrincipal.removeAll();
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setContentPane(panelAnalisis);
        this.revalidate();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemAnalisisActionPerformed

    private static void setLookandFeel() {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            Properties props = new Properties();
            props.put("logoString", "");
            LunaLookAndFeel.setCurrentTheme(props);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println(e);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            setLookandFeel();
            v1 = new VentanaPrincipal();
            v1.Icono();
            v1.setVisible(true);
        });
    }

    public static VentanaPrincipal v1 = new VentanaPrincipal();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAnalisis;
    private javax.swing.JMenuItem itemGrafica;
    private javax.swing.JMenuItem itemGraficaScrap;
    private javax.swing.JMenuItem itemRegistro;
    private javax.swing.JMenuItem itemScrap;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuAgregarDatos;
    private javax.swing.JMenuItem menuEliminarDatos;
    private javax.swing.JMenuItem menuRegistrosAntiguos;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
