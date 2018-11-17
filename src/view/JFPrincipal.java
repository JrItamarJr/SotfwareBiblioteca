package view;

import java.awt.Toolkit;
import javax.swing.JInternalFrame;

public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMLivro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMEmprestimo = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMMulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão Biblioteca");

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jMenu2.setText("Cliente");

        jMCliente.setText("Cadastro de Clientes");
        jMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Livro");

        jMLivro.setText("Cadastro de Livros");
        jMLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLivroActionPerformed(evt);
            }
        });
        jMenu3.add(jMLivro);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Empréstimo");

        jMEmprestimo.setText("Emprestimos");
        jMEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEmprestimoActionPerformed(evt);
            }
        });
        jMenu6.add(jMEmprestimo);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Multa");

        jMMulta.setText("Cadastro de Multas");
        jMMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMultaActionPerformed(evt);
            }
        });
        jMenu7.add(jMMulta);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLivroActionPerformed
        // Abre a janela
        AbrirInternal(new JILivro());
    }//GEN-LAST:event_jMLivroActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteActionPerformed
       // Abre a janela
        AbrirInternal(new JICliente());
    }//GEN-LAST:event_jMClienteActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        //Fecha o sistema
        System.exit(0);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEmprestimoActionPerformed
        // Abre a janela
        AbrirInternal(new JIEmprestimo());
    }//GEN-LAST:event_jMEmprestimoActionPerformed

    private void jMMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMultaActionPerformed
        //Abre a janela
        AbrirInternal(new JIMulta());
    }//GEN-LAST:event_jMMultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuItem jMCliente;
    private javax.swing.JMenuItem jMEmprestimo;
    private javax.swing.JMenuItem jMLivro;
    private javax.swing.JMenuItem jMMulta;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public void AbrirInternal(JInternalFrame frame) {
        for (JInternalFrame internal : jDesktopPane.getAllFrames()) {
            if (internal.getClass().toString().equalsIgnoreCase(frame.getClass().toString())) {
                return;
            }
        }
        jDesktopPane.add(frame);
        frame.setLocation(jDesktopPane.getWidth() / 2 - frame.getWidth() / 2,
                jDesktopPane.getHeight() / 2 - frame.getHeight() / 2);
        frame.setVisible(true);
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/utils/imagens/fundo.png")));
    }
}
