package VIEW;
import VIEW.TelaLogin;
public class JframeTelaLogin extends javax.swing.JFrame {
    public JframeTelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJPanel = new javax.swing.JPanel();
        sejabemvindoJLabel1 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        senhaJLabel = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        entrarJButton = new javax.swing.JButton();
        tracejado1 = new javax.swing.JLabel();
        tracejado2 = new javax.swing.JLabel();
        ouJLabel = new javax.swing.JLabel();
        criarcontaJButton = new javax.swing.JButton();
        esqueceuJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaLogin");
        setBackground(new java.awt.Color(65, 65, 65));

        loginJPanel.setBackground(new java.awt.Color(65, 65, 65));

        sejabemvindoJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        sejabemvindoJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sejabemvindoJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sejabemvindoJLabel1.setLabelFor(entrarJButton);
        sejabemvindoJLabel1.setText("SEJA BEM VINDO!");
        sejabemvindoJLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sejabemvindoJLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/John's Barbearia.png"))); // NOI18N

        emailJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailJLabel.setText("Email");

        txtEmailUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmailUsuario.setForeground(new java.awt.Color(65, 65, 65));
        txtEmailUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmailUsuario.setAutoscrolls(false);
        txtEmailUsuario.setBorder(null);
        txtEmailUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUsuarioActionPerformed(evt);
            }
        });

        senhaJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senhaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaJLabel.setText("Senha");

        txtSenhaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSenhaUsuario.setForeground(new java.awt.Color(65, 65, 65));

        entrarJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarJButton.setForeground(new java.awt.Color(65, 65, 65));
        entrarJButton.setText("ENTRAR");
        entrarJButton.setToolTipText("");
        entrarJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entrarJButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        entrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJButtonActionPerformed(evt);
            }
        });

        tracejado1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tracejado1.setForeground(new java.awt.Color(255, 255, 255));
        tracejado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tracejado1.setText("...............................................................................................................................................................................................");
        tracejado1.setMinimumSize(new java.awt.Dimension(891, 25));

        tracejado2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tracejado2.setForeground(new java.awt.Color(255, 255, 255));
        tracejado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tracejado2.setText("...............................................................................................................................................................................................");

        ouJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ouJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ouJLabel.setText("OU");
        ouJLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ouJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ouJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        criarcontaJButton.setBackground(new java.awt.Color(65, 65, 65));
        criarcontaJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        criarcontaJButton.setForeground(new java.awt.Color(255, 255, 255));
        criarcontaJButton.setText("CRIE SUA CONTA COM EMAIL");
        criarcontaJButton.setBorder(null);
        criarcontaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarcontaJButtonActionPerformed(evt);
            }
        });

        esqueceuJButton.setBackground(new java.awt.Color(65, 65, 65));
        esqueceuJButton.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        esqueceuJButton.setForeground(new java.awt.Color(255, 255, 255));
        esqueceuJButton.setText("Esqueceu sua Senha?");
        esqueceuJButton.setBorder(null);
        esqueceuJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceuJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(imagem)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(entrarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(criarcontaJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenhaUsuario)
                            .addComponent(sejabemvindoJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addComponent(txtEmailUsuario)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailJLabel)
                                    .addComponent(senhaJLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addComponent(tracejado1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(51, 51, 51)
                                .addComponent(ouJLabel)
                                .addGap(69, 69, 69)
                                .addComponent(tracejado2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(esqueceuJButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(sejabemvindoJLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(emailJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(senhaJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esqueceuJButton)
                        .addGap(33, 33, 33)
                        .addComponent(entrarJButton)
                        .addGap(32, 32, 32)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tracejado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tracejado2)
                            .addComponent(ouJLabel))
                        .addGap(43, 43, 43)
                        .addComponent(criarcontaJButton)))
                .addGap(0, 0, 0))
        );

        getContentPane().add(loginJPanel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 834, 607);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJButtonActionPerformed
         TelaLogin.fazerlogin();
    }//GEN-LAST:event_entrarJButtonActionPerformed

    private void txtEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUsuarioActionPerformed

    private void criarcontaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontaJButtonActionPerformed
        JFrameTelaCadastro janelaJframeTelaCadastro = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_criarcontaJButtonActionPerformed

    private void esqueceuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esqueceuJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JframeTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeTelaLogin().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarcontaJButton;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JButton esqueceuJButton;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JLabel ouJLabel;
    private javax.swing.JLabel sejabemvindoJLabel1;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JLabel tracejado1;
    private javax.swing.JLabel tracejado2;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    
}
