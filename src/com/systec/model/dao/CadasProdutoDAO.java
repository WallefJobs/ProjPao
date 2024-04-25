package com.systec.model.dao;

import com.systec.controller.ConnectionFactory;
import com.systec.model.CadasProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadasProdutoDAO extends CadasProduto {
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public boolean inserir(CadasProduto produto) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String inserir = "INSERT INTO tb_produtos ( nome, valor, qtd) VALUES (?, ?, ?)";
        try {
            stmt = conn.prepareStatement(inserir);
            stmt.setString(1, CadasProduto.getNome());
            stmt.setString(2, CadasProduto.getValor());
            stmt.setString(3, CadasProduto.getQtd());

            int adicionar = stmt.executeUpdate();
            if (adicionar > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt);
        }
        return retorno;
    }

    public boolean alterar(CadasProduto produto) {
        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String sql = "update tb_produtos set nome = ?, valor = ?, qtd = ? where id_produtos = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadasProduto.getNome());
            stmt.setString(2, CadasProduto.getValor());
            stmt.setString(3, CadasProduto.getQtd());
            stmt.setInt(4, CadasProduto.getId_produtos());

            int alterado = stmt.executeUpdate();
            if (alterado > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt);
        }
        return retorno;
    }

    public boolean deletar(CadasProduto produto) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();

        String sql = "DELETE FROM tb_produtos WHERE id_produtos = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, CadasProduto.getId_produtos());
            int deletado = stmt.executeUpdate();
            if (deletado > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt);
        }
        return retorno;
    }
    
    public void pesquisar(int id) {
        Connection conn = ConnectionFactory.getConnection();
        String pesquisa1 = "SELECT * FROM `tb_produtos` WHERE id_produtos = ?";
        try {
            stmt = conn.prepareStatement(pesquisa1);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                this.setId_produtos(rs.getInt(1));
                this.setNome(rs.getString(2));
                this.setValor(rs.getString(3));
                this.setQtd(rs.getString(4));
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt, rs);
        }
    }
}
