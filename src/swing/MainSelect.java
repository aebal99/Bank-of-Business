/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author ercan
 */
public class MainSelect extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;

    /**
     * Creates new form MainSelect
     *
     * @param home Dynamic panel.
     */
    public MainSelect(swing.Home home) {
        initComponents();
        frame = home;

        timer = new Timer(500, (ActionEvent e) -> {
            mainlabel2.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        });  
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminbtn = new java.awt.Button();
        bankerbtn = new java.awt.Button();
        customerbtn = new java.awt.Button();
        mainlabel = new javax.swing.JLabel();
        adminicon = new javax.swing.JLabel();
        bankericon = new javax.swing.JLabel();
        customericon = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        mainlabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        adminbtn.setBackground(new java.awt.Color(23, 35, 51));
        adminbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminbtn.setLabel("Admin");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });

        bankerbtn.setBackground(new java.awt.Color(23, 35, 51));
        bankerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bankerbtn.setForeground(new java.awt.Color(255, 255, 255));
        bankerbtn.setLabel("Banker");
        bankerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankerbtnActionPerformed(evt);
            }
        });

        customerbtn.setBackground(new java.awt.Color(23, 35, 51));
        customerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        customerbtn.setForeground(new java.awt.Color(255, 255, 255));
        customerbtn.setLabel("Customer");
        customerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerbtnActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Welcome to Bank of Business");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        adminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_admin_settings_male_48px.png"))); // NOI18N

        bankericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_registration_48px.png"))); // NOI18N

        customericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_user_male_48px.png"))); // NOI18N

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("You can select the actions to do from below.");

        mainlabel2.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel2.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainlabel2.setText("28 March 2020");
        mainlabel2.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setPreferredSize(new java.awt.Dimension(223, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(bankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(852, 852, 852))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(adminicon)
                .addGap(378, 378, 378)
                .addComponent(bankericon)
                .addGap(378, 378, 378)
                .addComponent(customericon)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bankericon)
                    .addComponent(adminicon)
                    .addComponent(customericon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(207, 207, 207))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginAdmin");
    }//GEN-LAST:event_adminbtnActionPerformed

    private void customerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginCustomer");
    }//GEN-LAST:event_customerbtnActionPerformed

    private void bankerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginBanker");
    }//GEN-LAST:event_bankerbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button adminbtn;
    private javax.swing.JLabel adminicon;
    private java.awt.Button bankerbtn;
    private javax.swing.JLabel bankericon;
    private java.awt.Button customerbtn;
    private javax.swing.JLabel customericon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JLabel mainlabel2;
    // End of variables declaration//GEN-END:variables
}
