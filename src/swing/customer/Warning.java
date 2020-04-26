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
public class Warning extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form Warning
     *
     * @param home Dynamic panel.
     */
    public Warning(swing.Home home) {
        initComponents();
        frame = home;

        if (Data.getPage1().equals("TransferCustomer") && Data.getPage2() == null) {
            int type = 0;
            if (Data.getTransfer().length() == 16) {
                type = 1;
            }
            infolabel.setText("The " + ((type == 0) ? ("user ID") : ("card number")) + " entered is unacceptable.");
            if ((type == 0 && Data.getTransfer().equals(Data.getCustomer().getId().getID())) || (type == 1 && Data.getTransfer().equals(Data.getCustomer().getCardNumber()))) {
                infolabel2.setText("You can't transfer money to yourself.");
            } else if (!Database.exists("Accounts", ((type == 0) ? ("ID") : ("CardNumber")), Data.getTransfer())) {
                infolabel2.setText("The " + ((type == 0) ? ("user ID") : ("card number")) + " doesn't exist.");
            } else {
                infolabel2.setText("The account type is invalid.");
            }
            return;
        }
        if ((Data.getMoneyType() == 0 && Data.getCustomer().getDollar().compareTo(Data.getMoney()) == -1) || (Data.getMoneyType() == 1 && Data.getCustomer().getEuro().compareTo(Data.getMoney()) == -1) || (Data.getMoneyType() == 2 && Data.getCustomer().getPound().compareTo(Data.getMoney()) == -1) || (Data.getMoneyType() == 3 && Data.getCustomer().getTurkishLira().compareTo(Data.getMoney()) == -1)) {
            if (Data.getPage2().equals("WithdrawalCustomer")) {
                infolabel2.setText("You don't have enough fund to withdrawal.");
            } else if (Data.getPage2().equals("TransferMoneyCustomer")) {
                infolabel2.setText("You don't have enough fund to transfer.");
            }
            return;
        }
        if (Data.getMoney().compareTo(Database.isBigDecimal("10000")) == 1) {
            infolabel2.setText("The amount can't be more than 10,000.");
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

        mainlabel = new javax.swing.JLabel();
        backbtn = new java.awt.Button();
        backicon = new javax.swing.JLabel();
        mainmenubtn = new java.awt.Button();
        mainmenuicon = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        infolabel2 = new javax.swing.JLabel();
        infolabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Warning");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        backbtn.setBackground(new java.awt.Color(23, 35, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setLabel("Back");
        backbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        backicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        mainmenubtn.setBackground(new java.awt.Color(23, 35, 51));
        mainmenubtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        mainmenubtn.setForeground(new java.awt.Color(255, 255, 255));
        mainmenubtn.setLabel("Main Menu");
        mainmenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenubtnActionPerformed(evt);
            }
        });

        mainmenuicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("The amount entered is unacceptable.");

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Please enter amount in multiple of 10/50/100 only.");

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Do you wish to go back?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(backicon)
                        .addGap(538, 538, 538)
                        .addComponent(mainmenuicon)
                        .addGap(10, 10, 10)
                        .addComponent(mainmenubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(277, 277, 277))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backicon)
                    .addComponent(mainmenubtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainmenuicon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        if (Data.getPage2() == null) {
            frame.ChangeJPanel(Data.getPage1());
        } else if (Data.getPage1() == null) {
            frame.ChangeJPanel(Data.getPage2());
        }
    }//GEN-LAST:event_backbtnActionPerformed

    private void mainmenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenubtnActionPerformed
        Data.setPage1(null);
        Data.setPage2(null);
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_mainmenubtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backbtn;
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private javax.swing.JLabel mainlabel;
    private java.awt.Button mainmenubtn;
    private javax.swing.JLabel mainmenuicon;
    // End of variables declaration//GEN-END:variables
}
