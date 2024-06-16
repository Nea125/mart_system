
package view;
import controllers.AuthControllers;
public class sign_in extends javax.swing.JFrame {
boolean isValidemail = false;
boolean isValidPassword = false;
AuthControllers controllers = new AuthControllers();

    public sign_in() {
        initComponents();
        
    }
      public void setTxtcheckemailText(String text) {
        checkemail.setText(text);
    }
       // Method to set text of txtcheckpassword
    public void setPasswordValidationMessage(String message) {
        checkpassword.setText(message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnsignin = new com.k33ptoo.components.KButton();
        btnregister = new necesario.MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        checkemail = new javax.swing.JLabel();
        txtcheckemail1 = new javax.swing.JLabel();
        txtcheckemail2 = new javax.swing.JLabel();
        checkpassword = new javax.swing.JLabel();
        hide_show = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(798, 576));
        setMinimumSize(new java.awt.Dimension(798, 576));
        setPreferredSize(new java.awt.Dimension(903, 548));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel2.setText("SIGN IN YOUR ACCOUN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 160, 300, 50);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 200, 160, 50);

        txtemail.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(51, 51, 51));
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtemail);
        txtemail.setBounds(300, 240, 340, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 280, 160, 50);

        txtpassword.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(51, 51, 51));
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(300, 330, 340, 40);

        btnsignin.setText("SIGN IN");
        btnsignin.setToolTipText("");
        btnsignin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsignin.setkBorderRadius(30);
        btnsignin.setkEndColor(new java.awt.Color(255, 51, 51));
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignin);
        btnsignin.setBounds(300, 390, 340, 40);

        btnregister.setBackground(new java.awt.Color(255, 255, 255));
        btnregister.setForeground(new java.awt.Color(51, 51, 255));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister);
        btnregister.setBounds(540, 450, 100, 20);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("YOU HAVE NO ACCOUNT YET?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 450, 210, 20);

        checkemail.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(checkemail);
        checkemail.setBounds(300, 280, 340, 20);

        txtcheckemail1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtcheckemail1);
        txtcheckemail1.setBounds(380, 280, 230, 20);

        txtcheckemail2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtcheckemail2);
        txtcheckemail2.setBounds(380, 280, 230, 20);

        checkpassword.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(checkpassword);
        checkpassword.setBounds(300, 370, 340, 16);

        hide_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_showActionPerformed(evt);
            }
        });
        getContentPane().add(hide_show);
        hide_show.setBounds(640, 340, 20, 19);

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel5.setText("LOGIN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 80, 100, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
       String email = txtemail.getText();
       String password = txtpassword.getText();
       String validateEmail = "";
       if (AuthControllers.isValidEmail(email)) {
              
             isValidemail=true;
        }else if(email.isEmpty())
        {
            validateEmail="Please Input Email...";
            isValidemail=false;
            
        }
       else {
           validateEmail="Email is invalid.";
            isValidemail=false;
          
        }
         checkemail.setText(validateEmail);

       // check Password
       
       String validatePassword = "";
        if (AuthControllers.isPasswordValid(password)) {
           isValidPassword=true;
        } else if(password.isEmpty())
        {
            validatePassword="Please Input Password...";
             isValidPassword=false;
           
        }else {
            validatePassword="Password must be at least 6 characters";
              isValidPassword=false;
           
        }
        checkpassword.setText(validatePassword);
        if(isValidPassword==true && isValidemail==true)
        {
            boolean status = controllers.checkCredentialToLogin(email, password);
            if(status)
            {
                controllers.SaveLoginData(email, password);
            }
        }

       
    }//GEN-LAST:event_btnsigninActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
      
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        txtpassword.setEchoChar('\u2022'); // Set echo character to dot (•)
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void hide_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_showActionPerformed
        boolean isSelected = hide_show.isSelected();              
                // Show/hide password based on checkbox state
                if (isSelected) {
                    txtpassword.setEchoChar((char) 0); // Display characters as plain text
                } else {
                    txtpassword.setEchoChar('\u2022'); // Display characters as dots (•)
                }
    }//GEN-LAST:event_hide_showActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
       register.main(null);
       dispose();
    }//GEN-LAST:event_btnregisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btnregister;
    private com.k33ptoo.components.KButton btnsignin;
    private javax.swing.JLabel checkemail;
    private javax.swing.JLabel checkpassword;
    private javax.swing.JCheckBox hide_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtcheckemail1;
    private javax.swing.JLabel txtcheckemail2;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
