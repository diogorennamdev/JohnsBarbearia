package VIEW;

import CONTROLS.ControlTelaAgendamento;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamentoException;
import HELPERS.ChamarTelas;
import HELPERS.LimitaCaracteres;
import java.sql.SQLException;
import java.lang.Integer;
import static java.lang.Integer.getInteger;

import javax.swing.JOptionPane;

public class JFrameTelaAgendamento extends javax.swing.JFrame {

    public JFrameTelaAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBDException {
        initComponents();
        setResizable(false);
        ControlTelaAgendamento.PreencherTabela(AgendamentosJTable);
        ValorTextField.setDocument(new LimitaCaracteres(2,
                LimitaCaracteres.TipoEntrada.VALOR));
        ObservçãoJTextArea.setDocument(new LimitaCaracteres(50,
                LimitaCaracteres.TipoEntrada.OBSERVACAO));

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
        AgendamentosJScrollPane = new javax.swing.JScrollPane();
        AgendamentosJTable = new javax.swing.JTable();
        EditarJButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ObservaçãoJLabel = new javax.swing.JLabel();
        ClienteJText = new javax.swing.JTextField();
        LimparAgendaJButton = new javax.swing.JButton();
        ID_agendamentoJTextField = new javax.swing.JTextField();

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

        ObservçãoJScrollPane.setForeground(new java.awt.Color(65, 65, 65));
        ObservçãoJScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ObservçãoJTextArea.setRows(1);
        ObservçãoJTextArea.setTabSize(0);
        ObservçãoJScrollPane.setViewportView(ObservçãoJTextArea);

        ServiçoJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoJComboBox.setForeground(new java.awt.Color(65, 65, 65));
        ServiçoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecone seu serviço...", "Corte ", "Corte na Tesoura", "Barba Comum", "Sobrancelha", "Corte Feminino (side cut)", "Barba Terapia ", "Limpeza de Pele", "Pigmentação", "Corte + Barba Comum + Sobrancelha", "Corte + Barba Terapia + Sobrancelha", "Corte na Tesoura + Sobrancelha + Limpeza de Pele", "Corte na Tesoura + Barba Comum + Sobrancelha + Pigmentação" }));

        ServiçoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ServiçoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ServiçoLabel.setText("Serviço");

        ClienteLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClienteLabel.setText("Cliente");

        ValorTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ValorTextField.setForeground(new java.awt.Color(65, 65, 65));

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

        AgendamentosJTable.setForeground(new java.awt.Color(65, 65, 65));
        AgendamentosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Cliente", "Serviço", "Valor (R$)", "Data", "Hora", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgendamentosJTable.setGridColor(new java.awt.Color(234, 234, 234));
        AgendamentosJTable.setRowHeight(22);
        AgendamentosJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgendamentosJTableMouseClicked(evt);
            }
        });
        AgendamentosJScrollPane.setViewportView(AgendamentosJTable);

        EditarJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EditarJButton.setForeground(new java.awt.Color(65, 65, 65));
        EditarJButton.setText("EDITAR");
        EditarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarJButtonActionPerformed(evt);
            }
        });

        ExcluirJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExcluirJButton.setForeground(new java.awt.Color(65, 65, 65));
        ExcluirJButton.setText("EXCLUIR");
        ExcluirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirJButtonActionPerformed(evt);
            }
        });

        ObservaçãoJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ObservaçãoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ObservaçãoJLabel.setText("Observação:");

        LimparAgendaJButton.setBackground(new java.awt.Color(65, 65, 65));
        LimparAgendaJButton.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        LimparAgendaJButton.setForeground(new java.awt.Color(255, 255, 255));
        LimparAgendaJButton.setText("LIMPAR AGENDA ");
        LimparAgendaJButton.setBorder(null);
        LimparAgendaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAgendaJButtonActionPerformed(evt);
            }
        });

        ID_agendamentoJTextField.setEditable(false);
        ID_agendamentoJTextField.setBackground(new java.awt.Color(65, 65, 65));
        ID_agendamentoJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ID_agendamentoJTextField.setForeground(new java.awt.Color(65, 65, 65));
        ID_agendamentoJTextField.setAutoscrolls(false);
        ID_agendamentoJTextField.setBorder(null);
        ID_agendamentoJTextField.setEnabled(false);
        ID_agendamentoJTextField.setFocusable(false);
        ID_agendamentoJTextField.setRequestFocusEnabled(false);
        ID_agendamentoJTextField.setSelectedTextColor(new java.awt.Color(65, 65, 65));
        ID_agendamentoJTextField.setSelectionColor(new java.awt.Color(65, 65, 65));
        ID_agendamentoJTextField.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LimparAgendaJButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ObservaçãoJLabel)
                                    .addComponent(ValorJLabel)
                                    .addComponent(ServiçoLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ID_agendamentoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ClienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DataJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(HoraJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ServiçoJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ObservçãoJScrollPane)
                                    .addComponent(ClienteJText)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AgendamentosJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(AgendarJButton)
                                .addGap(28, 28, 28)
                                .addComponent(EditarJButton)
                                .addGap(29, 29, 29)
                                .addComponent(ExcluirJButton)))
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteLabel)
                    .addComponent(ClienteJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_agendamentoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServiçoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiçoLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorJLabel)
                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataJLabel)
                    .addComponent(HoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObservaçãoJLabel)
                    .addComponent(ObservçãoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgendarJButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExcluirJButton)
                        .addComponent(EditarJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgendamentosJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LimparAgendaJButton)
                .addContainerGap(9, Short.MAX_VALUE))
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

    private void AgendarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarJButtonActionPerformed
        try {
            String result = ControlTelaAgendamento.Agendar(nome_cliente(),
                    servico(),
                    valor_servico(),
                    data_agendamento(),
                    hora_agendamento(),
                    observacao_agendamento());
            ControlTelaAgendamento.PreencherTabela(AgendamentosJTable);
            limparCampos();

            if (result != null) {
                JOptionPane.showMessageDialog(rootPane, result);

            }
        } catch (NaoFoiPossivelEstabelecerConexaoComBDException | NaoFoiPossivelRealizarAgendamentoException | SQLException ex) {

        }
    }//GEN-LAST:event_AgendarJButtonActionPerformed

    private void SairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJButtonActionPerformed
        ChamarTelas.chamarTelaLogin();
        this.dispose();
    }//GEN-LAST:event_SairJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed

        try {
            if (AgendamentosJTable.getSelectedRow() != -1) {
                ControlTelaAgendamento.ExcluirAgendamento(AgendamentosJTable);
                ControlTelaAgendamento.PreencherTabela(AgendamentosJTable);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(
                        rootPane, " Selecio um hoarário na tabela para EXCLUIR");
            }

        } catch (NaoFoiPossivelEstabelecerConexaoComBDException ex) {
        }

    }//GEN-LAST:event_ExcluirJButtonActionPerformed

    private void EditarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarJButtonActionPerformed
        try {
            if (AgendamentosJTable.getSelectedRow() != -1) {
                AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 0);
                ControlTelaAgendamento.EditarAgendamento(nome_cliente(),
                        servico(),
                        valor_servico(),
                        data_agendamento(),
                        hora_agendamento(),
                        observacao_agendamento(),
                        ID_agendamento());
                ControlTelaAgendamento.PreencherTabela(AgendamentosJTable);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(
                        rootPane, " Selecio um hoarário na tabela para EDITAR");
            }

        } catch (NaoFoiPossivelEstabelecerConexaoComBDException ex) {
        }


    }//GEN-LAST:event_EditarJButtonActionPerformed

    private void AgendamentosJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendamentosJTableMouseClicked

        if (AgendamentosJTable.getSelectedRow() != -1) {

            ID_agendamentoJTextField.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 0).toString());
            ClienteJText.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 1).toString());
            ValorTextField.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 3).toString());
            DataTextField.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 4).toString());
            HoraTextField.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 5).toString());
            ObservçãoJTextArea.setText(AgendamentosJTable.getValueAt(AgendamentosJTable.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_AgendamentosJTableMouseClicked

    private void LimparAgendaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAgendaJButtonActionPerformed
        try {
            AgendamentosJTable.selectAll();
            ControlTelaAgendamento.LimparAgendamento(AgendamentosJTable);
            ControlTelaAgendamento.PreencherTabela(AgendamentosJTable);
            limparCampos();
        } catch (NaoFoiPossivelEstabelecerConexaoComBDException ex) {
        }
    }//GEN-LAST:event_LimparAgendaJButtonActionPerformed

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
    private javax.swing.JScrollPane AgendamentosJScrollPane;
    private javax.swing.JTable AgendamentosJTable;
    private javax.swing.JButton AgendarJButton;
    private javax.swing.JTextField ClienteJText;
    private javax.swing.JLabel ClienteLabel;
    private javax.swing.JLabel DataJLabel;
    private javax.swing.JFormattedTextField DataTextField;
    private javax.swing.JButton EditarJButton;
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JLabel HoraJLabel;
    private javax.swing.JFormattedTextField HoraTextField;
    private javax.swing.JTextField ID_agendamentoJTextField;
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JLabel JohnsBarbeariaJLabel;
    private javax.swing.JButton LimparAgendaJButton;
    private javax.swing.JLabel ObservaçãoJLabel;
    private javax.swing.JScrollPane ObservçãoJScrollPane;
    private javax.swing.JTextArea ObservçãoJTextArea;
    private javax.swing.JButton SairJButton;
    private javax.swing.JComboBox<String> ServiçoJComboBox;
    private javax.swing.JLabel ServiçoLabel;
    private javax.swing.JLabel ValorJLabel;
    private javax.swing.JTextField ValorTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private int ID_agendamento() {
        String ID_agendamento = ID_agendamentoJTextField.getText();
        int ID = 0;
        ID = Integer.parseInt(ID_agendamento);
        return ID;

    }

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
        ServiçoJComboBox.setToolTipText("");
        ValorTextField.setText("");
        DataTextField.setText("");
        HoraTextField.setText("");
        ObservçãoJTextArea.setText("");

    }

}
