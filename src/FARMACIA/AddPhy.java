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
public class AddPhy extends javax.swing.JPanel {

    /**
     * Creates new form AddPhy
     */
    public AddPhy() {
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

        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1210, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Area Of Expertise");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 190, 40));

        jTextField9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(29, 32, 38));
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 350, 50));

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(29, 32, 38));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 350, 50));

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(29, 32, 38));
        jTextField3.setBorder(null);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 350, 50));

        jPanel1.setBackground(new java.awt.Color(29, 32, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(29, 32, 38));
        jLabel20.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("[Add Physician]");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 170, 20));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F A R M A C I A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jButton1.setBackground(new java.awt.Color(29, 32, 38));
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.png"))); // NOI18N
        jButton1.setToolTipText("Create Account");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, 670));

        jLabel12.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Contact No.");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 130, 40));

        jLabel4.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Hospital Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 170, 40));

        jLabel3.setFont(new java.awt.Font("Palace Script MT", 0, 52)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Don't keep any field blank...");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 380, 50));

        jSeparator8.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 370, 20));

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(29, 32, 38));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 350, 50));

        jLabel2.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Qualification");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 120, 40));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/person.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, 70));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 370, 20));

        jLabel18.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Name ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 40));

        jSeparator14.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 370, 20));

        jSeparator15.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 370, 20));

        jSeparator11.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 370, 20));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(29, 32, 38));
        jTextField4.setBorder(null);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 350, 50));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setForeground(java.awt.Color.white);
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton9.setToolTipText("Go to Login Screen");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 70, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
