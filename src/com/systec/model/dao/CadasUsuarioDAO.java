package com.systec.model.dao;

import com.systec.controller.ConnectionFactory;
import com.systec.model.CadasUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadasUsuarioDAO extends CadasUsuario {

    private PreparedStatement stmt;
    private ResultSet rs;

    public boolean inserir(CadasUsuario usuario) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String inserir = "INSERT INTO tb_usuario ( nome, login, senha) VALUES (?, ?, ?)";
        try {
            stmt = conn.prepareStatement(inserir);
            stmt.setString(1, CadasUsuario.getNome());
            stmt.setString(2, CadasUsuario.getLogin());
            stmt.setString(3, CadasUsuario.getSenha());

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

    public boolean alterar(CadasUsuario usuario) {
        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String sql = "update tb_usuario set nome = ?, login = ?, senha = ? where id_usuario = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadasUsuario.getNome());
            stmt.setString(2, CadasUsuario.getLogin());
            stmt.setString(3, CadasUsuario.getSenha());
            stmt.setInt(4, usuario.getId_usuario());

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

    public boolean deletar(CadasUsuario cad) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();

        String sql = "DELETE FROM tb_usuario WHERE id_usuario = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, CadasUsuario.getId_usuario());
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
        String pesquisa1 = "SELECT * FROM `tb_usuario` WHERE id_usuario = ?";
        try {
            stmt = conn.prepareStatement(pesquisa1);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                this.setId_usuario(rs.getInt(1));
                this.setNome(rs.getString(2));
                this.setLogin(rs.getString(3));
                this.setSenha(rs.getString(4));
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt, rs);
        }
    }

}
