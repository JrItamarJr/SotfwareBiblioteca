package model.DAO;

import Controller.Conexao;
import Model.Bean.ClienteBean;
import Model.Bean.MultaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MultaDao {
    Connection con; 

    public MultaDao() {
        con = Conexao.getConnection();
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
    
    public List<MultaBean> readTableMulta() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<MultaBean> multas = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select multa.idMulta, cliente.nomeCliente, descricao, valorMulta from multa inner join cliente on multa.idMulta = cliente.idCliente;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MultaBean multa = new MultaBean();
                multa.setIdMulta(rs.getInt("multa.idMulta"));
                multa.setNomeCliente(rs.getString("cliente.nomeCliente"));
                multa.setDescricao(rs.getString("descricao"));
                multa.setValor(rs.getDouble("valorMulta"));
                multas.add(multa);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return multas;
    }
    
    public void create(MultaBean d) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO multa(idMulta,idCliente,descricao,valorMulta)VALUES(?,?,?,?)");
            stmt.setInt(1, d.getIdCliente());
            stmt.setInt(2, d.getIdCliente());
            stmt.setString(3, d.getDescricao());
            stmt.setDouble(4, d.getValor());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
        }
    }
    
    public void readValorTotal(int iID) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("select sum(valorMulta) from multa where idCliente ="+ iID +";");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MultaBean multa = new MultaBean();
                multa.setValorTotal(rs.getDouble("sum(valorMulta)"));
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
    }
    
    public void delete(MultaBean mul) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando delete
            stmt = con.prepareStatement("DELETE FROM multa WHERE idMulta = ?");
            stmt.setInt(1, mul.getIdMulta());
            // executar esse sql
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Multa excluida com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public void pagar(MultaBean mul) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando delete
            stmt = con.prepareStatement("DELETE FROM multa WHERE idMulta = ?");
            stmt.setInt(1, mul.getIdMulta());
            // executar esse sql
            stmt.executeUpdate();

        } catch (Exception ex) {
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
}
