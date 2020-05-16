/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class AddAdmin extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form AddAdmin
     *
     * @param home Dynamic panel.
     */
    public AddAdmin(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) fullNameText.getDocument()).setDocumentFilter(new Filter(0, 32));
        ((AbstractDocument) dateOfBirthText.getDocument()).setDocumentFilter(new Filter(0, 10));
        ((AbstractDocument) phoneNumberText.getDocument()).setDocumentFilter(new Filter(1, 11));
        ((AbstractDocument) homeAddressText.getDocument()).setDocumentFilter(new Filter(0, 32));
        ((AbstractDocument) passwordText.getDocument()).setDocumentFilter(new Filter(0, 15));
        ((AbstractDocument) salaryText.getDocument()).setDocumentFilter(new Filter(0, 15));
    }

    private void addAdmin() {

        /*
        1) ^ - start of the string
        2) (?=.*[0-9]) - Positive look ahead expression for any number
        3) (?=.*[a-z]) - Positive look ahead expression for lower case letter
        4) (?=.*[A-Z]) - Positive look ahead expression for upper case letter
        5) (?=.*[!@#$%^&*]) - Positive look ahead expression for any special character
        6) (?=\\S+$) - Positive look ahead expression for \S (non-space character)
        7) . – any character
        8) {8,} - minimum 8 characters in length
        9) $ - end of the string
         */
        if (!fullNameText.getText().isBlank() && !dateOfBirthText.getText().isBlank() && !phoneNumberText.getText().isBlank() && !homeAddressText.getText().isBlank() && !passwordText.getText().isBlank() && !salaryText.getText().isBlank()) {
            if (Data.dateValidation(dateOfBirthText.getText())) {
                if (passwordText.getText().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$")) {
                    BigDecimal salary = Database.isBigDecimal(salaryText.getText());
                    if (salary.compareTo(BigDecimal.ZERO) > 0 && salary.compareTo(new BigDecimal("-1")) != 0) {
                        String ID = Database.create("Accounts");
                        if (ID != null) {
                            Database.set("Accounts", "ID", ID, "AccountType", 2);
                            Database.set("Accounts", "ID", ID, "FullName", fullNameText.getText());
                            Database.set("Accounts", "ID", ID, "DateofBirth", dateOfBirthText.getText());
                            Database.set("Accounts", "ID", ID, "PhoneNumber", phoneNumberText.getText());
                            Database.set("Accounts", "ID", ID, "HomeAddress", homeAddressText.getText());
                            Database.set("Accounts", "ID", ID, "Password", passwordText.getText());
                            Database.set("Accounts", "ID", ID, "Salary", salary);
                            Database.set("Accounts", "ID", ID, "CreatedAt", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
                            fullNameText.setText(null);
                            dateOfBirthText.setText(null);
                            phoneNumberText.setText(null);
                            homeAddressText.setText(null);
                            passwordText.setText(null);
                            salaryText.setText(null);
                            infoLabel.setText("The admin was successfully added. [ID: " + ID + "]");
                        } else {
                            infoLabel.setText("System error and the admin couldn't be created.");
                        }
                    } else {
                        infoLabel.setText("The salary doesn't follow the rules.");
                    }
                } else {
                    infoLabel.setText("The password doesn't follow the rules.");
                }
            } else {
                infoLabel.setText("The date of birth doesn't follow the rules.");
            }
        } else {
            infoLabel.setText("The field can't be left blank.");
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
        fullNameText = new javax.swing.JTextField();
        infoLabel3 = new javax.swing.JLabel();
        dateOfBirthText = new javax.swing.JTextField();
        infoLabel4 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        infoLabel5 = new javax.swing.JLabel();
        homeAddressText = new javax.swing.JTextField();
        infoLabel6 = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        infoLabel7 = new javax.swing.JLabel();
        salaryText = new javax.swing.JTextField();
        addButton = new java.awt.Button();
        addIcon = new javax.swing.JLabel();
        cancelButton = new java.awt.Button();
        cancelIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Add Admin");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Full Name");

        fullNameText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        fullNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullNameText.setMaximumSize(new java.awt.Dimension(7, 39));
        fullNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextActionPerformed(evt);
            }
        });
        fullNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fullNameTextKeyPressed(evt);
            }
        });

        infoLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel3.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel3.setText("Date of Birth");

        dateOfBirthText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        dateOfBirthText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateOfBirthText.setMaximumSize(new java.awt.Dimension(7, 39));
        dateOfBirthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthTextActionPerformed(evt);
            }
        });
        dateOfBirthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateOfBirthTextKeyPressed(evt);
            }
        });

        infoLabel4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel4.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel4.setText("Phone Number");

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNumberText.setMaximumSize(new java.awt.Dimension(7, 39));
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });
        phoneNumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumberTextKeyPressed(evt);
            }
        });

        infoLabel5.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel5.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel5.setText("Home Address");

        homeAddressText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        homeAddressText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        homeAddressText.setMaximumSize(new java.awt.Dimension(7, 39));
        homeAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeAddressTextActionPerformed(evt);
            }
        });
        homeAddressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeAddressTextKeyPressed(evt);
            }
        });

        infoLabel6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel6.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel6.setText("Password");

        passwordText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        passwordText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordText.setMaximumSize(new java.awt.Dimension(7, 39));
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        infoLabel7.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel7.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel7.setText("Salary");

        salaryText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        salaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salaryText.setMaximumSize(new java.awt.Dimension(7, 39));
        salaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTextActionPerformed(evt);
            }
        });
        salaryText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salaryTextKeyPressed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(23, 35, 51));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setLabel("Add");
        addButton.setMinimumSize(new java.awt.Dimension(80, 49));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        addIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(infoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfBirthText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(addIcon)
                                .addGap(538, 538, 538)
                                .addComponent(cancelIcon)
                                .addGap(10, 10, 10)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(homeAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addIcon)))
                    .addComponent(cancelIcon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addAdmin();
    }//GEN-LAST:event_addButtonActionPerformed

    private void fullNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        frame.changeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void homeAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeAddressTextActionPerformed

    private void dateOfBirthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfBirthTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void salaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextActionPerformed

    private void fullNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_fullNameTextKeyPressed

    private void homeAddressTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeAddressTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_homeAddressTextKeyPressed

    private void dateOfBirthTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_dateOfBirthTextKeyPressed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_passwordTextKeyPressed

    private void phoneNumberTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumberTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_phoneNumberTextKeyPressed

    private void salaryTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addAdmin();
        }
    }//GEN-LAST:event_salaryTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addButton;
    private javax.swing.JLabel addIcon;
    private java.awt.Button cancelButton;
    private javax.swing.JLabel cancelIcon;
    private javax.swing.JTextField dateOfBirthText;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JTextField homeAddressText;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel infoLabel4;
    private javax.swing.JLabel infoLabel5;
    private javax.swing.JLabel infoLabel6;
    private javax.swing.JLabel infoLabel7;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField salaryText;
    // End of variables declaration//GEN-END:variables
}
