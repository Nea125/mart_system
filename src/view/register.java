
package view;

import controllers.AuthControllers;
public class register extends javax.swing.JFrame {
AuthControllers controller = new AuthControllers();
boolean isValidemail = false;
boolean isValidPassword = false;
boolean isValidcPassword = false;
    public register() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtcomfirmpassoword = new javax.swing.JPasswordField();
        btnregister = new com.k33ptoo.components.KButton();
        imagepath = new rojerusan.RSFotoCircle();
        checkemail = new javax.swing.JLabel();
        checkpassword = new javax.swing.JLabel();
        hide_show = new javax.swing.JCheckBox();
        checkemail1 = new javax.swing.JLabel();
        checkpassword1 = new javax.swing.JLabel();
        checkcpassword = new javax.swing.JLabel();
        hide_showcp = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(924, 595));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel2.setText("SIGN UP YOUR ACCOUN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 170, 300, 50);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 210, 160, 50);

        txtemail.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 0));
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtemail);
        txtemail.setBounds(290, 250, 340, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 290, 160, 50);

        txtpassword.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(290, 340, 340, 40);

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("COMFRIM PASSWORD");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 390, 220, 50);

        txtcomfirmpassoword.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtcomfirmpassoword.setForeground(new java.awt.Color(0, 0, 0));
        txtcomfirmpassoword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtcomfirmpassoword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcomfirmpassowordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcomfirmpassowordKeyReleased(evt);
            }
        });
        getContentPane().add(txtcomfirmpassoword);
        txtcomfirmpassoword.setBounds(290, 430, 340, 40);

        btnregister.setText("REGISTER");
        btnregister.setToolTipText("");
        btnregister.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnregister.setkBorderRadius(30);
        btnregister.setkEndColor(new java.awt.Color(255, 51, 51));
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister);
        btnregister.setBounds(290, 490, 340, 40);
        getContentPane().add(imagepath);
        imagepath.setBounds(380, 20, 160, 160);

        checkemail.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(checkemail);
        checkemail.setBounds(290, 290, 230, 20);

        checkpassword.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(checkpassword);
        checkpassword.setBounds(290, 380, 330, 20);

        hide_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_showActionPerformed(evt);
            }
        });
        getContentPane().add(hide_show);
        hide_show.setBounds(630, 350, 20, 19);

        checkemail1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(checkemail1);
        checkemail1.setBounds(290, 290, 230, 20);

        checkpassword1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(checkpassword1);
        checkpassword1.setBounds(360, 350, 240, 16);

        checkcpassword.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(checkcpassword);
        checkcpassword.setBounds(290, 470, 280, 20);

        hide_showcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_showcpActionPerformed(evt);
            }
        });
        getContentPane().add(hide_showcp);
        hide_showcp.setBounds(630, 440, 20, 19);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
       String email = txtemail.getText();
       String password = txtpassword.getText();
       String cpassword = txtcomfirmpassoword.getText();
       // check Email
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
        String validateCPassword = "";
        if(cpassword.equals(password) || cpassword.length()==password.length())
        {
            
            
        }
        else{
            validateCPassword="Confirm Password doesn't match";
             isValidcPassword=false;
            
        }
        if (AuthControllers.isPasswordValid(cpassword)) {
           isValidcPassword=true;
        } else if(cpassword.isEmpty())
        {
            validateCPassword="Please Input Confirm Password...";
             isValidcPassword=false;
            
        }
        
         else {
            validateCPassword="Password must be at least 6 characters";
             isValidcPassword=false;
             
           
        }
        checkcpassword.setText(validateCPassword);
               
      if(isValidemail==true && isValidPassword==true && isValidcPassword==true)
      {
           boolean staus = controller.checkCredentailToRegister(email);
           if(staus)
           {
               
           }else{
               controller.SaveRegisterData(email, password);
           }
      }

    }//GEN-LAST:event_btnregisterActionPerformed

    private void hide_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_showActionPerformed
        boolean isSelected = hide_show.isSelected();              
                // Show/hide password based on checkbox state
                if (isSelected) {
                    txtpassword.setEchoChar((char) 0); // Display characters as plain text
                } else {
                    txtpassword.setEchoChar('\u2022'); // Display characters as dots (•)
                }
    }//GEN-LAST:event_hide_showActionPerformed

    private void hide_showcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_showcpActionPerformed
       boolean isSelected = hide_showcp.isSelected();              
                // Show/hide password based on checkbox state
                if (isSelected) {
                    txtcomfirmpassoword.setEchoChar((char) 0); // Display characters as plain text
                } else {
                    txtcomfirmpassoword.setEchoChar('\u2022'); // Display characters as dots (•)
                }
    }//GEN-LAST:event_hide_showcpActionPerformed

    private void txtcomfirmpassowordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomfirmpassowordKeyReleased
        txtcomfirmpassoword.setEchoChar('\u2022'); // Set echo character to dot (•)
    }//GEN-LAST:event_txtcomfirmpassowordKeyReleased

    private void txtcomfirmpassowordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomfirmpassowordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomfirmpassowordKeyPressed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        boolean isSelected = hide_show.isSelected();              
                // Show/hide password based on checkbox state
                if (isSelected) {
                    txtpassword.setEchoChar((char) 0); // Display characters as plain text
                } else {
                    txtpassword.setEchoChar('\u2022'); // Display characters as dots (•)
                }
    }//GEN-LAST:event_txtpasswordKeyReleased

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnregister;
    private javax.swing.JLabel checkcpassword;
    private javax.swing.JLabel checkemail;
    private javax.swing.JLabel checkemail1;
    private javax.swing.JLabel checkpassword;
    private javax.swing.JLabel checkpassword1;
    private javax.swing.JCheckBox hide_show;
    private javax.swing.JCheckBox hide_showcp;
    private rojerusan.RSFotoCircle imagepath;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtcomfirmpassoword;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
