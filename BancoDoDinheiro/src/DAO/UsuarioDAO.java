/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ContaBancaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet autenticacaoUsuario(ContaBancaria objContaBancaria) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where nome = ? and senha = ? ";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objContaBancaria.getNomeCliente());
            pstm.setString(2, objContaBancaria.getSenhaCliente());           
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDTO autenticacaoUsuario " + erro);
            return null;
        }
    }

    public void cadastrarUsuario(ContaBancaria objContaBancaria) {
        String sql = "insert into usuario (nome, senha, saldo) values (?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objContaBancaria.getNomeCliente());
            pstm.setString(2, objContaBancaria.getSenhaCliente());
            pstm.setDouble(3, objContaBancaria.getSaldo());
            pstm.execute();
            pstm.close();;

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Usuario cadastrarUsuario" + e);
        }
    }

   

}
