/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Edineuza
 */
public class FrmHome extends javax.swing.JFrame {

   
    
    public FrmHome() {
        initComponents();
        
        
        showDate();
        showTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        menHome = new javax.swing.JMenu();
        menBasic = new javax.swing.JMenu();
        meniSum = new javax.swing.JMenuItem();
        meniSub = new javax.swing.JMenuItem();
        meniMulti = new javax.swing.JMenuItem();
        meniDiv = new javax.swing.JMenuItem();
        menPowRot = new javax.swing.JMenu();
        meniPow = new javax.swing.JMenuItem();
        meniSqrt = new javax.swing.JMenuItem();
        meniCbrt = new javax.swing.JMenuItem();
        menEquations = new javax.swing.JMenu();
        meniFdg = new javax.swing.JMenuItem();
        meniSdg = new javax.swing.JMenuItem();
        menExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 51, 51));
        lblDate.setText("jLabel1");
        getContentPane().add(lblDate);
        lblDate.setBounds(100, 220, 100, 17);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 51));
        lblTime.setText("jLabel1");
        getContentPane().add(lblTime);
        lblTime.setBounds(200, 220, 130, 17);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculator/background.png"))); // NOI18N
        getContentPane().add(lblBack);
        lblBack.setBounds(0, 0, 400, 280);

        mnbMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menHome.setText("Home");
        mnbMenu.add(menHome);

        menBasic.setText("Basic");

        meniSum.setText("Sum");
        meniSum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniSumActionPerformed(evt);
            }
        });
        menBasic.add(meniSum);

        meniSub.setText("Subtraction");
        meniSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniSubActionPerformed(evt);
            }
        });
        menBasic.add(meniSub);

        meniMulti.setText("Multiplication");
        meniMulti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniMultiActionPerformed(evt);
            }
        });
        menBasic.add(meniMulti);

        meniDiv.setText("Division");
        meniDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniDivActionPerformed(evt);
            }
        });
        menBasic.add(meniDiv);

        mnbMenu.add(menBasic);

        menPowRot.setText("Power & Root");

        meniPow.setText("Power");
        meniPow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniPowActionPerformed(evt);
            }
        });
        menPowRot.add(meniPow);

        meniSqrt.setText("Square Root");
        meniSqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniSqrtActionPerformed(evt);
            }
        });
        menPowRot.add(meniSqrt);

        meniCbrt.setText("Cubic Root");
        meniCbrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniCbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniCbrtActionPerformed(evt);
            }
        });
        menPowRot.add(meniCbrt);

        mnbMenu.add(menPowRot);

        menEquations.setText("Equations");

        meniFdg.setText("First Degree");
        meniFdg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniFdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniFdgActionPerformed(evt);
            }
        });
        menEquations.add(meniFdg);

        meniSdg.setText("Second Degree");
        meniSdg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meniSdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meniSdgActionPerformed(evt);
            }
        });
        menEquations.add(meniSdg);

        mnbMenu.add(menEquations);

        menExit.setText("Exit");
        menExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menExitMouseClicked(evt);
            }
        });
        mnbMenu.add(menExit);

        setJMenuBar(mnbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /*#REGION Application Menu*/
    private void meniSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniSumActionPerformed
        new FrmSum().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniSumActionPerformed

    private void meniSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniSubActionPerformed
        new FrmSub().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniSubActionPerformed

    private void meniMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniMultiActionPerformed
        new FrmMulti().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniMultiActionPerformed

    private void meniDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniDivActionPerformed
        new FrmDiv().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniDivActionPerformed

    private void meniPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniPowActionPerformed
        new FrmPow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniPowActionPerformed

    private void meniSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniSqrtActionPerformed
        new FrmSqrt().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniSqrtActionPerformed

    private void meniCbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniCbrtActionPerformed
        new FrmCubicRoot().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniCbrtActionPerformed

    private void meniFdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniFdgActionPerformed
        new FrmFirstDegree().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniFdgActionPerformed

    private void meniSdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meniSdgActionPerformed
        new FrmSecondDegree().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_meniSdgActionPerformed

    private void menExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menExitMouseClicked
       String msg = "Would you like to close application ?";
       int opt = JOptionPane.showConfirmDialog(null, msg, "Exit ?",
                                               JOptionPane.YES_NO_OPTION);
       if(opt == 0)
           System.exit(0);
    }//GEN-LAST:event_menExitMouseClicked
    /*#ENDREGION */
    
    
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
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHome().setVisible(true);
            }
        });
    }

    //Return Date method
    private void showDate() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        lblDate.setText(sdf.format(now));
    }
    
    //Return Time method
    private void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("-  hh:mm:ss a");
                lblTime.setText(sdf.format(now));
            }
        }).start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenu menBasic;
    private javax.swing.JMenu menEquations;
    private javax.swing.JMenu menExit;
    private javax.swing.JMenu menHome;
    private javax.swing.JMenu menPowRot;
    private javax.swing.JMenuItem meniCbrt;
    private javax.swing.JMenuItem meniDiv;
    private javax.swing.JMenuItem meniFdg;
    private javax.swing.JMenuItem meniMulti;
    private javax.swing.JMenuItem meniPow;
    private javax.swing.JMenuItem meniSdg;
    private javax.swing.JMenuItem meniSqrt;
    private javax.swing.JMenuItem meniSub;
    private javax.swing.JMenuItem meniSum;
    private javax.swing.JMenuBar mnbMenu;
    // End of variables declaration//GEN-END:variables
}