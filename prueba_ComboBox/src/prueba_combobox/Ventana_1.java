/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Ventana_1 extends javax.swing.JFrame {
    String[] linea = {"Linea 1", "Linea 2", "Linea 3","Linea 5","Linea 6","Linea 7","Linea 8",
                       "Linea 11","Linea 12","Linea 13","Linea 14","Linea 15"};
    String[] equipo_1 = {"Video jet 1-A", "Video jet 1-B", "Video jet de cajas"};
    String[] equipo_2 = {"Video jet 2-Bulk", "Video jet 2-P", "Video jet de cajas"};    
    String[] equipo_3 = {"Video jet 3-Bulk", "Video jet 3-P", "Video jet de cajas"};
    String[] equipo_5 = {"Video jet 5-1", "Video jet 5-2", "Video jet 5-3"};

    public Ventana_1() {
        initComponents();
       LineasCB.setModel(new javax.swing.DefaultComboBoxModel<>(linea));
       LineasCB.addActionListener(new onSelect());
       EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lineasLab = new javax.swing.JLabel();
        LineasCB = new javax.swing.JComboBox<>();
        equiposLab = new javax.swing.JLabel();
        EquiposCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        lineasLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineasLab.setText("Linea");
        jPanel1.add(lineasLab);

        LineasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LineasCB.setMinimumSize(new java.awt.Dimension(20, 30));
        LineasCB.setPreferredSize(new java.awt.Dimension(20, 30));
        jPanel1.add(LineasCB);

        equiposLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equiposLab.setText("Equipo");
        jPanel1.add(equiposLab);

        EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(EquiposCB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public class onSelect implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showInputDialog(null, "Confirmado");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EquiposCB;
    private javax.swing.JComboBox<String> LineasCB;
    private javax.swing.JLabel equiposLab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lineasLab;
    // End of variables declaration//GEN-END:variables

}