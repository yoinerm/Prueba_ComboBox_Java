/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Ventana_1 extends javax.swing.JFrame {
    String[] linea = {"Linea 1", "Linea 2", "Linea 3","Linea 5","Linea 6","Linea 7","Linea 8",
                      "Linea 11","Linea 12","Linea 13","Linea 14","Linea 15"};
    String[] equipo_1 = {"Video jet 1-A", "Video jet 1-B", "Video jet de cajas"};
    String[] equipo_2 = {"Video jet 2-Bulk", "Video jet 2-P", "Video jet de cajas"};    
    String[] equipo_3 = {"Video jet 3-Bulk", "Video jet 3-P", "Video jet de cajas"};
    String[] equipo_5 = {"Video jet 5-1", "Video jet 5-2", "Video jet 5-3"};
    String[] equipo_6 = {"Video jet 6-1", "Video jet 6-2"};
    String[] equipo_7 = {"Video jet 7-1", "Video jet 7-2"};
    String[] equipo_8 = {"Video jet 8-1", "Video jet 8-2"};
    String[] equipo_11 = {"Video jet 11-1", "Video jet 11-2"};
    String[] equipo_12 = {"Video jet 12-1", "Video jet 12-2"};
    String[] equipo_13 = {"Video jet 13-1", "Video jet 13-2"};
    String[] equipo_14 = {"Video jet 14-1", "Video jet 14-2", "Video jet 14-3"};
    String[] equipo_15 = {"Video jet 15-1", "Video jet 15-2", "Video jet 15-3"};
    String[] concatenar = new String[5];
        

    public Ventana_1() {
        
       initComponents();
       LineasCB.setModel(new javax.swing.DefaultComboBoxModel<>(linea));
       EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_1));
       LineasCB.setSelectedIndex(0);
       EquiposCB.setSelectedIndex(0);
       LineasCB.addActionListener(new onSelect(1));
       EquiposCB.addActionListener(new onSelect(2));
       btnGenerar.addActionListener(new onSelect(3));
       btnAgregar.addActionListener(new onSelect(4));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lineasLab = new javax.swing.JLabel();
        LineasCB = new javax.swing.JComboBox<>();
        equiposLab = new javax.swing.JLabel();
        EquiposCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        getText_CBoquilla = new javax.swing.JFormattedTextField();
        getText_PTinta = new javax.swing.JFormattedTextField();
        getText_PVacio = new javax.swing.JFormattedTextField();
        btnGenerar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoGenerado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(450, 350));
        setSize(new java.awt.Dimension(300, 300));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {160};
        jPanel1Layout.columnWeights = new double[] {0.0};
        jPanel1.setLayout(jPanel1Layout);

        lineasLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineasLab.setText("Linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel1.add(lineasLab, gridBagConstraints);

        LineasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LineasCB.setMaximumSize(new java.awt.Dimension(150, 25));
        LineasCB.setMinimumSize(new java.awt.Dimension(150, 25));
        LineasCB.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 4, 0);
        jPanel1.add(LineasCB, gridBagConstraints);

        equiposLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equiposLab.setText("Equipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel1.add(equiposLab, gridBagConstraints);

        EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EquiposCB.setMaximumSize(new java.awt.Dimension(150, 25));
        EquiposCB.setMinimumSize(new java.awt.Dimension(150, 25));
        EquiposCB.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 4, 0);
        jPanel1.add(EquiposCB, gridBagConstraints);

        jLabel1.setText("Control de boquilla");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Presion de tinta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Presion de vacio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        try {
            getText_CBoquilla.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getText_CBoquilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getText_CBoquilla.setToolTipText("");
        getText_CBoquilla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getText_CBoquilla.setMaximumSize(new java.awt.Dimension(150, 25));
        getText_CBoquilla.setMinimumSize(new java.awt.Dimension(150, 25));
        getText_CBoquilla.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 4, 0);
        jPanel1.add(getText_CBoquilla, gridBagConstraints);

        try {
            getText_PTinta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getText_PTinta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getText_PTinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getText_PTinta.setMaximumSize(new java.awt.Dimension(150, 25));
        getText_PTinta.setMinimumSize(new java.awt.Dimension(150, 25));
        getText_PTinta.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 4, 0);
        jPanel1.add(getText_PTinta, gridBagConstraints);

        try {
            getText_PVacio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getText_PVacio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getText_PVacio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getText_PVacio.setMaximumSize(new java.awt.Dimension(150, 25));
        getText_PVacio.setMinimumSize(new java.awt.Dimension(150, 25));
        getText_PVacio.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 4, 0);
        jPanel1.add(getText_PVacio, gridBagConstraints);

        btnGenerar.setText("Generar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 15, 0);
        jPanel1.add(btnGenerar, gridBagConstraints);

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 15, 0);
        jPanel1.add(btnAgregar, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(300, 50));

        textoGenerado.setColumns(20);
        textoGenerado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        textoGenerado.setRows(5);
        jScrollPane1.setViewportView(textoGenerado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

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
        private final int id;
        
        public onSelect(int a){
            id = a;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null, id);
            int indexItemL = LineasCB.getSelectedIndex();
            
            switch (id){
                ////////////////////////////////////////////////////////////////
                // SELECCION DE LINEAS
                ////////////////////////////////////////////////////////////////
                case 1:
                    //int indexItemL = LineasCB.getSelectedIndex();
                    
                    switch (indexItemL){
                        case 0:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_1));
                            concatenar[0] = "Linea 1";
                            break;
                        case 1:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_2));
                            concatenar[0] = "Linea 2";
                            break;
                        case 2:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_3));
                            concatenar[0] = "Linea 3";
                            break;
                        case 3:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_5));
                            concatenar[0] = "Linea 5";
                            break;
                        case 4:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_6));
                            concatenar[0] = "Linea 6";
                            break;
                        case 5:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_7));
                            concatenar[0] = "Linea 7";
                            break;
                        case 6:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_8));
                            concatenar[0] = "Linea 8";
                            break;
                        case 7:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_11));
                            concatenar[0] = "Linea 11";
                            break;
                        case 8:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_12));
                            concatenar[0] = "Linea 12";
                            break;
                        case 9:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_13));
                            concatenar[0] = "Linea 13";
                            break;
                        case 10:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_14));
                            concatenar[0] = "Linea 14";
                            break;
                        case 11:
                            EquiposCB.setModel(new javax.swing.DefaultComboBoxModel<>(equipo_15));
                            concatenar[0] = "Linea 15";
                            break;
                    }
                    
                    break;
                    
                    
                    
                    
                ////////////////////////////////////////////////////////////////
                // SELECCION DE EQUIPOS
                ////////////////////////////////////////////////////////////////
                case 2:
                    /*int itemIndexL = LineasCB.getSelectedIndex();*/
                    int itemIndexE = EquiposCB.getSelectedIndex();
                    switch (indexItemL){
                        case 0:
                            switch (itemIndexE){
                                case 0: concatenar[1] = "Video jet 1-A"; break;
                                case 1: concatenar[1] = "Video jet 1-B"; break;
                                case 2: concatenar[1] = "Video jet de cajas"; break;
                            }
                            break;
                        case 1:
                            switch (itemIndexE){
                                case 0: concatenar[1] = "Video jet 2-A"; break;
                                case 1: concatenar[1] = "Video jet 2-B"; break;
                                case 2: concatenar[1] = "Video jet de cajas"; break;
                            }
                            break;
                        case 2:
                            switch (itemIndexE){
                                case 0: concatenar[1] = "Video jet 3-A"; break;
                                case 1: concatenar[1] = "Video jet 3-B"; break;
                                case 2: concatenar[1] = "Video jet de cajas"; break;
                            }
                            break;
                    }
                    break;
                    
                case 3:
                    String s = textoGenerado.getText();
                    concatenar[2] = getText_CBoquilla.getText();    //2.Control de boquilla
                    concatenar[3] = getText_PTinta.getText();       //3.Presion de tinta
                    concatenar[4] = getText_PVacio.getText();       //4.Presion de vacio
                    CrearTexto crearTexto = new CrearTexto(concatenar);
                    textoGenerado.setText(s + "\n" + crearTexto.texto + "\n");
                    
                    break;
            }
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel equiposLab;
    private javax.swing.JFormattedTextField getText_CBoquilla;
    private javax.swing.JFormattedTextField getText_PTinta;
    private javax.swing.JFormattedTextField getText_PVacio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lineasLab;
    private javax.swing.JTextArea textoGenerado;
    // End of variables declaration//GEN-END:variables

}
