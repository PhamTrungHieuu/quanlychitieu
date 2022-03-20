/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.IOFile;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bangchi;
import model.Bangthu;

/**
 *
 * @author trung
 */
public final class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    private List<Bangthu> lbangthu;
    private String fbangthu;
    
    private List<Bangchi> lbangchi;
    private String fbangchi;
    private void loadData1() {
        File f = new File(fbangchi);
        if (f.exists()) {
            lbangchi = IOFile.doc(fbangchi);
        } 
        else {
            lbangchi = new ArrayList<>();
        }
    }        
    public void tongchi(){
        fbangchi = "src/controller/Bangchi.DAT";
        if(lbangchi == null || lbangchi.size() < 1)
            lbangchi = new ArrayList<>();
        loadData1();
        int tong = 0;
        for(Bangchi i: lbangchi)
            tong += i.getSotien();
        jtongchi.setText(Integer.toString(tong));
    }
    private void loadData() {
        File f = new File(fbangthu);
        if (f.exists()) {
            lbangthu = IOFile.doc(fbangthu);
        } 
        else {
            lbangthu = new ArrayList<>();
        }
    }        
    public void tongthu(){
        fbangthu = "src/controller/Bangthu.DAT";
        if(lbangthu == null || lbangthu.size() < 1)
            lbangthu = new ArrayList<>();
        loadData();
        int tong = 0;
        for(Bangthu i: lbangthu)
            tong += i.getSotien();
        jtongthu.setBackground(Color.GREEN);
        jtongthu.setFont(new Font("Serif", Font.BOLD, 20));
        jtongthu.setForeground(Color.RED);
        jtongthu.setText(Integer.toString(tong));
    }
    public Main() {
        initComponents();
        tongthu();
        tongchi();
//        setSize(1000, 700);
        Formbangthu fFormbangthu;
        fFormbangthu = new Formbangthu();
        fFormbangthu.setBackground(Color.GREEN);
        fFormbangthu.setFont(new Font("Serif", Font.BOLD, 20));
        fFormbangthu.setForeground(Color.RED);
        tab.addTab("Bang thu", fFormbangthu);
        Formbangchi fFormbangchi;
        fFormbangchi = new Formbangchi();
        tab.add("Bang chi", fFormbangchi);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jtongthu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtongchi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tổng số tiền thu :");

        jtongthu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtongthuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setText("Tổng số tiền chi :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtongthu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtongchi, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtongthu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtongchi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtongthuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtongthuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtongthuAncestorAdded

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jtongchi;
    private javax.swing.JLabel jtongthu;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
