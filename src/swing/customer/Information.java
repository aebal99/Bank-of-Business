/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

import library.*;

/**
 *
 * @author ercan
 */
public class Information extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form Information
     *
     * @param home Dynamic panel.
     */
    public Information(swing.Home home) {
        initComponents();
        frame = home;

        if (Data.getPage2().equals("DepositCustomer")) {
            infoLabel.setText("The amount you want to deposit is " + Data.currencyFormat(Data.getMoneyType(), Data.getMoney()));
        } else if (Data.getPage2().equals("WithdrawalCustomer")) {
            infoLabel.setText("The amount you want to withdrawal is " + Data.currencyFormat(Data.getMoneyType(), Data.getMoney()));
        } else if (Data.getPage2().equals("TransferMoneyCustomer")) {
            infoLabel.setText("The amount you want to transfer is " + Data.currencyFormat(Data.getMoneyType(), Data.getMoney()));
        }
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
        infoLabel = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        yesButton = new java.awt.Button();
        yesIcon = new javax.swing.JLabel();
        backButton = new java.awt.Button();
        backIcon = new javax.swing.JLabel();
        noButton = new java.awt.Button();
        noIcon = new javax.swing.JLabel();
        mainMenuButton = new java.awt.Button();
        mainMenuIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Information");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("The amount you want to deposit is $10,000");

        infoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Do you wish to continue?");

        yesButton.setBackground(new java.awt.Color(23, 35, 51));
        yesButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        yesButton.setForeground(new java.awt.Color(133, 187, 101));
        yesButton.setLabel("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        yesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_ok_48px.png"))); // NOI18N

        backButton.setBackground(new java.awt.Color(23, 35, 51));
        backButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setLabel("Back");
        backButton.setMinimumSize(new java.awt.Dimension(80, 49));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        noButton.setBackground(new java.awt.Color(23, 35, 51));
        noButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        noButton.setForeground(new java.awt.Color(133, 187, 101));
        noButton.setLabel("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        noIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_delete_48px.png"))); // NOI18N

        mainMenuButton.setBackground(new java.awt.Color(23, 35, 51));
        mainMenuButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        mainMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        mainMenuButton.setLabel("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        mainMenuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(yesIcon)
                                .addGap(538, 538, 538)
                                .addComponent(noIcon)
                                .addGap(10, 10, 10)
                                .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(backIcon)
                                .addGap(538, 538, 538)
                                .addComponent(mainMenuIcon)
                                .addGap(10, 10, 10)
                                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noIcon)
                    .addComponent(yesIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backIcon)
                    .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainMenuIcon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        frame.changeJPanel("ReceiptCustomer");
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        frame.changeJPanel(Data.getPage2());
    }//GEN-LAST:event_noButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        frame.changeJPanel(Data.getPage2());
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        Data.setPage1(null);
        Data.setPage2(null);
        frame.changeJPanel("HomeCustomer");
    }//GEN-LAST:event_mainMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backButton;
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel mainLabel;
    private java.awt.Button mainMenuButton;
    private javax.swing.JLabel mainMenuIcon;
    private java.awt.Button noButton;
    private javax.swing.JLabel noIcon;
    private java.awt.Button yesButton;
    private javax.swing.JLabel yesIcon;
    // End of variables declaration//GEN-END:variables
}
