package VIEW;

import CONTROLS.ControlTelaLogin;
import javax.swing.JOptionPane;

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
        entrarsistema.setBorder(null);
        entrarsistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarsistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entrarsistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        entrarsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarsistemaActionPerformed(evt);
            }
        });

        criarcontaJButton.setBackground(new java.awt.Color(65, 65, 65));
        criarcontaJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        criarcontaJButton.setForeground(new java.awt.Color(255, 255, 255));
        criarcontaJButton.setText("CRIE SUA CONTA COM EMAIL");
        criarcontaJButton.setBorder(null);
        criarcontaJButton.setBorderPainted(false);
        criarcontaJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarcontaJButton.setFocusPainted(false);
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
        esqueceuJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esqueceuJButton.setFocusable(false);
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
                            .addComponent(esqueceuJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sejabemvindoJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(entrarsistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
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
                        .addGap(78, 78, 78)
                        .addComponent(entrarsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criarcontaJButton)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 598, Short.MAX_VALUE)
        );

        setBounds(0, 0, 840, 605);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarsistemaActionPerformed
        ControlTelaLogin.entrarSistema(email_usuario(), senha_usuario());
        this.dispose();
    }//GEN-LAST:event_entrarsistemaActionPerformed

    private void txtEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuarioActionPerformed

    }//GEN-LAST:event_txtEmailUsuarioActionPerformed

    private void criarcontaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontaJButtonActionPerformed
        ControlTelaLogin.chamarTelaCadastro();
        this.dispose();
    }//GEN-LAST:event_criarcontaJButtonActionPerformed

    private void esqueceuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuJButtonActionPerformed

    }//GEN-LAST:event_esqueceuJButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JLabel sejabemvindoJLabel1;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    public String email_usuario() {
        String email_usuario = txtEmailUsuario.getText();
        return email_usuario;
    }

    public String senha_usuario() {
        String senha_usuario = txtSenhaUsuario.getText();
        return senha_usuario;
    }

}
