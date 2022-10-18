package VIEW;

import CONTROLS.ControlTelaCadastro;
import HELPERS.Validacoes;
import javax.swing.JOptionPane;

public class JFrameTelaCadastro extends javax.swing.JFrame {

    public JFrameTelaCadastro() {
        initComponents();
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
        EmailJText = new javax.swing.JTextField();
        EmailJLabel = new javax.swing.JLabel();
        SenhaJText = new javax.swing.JPasswordField();
        SenhaJLabel = new javax.swing.JLabel();
        CPFJText = new javax.swing.JTextField();
        CPFJLabel = new javax.swing.JLabel();
        CadastrarJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JPanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCabecalho.setPreferredSize(new java.awt.Dimension(820, 60));

        JohnsBarbeariaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/JOHN’S BARBEARIA cinza.png"))); // NOI18N

        SairJButton.setForeground(new java.awt.Color(65, 65, 65));
        SairJButton.setText("SAIR ✖");
        SairJButton.setBorder(null);
        SairJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
                .addGap(42, 42, 42))
        );
        JPanelCabecalhoLayout.setVerticalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JohnsBarbeariaJLabel)
                .addGap(16, 16, 16))
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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
        NomeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeJTextActionPerformed(evt);
            }
        });

        NomeJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NomeJLabel.setText("Nome");

        EmailJText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmailJText.setForeground(new java.awt.Color(65, 65, 65));

        EmailJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailJLabel.setText("Email");

        SenhaJText.setForeground(new java.awt.Color(65, 65, 65));

        SenhaJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SenhaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        SenhaJLabel.setText("Senha");

        CPFJText.setDisabledTextColor(new java.awt.Color(65, 65, 65));
        CPFJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFJTextActionPerformed(evt);
            }
        });

        CPFJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CPFJLabel.setForeground(new java.awt.Color(255, 255, 255));
        CPFJLabel.setText("CPF");

        CadastrarJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastrarJButton.setForeground(new java.awt.Color(65, 65, 65));
        CadastrarJButton.setText("CADASTRAR");
        CadastrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sejabemvindoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(CadastrarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(285, 285, 285))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CPFJText)
                    .addComponent(NomeJText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(EmailJText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SenhaJText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CPFJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeJLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(sejabemvindoJLabel)
                .addGap(58, 58, 58)
                .addComponent(NomeJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailJLabel)
                .addGap(5, 5, 5)
                .addComponent(EmailJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SenhaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CPFJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPFJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(CadastrarJButton)
                .addContainerGap(151, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void SairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJButtonActionPerformed
        ControlTelaCadastro.chamarTelaLogin();
        this.dispose();
    }//GEN-LAST:event_SairJButtonActionPerformed

    private void NomeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeJTextActionPerformed

    }//GEN-LAST:event_NomeJTextActionPerformed

    private void CadastrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarJButtonActionPerformed
        if (Validacoes.validarCPF(CPF_usuario()) == true) {
            ControlTelaCadastro.cadastrar(CPF_usuario(),
                    nome_usuario(),
                    email_usuario(),
                    senha_usuario());
            JOptionPane.showMessageDialog(null,
                    "CPF CADASTRADO!\n");
            ControlTelaCadastro.chamarTelaLogin();
            this.dispose();
        } else if (Validacoes.validarCPF(CPF_usuario()) == false) {
            JOptionPane.showMessageDialog(null,
                    "ERRO, CPF INVÁLIDO!\n");
            limparApenasCpf();
        }
    }//GEN-LAST:event_CadastrarJButtonActionPerformed

    private void CPFJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFJTextActionPerformed

    }//GEN-LAST:event_CPFJTextActionPerformed

    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFJLabel;
    private javax.swing.JTextField CPFJText;
    private javax.swing.JButton CadastrarJButton;
    private javax.swing.JLabel EmailJLabel;
    private javax.swing.JTextField EmailJText;
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

    public String email_usuario() {
        String email_usuario = EmailJText.getText();
        return email_usuario;
    }

    public String senha_usuario() {
        String senha_usuario = SenhaJText.getText();
        return senha_usuario;
    }

    public void limpaCampos() {
        CPFJText.setText("");
        NomeJText.setText("");
        EmailJText.setText("");
        SenhaJText.setText("");
    }

    public void limparApenasCpf() {
        CPFJText.setText("");
    }
}
