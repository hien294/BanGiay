/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bangiay.view;

/**
 *
 * @author admin
 */
public class ViewThuongHieu extends javax.swing.JFrame {

    /**
     * Creates new form ViewThuongHieu
     */
    public ViewThuongHieu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelThuongHieu = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnAddThuongHieu = new javax.swing.JButton();
        btnClearThuongHieu = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBangThuongHieu = new javax.swing.JTable();
        txtMaThuongHieu = new javax.swing.JTextField();
        txtTenThuongHieu = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpanelThuongHieu.setBackground(new java.awt.Color(204, 204, 204));
        JpanelThuongHieu.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Thương Hiệu");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("ID Thương Hiệu ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Mã Thương Hiệu ");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Tên Thương Hiệu ");

        btnAddThuongHieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddThuongHieu.setText("Add");
        btnAddThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddThuongHieuActionPerformed(evt);
            }
        });

        btnClearThuongHieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClearThuongHieu.setText("Clear");
        btnClearThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearThuongHieuActionPerformed(evt);
            }
        });

        tblBangThuongHieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Thương Hiệu", "Mã Thương Hiệu ", "Tên Thương Hiệu"
            }
        ));
        tblBangThuongHieu.setRowHeight(25);
        tblBangThuongHieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangThuongHieuMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblBangThuongHieu);

        txtMaThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaThuongHieuActionPerformed(evt);
            }
        });

        txtTenThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenThuongHieuActionPerformed(evt);
            }
        });

        lblID.setText("jLabel1");

        javax.swing.GroupLayout JpanelThuongHieuLayout = new javax.swing.GroupLayout(JpanelThuongHieu);
        JpanelThuongHieu.setLayout(JpanelThuongHieuLayout);
        JpanelThuongHieuLayout.setHorizontalGroup(
            JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnAddThuongHieu)
                .addGap(101, 101, 101)
                .addComponent(btnClearThuongHieu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                        .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(26, 26, 26)
                                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel25)))
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelThuongHieuLayout.setVerticalGroup(
            JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelThuongHieuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtTenThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelThuongHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddThuongHieu)
                    .addComponent(btnClearThuongHieu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddThuongHieuActionPerformed

    }//GEN-LAST:event_btnAddThuongHieuActionPerformed

    private void btnClearThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearThuongHieuActionPerformed

    }//GEN-LAST:event_btnClearThuongHieuActionPerformed

    private void tblBangThuongHieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangThuongHieuMouseClicked
     
    }//GEN-LAST:event_tblBangThuongHieuMouseClicked

    private void txtMaThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaThuongHieuActionPerformed

    private void txtTenThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenThuongHieuActionPerformed

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
            java.util.logging.Logger.getLogger(ViewThuongHieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewThuongHieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewThuongHieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewThuongHieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewThuongHieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelThuongHieu;
    private javax.swing.JButton btnAddThuongHieu;
    private javax.swing.JButton btnClearThuongHieu;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblBangThuongHieu;
    private javax.swing.JTextField txtMaThuongHieu;
    private javax.swing.JTextField txtTenThuongHieu;
    // End of variables declaration//GEN-END:variables
}
