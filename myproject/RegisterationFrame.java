package myproject;
import javax.swing.JOptionPane;

public class RegisterationFrame extends javax.swing.JFrame {

    //Creates new form java
    public RegisterationFrame() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Fname_label = new javax.swing.JLabel();
        Fname_textfield = new javax.swing.JTextField();
        Lname_label = new javax.swing.JLabel();
        Lname_textfield = new javax.swing.JTextField();
        Gender_label = new javax.swing.JLabel();
        Male_button = new javax.swing.JRadioButton();
        Female_button = new javax.swing.JRadioButton();
        other_button = new javax.swing.JRadioButton();
        Pno_label = new javax.swing.JLabel();
        Pno_textfield = new javax.swing.JTextField();
        prn_label = new javax.swing.JLabel();
        prn_textfield = new javax.swing.JTextField();
        regsubmit_button = new javax.swing.JButton();
        username_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        cpassword_label = new javax.swing.JLabel();
        cpassword_textfield = new javax.swing.JTextField();
        password_textfield = new javax.swing.JPasswordField();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Fname_label.setText("First Name");

        Fname_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fname_textfieldActionPerformed(evt);
            }
        });

        Lname_label.setText("Last Name");

        Gender_label.setText("Gender");

        buttonGroup1.add(Male_button);
        Male_button.setSelected(true);
        Male_button.setText("Male");
        Male_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Male_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Female_button);
        Female_button.setText("Female");

        buttonGroup1.add(other_button);
        other_button.setText("other");

        Pno_label.setText("Phone No.");

        Pno_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pno_textfieldActionPerformed(evt);
            }
        });

        prn_label.setText("PRN");

        prn_textfield.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                prn_textfieldInputMethodTextChanged(evt);
            }
        });
        prn_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prn_textfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prn_textfieldKeyTyped(evt);
            }
        });

        regsubmit_button.setText("Submit");
        regsubmit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regsubmit_buttonActionPerformed(evt);
            }
        });

        username_label.setText("Username");

        username_textfield.setEditable(false);

        password_label.setText("Password");

        cpassword_label.setText("Confirm password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lname_label)
                            .addComponent(Gender_label)
                            .addComponent(Pno_label)
                            .addComponent(prn_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(password_label)
                                .addComponent(username_label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Pno_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(prn_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(username_textfield)
                                .addComponent(password_textfield))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Male_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Female_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(other_button))
                            .addComponent(Lname_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Fname_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fname_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpassword_label)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regsubmit_button)
                                    .addComponent(cpassword_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fname_label)
                    .addComponent(Fname_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lname_label)
                    .addComponent(Lname_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender_label)
                    .addComponent(Male_button)
                    .addComponent(Female_button)
                    .addComponent(other_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pno_label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pno_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prn_label)
                    .addComponent(prn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label)
                    .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_label)
                    .addComponent(password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpassword_label)
                    .addComponent(cpassword_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(regsubmit_button)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }

    private void Fname_textfieldActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_Fname_textfieldActionPerformed

    private void regsubmit_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        //event_regsubmit_buttonActionPerformed
         String fname=Fname_textfield.getText();
         String lname=Lname_textfield.getText();
 
         
         String pno= Pno_textfield.getText();
         String prn =prn_textfield.getText();
         
         
         String password =new String(password_textfield.getPassword());
         String cpassword =cpassword_textfield.getText();
         
       
         String gender="male";
         
         if(Female_button.isSelected())
             gender="female";
         else if(other_button.isSelected())
             gender="other";

         boolean added=new RegisterService().addVoter(fname, lname, gender, pno, prn, password);                        //adding user inputs by addVoter
                                                                                                                        //function in RegisterService class
        if(true)
        {
            Fname_textfield.setText("");
             Lname_textfield.setText("");
             
             Pno_textfield.setText("");
             prn_textfield.setText("");
           
             username_textfield.setText("");
             password_textfield.setText("");
             
               if(password.equals(cpassword)==false)                                                                    //password do not match
                JOptionPane.showMessageDialog(this, "Add correct password");
               
               else{
            JOptionPane.showMessageDialog(this, "Added successfully!");                           //successfully registered
            dispose();
            
               }
        }
         
        else{
            JOptionPane.showMessageDialog(this,"Something went wrong");
        }  //error handling

    }//event_regsubmit_buttonActionPerformed

    private void Male_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_Male_buttonActionPerformed

    private void Pno_textfieldActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_Pno_textfieldActionPerformed

    private void prn_textfieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
        username_textfield.setText(prn_textfield.getText());
    }//event_prn_textfieldInputMethodTextChanged

    private void prn_textfieldKeyTyped(java.awt.event.KeyEvent evt) {
    }//event_prn_textfieldKeyTyped

    private void prn_textfieldKeyReleased(java.awt.event.KeyEvent evt) {
                    username_textfield.setText(prn_textfield.getText());
    }//event_prn_textfieldKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JRadioButton Female_button;
    private javax.swing.JLabel Fname_label;
    private javax.swing.JTextField Fname_textfield;
    private javax.swing.JLabel Gender_label;
    private javax.swing.JLabel Lname_label;
    private javax.swing.JTextField Lname_textfield;
    private javax.swing.JRadioButton Male_button;
    private javax.swing.JLabel Pno_label;
    private javax.swing.JTextField Pno_textfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cpassword_label;
    private javax.swing.JTextField cpassword_textfield;
    private javax.swing.JLabel prn_label;
    private javax.swing.JTextField prn_textfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTree jTree1;
    private javax.swing.JRadioButton other_button;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_textfield;
    private javax.swing.JButton regsubmit_button;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_textfield;
}
