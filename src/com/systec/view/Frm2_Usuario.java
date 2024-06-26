/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systec.view;

import com.systec.model.CadasUsuario;

import com.systec.model.dao.CadasUsuarioDAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Steve Wallef
 */
public class Frm2_Usuario extends javax.swing.JDialog {

    /**
     * Creates new form Frm2_Usuario
     */
    public Frm2_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    public static int linha = -1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha2 = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        txtID = new javax.swing.JLabel();
        jLabelImagemUsuario = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Usuário", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 37, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 34, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 37, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Confirma Senha");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 220, 110, 20);

        txtNome.setEnabled(false);
        jPanel1.add(txtNome);
        txtNome.setBounds(20, 70, 280, 30);

        txtLogin.setEnabled(false);
        jPanel1.add(txtLogin);
        txtLogin.setBounds(20, 130, 280, 30);

        txtSenha2.setEnabled(false);
        jPanel1.add(txtSenha2);
        txtSenha2.setBounds(20, 240, 280, 30);

        txtSenha.setEnabled(false);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(20, 190, 280, 30);
        jPanel1.add(txtID);
        txtID.setBounds(480, 30, 50, 30);

        jLabelImagemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/icon_Usuario.png"))); // NOI18N
        jPanel1.add(jLabelImagemUsuario);
        jLabelImagemUsuario.setBounds(310, 30, 220, 290);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconCancelar.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);
        btnExcluir.setBounds(260, 280, 40, 39);

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconPesquisa.png"))); // NOI18N
        btnPesquisa.setToolTipText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa);
        btnPesquisa.setBounds(60, 280, 40, 40);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconAdicionar.png"))); // NOI18N
        btnNovo.setToolTipText("Novo ");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo);
        btnNovo.setBounds(10, 280, 40, 40);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconOk.png"))); // NOI18N
        btnSalvar.setToolTipText("Salva ");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(110, 280, 40, 39);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconMenos.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(160, 280, 40, 39);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/systec/imagens/iconEditar.png"))); // NOI18N
        btnAlterar.setToolTipText("Altera");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(210, 280, 40, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 330);

        setSize(new java.awt.Dimension(561, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Controle de Tela

        txtNome.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtSenha2.setText("");
        txtID.setText("");

        txtNome.setEnabled(false);
        txtLogin.setEnabled(false);
        txtSenha.setEnabled(false);
        txtSenha2.setEnabled(false);

        //Controle de Botões
        btnSalvar.setEnabled(false);
        btnPesquisa.setEnabled(true);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        //Controle de Tela
        txtNome.setEnabled(true);
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);
        txtSenha2.setEnabled(true);

        //Controle de Botões
        btnSalvar.setEnabled(true);
        btnPesquisa.setEnabled(false);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(true);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        CadasUsuario usu = new CadasUsuario();
        CadasUsuarioDAO cad = new CadasUsuarioDAO();

        //Chamando tela para realização da pesquisa.
        Frm4_PesqUsuario pesqUsu = new Frm4_PesqUsuario(null, true);
        pesqUsu.setVisible(true);

        if (linha >= 0) {

            btnExcluir.setEnabled(true);

            cad.pesquisar(CadasUsuarioDAO.getId_usuario());

            //Controle de Tela
            txtNome.setEnabled(true);
            txtLogin.setEnabled(true);
            txtSenha.setEnabled(true);
            txtSenha2.setEnabled(true);

            //Controle de Botões
            btnSalvar.setEnabled(false);
            btnPesquisa.setEnabled(false);
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnCancelar.setEnabled(true);

            // Setando campos com seus respectivos valores.
            txtID.setText(Integer.toString(usu.getId_usuario()));
            txtNome.setText((usu.getNome()));
            txtLogin.setText((usu.getLogin()));
            txtSenha.setText((usu.getSenha()));
            txtSenha2.setText((usu.getSenha()));

        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtNome.getText().isEmpty() && !txtLogin.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtSenha2.getText().isEmpty()) {
            if (!txtSenha.getText().equals(txtSenha2.getText())) {

                JOptionPane.showMessageDialog(this, "Senhas Iválidas......");

            } else {

                CadasUsuarioDAO cad = new CadasUsuarioDAO();
                CadasUsuario usu = new CadasUsuario(txtNome.getText(), txtLogin.getText(), txtSenha.getText());
                int salva = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja salvar?", "Atenção", JOptionPane.YES_NO_OPTION);
                if (salva == JOptionPane.YES_OPTION) {
                    if (cad.inserir(usu)) {
                        JOptionPane.showMessageDialog(this, "Usuário Salvo com sucesso!");

                        //Controle de Tela
                        txtNome.setText("");
                        txtLogin.setText("");
                        txtSenha.setText("");
                        txtSenha2.setText("");

                        txtNome.setEnabled(false);
                        txtLogin.setEnabled(false);
                        txtSenha.setEnabled(false);
                        txtSenha2.setEnabled(false);

                        //Controle de Botões
                        btnSalvar.setEnabled(false);
                        btnPesquisa.setEnabled(true);
                        btnNovo.setEnabled(true);
                        btnCancelar.setEnabled(false);

                    }

                } 
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por Favor Preencha Todos os Campos");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (!txtSenha.getText().equals(txtSenha2.getText())) {

            JOptionPane.showMessageDialog(this, "Senhas Iválidas......");

        } else {
            CadasUsuarioDAO dao = new CadasUsuarioDAO();
            CadasUsuario cad = new CadasUsuario(Integer.parseInt(txtID.getText()), txtNome.getText(), txtLogin.getText(), txtSenha.getText());
            int altera = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja alterar?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (altera == JOptionPane.YES_OPTION) {
                if (dao.alterar(cad)) {
                    JOptionPane.showMessageDialog(this, "Alteração de Usuário Salva com sucesso!");

                    //Controle de Tela
                    txtID.setText("");
                    txtNome.setText("");
                    txtLogin.setText("");
                    txtSenha.setText("");
                    txtSenha2.setText("");

                    txtNome.setEnabled(false);
                    txtLogin.setEnabled(false);
                    txtSenha.setEnabled(false);
                    txtSenha2.setEnabled(false);

                    //Controle de Botões
                    btnSalvar.setEnabled(false);
                    btnPesquisa.setEnabled(true);
                    btnNovo.setEnabled(true);
                    btnCancelar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    btnAlterar.setEnabled(false);
                }
            } 
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        CadasUsuarioDAO dao = new CadasUsuarioDAO();
        int apagado = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja apagar?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (apagado == JOptionPane.YES_OPTION) {
            if (dao.deletar(dao)) {
                JOptionPane.showMessageDialog(this, "Usuário Apagada com sucesso!");
                //Controle de Tela
                txtID.setText("");
                txtNome.setText("");
                txtLogin.setText("");
                txtSenha.setText("");
                txtSenha2.setText("");

                txtNome.setEnabled(false);
                txtLogin.setEnabled(false);
                txtSenha.setEnabled(false);
                txtSenha2.setEnabled(false);

                //Controle de Botões
                btnSalvar.setEnabled(false);
                btnPesquisa.setEnabled(true);
                btnNovo.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnAlterar.setEnabled(false);
            }
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Frm2_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm2_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm2_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm2_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frm2_Usuario dialog = new Frm2_Usuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelImagemUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha2;
    // End of variables declaration//GEN-END:variables
}
