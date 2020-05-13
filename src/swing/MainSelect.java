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
            mainLabel2.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
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

        mainLabel = new javax.swing.JLabel();
        mainLabel2 = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        adminButton = new java.awt.Button();
        adminIcon = new javax.swing.JLabel();
        bankerButton = new java.awt.Button();
        bankerIcon = new javax.swing.JLabel();
        customerButton = new java.awt.Button();
        customerIcon = new javax.swing.JLabel();
        creditsButton = new java.awt.Button();
        creditsIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Welcome to Bank of Business");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        mainLabel2.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel2.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainLabel2.setText("28 March 2020");
        mainLabel2.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel2.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel2.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("You can select the actions to do from below.");

        adminButton.setBackground(new java.awt.Color(23, 35, 51));
        adminButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        adminButton.setLabel("Admin");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_admin_settings_male_48px.png"))); // NOI18N

        bankerButton.setBackground(new java.awt.Color(23, 35, 51));
        bankerButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bankerButton.setForeground(new java.awt.Color(255, 255, 255));
        bankerButton.setLabel("Banker");
        bankerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankerButtonActionPerformed(evt);
            }
        });

        bankerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_registration_48px.png"))); // NOI18N

        customerButton.setBackground(new java.awt.Color(23, 35, 51));
        customerButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        customerButton.setForeground(new java.awt.Color(255, 255, 255));
        customerButton.setLabel("Customer");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_user_male_48px.png"))); // NOI18N

        creditsButton.setBackground(new java.awt.Color(23, 35, 51));
        creditsButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        creditsButton.setForeground(new java.awt.Color(255, 255, 255));
        creditsButton.setLabel("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        creditsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_manager_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(mainLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bankerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(228, 228, 228)
                                        .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(adminIcon)
                        .addGap(378, 378, 378)
                        .addComponent(bankerIcon)
                        .addGap(378, 378, 378)
                        .addComponent(customerIcon)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(creditsIcon)
                        .addGap(511, 511, 511))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bankerIcon)
                    .addComponent(adminIcon)
                    .addComponent(customerIcon))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(41, 41, 41)
                .addComponent(creditsIcon)
                .addGap(10, 10, 10)
                .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginAdmin");
    }//GEN-LAST:event_adminButtonActionPerformed

    private void bankerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankerButtonActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginBanker");
    }//GEN-LAST:event_bankerButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginCustomer");
    }//GEN-LAST:event_customerButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("Credits");
    }//GEN-LAST:event_creditsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button adminButton;
    private javax.swing.JLabel adminIcon;
    private java.awt.Button bankerButton;
    private javax.swing.JLabel bankerIcon;
    private java.awt.Button creditsButton;
    private javax.swing.JLabel creditsIcon;
    private java.awt.Button customerButton;
    private javax.swing.JLabel customerIcon;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel2;
    // End of variables declaration//GEN-END:variables
}
