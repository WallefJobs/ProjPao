package com.systec.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bank_bakery_data?useSSL=false";
    private static final String USR = "root";
    private static final String PSW = "";
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USR, PSW);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de dados: " + e);
            return null;
        }
    }
    
    public static void disconnect(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
        }
    }
    
    public static void disconnect(Connection conn, PreparedStatement stmt) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
        }
    }
    
    public static void disconnect(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
        }
    }
    
}
