/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connection.ConnectionFactory;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.bean.Itens;
import model.dao.ItensDAO;

/**
 *
 * @author PICHAU
 */
public class TelaInvUsu extends javax.swing.JFrame {

    /**
     * Creates new form TelaInvUsu
     */
    private Connection con = null;

    public TelaInvUsu() {
        con = ConnectionFactory.getConnection();
        initComponents();
        attTabelaItens();
        //imgEB3.setEnabled(false);
        imgEB2.setEnabled(false);
    }

    class jPanelGradient extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

//            Color color1 = new Color(48, 18, 78); Cor Laranja
//            Color color2 = new Color(200, 88, 51); Cor Roxa
            Color color1 = new Color(21, 170, 30);
            Color color2 = new Color(10, 75, 15);
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        campoBuscaItens = new javax.swing.JTextField();
        imgPesq1 = new javax.swing.JLabel();
        imgEB3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescricaoItem = new javax.swing.JTextArea();
        cbCategoriaItem = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEspecificacaoItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        imgEB2 = new javax.swing.JLabel();
        jPanelCabeçalho = new jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoEBMini = new javax.swing.JLabel();
        btnDeslogar = new javax.swing.JButton();
        imgEBMedal = new javax.swing.JLabel();
        imgEB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Categoria", "Especificação"
            }
        ));
        tbItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbItensMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbItens);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 890, 260));

        campoBuscaItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaItensjTextField_pesqActionPerformed(evt);
            }
        });
        campoBuscaItens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscaItensKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscaItensKeyTyped(evt);
            }
        });
        jPanel2.add(campoBuscaItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 740, 30));

        imgPesq1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        imgPesq1.setForeground(new java.awt.Color(255, 255, 255));
        imgPesq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconePesq.png"))); // NOI18N
        imgPesq1.setText("Pesquisar");
        jPanel2.add(imgPesq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        imgEB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EBGrande.jpg"))); // NOI18N
        imgEB3.setText("jLabel8");
        jPanel2.add(imgEB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -10, 1090, 570));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 910, 320));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel5.add(txtNomeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 420, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DESCRIÇÃO");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        taDescricaoItem.setColumns(20);
        taDescricaoItem.setRows(5);
        taDescricaoItem.setText("\n\n");
        jScrollPane2.setViewportView(taDescricaoItem);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 380, 130));

        cbCategoriaItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Eletronico", "Movel", "Material de Escritório" }));
        jPanel5.add(cbCategoriaItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CATEGORIA");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel5.add(txtEspecificacaoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESPECIFICAÇAO");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        btnAdd.setText("ADICIONAR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 91, -1));

        imgEB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EBGrande.jpg"))); // NOI18N
        imgEB2.setText("jLabel8");
        jPanel5.add(imgEB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -390, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 200));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 890, 220));

        jPanelCabeçalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelCabeçalho.setForeground(new java.awt.Color(0, 102, 0));
        jPanelCabeçalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 122, 56));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISCOFIS");
        jPanelCabeçalho.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 21, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SISTEMA DE CONTROLE FISICO");
        jPanelCabeçalho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 66, -1, -1));

        logoEBMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo EB Miniatura.png"))); // NOI18N
        jPanelCabeçalho.add(logoEBMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1, -1, 100));

        btnDeslogar.setBackground(new java.awt.Color(204, 204, 204));
        btnDeslogar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout.png"))); // NOI18N
        btnDeslogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeslogar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });
        jPanelCabeçalho.add(btnDeslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 40));

        imgEBMedal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SimboloEBRecortado.png"))); // NOI18N
        jPanelCabeçalho.add(imgEBMedal, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 1, 350, 98));

        jPanel1.add(jPanelCabeçalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        imgEB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EBGrande.jpg"))); // NOI18N
        jPanel1.add(imgEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 100, 1090, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (tbItens.getSelectedRow() != -1) {

            int row = tbItens.getSelectedRow();
            String cell = tbItens.getModel().getValueAt(row, 0).toString();

            String titulo = tbItens.getModel().getValueAt(row, 1).toString();
            int result = JOptionPane.showConfirmDialog(null, "ATENÇÃO ! Deseja excluir o Item: " + titulo + " ?");

            if (result == 0) {

                String sql = "DELETE FROM Item WHERE id_Item = " + cell;

                try {

                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                    attTabelaItens();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir" + e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Item");
        }
        attTabelaItens();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Itens objItens = new Itens();
        ItensDAO objItensDAO = new ItensDAO();

        String indexComboBox = (String) cbCategoriaItem.getSelectedItem();

        while (txtNomeItem.getText().equals("") || txtEspecificacaoItem.getText().equals("") || taDescricaoItem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            break;
        }
        if (indexComboBox.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria");
        } else {

            objItens.setNome_Item(txtNomeItem.getText());
            objItens.setDescricao_Item(taDescricaoItem.getText());
            objItens.setCategoria_Item(indexComboBox);
            objItens.setEspecificacao_Item(txtEspecificacaoItem.getText());

            objItensDAO.save(objItens);
            JOptionPane.showMessageDialog(null, "Item '" + txtNomeItem.getText() + "' foi cadastrado com sucesso !");
            attTabelaItens();
        }
        txtNomeItem.setText("");
        taDescricaoItem.setText("");
        cbCategoriaItem.setSelectedIndex(0);
        txtEspecificacaoItem.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (tbItens.getSelectedRow() != -1) {

            String indexComboBox = (String) cbCategoriaItem.getSelectedItem();

            if (indexComboBox.equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Selecione uma Categoria");
            } else {
                Itens objItem = new Itens();
                ItensDAO objItenDAO = new ItensDAO();

                objItem.setId_Item((int) tbItens.getValueAt(tbItens.getSelectedRow(), 0));
                objItem.setNome_Item(txtNomeItem.getText());
                objItem.setDescricao_Item(taDescricaoItem.getText());
                objItem.setCategoria_Item(indexComboBox);
                objItem.setEspecificacao_Item(txtEspecificacaoItem.getText());

                objItenDAO.updateItens(objItem);

                txtNomeItem.setText("");
                taDescricaoItem.setText("");
                txtEspecificacaoItem.setText("");
                cbCategoriaItem.setSelectedIndex(0);

                attTabelaItens();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tbItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItensMouseClicked
        // TODO add your handling code here:
        if (tbItens.getSelectedRow() != -1) {
            txtNomeItem.setText(tbItens.getValueAt(tbItens.getSelectedRow(), 1).toString());
            taDescricaoItem.setText(tbItens.getValueAt(tbItens.getSelectedRow(), 2).toString());
            cbCategoriaItem.setSelectedIndex(0);
            txtEspecificacaoItem.setText(tbItens.getValueAt(tbItens.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tbItensMouseClicked

    private void campoBuscaItensjTextField_pesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaItensjTextField_pesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaItensjTextField_pesqActionPerformed

    private void campoBuscaItensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaItensKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaItensKeyPressed

    private void campoBuscaItensKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaItensKeyTyped

        try {
            String sql = "SELECT * FROM item WHERE nome_Item LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + campoBuscaItens.getText() + "%");
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tbItens.getModel();
            modelo.setNumRows(0);
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("id_Item"),
                    rs.getString("nome_Item"),
                    rs.getString("descricao_Item"),
                    rs.getString("categoria_Item"),
                    rs.getString("especificacao_Item"),});
        }
        rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_campoBuscaItensKeyTyped

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        // TODO add your handling code here:
        LoginUsu telalogin = new LoginUsu();
        telalogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeslogarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInvUsu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInvUsu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInvUsu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInvUsu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInvUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoBuscaItens;
    private javax.swing.JComboBox<String> cbCategoriaItem;
    private javax.swing.JLabel imgEB;
    private javax.swing.JLabel imgEB2;
    private javax.swing.JLabel imgEB3;
    private javax.swing.JLabel imgEBMedal;
    private javax.swing.JLabel imgPesq1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCabeçalho;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoEBMini;
    private javax.swing.JTextArea taDescricaoItem;
    private javax.swing.JTable tbItens;
    private javax.swing.JTextField txtEspecificacaoItem;
    private javax.swing.JTextField txtNomeItem;
    // End of variables declaration//GEN-END:variables
    private void attTabelaItens() {

        try {

            String sql = "SELECT * FROM item";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbItens.getModel();

            model.setNumRows(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_Item"),
                    rs.getString("nome_Item"),
                    rs.getString("descricao_Item"),
                    rs.getString("categoria_Item"),
                    rs.getString("especificacao_Item")});

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar dados" + e);
        }
    }
}
