/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FARMACIA;

/**
 *
 * @author Tasnim Ahmed
 */
public class Bank extends javax.swing.JPanel {

    /**
     * Creates new form Bank
     */
    public Bank() {
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

        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1210, 670));
        setPreferredSize(new java.awt.Dimension(1210, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/balance.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 70));

        jLabel18.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Available Balance : ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 350, 40));

        jPanel2.setBackground(new java.awt.Color(29, 32, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F A R M A C I A");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jLabel12.setBackground(new java.awt.Color(29, 32, 38));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bank (2).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 260, 180));

        jButton9.setBackground(new java.awt.Color(29, 32, 38));
        jButton9.setForeground(java.awt.Color.white);
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invest.png"))); // NOI18N
        jButton9.setToolTipText("Back To Menu");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton9.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 90, 90));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("[Add Balance]");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        jLabel3.setFont(new java.awt.Font("Palace Script MT", 0, 52)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Balance Statement");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/taka.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 60, 60));

        jLabel14.setFont(new java.awt.Font("Ubuntu Mono", 1, 48)); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 390, 70));

        jLabel4.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Transaction ID (Provided By Bank)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 360, 40));

        jSeparator14.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 370, 20));

        jSeparator8.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 370, 20));

        jLabel2.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Amount");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 90, 40));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(29, 32, 38));
        jTextField4.setBorder(null);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 350, 50));

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(29, 32, 38));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 350, 50));

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 270, 40));

        jSeparator11.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 270, 20));

        jButton1.setBackground(new java.awt.Color(29, 32, 38));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate Payment ID");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 270, 50));

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*Remember Payment ID");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 170, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setForeground(java.awt.Color.white);
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton10.setToolTipText("Back To Menu");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
