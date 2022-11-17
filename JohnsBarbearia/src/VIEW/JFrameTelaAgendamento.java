package VIEW;

import CONTROLS.ControlTelaAgendamento;
import HELPERS.ChamarTelas;

public class JFrameTelaAgendamento extends javax.swing.JFrame {

    public JFrameTelaAgendamento() {
        initComponents();
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelCabecalho = new javax.swing.JPanel();
        SairJButton = new javax.swing.JButton();
        JohnsBarbeariaJLabel = new javax.swing.JLabel();
        ObservçãoJScrollPane = new javax.swing.JScrollPane();
        ObservçãoJTextArea = new javax.swing.JTextArea();
        ObservaçãoJLabel = new javax.swing.JLabel();
        ServiçoJComboBox = new javax.swing.JComboBox<>();
        ServiçoLabel = new javax.swing.JLabel();
        ClienteLabel = new javax.swing.JLabel();
        ValorTextField = new javax.swing.JTextField();
        ValorJLabel = new javax.swing.JLabel();
        DataTextField = new javax.swing.JFormattedTextField();
        DataJLabel = new javax.swing.JLabel();
        HoraTextField = new javax.swing.JFormattedTextField();
        HoraJLabel = new javax.swing.JLabel();
        AgendarJButton = new javax.swing.JButton();
        ClienteJText = new javax.swing.JTextField();
        horariosJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        JPanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCabecalho.setPreferredSize(new java.awt.Dimension(820, 60));

        SairJButton.setForeground(new java.awt.Color(65, 65, 65));
        SairJButton.setText("Sair  ✖");
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

        JohnsBarbeariaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/JOHN’S BARBEARIA cinza.png"))); // NOI18N

        javax.swing.GroupLayout JPanelCabecalhoLayout = new javax.swing.GroupLayout(JPanelCabecalho);
        JPanelCabecalho.setLayout(JPanelCabecalhoLayout);
        JPanelCabecalhoLayout.setHorizontalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JohnsBarbeariaJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SairJButton)
                .addGap(24, 24, 24))
        );
        JPanelCabecalhoLayout.setVerticalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JohnsBarbeariaJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(SairJButton)
                .addGap(19, 19, 19))
        );

        ObservçãoJTextArea.setColumns(5);
        ObservçãoJTextArea.setRows(10);
        ObservçãoJScrollPane.setViewportView(ObservçãoJTextArea);

        ObservaçãoJLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ObservaçãoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ObservaçãoJLabel.setText("OBSERVAÇÃO:");

        ServiçoJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoJComboBox.setForeground(new java.awt.Color(65, 65, 65));
        ServiçoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecone seu serviço...", "Corte ", "Corte na Tesoura", "Barba Comum", "Sobrancelha", "Corte Feminino (side cut)", "Barba Terapia ", "Limpeza de Pele", "Pigmentação", "Corte + Barba Comum + Sobrancelha", "Corte + Barba Terapia + Sobrancelha", "Corte na Tesoura + Sobrancelha + Limpeza de Pele", "Corte na Tesoura + Barba Comum + Sobrancelha + Pigmentação" }));
        ServiçoJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiçoJComboBoxActionPerformed(evt);
            }
        });

        ServiçoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ServiçoLabel.setText("Serviço");

        ClienteLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClienteLabel.setText("Cliente");

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

        DataTextField.setForeground(new java.awt.Color(65, 65, 65));
        try {
            DataTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DataTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextFieldActionPerformed(evt);
            }
        });

        DataJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DataJLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataJLabel.setText("Data");

        HoraTextField.setForeground(new java.awt.Color(65, 65, 65));
        try {
            HoraTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        HoraTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HoraTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        HoraJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HoraJLabel.setForeground(new java.awt.Color(255, 255, 255));
        HoraJLabel.setText("Hora");

        AgendarJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AgendarJButton.setForeground(new java.awt.Color(65, 65, 65));
        AgendarJButton.setText("AGENDAR");
        AgendarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarJButtonActionPerformed(evt);
            }
        });

        ClienteJText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClienteJText.setForeground(new java.awt.Color(65, 65, 65));
        ClienteJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteJTextActionPerformed(evt);
            }
        });

        horariosJButton.setBackground(new java.awt.Color(65, 65, 65));
        horariosJButton.setForeground(new java.awt.Color(255, 255, 255));
        horariosJButton.setText("Ver Clientes Agendados  ▶");
        horariosJButton.setBorderPainted(false);
        horariosJButton.setContentAreaFilled(false);
        horariosJButton.setDefaultCapable(false);
        horariosJButton.setFocusPainted(false);
        horariosJButton.setFocusable(false);
        horariosJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        horariosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horariosJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObservaçãoJLabel)
                            .addComponent(ObservçãoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgendarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                                .addComponent(horariosJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DataJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(ValorJLabel)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ServiçoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ServiçoJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(HoraJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ValorTextField)
                            .addComponent(ClienteJText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteLabel)
                    .addComponent(ClienteJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServiçoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiçoLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataJLabel)
                    .addComponent(HoraJLabel)
                    .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(ObservaçãoJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ObservçãoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendarJButton)
                    .addComponent(horariosJButton))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJButtonActionPerformed
        ChamarTelas.chamarTelaLogin();
        this.dispose();
    }//GEN-LAST:event_SairJButtonActionPerformed

    private void ValorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTextFieldActionPerformed

    private void AgendarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarJButtonActionPerformed
        if (ControlTelaAgendamento.Agendar(nome_cliente(),
                servico(),
                valor_servico(),
                data_agendamento(),
                hora_agendamento(),
                observacao_agendamento())) {
            limparCampos();

        }

    }//GEN-LAST:event_AgendarJButtonActionPerformed

    private void ServiçoJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiçoJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiçoJComboBoxActionPerformed

    private void ClienteJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteJTextActionPerformed

    private void horariosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horariosJButtonActionPerformed
        ChamarTelas.chamarTelaHorarios();
        this.dispose();
        //this.ListarCliente(ControlTelaAgendamento);
    }//GEN-LAST:event_horariosJButtonActionPerformed

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
    private javax.swing.JButton AgendarJButton;
    private javax.swing.JTextField ClienteJText;
    private javax.swing.JLabel ClienteLabel;
    private javax.swing.JLabel DataJLabel;
    private javax.swing.JFormattedTextField DataTextField;
    private javax.swing.JLabel HoraJLabel;
    private javax.swing.JFormattedTextField HoraTextField;
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JLabel JohnsBarbeariaJLabel;
    private javax.swing.JLabel ObservaçãoJLabel;
    private javax.swing.JScrollPane ObservçãoJScrollPane;
    private javax.swing.JTextArea ObservçãoJTextArea;
    private javax.swing.JButton SairJButton;
    private javax.swing.JComboBox<String> ServiçoJComboBox;
    private javax.swing.JLabel ServiçoLabel;
    private javax.swing.JLabel ValorJLabel;
    private javax.swing.JTextField ValorTextField;
    private javax.swing.JButton horariosJButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String nome_cliente() {
        String nome_cliente = ClienteJText.getText();
        return nome_cliente;
    }

    private String servico() {
        String serviço = ServiçoJComboBox.getSelectedItem().toString();
        return serviço;
    }

    private String valor_servico() {
        String valor_servico = ValorTextField.getText();
        return valor_servico;

    }

    private String data_agendamento() {
        String data_agendamento = DataTextField.getText();
        return data_agendamento;
    }

    private String hora_agendamento() {
        String hora_agendamento = HoraTextField.getText();
        return hora_agendamento;
    }

    private String observacao_agendamento() {
        String observacao_agendamento = ObservçãoJTextArea.getText();
        return observacao_agendamento;
    }

    public void limparCampos() {
        ClienteJText.setText("");
        ValorTextField.setText("");
        DataTextField.setText("");
        HoraTextField.setText("");
        ObservçãoJTextArea.setText("");

    }
}
