package VIEW;

import CONTROL.ControlTelaLogin;

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
        entrarsistema = new javax.swing.JButton();
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
        sejabemvindoJLabel1.setLabelFor(entrarsistema);
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

        entrarsistema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarsistema.setForeground(new java.awt.Color(65, 65, 65));
        entrarsistema.setText("ENTRAR");
        entrarsistema.setToolTipText("");
        entrarsistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entrarsistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        entrarsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarsistemaActionPerformed(evt);
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
        criarcontaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarcontaJButtonActionPerformed(evt);
            }
        });

        esqueceuJButton.setBackground(new java.awt.Color(65, 65, 65));
        esqueceuJButton.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        esqueceuJButton.setForeground(new java.awt.Color(255, 255, 255));
        esqueceuJButton.setText("Esqueceu sua Senha?");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(criarcontaJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenhaUsuario)
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
                            .addComponent(esqueceuJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sejabemvindoJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(entrarsistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(sejabemvindoJLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(emailJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(senhaJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esqueceuJButton)
                        .addGap(50, 50, 50)
                        .addComponent(entrarsistema)
                        .addGap(55, 55, 55)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tracejado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tracejado2)
                            .addComponent(ouJLabel))
                        .addGap(43, 43, 43)
                        .addComponent(criarcontaJButton))
                    .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(loginJPanel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 840, 605);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarsistemaActionPerformed
        ControlTelaLogin.entrarsistemaActionPerformed(email(), senha());
        this.dispose();
    }//GEN-LAST:event_entrarsistemaActionPerformed

    private void txtEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUsuarioActionPerformed

    private void criarcontaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontaJButtonActionPerformed
        ControlTelaLogin.criarcontaJButtonActionPerformed();
        this.dispose();
    }//GEN-LAST:event_criarcontaJButtonActionPerformed

    private void esqueceuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esqueceuJButtonActionPerformed

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeTelaLogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarcontaJButton;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JButton entrarsistema;
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

    public String email() {
        String nome_email = txtEmailUsuario.getText();
        return nome_email;
    }

    public String senha() {
        String nome_senha = txtSenhaUsuario.getText();
        return nome_senha;
    }

}
