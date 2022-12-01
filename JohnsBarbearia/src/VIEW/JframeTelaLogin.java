package VIEW;

import CONTROLS.ControlTelaLogin;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoListarDadosException;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.ChamarTelas;
import HELPERS.LimitaCaracteres;
import javax.swing.JOptionPane;

public class JframeTelaLogin extends javax.swing.JFrame {

    public JframeTelaLogin() {
        initComponents();
        CPFJText.setDocument(new LimitaCaracteres(11,
                LimitaCaracteres.TipoEntrada.CPF));
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJPanel = new javax.swing.JPanel();
        sejabemvindoJLabel1 = new javax.swing.JLabel();
        CPFJLabel = new javax.swing.JLabel();
        CPFJText = new javax.swing.JTextField();
        senhaJLabel = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        entrarsistema = new javax.swing.JButton();
        criarcontaJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(65, 65, 65));

        loginJPanel.setBackground(new java.awt.Color(65, 65, 65));
        loginJPanel.setMaximumSize(new java.awt.Dimension(600, 500));
        loginJPanel.setPreferredSize(new java.awt.Dimension(600, 500));

        sejabemvindoJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        sejabemvindoJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sejabemvindoJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sejabemvindoJLabel1.setLabelFor(entrarsistema);
        sejabemvindoJLabel1.setText("SEJA BEM VINDO!");
        sejabemvindoJLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sejabemvindoJLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CPFJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CPFJLabel.setForeground(new java.awt.Color(255, 255, 255));
        CPFJLabel.setText("CPF");

        CPFJText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CPFJText.setForeground(new java.awt.Color(65, 65, 65));
        CPFJText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CPFJText.setAutoscrolls(false);
        CPFJText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/JOHN’S BARBEARIA.png"))); // NOI18N

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(criarcontaJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CPFJText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CPFJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sejabemvindoJLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                                    .addComponent(senhaJLabel)))
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(entrarsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(sejabemvindoJLabel1)
                .addGap(31, 31, 31)
                .addComponent(CPFJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(senhaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(entrarsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(criarcontaJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarsistemaActionPerformed
        try {
            String result = ControlTelaLogin.ValidarDadosLogin(CPF_usuario(),
                    senha_usuario());
            if (result != null) {
                JOptionPane.showMessageDialog(rootPane, result);
                limparCampos();
            } else {
                this.dispose();
            }
        } catch (NaoFoiPossivelAutenticarUsuarioException
                | NaoFoiPossivelEstabelecerConexaoComBDException
                | ErroAoCriptografaSenhaException
                | ErroAoListarDadosException ex) {
        }
    }//GEN-LAST:event_entrarsistemaActionPerformed

    private void criarcontaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarcontaJButtonActionPerformed
        ChamarTelas.chamarTelaCadastro();
        this.dispose();
    }//GEN-LAST:event_criarcontaJButtonActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JframeTelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFJLabel;
    private javax.swing.JTextField CPFJText;
    private javax.swing.JButton criarcontaJButton;
    private javax.swing.JButton entrarsistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JLabel sejabemvindoJLabel1;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
    public String CPF_usuario() {
        String CPF_usuario = CPFJText.getText();
        return CPF_usuario;
    }

    public String senha_usuario() {
        String senha_usuario = txtSenhaUsuario.getText();
        return senha_usuario;
    }

    public void limparCampos() {
        CPFJText.setText("");
        txtSenhaUsuario.setText("");
    }

}
