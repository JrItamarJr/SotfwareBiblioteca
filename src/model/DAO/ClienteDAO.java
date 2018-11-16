/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Beam.Cliente;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    Connection con;

    public ClienteDAO() {
        con = Conexao.getConnection();
    }
    public void create(Cliente d) {
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("INSERT INTO cliente(idCliente,nomeCliente,telefoneCliente,emailCliente,enderecoCliente,cpfCliente,sexo,dt_nascimentoCliente)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, d.getId());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getFone());
            stmt.setString(4, d.getEmail());
            stmt.setString(5, d.getEndereco());
            stmt.setString(6, d.getCpf());
            stmt.setString(7, d.getSexo());
            stmt.setString(8, d.getDataNasc());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
        }
    }
}
