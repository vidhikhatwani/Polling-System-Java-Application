package myproject;

public class VoteFrame extends javax.swing.JFrame {

    //  Creates new form java
    public VoteFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        vote_label = new javax.swing.JLabel();
        vote1_button = new javax.swing.JRadioButton();
        vote2_button = new javax.swing.JRadioButton();
        vote3_button = new javax.swing.JRadioButton();
        vote4_button = new javax.swing.JRadioButton();
        vote5_button = new javax.swing.JRadioButton();
        vote6_button = new javax.swing.JRadioButton();
        submitvote_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vote_label.setText("Choose from the given Options: ");

        buttonGroup1.add(vote1_button);
        vote1_button.setText("Option 1");
        vote1_button.setName("1");
        vote1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote1_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vote2_button);
        vote2_button.setText("Option 2");
        vote2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote2_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vote3_button);
        vote3_button.setText("Option 3");
        vote3_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote3_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vote4_button);
        vote4_button.setText("Option 4");
        vote4_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote4_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vote5_button);
        vote5_button.setText("Option 5");
        vote5_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote5_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vote6_button);
        vote6_button.setText("None of the above");
        vote6_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote6_buttonActionPerformed(evt);
            }
        });

        submitvote_button.setText("Submit");
        submitvote_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitvote_buttonActionPerformed(evt);
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
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vote6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(submitvote_button)
                            .addGap(147, 147, 147))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(vote1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(vote_label)
                .addGap(21, 21, 21)
                .addComponent(vote1_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote5_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote6_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(submitvote_button)
                .addContainerGap())
        );

        pack();
    }

    private void vote5_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote5_buttonActionPerformed
    
    private void vote6_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote6_buttonActionPerformed

    private void vote1_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote1_buttonActionPerformed

    private void vote2_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote2_buttonActionPerformed

    private void vote3_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote3_buttonActionPerformed

    private void vote4_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    }//event_vote4_buttonActionPerformed

    private void submitvote_buttonActionPerformed(java.awt.event.ActionEvent evt) {

                int vote;                                                                                               // to check which option has been
                if (vote1_button.isSelected()) {                                                                        //selected by the user
  
                    vote = 1;
                } 
  
                else if (vote2_button.isSelected()) { 
  
                    vote = 2;
                } 
                else if(vote3_button.isSelected()){ 
  
                    vote = 3;
                } 
                else if(vote4_button.isSelected()){ 
  
                    vote = 4;
                } 
                else if(vote5_button.isSelected()){ 
  
                    vote = 5;
                } 
                
                else
                {
                    vote=6;
                }
  
                 new VoteService().addVote(vote);                                                                       //adding the selected option id in
                                                                                                                        //in the database, votes table
                // MessageDialog to show information selected radion buttons. 
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitFrame().setVisible(true);
            }
        });

    }//event_submitvote_buttonActionPerformed

    // Variables declaration
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton submitvote_button;
    private javax.swing.JRadioButton vote1_button;
    private javax.swing.JRadioButton vote2_button;
    private javax.swing.JRadioButton vote3_button;
    private javax.swing.JRadioButton vote4_button;
    private javax.swing.JRadioButton vote5_button;
    private javax.swing.JRadioButton vote6_button;
    private javax.swing.JLabel vote_label;
}
