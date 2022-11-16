package VIEW;

import CONTROLS.ControlTelaAgendamento;
import HELPERS.ChamarTelas;

public class JFrameTelaHorarios extends javax.swing.JFrame {

//    String CPF_usuario;

    public JFrameTelaHorarios() {
        initComponents();
        setResizable(false);
        ControlTelaAgendamento.LerTabela(TabelaAgendamentoJTable);
        

    }
//
//    public JFrameTelaHorarios(String CPF_usuario) {
//        this.CPF_usuario = CPF_usuario;
//    }
//
//    public String getCPF_usuario() {
//        return CPF_usuario;
//    }
//
//    public void setCPF_usuario(String CPF_usuario) {
//        this.CPF_usuario = CPF_usuario;
//    }
//    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelCabecalho = new javax.swing.JPanel();
        VoltarJButton = new javax.swing.JButton();
        JohnsBarbeariaJLabel = new javax.swing.JLabel();
        TabelaAgendamentoJScrollPane = new javax.swing.JScrollPane();
        TabelaAgendamentoJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        JPanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCabecalho.setPreferredSize(new java.awt.Dimension(820, 60));

        VoltarJButton.setForeground(new java.awt.Color(65, 65, 65));
        VoltarJButton.setText("Voltar  ↩");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
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

        TabelaAgendamentoJTable.setForeground(new java.awt.Color(65, 65, 65));
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Serviço", "Valor (R$)", "Data", "Horário", "Observção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAgendamentoJTable.setAutoscrolls(false);
        TabelaAgendamentoJTable.setGridColor(new java.awt.Color(204, 204, 204));
        TabelaAgendamentoJTable.setRowHeight(22);
        TabelaAgendamentoJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAgendamentoJTableMouseClicked(evt);
            }
        });
        TabelaAgendamentoJScrollPane.setViewportView(TabelaAgendamentoJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TabelaAgendamentoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(TabelaAgendamentoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
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

    private void VoltarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarJButtonActionPerformed
        ChamarTelas.chamarTelaAgendamento();
        this.dispose();
    }//GEN-LAST:event_VoltarJButtonActionPerformed

    private void TabelaAgendamentoJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAgendamentoJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAgendamentoJTableMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaHorarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JLabel JohnsBarbeariaJLabel;
    private javax.swing.JScrollPane TabelaAgendamentoJScrollPane;
    private javax.swing.JTable TabelaAgendamentoJTable;
    private javax.swing.JButton VoltarJButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
