/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Bean.ClienteBean;

/**
 *
 * @author Aluno
 */
public class ClienteDao {

    Connection con;

    public ClienteDao() {
        con = Conexao.getConnection();
    }

    public void create(ClienteBean d) {
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

    public List<ClienteBean> readTable() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClienteBean> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteBean cliente = new ClienteBean();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nomeCliente"));
                cliente.setFone(rs.getString("telefoneCliente"));
                cliente.setCpf(rs.getString("cpfCliente"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEndereco(rs.getString("enderecoCliente"));
                cliente.setEmail(rs.getString("emailCliente"));
                cliente.setDataNasc(rs.getString("dt_nascimentoCliente"));
                clientes.add(cliente);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return clientes;
    }

    public List<ClienteBean> readTableForDesc(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClienteBean> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nomeCliente LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteBean cliente = new ClienteBean();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nomeCliente"));
                cliente.setFone(rs.getString("telefoneCliente"));
                cliente.setCpf(rs.getString("cpfCliente"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEndereco(rs.getString("enderecoCliente"));
                cliente.setEmail(rs.getString("emailCliente"));
                cliente.setDataNasc(rs.getString("dt_nascimentoCliente"));
                clientes.add(cliente);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return clientes;
    }

    public void update(ClienteBean cli) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando UPDATE
            stmt = con.prepareStatement("UPDATE cliente SET nomeCliente = ?, telefoneCliente = ?, emailCliente = ?, enderecoCliente = ?, cpfCliente = ?, sexo = ?, dt_nascimentoCliente = ? WHERE idCliente = ?");

            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getFone());
            stmt.setString(3, cli.getEmail());
            stmt.setString(4, cli.getEndereco());
            stmt.setString(5, cli.getCpf());
            stmt.setString(6, cli.getSexo());
            stmt.setString(7, cli.getDataNasc());
            stmt.setInt(8, cli.getId());
            stmt.executeUpdate();

            // executar esse sql
            stmt.executeUpdate();

            // mensagem informando que atualizou            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void delete(ClienteBean cli) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando delete
            stmt = con.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
            stmt.setInt(1, cli.getId());
            // executar esse sql
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public List<ClienteBean> readTableForCpf(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClienteBean> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpfCliente = ?");
            stmt.setString(1, desc );

            rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteBean cliente = new ClienteBean();
                cliente.setId(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nomeCliente"));
                cliente.setFone(rs.getString("telefoneCliente"));
                cliente.setCpf(rs.getString("cpfCliente"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEndereco(rs.getString("enderecoCliente"));
                cliente.setEmail(rs.getString("emailCliente"));
                cliente.setDataNasc(rs.getString("dt_nascimentoCliente"));
                clientes.add(cliente);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return clientes;
    }

}
