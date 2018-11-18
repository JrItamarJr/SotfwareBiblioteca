/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Model.Bean.ClienteBean;
import model.Dao.ClienteDao;
import utils.BdCliente;

/**
 *
 * @author Aluno
 */
public class JICliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JICliente
     */
    public JICliente() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) JTCliente.getModel();
        JTCliente.setRowSorter(new TableRowSorter(modelo));
        readTable();
        desabilitaCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBPesquisar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        cbSexo = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JFormattedTextField();
        txtFone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Cliente"));

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Clientes");
        setMinimumSize(new java.awt.Dimension(0, 0));
        setRequestFocusEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jBPesquisar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBPesquisar1.setText("Pesquisar");
        jBPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisar1ActionPerformed(evt);
            }
        });

        JTCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "CPF", "Sexo", "Endereço", "Email", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTClienteMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTCliente);
        if (JTCliente.getColumnModel().getColumnCount() > 0) {
            JTCliente.getColumnModel().getColumn(0).setResizable(false);
            JTCliente.getColumnModel().getColumn(0).setPreferredWidth(30);
            JTCliente.getColumnModel().getColumn(1).setResizable(false);
            JTCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
            JTCliente.getColumnModel().getColumn(2).setResizable(false);
            JTCliente.getColumnModel().getColumn(2).setPreferredWidth(70);
            JTCliente.getColumnModel().getColumn(3).setResizable(false);
            JTCliente.getColumnModel().getColumn(3).setPreferredWidth(70);
            JTCliente.getColumnModel().getColumn(4).setResizable(false);
            JTCliente.getColumnModel().getColumn(4).setPreferredWidth(50);
            JTCliente.getColumnModel().getColumn(5).setResizable(false);
            JTCliente.getColumnModel().getColumn(5).setPreferredWidth(150);
            JTCliente.getColumnModel().getColumn(6).setResizable(false);
            JTCliente.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Nome:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jBPesquisar1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Nasciemento");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Sexo: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Cpf: ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Endereço: ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Fone: ");

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outros" }));
        cbSexo.setSelectedIndex(-1);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("E-mail:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAlterar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBNovo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBSair.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBSair.setText("Limpar");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisar1ActionPerformed

    }//GEN-LAST:event_jBPesquisar1ActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

        if (JTCliente.getSelectedRow() != -1) {// se JTprodutos estiver algo selecionado
            ClienteBean cli = new ClienteBean();
            ClienteDao cliDAO = new ClienteDao();// instancia a classe para execução do script
            cli.setId((int) JTCliente.getValueAt(JTCliente.getSelectedRow(), 0));
            cliDAO.delete(cli);//metódo para executar o delete
            
            txtCPF.setText("");
            txtData.setText("");
            txtEndereco.setText("");
            txtFone.setText("");
            txtNome.setText("");
            txtEmail.setText("");
            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if (JTCliente.getSelectedRow() != -1) {
            ClienteBean cli = new ClienteBean();
            ClienteDao cliDAO = new ClienteDao();
            cli.setNome(txtNome.getText());
            cli.setCpf(txtCPF.getText());
            cli.setDataNasc(txtData.getText());
            cli.setFone(txtFone.getText());
            cli.setEndereco(txtEndereco.getText());
            cli.setSexo(cbSexo.getSelectedItem().toString());
            cli.setId((int) JTCliente.getValueAt(JTCliente.getSelectedRow(), 0));// serve para capturar o ID da linha selecionada
            cliDAO.update(cli);

            txtCPF.setText("");
            txtData.setText("");
            txtEndereco.setText("");
            txtFone.setText("");
            txtNome.setText("");
            txtEmail.setText("");
            cbSexo.setSelectedIndex(-1);

            readTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar!");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaCampos();
        
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        ClienteBean cli = new ClienteBean();
        ClienteDao cliDAO = new ClienteDao();
        cli.setNome(txtNome.getText());
        cli.setCpf(txtCPF.getText());
        cli.setDataNasc(txtData.getText());
        cli.setFone(txtFone.getText());
        cli.setEndereco(txtEndereco.getText());
        cli.setSexo(cbSexo.getSelectedItem().toString());
        cli.setEmail(txtEmail.getText());
        cliDAO.create(cli);
        txtCPF.setText("");
        txtData.setText("");
        txtEndereco.setText("");
        txtFone.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        cbSexo.setSelectedIndex(-1);
        readTable();

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        txtCPF.setText("");
        txtData.setText("");
        txtEndereco.setText("");
        txtFone.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        cbSexo.setSelectedIndex(-1);
    }//GEN-LAST:event_jBSairActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        readTableForDesc(txtPesquisa.getText());
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void JTClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTClienteMouseReleased
        // TODO add your handling code here:
        if (JTCliente.getSelectedRow() != -1) {
            
            txtNome.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 1).toString());
            txtFone.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 2).toString());
            txtCPF.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 3).toString());
            cbSexo.setSelectedItem(JTCliente.getValueAt(JTCliente.getSelectedRow(), 4).toString());
            txtEndereco.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 5).toString());
            txtEmail.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 6).toString());
            txtData.setText(JTCliente.getValueAt(JTCliente.getSelectedRow(), 7).toString());

        }
    }//GEN-LAST:event_JTClienteMouseReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTCliente;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBPesquisar1;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) JTCliente.getModel();
        modelo.setNumRows(0);// está definindo que no início não dará nenhum registro
        //metodos para preencher as tabelas
        ClienteDao cliDAO = new ClienteDao();
        // metodo para trazer os produtos e adicionar as linhas
        for (ClienteBean cli : cliDAO.readTable()) {
            modelo.addRow(new Object[]{
                cli.getId(),
                cli.getNome(),
                cli.getFone(),
                cli.getCpf(),
                cli.getSexo(),
                cli.getEndereco(),
                cli.getEmail(),
                cli.getDataNasc()
            });

        }
    }

    public void readTableForDesc(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) JTCliente.getModel();
        modelo.setNumRows(0);// está definindo que no início não dará nenhum registro
        //metodos para preencher as tabelas
        ClienteDao cliDAO = new ClienteDao();
        // metodo para trazer os produtos e adicionar as linhas
        for (ClienteBean cli : cliDAO.readTableForDesc(desc)) {
            modelo.addRow(new Object[]{
                cli.getId(),
                cli.getNome(),
                cli.getFone(),
                cli.getCpf(),
                cli.getSexo(),
                cli.getEndereco(),
                cli.getEmail(),
                cli.getDataNasc()
            });
        }
    }
    // Desabilita os campos do formulário
    private void desabilitaCampos() {
        txtNome.setEnabled(false);
        txtCPF.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtFone.setEnabled(false);
        cbSexo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtData.setEnabled(false);
    }

    // Habilita os campos do formulário
    private void habilitaCampos() {

        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtFone.setEnabled(true);
        cbSexo.setEnabled(true);
        txtEmail.setEnabled(true);
        txtData.setEnabled(true);
    }
}
