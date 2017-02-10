package pe.egcc.genioapp.view;

import pe.egcc.genioapp.controller.GenioController;

public class Mcm extends javax.swing.JInternalFrame {

    public Mcm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        btnmcd = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtn2 = new javax.swing.JTextField();
        btnlimpier = new javax.swing.JButton();
        btnmcm = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MCM Y MCD");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Numero 1:");

        txtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnmcd.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnmcd.setText("mcd");
        btnmcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmcdActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Numero 2:");

        txtn2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnlimpier.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnlimpier.setText("Limpiar");
        btnlimpier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpierActionPerformed(evt);
            }
        });

        btnmcm.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnmcm.setText("mcm");
        btnmcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmcmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnmcd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnmcm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpier, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmcd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnmcm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlimpier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnmcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmcdActionPerformed
      // Dato
      int n1 = Integer.parseInt(txtn1.getText());
      int n2 = Integer.parseInt(txtn2.getText());
      // Proceso
      GenioController control = new GenioController();
      int mcd = control.mcd(n1, n2);
      // repo
      label.setText("El MCD es: " + mcd);
  }//GEN-LAST:event_btnmcdActionPerformed

    private void btnlimpierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpierActionPerformed
        txtn1.setText("");
        txtn2.setText("");
    }//GEN-LAST:event_btnlimpierActionPerformed

    private void btnmcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmcmActionPerformed
        //datos
        int n1 = Integer.parseInt(txtn1.getText());
        int n2 = Integer.parseInt(txtn2.getText());
        //proceso
        GenioController controller = new GenioController();
        int mcm = controller.mcm(n1, n2);
        //resultado
label.setText("El MCM es: "+mcm);
    }//GEN-LAST:event_btnmcmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlimpier;
    private javax.swing.JButton btnmcd;
    private javax.swing.JButton btnmcm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    // End of variables declaration//GEN-END:variables
}
