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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Beam.Emprestimo;

/**
 *
 * @author Alcenir
 */
public class EmprestimoDAO {

    Connection con;

    public EmprestimoDAO() {
        con = Conexao.getConnection();
    }

    public void create(Emprestimo emp) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO emprestimo(idCliente,idLivro,dtEmprestimo,dtDevolucao)VALUES(?,?,?,?)");

            stmt.setInt(1, emp.getId_cliente());
            stmt.setInt(2, emp.getId_livro());
            stmt.setString(3, emp.getData_emprestimo());
            stmt.setString(4, emp.getData_devolucao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
        }
    }

    public List<Emprestimo> readTable() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Emprestimo> emprestimos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM emprestimo INNER JOIN cliente ON cliente.idCliente = emprestimo.idCliente INNER JOIN livro ON livro.idLivro = emprestimo.idLivro;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Emprestimo emp = new Emprestimo();
                emp.setId_emprestimo(rs.getInt("idEmprestimo"));
                emp.setNomeCliente(rs.getString("nomeCliente"));
                emp.setNomeLivro(rs.getString("exemplarLivro"));
                emp.setData_emprestimo(rs.getString("dtEmprestimo"));
                emp.setData_devolucao(rs.getString("dtDevolucao"));
                
                emprestimos.add(emp);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return emprestimos;
    }

    public List<Emprestimo> readTableForDesc(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Emprestimo> emprestimos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM emprestimo INNER JOIN cliente ON cliente.idCliente = emprestimo.idCliente INNER JOIN livro ON livro.idLivro = emprestimo.idLivro WHERE idEmprestimo LIKE ?;");
            
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Emprestimo emp = new Emprestimo();
                emp.setId_emprestimo(rs.getInt("idEmprestimo"));
                emp.setNomeCliente(rs.getString("nomeCliente"));
                emp.setNomeLivro(rs.getString("exemplarLivro"));
                emp.setData_emprestimo(rs.getString("dtEmprestimo"));
                emp.setData_devolucao(rs.getString("dtDevolucao"));
                
                emprestimos.add(emp);
            }
        } catch (Exception ex) {
            Logger.getLogger(LivrosDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return emprestimos;
    }

    public void update(Emprestimo emp) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando UPDATE
            stmt = con.prepareStatement("UPDATE emprestimo SET idCliente = ?, idLivro = ?, dtEmprestimo = ?, dtDevolucao = ? WHERE idEmprestimo = ?");

            stmt.setInt(1, emp.getId_cliente());
            stmt.setInt(2, emp.getId_livro());
            stmt.setString(3, emp.getData_emprestimo());
            stmt.setString(4, emp.getData_devolucao());
            stmt.setInt(5, emp.getId_emprestimo());
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

    public void delete(Emprestimo emp) {
        // utilizar a classe que me permite executar sql
        PreparedStatement stmt = null;
        try {
            // digitar o comando delete
            stmt = con.prepareStatement("DELETE FROM emprestimo WHERE idEmprestimo = ?");
            stmt.setInt(1, emp.getId_emprestimo());
            // executar esse sql
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Emprestimo excluido com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
}
