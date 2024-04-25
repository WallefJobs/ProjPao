/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systec.view;

import com.systec.controller.ConnectionFactory;
import com.systec.model.CadasUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class Frm4_PesqUsuario extends javax.swing.JDialog {

    PreparedStatement stmt = null;
    ResultSet rs = null;
    

    CadasUsuario serv = new CadasUsuario();

    public Frm4_PesqUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private final DefaultTableModel modelo = new DefaultTableModel(new Object[]{"", "", ""}, 0) {
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }

    };

    private void colunas() {
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("NOME");
       
    }

    private void Pesquisar() {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT id_usuario, nome FROM tb_usuario WHERE nome LIKE ?";
        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + txtPesq.getText() + "%");
            //stmt.setString(1, txtPesq.getText());
            rs = stmt.executeQuery();
            colunas();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getObject(1), rs.getObject(2)});
            }
            tblOs.setModel(modelo);
            tblOs.getColumnModel().getColumn(0).setMaxWidth(1000);
            tblOs.getColumnModel().getColumn(0).setMinWidth(50);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void PreencherTabela() {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT usu.id_usuario , usu.nome FROM tb_usuario usu";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            colunas();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getObject(1), rs.getObject(2)});
            }
            tblOs.setModel(modelo);
            tblOs.getColumnModel().getColumn(0).setMaxWidth(1000);
            tblOs.getColumnModel().getColumn(0).setMinWidth(50);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setCampos() {
        int linha = tblOs.getSelectedRow();
        serv.setId_usuario(Integer.parseInt(tblOs.getValueAt(linha, 0).toString()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOs = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtPesq.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesq);
        txtPesq.setBounds(20, 40, 340, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconPesquisa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 40, 30, 30);

        tblOs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblOs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblOs.setEditingColumn(0);
        tblOs.setEditingRow(0);
        tblOs.getTableHeader().setResizingAllowed(false);
        tblOs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 433, 275);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecionar);
        btnSelecionar.setBounds(350, 370, 103, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Digite o nome do Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 240, 30);

        setSize(new java.awt.Dimension(486, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyReleased
        Pesquisar();
    }//GEN-LAST:event_txtPesqKeyReleased

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblOs.getSelectedRow() >= 0) {
            setCampos();
            Frm2_Usuario.linha = tblOs.getSelectedRow() + 1;
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Não há nenhuma Usuário selecionada!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PreencherTabela();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm4_PesqUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frm4_PesqUsuario dialog = new Frm4_PesqUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOs;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}