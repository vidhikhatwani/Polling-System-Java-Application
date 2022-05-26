package myproject;

import javax.swing.JOptionPane;

public class WelcomeFrame extends javax.swing.JFrame {

     // Creates new form java
    public WelcomeFrame() {
        initComponents();
    }

    private void initComponents() {

        username_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        signin_button = new javax.swing.JButton();
        signin_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username_label.setText("Username");

        password_label.setText("Password");

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        signin_button.setText("Sign Up");
        signin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_buttonActionPerformed(evt);
            }
        });

        signin_label.setText("New Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit_button)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_label)
                    .addComponent(password_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(username_textfield))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(signin_button))
                    .addComponent(signin_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label)
                    .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_label)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(submit_button)
                .addGap(20, 20, 20)
                .addComponent(signin_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signin_button)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }//initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        //event_submit_buttonActionPerformed
        String username = username_textfield.getText();
        String password = new String(this.jPasswordField1.getPassword());
        if(new RegisterService().validateVoter(username, password))                                                     //checking the validation of username
                                                                                                                        //and password, i.e. if it is present
            if(new RegisterService().validateAdmin(username, password))                                                 //in out database
                new AminFrame().setVisible(true);
            else
                new VoteFrame().setVisible(true);
        else    
            JOptionPane.showMessageDialog(this, "Invalid username or password");
    }//event_submit_buttonActionPerformed

    private void signin_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                         //new registration, signup option
        //event_signin_buttonActionPerformed
        new RegisterationFrame().setVisible(true);
    }
    //event_signin_buttonActionPerformed

    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton signin_button;
    private javax.swing.JLabel signin_label;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration
}
