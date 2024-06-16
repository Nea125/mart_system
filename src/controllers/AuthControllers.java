
package controllers;
import DB.ConnectionDB;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AuthControllers {
        private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // validate email
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        DefaultTableModel model;
        ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
            ImageIcon iconerr = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\wrong.png");

        ConnectionDB db = new ConnectionDB();

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    // validate password
     public static boolean isPasswordValid(String password) {
      
        return password.length() >= 6;
    }
     // save register
     
    public void SaveRegisterData(String email,String password)
    {
        try {
            sql = "INSERT INTO tbregister(email,password)VALUES(?,?)";
            ps = db.connection().prepareStatement(sql);
          
             ps.setString(1, email);
             ps.setString(2, password);
           
            int index = ps.executeUpdate();
            if(index>0)
            {
                JOptionPane.showMessageDialog(null, "Register Success","SAVE", HEIGHT, icon);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
      // save login
     
    public void SaveLoginData(String email,String password)
    {
        try {
            sql = "INSERT INTO tblogin(email,password)VALUES(?,?)";
            ps = db.connection().prepareStatement(sql);
          
             ps.setString(1, email);
             ps.setString(2, password);
           
            int index = ps.executeUpdate();
            if(index>0)
            {
                JOptionPane.showMessageDialog(null, "LoginSucess","SAVE", HEIGHT, icon);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    // checkBefor Login
//     public boolean checkCredentailTologin(String email,String password)
//    {
//       
//        try {
//            sql = "SELECT email,password FROM tbregister WHERE email = ? AND password = ?";
//            ps = db.connection().prepareStatement(sql);
//            ps.setString(1, email);
//            ps.setString(2, password);
//            rs = ps.executeQuery();
//           
//           
//            if(rs.next()) {
//                
//                 return true;
//            } else {
//              
//                JOptionPane.showMessageDialog(null, "Invalid Email or Password","LOGIN", HEIGHT, iconerr);
//            }
//
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//            return false;
//        
//    }
    
    
    

    
    public boolean checkCredentialToLogin(String email, String password) {
    String sql = "SELECT email, password FROM tbregister WHERE email = ? AND password=?";
    try (PreparedStatement ps = db.connection().prepareStatement(sql)) {
        ps.setString(1, email);
        ps.setString(2, password);
        String storedEmail = rs.getString("email");
        String storedPassword = rs.getString("password");
        try (ResultSet rs = ps.executeQuery()) {
            if (!rs.next()){
              
                JOptionPane.showMessageDialog(null, "No account found for this email. Please register.", "LOGIN", JOptionPane.WARNING_MESSAGE);
                
            } else{
               
                if (storedPassword.equals(password) && storedEmail.equals(email)) {
                  
                    return true; 
                } else {
                  
                    JOptionPane.showMessageDialog(null, "Invalid Email Or Password", "LOGIN", JOptionPane.WARNING_MESSAGE);
                    return false; 
                }
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return false; 
}
    
    
    
    
    


    public boolean checkCredentailToRegister(String email)
    {
       
        try {
            sql = "SELECT email FROM tbregister WHERE email = ?";
            ps = db.connection().prepareStatement(sql);
            ps.setString(1, email);
            
            rs = ps.executeQuery();
              if(rs.next()) {
                  JOptionPane.showMessageDialog(null, "email already exist.","LOGIN", HEIGHT, iconerr);
                 return true;
            } else {
              
                
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return false;
        
    }
      
      
      
}
