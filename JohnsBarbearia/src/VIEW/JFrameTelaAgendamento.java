package VIEW;

import CONTROLS.ControlTelaCadastro;
import HELPERS.LimitaCaracteres;

public class JFrameTelaAgendamento extends javax.swing.JFrame {

    public JFrameTelaAgendamento() {
        initComponents();
        setResizable(false);
        DataTextField.setDocument(new LimitaCaracteres(10,
                LimitaCaracteres.TipoEntrada.DATA));
//        ObservçãoJTextArea.setDocument(new LimitaCaracteres(60,
//                LimitaCaracteres.TipoEntrada.OBSERVACAO));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelCabecalho = new javax.swing.JPanel();
        VoltarJButton = new javax.swing.JButton();
        JohnsBarbeariaJLabel = new javax.swing.JLabel();
        TabelaAgendamentoJScrollPane = new javax.swing.JScrollPane();
        TabelaAgendamentoJTable = new javax.swing.JTable();
        ObservçãoJScrollPane = new javax.swing.JScrollPane();
        ObservçãoJTextArea = new javax.swing.JTextArea();
        ObservaçãoJLabel = new javax.swing.JLabel();
        ServiçoJComboBox = new javax.swing.JComboBox<>();
        ServiçoLabel = new javax.swing.JLabel();
        NomeJText = new javax.swing.JTextField();
        ValorTextField = new javax.swing.JTextField();
        ValorJLabel = new javax.swing.JLabel();
        DataTextField = new javax.swing.JTextField();
        DataJLabel = new javax.swing.JLabel();
        HoraTextField = new javax.swing.JTextField();
        HoraJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        JPanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCabecalho.setPreferredSize(new java.awt.Dimension(820, 60));

        VoltarJButton.setForeground(new java.awt.Color(65, 65, 65));
        VoltarJButton.setText("Sair ✖");
        VoltarJButton.setBorder(null);
        VoltarJButton.setBorderPainted(false);
        VoltarJButton.setContentAreaFilled(false);
        VoltarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarJButton.setFocusPainted(false);
        VoltarJButton.setFocusable(false);
        VoltarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarJButtonActionPerformed(evt);
            }
        });

        JohnsBarbeariaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/JOHN’S BARBEARIA cinza.png"))); // NOI18N

        javax.swing.GroupLayout JPanelCabecalhoLayout = new javax.swing.GroupLayout(JPanelCabecalho);
        JPanelCabecalho.setLayout(JPanelCabecalhoLayout);
        JPanelCabecalhoLayout.setHorizontalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JohnsBarbeariaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VoltarJButton)
                .addGap(24, 24, 24))
        );
        JPanelCabecalhoLayout.setVerticalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JohnsBarbeariaJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(VoltarJButton)
                .addGap(19, 19, 19))
        );

        TabelaAgendamentoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Serviço", "Valor (R$)", "Data", "Hora", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAgendamentoJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaAgendamentoJTable.setFocusable(false);
        TabelaAgendamentoJTable.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaAgendamentoJTable.setRowHeight(23);
        TabelaAgendamentoJTable.setRowSelectionAllowed(false);
        TabelaAgendamentoJScrollPane.setViewportView(TabelaAgendamentoJTable);

        ObservçãoJTextArea.setColumns(5);
        ObservçãoJTextArea.setRows(10);
        ObservçãoJScrollPane.setViewportView(ObservçãoJTextArea);

        ObservaçãoJLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ObservaçãoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ObservaçãoJLabel.setText("OBSERVAÇÃO:");

        ServiçoJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoJComboBox.setForeground(new java.awt.Color(65, 65, 65));
        ServiçoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corte ", "Corte na Tesoura", "Barba Comum", "Sobrancelha", "Corte Feminino (side cut)", "Barba Terapia ", "Limpeza de Pele", "Pigmentação", "Corte + Barba Comun + Sobrancelha", "Corte + Barba Terapia + Sobrancelha", "Corte na Tesoura + Sobrancelha + Limpeza de Pele", "Corte na Tesoura + Barba Comun + Sobrancelha + Pigmentação" }));
        ServiçoJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiçoJComboBoxActionPerformed(evt);
            }
        });

        ServiçoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ServiçoLabel.setText("Serviço");

        NomeJText.setBackground(new java.awt.Color(65, 65, 65));
        NomeJText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeJText.setForeground(new java.awt.Color(255, 255, 255));
        NomeJText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NomeJText.setBorder(null);
        NomeJText.setEnabled(false);
        NomeJText.setRequestFocusEnabled(false);
        NomeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeJTextActionPerformed(evt);
            }
        });

        ValorTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ValorTextField.setForeground(new java.awt.Color(65, 65, 65));
        ValorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTextFieldActionPerformed(evt);
            }
        });

        ValorJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ValorJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ValorJLabel.setText("Valor");

        DataTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataTextField.setForeground(new java.awt.Color(65, 65, 65));
        DataTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextFieldActionPerformed(evt);
            }
        });

        DataJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataJLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataJLabel.setText("Data");

        HoraTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HoraTextField.setForeground(new java.awt.Color(65, 65, 65));
        HoraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraTextFieldActionPerformed(evt);
            }
        });

        HoraJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HoraJLabel.setForeground(new java.awt.Color(255, 255, 255));
        HoraJLabel.setText("Hora");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(65, 65, 65));
        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ServiçoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ValorJLabel)
                            .addComponent(DataJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ServiçoJComboBox, 0, 1, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HoraJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObservaçãoJLabel)
                    .addComponent(ObservçãoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(JSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TabelaAgendamentoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NomeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServiçoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ServiçoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataJLabel)
                            .addComponent(HoraJLabel)
                            .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ObservaçãoJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ObservçãoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addComponent(JSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabelaAgendamentoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void VoltarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarJButtonActionPerformed
        ControlTelaCadastro.chamarTelaLogin();
        this.dispose();
    }//GEN-LAST:event_VoltarJButtonActionPerformed

    private void NomeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeJTextActionPerformed

    private void ValorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTextFieldActionPerformed

    private void HoraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ServiçoJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiçoJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiçoJComboBoxActionPerformed

    private void DataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextFieldActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataJLabel;
    private javax.swing.JTextField DataTextField;
    private javax.swing.JLabel HoraJLabel;
    private javax.swing.JTextField HoraTextField;
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JSeparator JSeparator;
    private javax.swing.JLabel JohnsBarbeariaJLabel;
    private javax.swing.JTextField NomeJText;
    private javax.swing.JLabel ObservaçãoJLabel;
    private javax.swing.JScrollPane ObservçãoJScrollPane;
    private javax.swing.JTextArea ObservçãoJTextArea;
    private javax.swing.JComboBox<String> ServiçoJComboBox;
    private javax.swing.JLabel ServiçoLabel;
    private javax.swing.JScrollPane TabelaAgendamentoJScrollPane;
    private javax.swing.JTable TabelaAgendamentoJTable;
    private javax.swing.JLabel ValorJLabel;
    private javax.swing.JTextField ValorTextField;
    private javax.swing.JButton VoltarJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
