/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

/**
 *
 * @author ercan
 */
public class CurrencyRate extends javax.swing.JPanel {

    final private swing.Home frame;
    
    /**
     * Creates new form CurrencyRate
     */
    public CurrencyRate(swing.Home home) {
        initComponents();
        frame = home;
        
        currencyratetable.getTableHeader().setFont(new java.awt.Font("Segoe UI", 0, 32));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        currencyratetable = new javax.swing.JTable();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Currency Rate");

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

        currencyratetable.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        currencyratetable.setForeground(new java.awt.Color(23, 35, 51));
        currencyratetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dollar", "", null, null, null},
                {"Euro", "", null, null, null},
                {"Pound", null, null, null, null},
                {"Turkish Lira", null, null, null, null}
            },
            new String [] {
                "", "Dollar", "Euro", "Pound", "Turkish Lira"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        currencyratetable.setRowHeight(71);
        currencyratetable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        currencyratetable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(currencyratetable);
        if (currencyratetable.getColumnModel().getColumnCount() > 0) {
            currencyratetable.getColumnModel().getColumn(0).setResizable(false);
            currencyratetable.getColumnModel().getColumn(1).setResizable(false);
            currencyratetable.getColumnModel().getColumn(2).setResizable(false);
            currencyratetable.getColumnModel().getColumn(3).setResizable(false);
            currencyratetable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelicon)))
                        .addGap(0, 562, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelicon))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JTable currencyratetable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainlabel;
    // End of variables declaration//GEN-END:variables
}
