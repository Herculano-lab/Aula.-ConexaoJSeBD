/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Conexao;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genev
 */
public class Tela extends javax.swing.JFrame {
    
    private Usuario_view Usuario_view;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        // btn_remover.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_lastnome = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        lb_nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Endereço = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lb_gravar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Email");

        txt_codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        txt_lastnome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_lastnome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 2)));
        txt_lastnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastnomeActionPerformed(evt);
            }
        });

        txt_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 1, 0)));

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nome.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Senha");

        txt_Endereço.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Endereço.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Endereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EndereçoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Endereço");

        lb_gravar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_gravar.setText("Gravar");
        lb_gravar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lb_gravarActionPerformed(evt);
            }
        });

        btn_remover.setBackground(new java.awt.Color(240, 230, 220));
        btn_remover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remover.setForeground(new java.awt.Color(2, 4, 1));
        btn_remover.setText("Remover");
        btn_remover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        TblProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TblProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Nome", "Senha", "Endereço "
            }
        ));
        jScrollPane1.setViewportView(TblProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nome)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(284, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lastnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Endereço, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lb_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_lastnome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_gravar)
                    .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_lastnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnomeActionPerformed

    private void txt_EndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EndereçoActionPerformed

    private void lb_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lb_gravarActionPerformed
        
        
        // btn_remover.setEnabled(true);
        
        String codigo;
        String nome;
        String lastnome;
        String Endereço;
        
        
         nome = txt_nome.getText();
          codigo = txt_codigo.getText();
          Endereço = txt_Endereço.getText();
          lastnome = txt_lastnome.getText();
          //Usuario t = new Usuario();
          btn_remover.remove(this);
          
    
        Conexao a = new Conexao();
        a.getConnection();
        
      
    
          
          DefaultTableModel tabelaProduto = (DefaultTableModel) TblProduto.getModel();
          Object[] novo =new Object []{
        nome,
        codigo,
        Endereço,
        lastnome,
          };     
          //lb_gravar.setEnabled(false);
           //if (codigo.isEmpty()){
        if (!nome.isEmpty()&& !codigo.isEmpty() && !Endereço.isEmpty() && !lastnome.isEmpty()){
       
            JOptionPane.showMessageDialog(this, "");
            
            //usuario_control = new Usuario_control(txt_nome.getText(),txt_codigo.getText(),txt_Endereço.getText(),txt_lastnome.getText());
            
        }
        else
        {
        System.out.println("");
        }
         tabelaProduto.addRow(novo);
          txt_nome.setText("");
          txt_codigo.setText("");
          txt_Endereço.setText("");
          txt_lastnome.setText("");
    }//GEN-LAST:event_lb_gravarActionPerformed

    

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
    // TODO add your handling code here:
       // lb_gravar.setText(null);
        int linhaSelecionada = TblProduto.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma linha ");
            
        }
        else{
        DefaultTableModel tabelaProduto = (DefaultTableModel) TblProduto.getModel();
         tabelaProduto.removeRow(linhaSelecionada);
         JOptionPane.showMessageDialog(this, "Produto excluido");
        }
    }//GEN-LAST:event_btn_removerActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblProduto;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lb_gravar;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JTextField txt_Endereço;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_lastnome;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
