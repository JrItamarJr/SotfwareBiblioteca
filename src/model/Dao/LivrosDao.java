/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Dao;

import Controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Bean.LivroBean;

/**
 *
 * @author Alcenir
 */
public class LivrosDao {
    Connection con;

    public LivrosDao() {
        con = Conexao.getConnection();
    }
    public void create(LivroBean liv) {
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("INSERT INTO livro(autorLivro,exemplarLivro,edicaoLivro,anoLivro,disponibilidade)VALUES(?,?,?,?,?)");
            
            
            stmt.setString(1, liv.getAutor());
            stmt.setString(2, liv.getExemplar());
            stmt.setInt(3, liv.getEdicao());
            stmt.setInt(4, liv.getAno());
            stmt.setString(5, liv.getDisponibilidade());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
        }
    }
    public List<LivroBean> readTable() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<LivroBean> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM livro;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                LivroBean livros = new LivroBean();
                livros.setId(rs.getInt("idLivro"));
                
                livros.setAutor(rs.getString("autorLivro"));
                
                livros.setExemplar(rs.getString("exemplarLivro"));
                livros.setEdicao(rs.getInt("edicaoLivro"));
                livros.setAno(rs.getInt("anoLivro"));
                livros.setDisponibilidade("disponibilidade");
                clientes.add(livros);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())  
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return clientes;  
    }

    public List<LivroBean> readTableForDesc(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<LivroBean> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM livro WHERE exemplarLivro LIKE ?");
            stmt.setString(1, "%" + desc + "%"); 

            rs = stmt.executeQuery();

            while (rs.next()) {
                LivroBean livros = new LivroBean();
                livros.setId(rs.getInt("idLivro"));
                
                livros.setAutor(rs.getString("autorLivro"));
                
                livros.setExemplar(rs.getString("exemplarLivro"));
                livros.setEdicao(rs.getInt("edicaoLivro"));
                livros.setAno(rs.getInt("anoLivro"));
                livros.setDisponibilidade("disponibilidade");
                clientes.add(livros);
            }
        } catch (Exception ex) {
            Logger.getLogger(LivrosDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return clientes;
    }

    public void update(LivroBean liv) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando UPDATE
            stmt = con.prepareStatement("UPDATE livro SET autorLivro = ?, exemplarLivro = ?, edicaoLivro = ?, anoLivro = ? ,disponibilidade = ? WHERE idLivro = ?");
            
            stmt.setString(1, liv.getAutor());
            
            stmt.setString(2, liv.getExemplar());
            stmt.setInt(3, liv.getEdicao());
            stmt.setInt(4, liv.getAno());
            stmt.setString(5, liv.getDisponibilidade());
            stmt.setInt(6, liv.getId());
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

    public void delete(LivroBean liv) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando delete
            stmt = con.prepareStatement("DELETE FROM livro WHERE idLivro = ?");
            stmt.setInt(1, liv.getId());
            // executar esse sql
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!");           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            Conexao.closeConnection(con, stmt); 
        }
    }  

}
