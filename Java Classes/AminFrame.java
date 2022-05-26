package myproject;

import javax.swing.*;

public class AminFrame extends javax.swing.JFrame {

    //Creates new form java
    public AminFrame() {
        initComponents();
    }
    private void initComponents() {

        JLabel vote_label = new JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        yes_button = new javax.swing.JRadioButton();
        no_button = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vote_label.setText("---ADMIN---");

        buttonGroup1.add(yes_button);
        yes_button.setText("Cast your vote now");
        yes_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(no_button);
        no_button.setText("Check Result");
        no_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(vote_label)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yes_button)
                    .addComponent(no_button))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(vote_label)
                .addGap(96, 96, 96)
                .addComponent(yes_button)
                .addGap(34, 34, 34)
                .addComponent(no_button)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }

    private void yes_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                            //opening voting options for admin
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoteFrame().setVisible(true);
            }
            });
        
    }//event_yes_buttonActionPerformed

    private void no_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                             //opeing result
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
            });
    }//event_no_buttonActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton no_button;
    private javax.swing.JRadioButton yes_button;
}
