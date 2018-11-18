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
import Model.Bean.EmprestimoBean;

/**
 *
 * @author Alcenir
 */
public class EmprestimoDao {

    Connection con;

    public EmprestimoDao() {
        con = Conexao.getConnection();
    }

    public void create(EmprestimoBean emp) {
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

    public List<EmprestimoBean> readTable() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<EmprestimoBean> emprestimos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM emprestimo INNER JOIN cliente ON cliente.idCliente = emprestimo.idCliente INNER JOIN livro ON livro.idLivro = emprestimo.idLivro;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                EmprestimoBean emp = new EmprestimoBean();
                emp.setId_emprestimo(rs.getInt("idEmprestimo"));
                emp.setNomeCliente(rs.getString("nomeCliente"));
                emp.setNomeLivro(rs.getString("exemplarLivro"));
                emp.setData_emprestimo(rs.getString("dtEmprestimo"));
                emp.setData_devolucao(rs.getString("dtDevolucao"));
                
                emprestimos.add(emp);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return emprestimos;
    }

    public List<EmprestimoBean> readTableForDesc(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<EmprestimoBean> emprestimos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM emprestimo INNER JOIN cliente ON cliente.idCliente = emprestimo.idCliente INNER JOIN livro ON livro.idLivro = emprestimo.idLivro WHERE idEmprestimo LIKE ?;");
            
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                EmprestimoBean emp = new EmprestimoBean();
                emp.setId_emprestimo(rs.getInt("idEmprestimo"));
                emp.setNomeCliente(rs.getString("nomeCliente"));
                emp.setNomeLivro(rs.getString("exemplarLivro"));
                emp.setData_emprestimo(rs.getString("dtEmprestimo"));
                emp.setData_devolucao(rs.getString("dtDevolucao"));
                
                emprestimos.add(emp);
            }
        } catch (Exception ex) {
            Logger.getLogger(LivrosDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
        return emprestimos;
    }

    public void update(EmprestimoBean emp) {
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

    public void delete(EmprestimoBean emp) {
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
