package VIEW;

import CONTROLS.ControlTelaCadastro;
import EXCEPTIONS.ErroAoCriptografaSenhaException;
import EXCEPTIONS.ErroAoValidarCPFException;
import EXCEPTIONS.ErroAoValidarDadosExecption;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelCadastrarUsuarioException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import HELPERS.ChamarTelas;
import HELPERS.LimitaCaracteres;
import HELPERS.SomenteNumeros;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JFrameTelaCadastro extends javax.swing.JFrame {

    public JFrameTelaCadastro() {
        initComponents();
        setResizable(false);
        CPFJText.setDocument(new SomenteNumeros());
        CPFJText.setDocument(new LimitaCaracteres(11,
                LimitaCaracteres.TipoEntrada.CPF));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelCabecalho = new javax.swing.JPanel();
        JohnsBarbeariaJLabel = new javax.swing.JLabel();
        SairJButton = new javax.swing.JButton();
        sejabemvindoJLabel = new javax.swing.JLabel();
        NomeJText = new javax.swing.JTextField();
        NomeJLabel = new javax.swing.JLabel();
        SenhaJText = new javax.swing.JPasswordField();
        SenhaJLabel = new javax.swing.JLabel();
        CPFJText = new javax.swing.JTextField();
        CPFJLabel = new javax.swing.JLabel();
        CadastrarJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JPanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCabecalho.setPreferredSize(new java.awt.Dimension(820, 60));

        JohnsBarbeariaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/JOHN’S BARBEARIA cinza.png"))); // NOI18N

        SairJButton.setForeground(new java.awt.Color(65, 65, 65));
        SairJButton.setText(" Voltar   ↩");
        SairJButton.setBorder(null);
        SairJButton.setBorderPainted(false);
        SairJButton.setContentAreaFilled(false);
        SairJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairJButton.setFocusPainted(false);
        SairJButton.setFocusable(false);
        SairJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelCabecalhoLayout = new javax.swing.GroupLayout(JPanelCabecalho);
        JPanelCabecalho.setLayout(JPanelCabecalhoLayout);
        JPanelCabecalhoLayout.setHorizontalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JohnsBarbeariaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SairJButton)
                .addContainerGap())
        );
        JPanelCabecalhoLayout.setVerticalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JohnsBarbeariaJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(SairJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sejabemvindoJLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sejabemvindoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        sejabemvindoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sejabemvindoJLabel.setText("CADASTRO");
        sejabemvindoJLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sejabemvindoJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NomeJText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeJText.setForeground(new java.awt.Color(65, 65, 65));

        NomeJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NomeJLabel.setText("Nome");

        SenhaJText.setForeground(new java.awt.Color(65, 65, 65));

        SenhaJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SenhaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        SenhaJLabel.setText("Senha");

        CPFJText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CPFJText.setForeground(new java.awt.Color(65, 65, 65));
        CPFJText.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        CPFJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CPFJLabel.setForeground(new java.awt.Color(255, 255, 255));
        CPFJLabel.setText("CPF");

        CadastrarJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastrarJButton.setForeground(new java.awt.Color(65, 65, 65));
        CadastrarJButton.setText("CADASTRAR");
        CadastrarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarJButton.setFocusPainted(false);
        CadastrarJButton.setFocusable(false);
        CadastrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPFJLabel)
                    .addComponent(SenhaJText)
                    .addComponent(SenhaJLabel)
                    .addComponent(NomeJLabel)
                    .addComponent(NomeJText)
                    .addComponent(CPFJText, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sejabemvindoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(CadastrarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addGap(121, 121, 121)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(sejabemvindoJLabel)
                .addGap(41, 41, 41)
                .addComponent(NomeJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(CPFJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFJText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(CadastrarJButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJButtonActionPerformed
        ChamarTelas.chamarTelaLogin();
        this.dispose();
    }//GEN-LAST:event_SairJButtonActionPerformed

    private void CadastrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarJButtonActionPerformed
        try {
            String result = ControlTelaCadastro.autenticaDados(CPF_usuario(),
                    nome_usuario(),
                    senha_usuario());
            if (result != null) {
                JOptionPane.showMessageDialog(rootPane, result);
                limparCampos();
            } else {
                this.dispose();
            }
        } catch (ErroAoValidarCPFException
                | ErroAoValidarDadosExecption
                | NaoFoiPossivelCadastrarUsuarioException
                | NaoFoiPossivelEstabelecerConexaoComBDException
                | SQLException
                | NaoFoiPossivelAutenticarUsuarioException
                | ErroAoCriptografaSenhaException ex) {
        }
    }//GEN-LAST:event_CadastrarJButtonActionPerformed

    public static void WindowsLayout() {
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
    private javax.swing.JButton CadastrarJButton;
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JLabel JohnsBarbeariaJLabel;
    private javax.swing.JLabel NomeJLabel;
    private javax.swing.JTextField NomeJText;
    private javax.swing.JButton SairJButton;
    private javax.swing.JLabel SenhaJLabel;
    private javax.swing.JPasswordField SenhaJText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sejabemvindoJLabel;
    // End of variables declaration//GEN-END:variables

    public String CPF_usuario() {
        return CPFJText.getText();
    }

    public String nome_usuario() {
        String nome_usuario = NomeJText.getText();
        return nome_usuario;
    }

    public String senha_usuario() {
        String senha_usuario = SenhaJText.getText();
        return senha_usuario;
    }

    public void limparCampos() {
        CPFJText.setText("");
        NomeJText.setText("");
        SenhaJText.setText("");
    }
}
