/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package day2;

import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuc
 */
public class NewJFrame extends javax.swing.JFrame {
    private CardLayout cardLayout;
    
    
    public NewJFrame() {
        initComponents();
        cardLayout = (CardLayout) pnlView.getLayout();
        pnlView.add(pnlTrangchu,"pnlTrangChu");
        pnlView.add(account,"account");
    }
    int width =235;
    int heigth = 509;
    void OpenMenu(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0;i<width;i++){
                    pnlMenu.setSize(i, heigth);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        }).start();
    }
     void CloseMenu(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i =width;i>0;i--){
                    pnlMenu.setSize(i, heigth);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        trangChu = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblOpen = new javax.swing.JLabel();
        pnlView = new javax.swing.JPanel();
        pnlTrangchu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trangChu.setText("Trang chủ");
        trangChu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trangChuMouseClicked(evt);
            }
        });

        acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc.setText("Khách hàng");
        acc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nhân viên");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đăng xuất");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/day2/Close_1.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClose)
                .addGap(96, 96, 96)
                .addComponent(trangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/day2/Menu.png"))); // NOI18N
        lblOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMouseClicked(evt);
            }
        });

        pnlView.setLayout(new java.awt.CardLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Trang chủ");

        javax.swing.GroupLayout pnlTrangchuLayout = new javax.swing.GroupLayout(pnlTrangchu);
        pnlTrangchu.setLayout(pnlTrangchuLayout);
        pnlTrangchuLayout.setHorizontalGroup(
            pnlTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangchuLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel5)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        pnlTrangchuLayout.setVerticalGroup(
            pnlTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        pnlView.add(pnlTrangchu, "card2");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tài khoản");

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel6)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 416, Short.MAX_VALUE))
        );

        pnlView.add(account, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblOpen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblOpen)
                .addGap(18, 18, 18)
                .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        CloseMenu();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMouseClicked
        OpenMenu();
    }//GEN-LAST:event_lblOpenMouseClicked

    private void trangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trangChuMouseClicked
        cardLayout.show(pnlView, "pnlTrangChu");
    }//GEN-LAST:event_trangChuMouseClicked

    private void accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseClicked
        cardLayout.show(pnlView, "account");
    }//GEN-LAST:event_accMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc;
    private javax.swing.JPanel account;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblOpen;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTrangchu;
    private javax.swing.JPanel pnlView;
    private javax.swing.JLabel trangChu;
    // End of variables declaration//GEN-END:variables
}
