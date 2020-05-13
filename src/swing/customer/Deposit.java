/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.Timer;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class Deposit extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;

    /**
     * Creates new form Deposit
     *
     * @param home Dynamic panel.
     */
    public Deposit(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) moneyText.getDocument()).setDocumentFilter(new Filter(1, 5));

        timer = new Timer(2000, (ActionEvent e) -> {
            dolarAmountLabel.setText(Data.currencyFormat(0, Data.getCustomer().getDollar()));
            euroAmountLabel.setText(Data.currencyFormat(1, Data.getCustomer().getEuro()));
            poundAmountLabel.setText(Data.currencyFormat(2, Data.getCustomer().getPound()));
            turkishLiraAmountLabel.setText(Data.currencyFormat(3, Data.getCustomer().getTurkishLira()));
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    public void deposit() {
        if (!moneyText.getText().isBlank()) {
            BigDecimal money = Database.isBigDecimal(moneyText.getText());
            Data.setPage1(null);
            Data.setPage2("DepositCustomer");
            Data.setMoney(money);
            Data.setMoneyType(moneyType.getSelectedIndex());
            if (timer != null) {
                timer.stop();
            }
            if (money.compareTo(BigDecimal.ZERO) > 0 && money.compareTo(new BigDecimal("10000")) <= 0 && (money.remainder(Database.isBigDecimal("10")).compareTo(BigDecimal.ZERO) == 0 || money.remainder(Database.isBigDecimal("50")).compareTo(BigDecimal.ZERO) == 0 || money.remainder(Database.isBigDecimal("100")).compareTo(BigDecimal.ZERO) == 0)) {
                frame.ChangeJPanel("InformationCustomer");
            } else {
                frame.ChangeJPanel("WarningCustomer");
            }
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
        jPanel = new javax.swing.JPanel();
        dolarLabel = new javax.swing.JLabel();
        dolarAmountLabel = new javax.swing.JLabel();
        euroLabel = new javax.swing.JLabel();
        euroAmountLabel = new javax.swing.JLabel();
        poundLabel = new javax.swing.JLabel();
        poundAmountLabel = new javax.swing.JLabel();
        turkishLiraLabel = new javax.swing.JLabel();
        turkishLiraAmountLabel = new javax.swing.JLabel();
        moneyText = new javax.swing.JTextField();
        moneyType = new javax.swing.JComboBox<>();
        okButton = new java.awt.Button();
        cancelButton = new java.awt.Button();
        cancelIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Deposit");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Enter amount and press OK.");

        jPanel.setMaximumSize(new java.awt.Dimension(296, 179));
        jPanel.setMinimumSize(new java.awt.Dimension(296, 179));

        dolarLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dolarLabel.setText("Dollar:");

        dolarAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolarAmountLabel.setForeground(new java.awt.Color(133, 187, 101));
        dolarAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dolarAmountLabel.setText("$500");

        euroLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        euroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        euroLabel.setText("Euro:");

        euroAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        euroAmountLabel.setForeground(new java.awt.Color(133, 187, 101));
        euroAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        euroAmountLabel.setText("400 €");

        poundLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poundLabel.setText("Pound:");

        poundAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundAmountLabel.setForeground(new java.awt.Color(133, 187, 101));
        poundAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poundAmountLabel.setText("£200");

        turkishLiraLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishLiraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turkishLiraLabel.setText("Turkish Lira:");

        turkishLiraAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishLiraAmountLabel.setForeground(new java.awt.Color(133, 187, 101));
        turkishLiraAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        turkishLiraAmountLabel.setText("₺500");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(dolarLabel)
                        .addGap(6, 6, 6)
                        .addComponent(dolarAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(turkishLiraLabel)
                            .addGap(6, 6, 6)
                            .addComponent(turkishLiraAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(poundLabel)
                            .addGap(6, 6, 6)
                            .addComponent(poundAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                            .addComponent(euroLabel)
                            .addGap(6, 6, 6)
                            .addComponent(euroAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolarLabel)
                    .addComponent(dolarAmountLabel))
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euroLabel)
                    .addComponent(euroAmountLabel))
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poundLabel)
                    .addComponent(poundAmountLabel))
                .addGap(11, 11, 11)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turkishLiraLabel)
                    .addComponent(turkishLiraAmountLabel))
                .addGap(11, 11, 11))
        );

        moneyText.setBackground(new java.awt.Color(23, 35, 51));
        moneyText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        moneyText.setForeground(new java.awt.Color(255, 255, 255));
        moneyText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        moneyText.setMaximumSize(new java.awt.Dimension(7, 39));
        moneyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyTextActionPerformed(evt);
            }
        });
        moneyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                moneyTextKeyPressed(evt);
            }
        });

        moneyType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        moneyType.setForeground(new java.awt.Color(23, 35, 51));
        moneyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollar", "Euro", "Pound", "Turkish Lira" }));
        moneyType.setToolTipText("");

        okButton.setBackground(new java.awt.Color(23, 35, 51));
        okButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setLabel("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(23, 35, 51));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setLabel("Cancel");
        cancelButton.setMinimumSize(new java.awt.Dimension(80, 49));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cancelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(moneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(moneyType, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cancelIcon)
                                .addGap(220, 220, 220)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))))
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyType, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelIcon)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Data.setPage1(null);
        Data.setPage2(null);
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void moneyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyTextActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        deposit();
    }//GEN-LAST:event_okButtonActionPerformed

    private void moneyTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moneyTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            deposit();
        }
    }//GEN-LAST:event_moneyTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelButton;
    private javax.swing.JLabel cancelIcon;
    private javax.swing.JLabel dolarAmountLabel;
    private javax.swing.JLabel dolarLabel;
    private javax.swing.JLabel euroAmountLabel;
    private javax.swing.JLabel euroLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField moneyText;
    private javax.swing.JComboBox<String> moneyType;
    private java.awt.Button okButton;
    private javax.swing.JLabel poundAmountLabel;
    private javax.swing.JLabel poundLabel;
    private javax.swing.JLabel turkishLiraAmountLabel;
    private javax.swing.JLabel turkishLiraLabel;
    // End of variables declaration//GEN-END:variables
}
