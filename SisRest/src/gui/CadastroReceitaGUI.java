/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.IngredienteDAO;
import dao.ProdutoDAO;
import dao.ReceitaDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Ingrediente;
import model.IngredienteDaReceitaTableModel;
import model.Produto;
import model.Receita;
import model.ReceitaComboBoxModel;


/**
 *
 * @author Daniel Lima
 */
public class CadastroReceitaGUI extends javax.swing.JFrame {
    Receita rece;
    ReceitaDAO receDAO;
    Produto prod;
    ProdutoDAO prodDAO;
    Ingrediente ingrediente;
    IngredienteDAO ingredienteDAO;
    
    ReceitaComboBoxModel receitaComboBoxModel;
    private List<Receita> receitas = new ArrayList<>();
    private List<Receita> idReceitas = new ArrayList<>();
    private List<Ingrediente> ingredientesDaReceita = new ArrayList<>();
     static int idReceitaTemp;
    /**
     * Creates new form CadastroReceitaGUI
     */
    public CadastroReceitaGUI() throws Exception {
        initComponents();
        inicializaComboReceita();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblReceita = new javax.swing.JLabel();
        txtReceita = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbReceitas = new javax.swing.JComboBox<>();
        lblReceitas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Receitas");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Receitas"));

        lblReceita.setText("Receita");

        txtReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceitaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblReceita)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar))
                    .addComponent(txtReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceita)
                    .addComponent(txtReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Receitas"));

        cbReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbReceitasMouseClicked(evt);
            }
        });
        cbReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReceitasActionPerformed(evt);
            }
        });

        lblReceitas.setText("Receitas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReceitas)
                .addGap(30, 30, 30)
                .addComponent(cbReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceitas))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceitaActionPerformed
       String receita = txtReceita.getText();
    }//GEN-LAST:event_txtReceitaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        if("".equals(txtReceita.getText())){
            JOptionPane.showMessageDialog(null,"Campo de receita vazio!");
        }else{
        
        rece = new  Receita();
        try {
            receDAO = new ReceitaDAO();
            rece.setNomeReceita(txtReceita.getText());
            receDAO.Cadastrar(rece);
        } catch (Exception ex) {
            Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Receita Cadastrada com Sucesso");
        txtReceita.setText("");
        try {
            //        popularCombo();
            inicializaComboReceita();
        } catch (Exception ex) {
            Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }//GEN-LAST:event_btnCadastrarActionPerformed
       
    private void cbReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReceitasActionPerformed
        selecionaIds();
    }//GEN-LAST:event_cbReceitasActionPerformed

    private void cbReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbReceitasMouseClicked
     
    }//GEN-LAST:event_cbReceitasMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(cbReceitas.getSelectedIndex() == 0 ){
            JOptionPane.showMessageDialog(null,"Selecione uma receita!");
        }else{
        rece = new Receita();
        //rece.setNomeReceita(cbReceitas.getSelectedItem().toString());
            selecionaIds();
            int chavePrimaria = rece.getIdReceita();
         
            int opcao =  JOptionPane.showConfirmDialog(null,"Pode haver um produto com essa receita deseja excluir ?");
                    if(opcao == 0){
            try {
                receDAO = new ReceitaDAO();
                receDAO.excluir(rece);
                JOptionPane.showMessageDialog(null,"Receita excluida com sucesso");
                inicializaComboReceita();
            } catch (Exception ex) {
                Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           }          
            
            
             //prodDAO = new ProdutoDAO();
             
             //idReceitas = prodDAO.retornaIdChaveEstrangeira(rece);
             
//             if(idReceitas.size() == 0 ){
//                 //Array de receitas que contem produtos cadastrados nelas sera nulo ou seja nao tera produtos cadastrados
//                        receDAO = new ReceitaDAO();
//                        receDAO.excluir(rece);
//                        JOptionPane.showMessageDialog(null,"Receita excluida com sucesso");
//                        inicializaComboReceita();
//             }
//            for(Receita r : idReceitas){  
//                
//                if(r.getIdReceita() == chavePrimaria){
//                    
//                    int opcao =  JOptionPane.showConfirmDialog(null,"Existe um produto com essa Receita, deseja realmente excluir?");
//                    if(opcao == 0 || opcao == -1){
//                        receDAO = new ReceitaDAO();
//                        receDAO.excluir(rece);
//                        JOptionPane.showMessageDialog(null,"Receita excluida com sucesso");
//                        inicializaComboReceita();
//                         
//                        //JOptionPane.showMessageDialog(null,"Existe um produto cadastrado com essa receita");
//                    }
//                }
//            if(r.getIdReceita() != chavePrimaria){
//                        receDAO = new ReceitaDAO();
//                        receDAO.excluir(rece);
//                        JOptionPane.showMessageDialog(null,"Receita excluida com sucesso");
//                        inicializaComboReceita();
//                     //break;
//                    }
//                }

//        } catch (Exception ex) {
//            Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//      }
       // limparIngDaReceitaTable();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(cbReceitas.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Selecione uma receita!");
        }else{    
       // selecionaIds();
        idReceitaTemp = rece.getIdReceita();
       
        try {
             if("".equals(txtReceita.getText())){
            JOptionPane.showMessageDialog(null,"Campo de receita vazio!");
             }else{
            rece = new Receita();
            receDAO = new ReceitaDAO();
            
            rece.setIdReceita(idReceitaTemp);
            rece.setNomeReceita(txtReceita.getText());
            receDAO.atualizar(rece);
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
            inicializaComboReceita();
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtReceita.setText("");
      }  
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
      limparCampos();
        
    }//GEN-LAST:event_btnLimparActionPerformed
    public final void inicializaComboReceita() throws Exception {
        DefaultComboBoxModel comboReceita = new DefaultComboBoxModel();
        comboReceita.addElement("Selecione Receita");
        receDAO = new ReceitaDAO();
        rece = new Receita();
        receitas = receDAO.listaTodasReceitas(rece);
        
        for (Receita r : receitas) {
            comboReceita.addElement(r.getNomeReceita());
        }
        cbReceitas.setModel(comboReceita);
        //cbReceitas.setSelectedIndex(0);
        
    }
     private void selecionaIds(){
         //arruma o problema de selecionar receita
     int ind = cbReceitas.getSelectedIndex();
        if (ind < 1) {
            rece = null;
            return;
        }
        ind--;
        rece = receitas.get(ind);
        //System.out.println(rece.getIdReceita());
    }
     public void limparCampos(){
         txtReceita.setText("");
     }

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
            java.util.logging.Logger.getLogger(CadastroReceitaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroReceitaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroReceitaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroReceitaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                CadastroReceitaGUI cadastroReceitaGUI = new CadastroReceitaGUI();
//                try {
//                    cadastroReceitaGUI.inicializaComboReceita();
//                    cadastroReceitaGUI.selecionaIds();
//                } catch (Exception ex) {
//                    Logger.getLogger(CadastroReceitaGUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                cadastroReceitaGUI.setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbReceitas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JLabel lblReceitas;
    private javax.swing.JTextField txtReceita;
    // End of variables declaration//GEN-END:variables
}
