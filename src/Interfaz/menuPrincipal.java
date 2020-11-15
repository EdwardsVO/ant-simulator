/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Edward Vergel
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.CiudadesEnSimulacion.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nuevaSimulacion = new javax.swing.JButton();
        guardarGrafo = new javax.swing.JButton();
        cargarGrafo = new javax.swing.JButton();
        insertarCiudad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CiudadesEnSimulacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevaSimulacion.setBackground(new java.awt.Color(51, 51, 51));
        nuevaSimulacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nuevaSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        nuevaSimulacion.setText("Empezar Simulacion");
        nuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaSimulacionActionPerformed(evt);
            }
        });
        jPanel1.add(nuevaSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 40));

        guardarGrafo.setBackground(new java.awt.Color(51, 51, 51));
        guardarGrafo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        guardarGrafo.setForeground(new java.awt.Color(255, 255, 255));
        guardarGrafo.setText("Guardar");
        jPanel1.add(guardarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, 30));

        cargarGrafo.setBackground(new java.awt.Color(51, 51, 51));
        cargarGrafo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cargarGrafo.setForeground(new java.awt.Color(255, 255, 255));
        cargarGrafo.setText("Cargar");
        jPanel1.add(cargarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 160, 30));

        insertarCiudad.setBackground(new java.awt.Color(51, 51, 51));
        insertarCiudad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        insertarCiudad.setForeground(new java.awt.Color(255, 255, 255));
        insertarCiudad.setText("Insertar Ciudad");
        jPanel1.add(insertarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar Ciudad");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 40));

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ciudades en Simulacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 350, 80));

        exitButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("x");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 50, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ANT ALGORITHM");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 50));

        CiudadesEnSimulacion.setEditable(false);
        CiudadesEnSimulacion.setBackground(new java.awt.Color(102, 102, 102));
        CiudadesEnSimulacion.setColumns(20);
        CiudadesEnSimulacion.setRows(5);
        jScrollPane2.setViewportView(CiudadesEnSimulacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 350, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void nuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaSimulacionActionPerformed
        iniciarSimulacion is = new iniciarSimulacion();
        is.setVisible(true);
    }//GEN-LAST:event_nuevaSimulacionActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CiudadesEnSimulacion;
    private javax.swing.JButton cargarGrafo;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton guardarGrafo;
    private javax.swing.JButton insertarCiudad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nuevaSimulacion;
    // End of variables declaration//GEN-END:variables
}
