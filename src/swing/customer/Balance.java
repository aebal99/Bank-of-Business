/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

/**
 *
 * @author ercan
 */
public class Balance extends javax.swing.JPanel {

    final private swing.Home frame;
    
    /**
     * Creates new form Balance
     */
    public Balance(swing.Home home) {
        initComponents();
        frame = home;
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
        cancelbtn = new java.awt.Button();
        cancelicon = new javax.swing.JLabel();
        moneytext = new javax.swing.JTextField();
        infolabel = new javax.swing.JLabel();
        okbtn = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        dolarlabel = new javax.swing.JLabel();
        eurolabel = new javax.swing.JLabel();
        poundlabel = new javax.swing.JLabel();
        turkishliralabel = new javax.swing.JLabel();
        dolaralabel = new javax.swing.JLabel();
        euroalabel = new javax.swing.JLabel();
        poundalabel = new javax.swing.JLabel();
        turkishliraalabel = new javax.swing.JLabel();
        moneytype = new javax.swing.JComboBox<>();
        moneyctype = new javax.swing.JComboBox<>();
        infolabel2 = new javax.swing.JLabel();
        resultlabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        typelabel = new javax.swing.JLabel();
        firstlabel = new javax.swing.JLabel();
        secondlabel = new javax.swing.JLabel();
        thirdlabel = new javax.swing.JLabel();
        firstalabel = new javax.swing.JLabel();
        secondalabel = new javax.swing.JLabel();
        thirdalabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Balance");

        cancelbtn.setBackground(new java.awt.Color(23, 35, 51));
        cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setLabel("Cancel");
        cancelbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        cancelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        moneytext.setBackground(new java.awt.Color(23, 35, 51));
        moneytext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        moneytext.setForeground(new java.awt.Color(255, 255, 255));
        moneytext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        moneytext.setText("1.000.000.000");
        moneytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneytextActionPerformed(evt);
            }
        });

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("Enter amount you want to convert and press OK.");

        okbtn.setBackground(new java.awt.Color(23, 35, 51));
        okbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setLabel("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        dolarlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dolarlabel.setText("Dollar:");

        eurolabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        eurolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eurolabel.setText("Euro:");

        poundlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poundlabel.setText("Pound:");

        turkishliralabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishliralabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turkishliralabel.setText("Turkish Lira:");

        dolaralabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolaralabel.setForeground(new java.awt.Color(133, 187, 101));
        dolaralabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dolaralabel.setText("$500");

        euroalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        euroalabel.setForeground(new java.awt.Color(133, 187, 101));
        euroalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        euroalabel.setText("€400");

        poundalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundalabel.setForeground(new java.awt.Color(133, 187, 101));
        poundalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poundalabel.setText("£200");

        turkishliraalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishliraalabel.setForeground(new java.awt.Color(133, 187, 101));
        turkishliraalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        turkishliraalabel.setText("500₺");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dolarlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dolaralabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eurolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(euroalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(turkishliralabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turkishliraalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(poundlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(poundalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolarlabel)
                    .addComponent(dolaralabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eurolabel)
                    .addComponent(euroalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poundlabel)
                    .addComponent(poundalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turkishliralabel)
                    .addComponent(turkishliraalabel))
                .addContainerGap())
        );

        moneytype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        moneytype.setForeground(new java.awt.Color(23, 35, 51));
        moneytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollar", "Euro", "Pound", "Turkish Lira" }));
        moneytype.setToolTipText("");

        moneyctype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        moneyctype.setForeground(new java.awt.Color(23, 35, 51));
        moneyctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollar", "Euro", "Pound", "Turkish Lira" }));
        moneyctype.setToolTipText("");

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Currency you want to convert.");

        resultlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultlabel.setForeground(new java.awt.Color(255, 255, 255));
        resultlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultlabel.setText("Result: $500.000.000.000");

        typelabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        typelabel.setForeground(new java.awt.Color(133, 187, 101));
        typelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typelabel.setText("Dollar");

        firstlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        firstlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstlabel.setText("Euro:");

        secondlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        secondlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondlabel.setText("Pound:");

        thirdlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        thirdlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdlabel.setText("Turkish Lira:");

        firstalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        firstalabel.setForeground(new java.awt.Color(133, 187, 101));
        firstalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstalabel.setText("€1.21");

        secondalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        secondalabel.setForeground(new java.awt.Color(133, 187, 101));
        secondalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondalabel.setText("£1.14");

        thirdalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        thirdalabel.setForeground(new java.awt.Color(133, 187, 101));
        thirdalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thirdalabel.setText("5.42₺");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(firstlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(thirdlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirdalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(secondlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(typelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstlabel)
                    .addComponent(firstalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondlabel)
                    .addComponent(secondalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdlabel)
                    .addComponent(thirdalabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelicon)
                                .addGap(220, 220, 220)
                                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(moneytext, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneytype, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(moneyctype, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moneytext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(moneytype, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moneyctype, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resultlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelicon))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void moneytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneytextActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JLabel dolaralabel;
    private javax.swing.JLabel dolarlabel;
    private javax.swing.JLabel euroalabel;
    private javax.swing.JLabel eurolabel;
    private javax.swing.JLabel firstalabel;
    private javax.swing.JLabel firstlabel;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JComboBox<String> moneyctype;
    private javax.swing.JTextField moneytext;
    private javax.swing.JComboBox<String> moneytype;
    private java.awt.Button okbtn;
    private javax.swing.JLabel poundalabel;
    private javax.swing.JLabel poundlabel;
    private javax.swing.JLabel resultlabel;
    private javax.swing.JLabel secondalabel;
    private javax.swing.JLabel secondlabel;
    private javax.swing.JLabel thirdalabel;
    private javax.swing.JLabel thirdlabel;
    private javax.swing.JLabel turkishliraalabel;
    private javax.swing.JLabel turkishliralabel;
    private javax.swing.JLabel typelabel;
    // End of variables declaration//GEN-END:variables
}
