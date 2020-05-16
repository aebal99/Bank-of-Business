/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.banker;

import java.awt.event.KeyEvent;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class Login extends javax.swing.JPanel implements InterfaceLogin {

    final private swing.Home frame;

    /**
     * Creates new form Login
     *
     * @param home Dynamic panel.
     */
    public Login(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) userIDText.getDocument()).setDocumentFilter(new Filter(1, 16));
        ((AbstractDocument) password.getDocument()).setDocumentFilter(new Filter(0, 15));
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
        userIDText = new javax.swing.JTextField();
        infoLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginButton = new java.awt.Button();
        loginIcon = new javax.swing.JLabel();
        exitButton = new java.awt.Button();
        exitIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Banker - Login");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Enter User ID");

        userIDText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        userIDText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userIDText.setMaximumSize(new java.awt.Dimension(7, 39));
        userIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTextActionPerformed(evt);
            }
        });
        userIDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userIDTextKeyPressed(evt);
            }
        });

        infoLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel3.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel3.setText("Password");

        password.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setMaximumSize(new java.awt.Dimension(7, 39));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(23, 35, 51));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setLabel("Login");
        loginButton.setMinimumSize(new java.awt.Dimension(80, 49));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_enter_48px.png"))); // NOI18N

        exitButton.setBackground(new java.awt.Color(23, 35, 51));
        exitButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setLabel("Exit");
        exitButton.setMinimumSize(new java.awt.Dimension(80, 49));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(infoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(loginIcon)
                                .addGap(538, 538, 538)
                                .addComponent(exitIcon)
                                .addGap(10, 10, 10)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(11, 11, 11)
                .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginIcon)))
                    .addComponent(exitIcon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void login() {

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
        if (!userIDText.getText().isBlank() && !new String(password.getPassword()).isBlank()) {
            if (Database.exists("Accounts", "ID", userIDText.getText())) {
                if (Database.getInt("Accounts", "ID", userIDText.getText(), "AccountType") == 1) {
                    if (new String(password.getPassword()).matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$")) {
                        if (new String(password.getPassword()).equals(Database.getString("Accounts", "ID", userIDText.getText(), "Password"))) {
                            String[] load = Database.getArray("Accounts", "ID", userIDText.getText());
                            Banker banker = new Banker();
                            banker.getId().setID(load[0]);
                            banker.getId().setFullName(load[3], 0);
                            banker.getId().setDateOfBirth(load[4], 0);
                            banker.setPhoneNumber(load[6], 0);
                            banker.setHomeAddress(load[11], 0);
                            banker.setPassword(load[12], 0);
                            banker.setBankerSalary(Database.isBigDecimal(load[13]), 0);
                            Data.setBanker(banker);
                            frame.changeJPanel("HomeBanker");
                        } else {
                            infoLabel.setText("The password doesn't match.");
                        }
                    } else {
                        infoLabel.setText("The password doesn't follow the rules.");
                    }
                } else {
                    infoLabel.setText("The account type is invalid.");
                }
            } else {
                infoLabel.setText("The user ID is invalid.");
            }
        } else {
            infoLabel.setText("The user ID can't be left blank.");
        }
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTextActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        frame.changeJPanel("MainSelect");
    }//GEN-LAST:event_exitButtonActionPerformed

    private void userIDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_userIDTextKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exitButton;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private java.awt.Button loginButton;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userIDText;
    // End of variables declaration//GEN-END:variables
}
