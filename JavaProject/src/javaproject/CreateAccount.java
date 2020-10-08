/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CreateAccount extends javax.swing.JFrame {

    int x;
    String Default1 = "Your Email Here...";
    String Default2 = "Something Unique !";
    String Default3 = "Use 8-10 Characters Only !";
    

    public CreateAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passVisibility = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sri Nandana Osu Sala - Create an Account");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Webp.net-resizeimage (1).jpg")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Enter Your Name");

        nameField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameFieldMousePressed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Enter a Username");

        usernameField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Enter a Password");

        passField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFieldKeyTyped(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(51, 102, 255));
        RegisterButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseExited(evt);
            }
        });
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Enter Your Email");

        userMail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        userMail.setForeground(new java.awt.Color(153, 153, 153));
        userMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userMailFocusLost(evt);
            }
        });
        userMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userMailKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/username.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/email.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/admin.png"))); // NOI18N

        passVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/disabled.png"))); // NOI18N
        passVisibility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passVisibilityMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passVisibilityMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(passVisibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(nameField)
                            .addComponent(userMail, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passVisibility, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Create an Account ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(450, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        passVisibility.setEnabled(false);
        userMail.setText(Default1);
        userMail.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText(Default2);
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        passField.setEchoChar((char) 0);
        passField.setText(Default3);
        passField.setForeground(new java.awt.Color(153, 153, 153));
        
        x = passField.getPassword().length;
         
    }//GEN-LAST:event_formWindowOpened

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        

        if(usernameField.getText().equals(Default2)){
            
            usernameField.setForeground(new java.awt.Color(0, 0, 0));
            usernameField.setText(null);
           
        }
        
    }//GEN-LAST:event_usernameFieldFocusGained

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
      
        if(passField.getPassword().length==x || passField.getPassword().length==0){
            
            passField.setForeground(new java.awt.Color(0, 0, 0));
            passField.setEchoChar('*');
            passField.setText(null);
            
        }

                
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        
        if(passField.getPassword().length==0){
            
            passField.setForeground(new java.awt.Color(153, 153, 153));
            passField.setEchoChar((char) 0);
            passField.setText(Default3);
            
        }
        
    }//GEN-LAST:event_passFieldFocusLost

    private void RegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseEntered
      
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        
    }//GEN-LAST:event_RegisterButtonMouseEntered

    private void RegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseExited
        
        RegisterButton.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RegisterButtonMouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
        nameField.setText(null);
        userMail.setText(Default1);
        userMail.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText(Default2);
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        passField.setEchoChar((char) 0);
        passField.setText(Default3);
        passField.setForeground(new java.awt.Color(153, 153, 153));
        passVisibility.setIcon(new ImageIcon(getClass().getResource("disabled.png")));
        passVisibility.setEnabled(false);
        
    }//GEN-LAST:event_formWindowClosed

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyTyped
 
        passVisibility.setEnabled(true);
        passVisibility.setIcon(new ImageIcon(getClass().getResource("notvisible.png")));
        
        if(evt.getKeyChar()==KeyEvent.VK_DELETE || evt.getKeyChar()==KeyEvent.VK_BACK_SPACE){
            
            if(passField.getPassword().length==0){
                
                passVisibility.setIcon(new ImageIcon(getClass().getResource("disabled.png")));
                passVisibility.setEnabled(false);
                
            } 
        }
        if(passField.getPassword().length==10){
            
             JOptionPane.showMessageDialog(this, "<html><h4>Password Must Not Contain More Than 10 Characters !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
        }
        
      if(evt.getKeyChar()==KeyEvent.VK_ENTER){
          
          RegisterButton.doClick();
          
      }
        
         
    }//GEN-LAST:event_passFieldKeyTyped

    private void nameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMousePressed
               
        if(nameField.getText().equals(Default1)){
            
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.setText(null);
        
       }
    }//GEN-LAST:event_nameFieldMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        if(passField.getPassword().length!=x){
            
            passField.setEchoChar('*');
        }

       if(passField.getPassword().length==11){
           
           String pw1 = new String(passField.getPassword());

               StringBuilder sb = new StringBuilder(pw1);
               sb.deleteCharAt(10);
               String pw2 = new String(sb);    
               passField.setText(pw2);
                              
        }

    }//GEN-LAST:event_formWindowActivated

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        
        if(usernameField.getText().isEmpty() || usernameField.getText().contains(" ")){
            
            usernameField.setForeground(new java.awt.Color(153, 153, 153));
            usernameField.setText(Default2);
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
               
          passField.setEchoChar((char) 0);
          String pass = new String(passField.getPassword());
          passField.setEchoChar('*');
          
          String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
          String email = userMail.getText();
          
        if(nameField.getText().equals(Default1) || nameField.getText().isEmpty() || nameField.getText().startsWith(" ")){
             
            passField.setEchoChar((char) 0);
            nameField.setForeground(new java.awt.Color(0, 0, 0));
            nameField.setText("Admin");
            JOptionPane.showMessageDialog(this, "<html><h4>Username and Password Must Not Be Empty !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            usernameField.grabFocus();
            
        }
        else if(usernameField.getText().equals(Default2) || usernameField.getText().isEmpty() || usernameField.getText().contains(" ")){
            
            passField.setEchoChar((char) 0);
            JOptionPane.showMessageDialog(this, "<html><h4>Username Must Not Be Empty !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            usernameField.setForeground(new java.awt.Color(0, 0, 0));
            usernameField.setText(null);
            usernameField.grabFocus();
        }
              
        else if(email.matches(regex)==false){
            
            JOptionPane.showMessageDialog(this, "<html><h4>You Must Provide a Valid Email Address !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            userMail.grabFocus();
            passField.setEchoChar((char)0);
        }   
        
        else if(passField.getPassword().length==x){
            
            JOptionPane.showMessageDialog(this, "<html><h4>Password Must Not Be Empty !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            passField.setForeground(new java.awt.Color(0, 0, 0));
            passField.setText(null);
            passField.grabFocus();
        }
        
        else if(passField.getPassword().length<8){
            
            JOptionPane.showMessageDialog(this, "<html><h4>Password Must Contain Atleast 8 Characters !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            passField.grabFocus();

        }
        else if(passField.getPassword().length>10){
            
            JOptionPane.showMessageDialog(this, "<html><h4>Password Must Not Contain More Than 10 Characters !</h4></html>", "Error !", JOptionPane.ERROR_MESSAGE);
            passField.grabFocus();
        }
        else {
        try{
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Sri_Nandana","root","iammad_287");
            Statement stmt = (Statement)con.createStatement();
            
            stmt.executeUpdate("CREATE TABLE Admin (AdminName varchar(40) primary key,Username varchar(20),Email varchar(40),Password varchar(11));");
            stmt.executeUpdate("INSERT INTO Admin Values ('"+nameField.getText()+"','"+usernameField.getText()+"','"+userMail.getText()+"','"+pass+"');");
            
             JOptionPane.showMessageDialog(this, "<html><h4>Account Created Successfully !<br>You Can Now Log In Using The Username and the Password You've Given..:)</h4></html> ", "Successful !",JOptionPane.INFORMATION_MESSAGE);
             dispose();
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "<html><h4>You Have Created an Account Already !<br><br>Please Log In Using Your Username and the Password.</h4></html>", "Error !",JOptionPane.ERROR_MESSAGE);
            dispose();

        }
        }
        
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void userMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userMailFocusGained
       
        if(userMail.getText().equals(Default1)){
            
            userMail.setForeground(new java.awt.Color(0, 0, 0));
            userMail.setText(null);
            
        }
    }//GEN-LAST:event_userMailFocusGained

    private void userMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userMailFocusLost
        
        if(userMail.getText().contains(" ") || userMail.getText().isEmpty()){
            
            userMail.setForeground(new java.awt.Color(153, 153, 153));
            userMail.setText(Default1);
        }
        
    }//GEN-LAST:event_userMailFocusLost

    private void passVisibilityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passVisibilityMousePressed
        
        if(passVisibility.isEnabled()){
            
            passVisibility.setIcon(new ImageIcon(getClass().getResource("visible.png")));
            passField.setEchoChar((char) 0);
            
        }
    }//GEN-LAST:event_passVisibilityMousePressed

    private void passVisibilityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passVisibilityMouseReleased
            
        if(passVisibility.isEnabled()){
            
            passVisibility.setIcon(new ImageIcon(getClass().getResource("notvisible.png")));
            passField.setEchoChar('*');
            
        }
        
        
    }//GEN-LAST:event_passVisibilityMouseReleased

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
       
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
            usernameField.grabFocus();
        }
        
    }//GEN-LAST:event_nameFieldKeyTyped

    private void usernameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyTyped
        
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
           userMail.grabFocus();
        }
        
    }//GEN-LAST:event_usernameFieldKeyTyped

    private void userMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userMailKeyTyped
       
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
            passField.grabFocus();
        }

    }//GEN-LAST:event_userMailKeyTyped

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        
      if(nameField.getText().isEmpty()|| nameField.getText().startsWith(" ")){
            
          nameField.setText("Admin");
          
        }
      
    }//GEN-LAST:event_nameFieldFocusLost

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passVisibility;
    private javax.swing.JTextField userMail;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
