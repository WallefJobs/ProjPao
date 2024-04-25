package com.systec.model.dao;

import com.systec.controller.ConnectionFactory;
import com.systec.model.CadasCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Steve Wallef
 */
public class CadasClienteDAO extends CadasCliente{
    
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public boolean inserir(CadasCliente cliente) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String inserir = "INSERT INTO tb_cliente ( nome, cpf, telefone) VALUES (?, ?, ?)";
        try {
            stmt = conn.prepareStatement(inserir);
            stmt.setString(1, CadasCliente.getNome());
            stmt.setString(2, CadasCliente.getCpf());
            stmt.setString(3, CadasCliente.getTelefone());

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

    public boolean alterar(CadasCliente cliente) {
        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();
        String sql = "update tb_cliente set nome = ?, cpf = ?, telefone = ? where id_cliente = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, CadasCliente.getNome());
            stmt.setString(2, CadasCliente.getCpf());
            stmt.setString(3, CadasCliente.getTelefone());
            stmt.setInt(4, CadasCliente.getId_cliente());

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

    public boolean deletar(CadasCliente cad) {

        boolean retorno = false;
        Connection conn = ConnectionFactory.getConnection();

        String sql = "DELETE FROM tb_cliente WHERE id_cliente = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, CadasCliente.getId_cliente());
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
        String pesquisa1 = "SELECT * FROM `tb_cliente` WHERE id_cliente = ?";
        try {
            stmt = conn.prepareStatement(pesquisa1);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                this.setId_cliente(rs.getInt(1));
                this.setNome(rs.getString(2));
                this.setCpf(rs.getString(3));
                this.setTelefone(rs.getString(4));
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.disconnect(conn, stmt, rs);
        }
    }
}
