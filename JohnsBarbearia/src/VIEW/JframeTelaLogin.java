package VIEW;

import CONTROLS.ControlTelaLogin;
import java.util.Map;
import javax.swing.JOptionPane;

public class JframeTelaLogin extends javax.swing.JFrame {

    public JframeTelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esqueceuJButton = new javax.swing.JButton();
        loginJPanel = new javax.swing.JPanel();
        sejabemvindoJLabel1 = new javax.swing.JLabel();
        cpfJLabel = new javax.swing.JLabel();
        txtCPFUsuario = new javax.swing.JTextField();
        senhaJLabel = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        entrarsistema = new javax.swing.JButton();
        criarcontaJButton = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(65, 65, 65));

        loginJPanel.setBackground(new java.awt.Color(65, 65, 65));

        sejabemvindoJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        sejabemvindoJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sejabemvindoJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sejabemvindoJLabel1.setLabelFor(entrarsistema);
        sejabemvindoJLabel1.setText("SEJA BEM VINDO!");
        sejabemvindoJLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sejabemvindoJLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cpfJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpfJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cpfJLabel.setText("CPF");

        txtCPFUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCPFUsuario.setForeground(new java.awt.Color(65, 65, 65));
        txtCPFUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCPFUsuario.setAutoscrolls(false);
        txtCPFUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCPFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFUsuarioActionPerformed(evt);
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
        criarcontaJButton.setText("CRIE SUA CONTA");
        criarcontaJButton.setBorder(null);
        criarcontaJButton.setBorderPainted(false);
        criarcontaJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarcontaJButton.setFocusPainted(false);
        criarcontaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarcontaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criarcontaJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenhaUsuario)
                    .addComponent(txtCPFUsuario)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfJLabel)
                            .addComponent(senhaJLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sejabemvindoJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginJPanelLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(entrarsistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(228, 228, 228))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(sejabemvindoJLabel1)
                .addGap(53, 53, 53)
                .addComponent(cpfJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(senhaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(entrarsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarcontaJButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarsistemaActionPerformed
        if (ControlTelaLogin.validarDadosLogin(CPF_usuario(),
                senha_usuario())) {
            this.dispose();
        } else {
            limpaCampos();
        }

    }//GEN-LAST:event_entrarsistemaActionPerformed

    private void txtCPFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFUsuarioActionPerformed

    }//GEN-LAST:event_txtCPFUsuarioActionPerformed

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
    private javax.swing.JLabel cpfJLabel;
    private javax.swing.JButton criarcontaJButton;
    private javax.swing.JButton entrarsistema;
    private javax.swing.JButton esqueceuJButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JLabel sejabemvindoJLabel1;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JTextField txtCPFUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    public String CPF_usuario() {
        String CPF_usuario = txtCPFUsuario.getText();
        return CPF_usuario;
    }

    public String senha_usuario() {
        String senha_usuario = txtSenhaUsuario.getText();
        return senha_usuario;
    }

    public void limpaCampos() {
        txtCPFUsuario.setText("");
        txtSenhaUsuario.setText("");
    }

}
