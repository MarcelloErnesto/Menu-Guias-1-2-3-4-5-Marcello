/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author kev
 */
public class GUIA2 extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public GUIA2() {
        initComponents();
        panelito2.setVisible(false);
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Menú");
        btnInsertar.setEnabled(false);
        panelito1.setVisible(false);
      //  this.setExtendedState(MAXIMIZED_BOTH);
    }
    int contador = 0;
    String[] letras = new String[10];
    String[] letras1 = new String[10];

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelito1 = new javax.swing.JPanel();
        txtArray = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtOpcion = new javax.swing.JTextField();
        btnProcesarMenu = new javax.swing.JButton();
        panelito2 = new javax.swing.JPanel();
        txtPegar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("1. Para ingresar las letras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 92, 391, 29));

        jLabel2.setText("2. Ordenar de manera Ascendente ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 132, -1, -1));

        jLabel3.setText("3. Mostrar letras Ingresadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 171, -1, -1));

        jLabel4.setText("Indicacion: Ingrese la opción que Desea:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel5.setText("0. Salir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 206, 87, -1));

        panelito1.setBackground(new java.awt.Color(204, 255, 255));

        txtArray.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtArrayKeyTyped(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        btnInsertar.setText("insertar+");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel6.setText("ingrese las letras (10 en total)");

        javax.swing.GroupLayout panelito1Layout = new javax.swing.GroupLayout(panelito1);
        panelito1.setLayout(panelito1Layout);
        panelito1Layout.setHorizontalGroup(
            panelito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelito1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtArray, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelito1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(110, 110, 110))
        );
        panelito1Layout.setVerticalGroup(
            panelito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelito1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(panelito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(panelito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Xperia", 1, 11)); // NOI18N
        jLabel8.setText("GUIA 2: Menu de Introduccion de datos.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 10));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 477, 9));

        txtOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcionActionPerformed(evt);
            }
        });
        txtOpcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 162, -1));

        btnProcesarMenu.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        btnProcesarMenu.setText("Procesar");
        btnProcesarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        panelito2.setBackground(new java.awt.Color(204, 255, 255));

        txtPegar.setText("                        ");

        jLabel7.setText("las letras ingresadas son:");

        javax.swing.GroupLayout panelito2Layout = new javax.swing.GroupLayout(panelito2);
        panelito2.setLayout(panelito2Layout);
        panelito2Layout.setHorizontalGroup(
            panelito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelito2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelito2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(txtPegar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelito2Layout.setVerticalGroup(
            panelito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelito2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(panelito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Hall Fetica Wide", 0, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel9.setText("Ingrese la opcion que Desea:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 230, 230, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 500, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {

    }
    
    


    private void txtOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcionActionPerformed

    }//GEN-LAST:event_txtOpcionActionPerformed

    private void btnProcesarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarMenuActionPerformed

        String eleccion;
        int num;

        eleccion = txtOpcion.getText();
        num = Integer.parseInt(eleccion);
        txtOpcion.setText("");

        if (num < 0 || num > 3) {
            JOptionPane.showMessageDialog(null, "ingrese una opcion valida");

        } else {

            switch (num) {
                case 1:
                    txtArray.setText("");
                    txtArray.setEnabled(true);
                    btnInsertar.setEnabled(false);
                    panelito1.setVisible(true);
                    btnProcesarMenu.setEnabled(false);
                    txtOpcion.setEnabled(false);
                    txtPegar.setText("");
                    break;
                case 2:
                   if (txtArray.getText().equals("")){
                     JOptionPane.showMessageDialog(null,"Ingrese cadena de texto a ordenar");
                   }
                   else {
                       Arrays.sort(letras);
                       JOptionPane.showMessageDialog(null,"Las letras de cadena de texto estan ordenadas");
                   }
                    break;
                case 3:
                    String cadena=""; if (txtArray.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"No ha ingesado cadena de texto");
                    }
                    else {
                        for (int i=0; i<letras.length; i++){
                       cadena = cadena + letras [i];
                        }
                    panelito2.setVisible(true);
                    txtPegar.setText(cadena);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }

    }//GEN-LAST:event_btnProcesarMenuActionPerformed

    private void txtOpcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcionKeyTyped
//validacion para que ingrese letras
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtOpcionKeyTyped

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        for (int i = 0; i < 10; i++) {
            letras[i] = "";
        }

        int i;
        String letritas = txtArray.getText(); //para recorrer la cadena de texto y despues leerla caracter --
        for (i = 0; i < 10; i++) {                   //por caracter y ingresarlo en un array string
            letras[i] = Character.toString(letritas.charAt(i));
        }

        panelito1.setVisible(false);//ocultar el panel al presionar el boton
        btnProcesarMenu.setEnabled(true);
        txtOpcion.setEnabled(true);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtArrayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrayKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
        } else {
            evt.consume();
        }
        if (txtArray.getText().length() >= 10) {
            evt.consume();//validacion de maximo de letras

        }
        if (txtArray.getText().length() > 9) {
            btnInsertar.setEnabled(true);
            txtArray.setEnabled(false);
        }

    }//GEN-LAST:event_txtArrayKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Opciones win = new Opciones();
        this.setVisible(false);
        win.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIA2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnProcesarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelito1;
    private javax.swing.JPanel panelito2;
    private javax.swing.JTextField txtArray;
    private javax.swing.JTextField txtOpcion;
    private javax.swing.JLabel txtPegar;
    // End of variables declaration//GEN-END:variables
}
