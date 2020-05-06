/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.banker;

import java.awt.event.ActionEvent;
import javax.swing.Timer;
import library.*;

/**
 *
 * @author ercan
 */
public class Home extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;

    /**
     * Creates new form Home
     *
     * @param home Dynamic panel.
     */
    public Home(swing.Home home) {
        initComponents();
        frame = home;

        timer = new Timer(2000, (ActionEvent e) -> {
            mainlabel.setText("Welcome " + Data.getBanker().getId().getFullName());
            mainlabel2.setText("Salary: " + Data.currencyFormat(0, Data.getBanker().getBankerSalary()));
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

        mainlabel = new javax.swing.JLabel();
        mainlabel2 = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        customersbtn = new java.awt.Button();
        customersicon = new javax.swing.JLabel();
        addcustomerbtn = new java.awt.Button();
        addcustomericon = new javax.swing.JLabel();
        editcustomerbtn = new java.awt.Button();
        editcustomericon = new javax.swing.JLabel();
        deletecustomerbtn = new java.awt.Button();
        deletecustomericon = new javax.swing.JLabel();
        settingsbtn = new java.awt.Button();
        settingsicon = new javax.swing.JLabel();
        bankersbtn = new java.awt.Button();
        bankersicon = new javax.swing.JLabel();
        balancebtn = new java.awt.Button();
        balanceicon = new javax.swing.JLabel();
        transactionsbtn = new java.awt.Button();
        transactionsicon = new javax.swing.JLabel();
        logoutbtn = new java.awt.Button();
        logouticon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Welcome Banker");

        mainlabel2.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel2.setForeground(new java.awt.Color(133, 187, 101));
        mainlabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainlabel2.setText("Salary: $500");
        mainlabel2.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel2.setPreferredSize(new java.awt.Dimension(223, 47));

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("You can select the actions to do from below.");

        customersbtn.setBackground(new java.awt.Color(23, 35, 51));
        customersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        customersbtn.setForeground(new java.awt.Color(255, 255, 255));
        customersbtn.setLabel("Customers");
        customersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersbtnActionPerformed(evt);
            }
        });

        customersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_user_male_48px.png"))); // NOI18N

        addcustomerbtn.setBackground(new java.awt.Color(23, 35, 51));
        addcustomerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addcustomerbtn.setForeground(new java.awt.Color(255, 255, 255));
        addcustomerbtn.setLabel("Add Customer");
        addcustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerbtnActionPerformed(evt);
            }
        });

        addcustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

        editcustomerbtn.setBackground(new java.awt.Color(23, 35, 51));
        editcustomerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        editcustomerbtn.setForeground(new java.awt.Color(255, 255, 255));
        editcustomerbtn.setLabel("Edit Customer");
        editcustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcustomerbtnActionPerformed(evt);
            }
        });

        editcustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_edit_property_48px.png"))); // NOI18N

        deletecustomerbtn.setBackground(new java.awt.Color(23, 35, 51));
        deletecustomerbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        deletecustomerbtn.setForeground(new java.awt.Color(255, 255, 255));
        deletecustomerbtn.setLabel("Del. Customer");
        deletecustomerbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        deletecustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecustomerbtnActionPerformed(evt);
            }
        });

        deletecustomericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_remove_property_48px.png"))); // NOI18N

        settingsbtn.setBackground(new java.awt.Color(23, 35, 51));
        settingsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        settingsbtn.setForeground(new java.awt.Color(255, 255, 255));
        settingsbtn.setLabel("Settings");
        settingsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsbtnActionPerformed(evt);
            }
        });

        settingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_automatic_48px.png"))); // NOI18N

        bankersbtn.setBackground(new java.awt.Color(23, 35, 51));
        bankersbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bankersbtn.setForeground(new java.awt.Color(255, 255, 255));
        bankersbtn.setLabel("Bankers");
        bankersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankersbtnActionPerformed(evt);
            }
        });

        bankersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_registration_48px.png"))); // NOI18N

        balancebtn.setBackground(new java.awt.Color(23, 35, 51));
        balancebtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        balancebtn.setForeground(new java.awt.Color(255, 255, 255));
        balancebtn.setLabel("Balance");
        balancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancebtnActionPerformed(evt);
            }
        });

        balanceicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_refund_48px.png"))); // NOI18N

        transactionsbtn.setBackground(new java.awt.Color(23, 35, 51));
        transactionsbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        transactionsbtn.setForeground(new java.awt.Color(255, 255, 255));
        transactionsbtn.setLabel("Transactions");
        transactionsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsbtnActionPerformed(evt);
            }
        });

        transactionsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_transaction_list_48px.png"))); // NOI18N

        logoutbtn.setBackground(new java.awt.Color(23, 35, 51));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setLabel("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(editcustomericon)
                                .addGap(245, 245, 245)
                                .addComponent(settingsicon)
                                .addGap(245, 245, 245)
                                .addComponent(transactionsicon)
                                .addGap(10, 10, 10)
                                .addComponent(transactionsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(customersicon))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(addcustomericon)))
                                .addGap(538, 538, 538)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bankersicon)
                                        .addGap(10, 10, 10)
                                        .addComponent(bankersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(balanceicon)
                                        .addGap(10, 10, 10)
                                        .addComponent(balancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deletecustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(deletecustomericon)
                                .addGap(170, 170, 170)
                                .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(logouticon)
                                .addGap(10, 10, 10)
                                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainlabel)
                    .addComponent(mainlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankersbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customersicon, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addcustomericon)
                                    .addComponent(balancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balanceicon))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editcustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editcustomericon)
                                    .addComponent(transactionsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionsicon))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(settingsicon)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankersicon)
                        .addGap(249, 249, 249)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(settingsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletecustomerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletecustomericon)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logouticon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("CustomersBanker");
    }//GEN-LAST:event_customersbtnActionPerformed

    private void balancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancebtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("BalanceBanker");
    }//GEN-LAST:event_balancebtnActionPerformed

    private void bankersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankersbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("BankersBanker");
    }//GEN-LAST:event_bankersbtnActionPerformed

    private void settingsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("SettingsBanker");
    }//GEN-LAST:event_settingsbtnActionPerformed

    private void deletecustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecustomerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("DeleteCustomerBanker");
    }//GEN-LAST:event_deletecustomerbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        Data.setBanker(null);
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("LoginBanker");
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void addcustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("AddCustomerBanker");
    }//GEN-LAST:event_addcustomerbtnActionPerformed

    private void editcustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcustomerbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("EditCustomerBanker");
    }//GEN-LAST:event_editcustomerbtnActionPerformed

    private void transactionsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("TransactionsBanker");
    }//GEN-LAST:event_transactionsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addcustomerbtn;
    private javax.swing.JLabel addcustomericon;
    private java.awt.Button balancebtn;
    private javax.swing.JLabel balanceicon;
    private java.awt.Button bankersbtn;
    private javax.swing.JLabel bankersicon;
    private java.awt.Button customersbtn;
    private javax.swing.JLabel customersicon;
    private java.awt.Button deletecustomerbtn;
    private javax.swing.JLabel deletecustomericon;
    private java.awt.Button editcustomerbtn;
    private javax.swing.JLabel editcustomericon;
    private javax.swing.JLabel infolabel;
    private java.awt.Button logoutbtn;
    private javax.swing.JLabel logouticon;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JLabel mainlabel2;
    private java.awt.Button settingsbtn;
    private javax.swing.JLabel settingsicon;
    private java.awt.Button transactionsbtn;
    private javax.swing.JLabel transactionsicon;
    // End of variables declaration//GEN-END:variables
}
