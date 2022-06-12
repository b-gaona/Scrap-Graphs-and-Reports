package paquete1;

public class modificarDatos extends javax.swing.JDialog {

    agregarDatos agregar = new agregarDatos();

    public modificarDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setContentPane(agregar);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelACambiar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(560, 510));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelACambiar.setMaximumSize(new java.awt.Dimension(550, 420));
        panelACambiar.setMinimumSize(new java.awt.Dimension(550, 420));

        javax.swing.GroupLayout panelACambiarLayout = new javax.swing.GroupLayout(panelACambiar);
        panelACambiar.setLayout(panelACambiarLayout);
        panelACambiarLayout.setHorizontalGroup(
            panelACambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panelACambiarLayout.setVerticalGroup(
            panelACambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        VentanaPrincipal v1 = new VentanaPrincipal();
        v1.Icono();
        v1.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void changeSize(int x, int y) {
        this.setSize(x, y);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            modificarDatos dialog = new modificarDatos(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel panelACambiar;
    // End of variables declaration//GEN-END:variables
}
